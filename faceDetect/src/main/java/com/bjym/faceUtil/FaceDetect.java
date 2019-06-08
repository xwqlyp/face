package com.bjym.faceUtil;


import com.baidu.ai.aip.utils.HttpUtil;
import com.baidu.aip.util.Base64Util;
import com.bjym.common.FileUtil;
import com.google.gson.JsonObject;
import com.baidu.ai.aip.utils.GsonUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.json.JSONObject;

/**
 * 人脸检测与属性分析
 */
public class FaceDetect {

	private static final Class String = null;

	/**
	 * 重要提示代码中所需工具类
	 * FileUtil,Base64Util,HttpUtil,GsonUtils请从
	 * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
	 * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
	 * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
	 * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
	 * 下载
	 */


	public static String detect(byte[] arg0, String max_face_num) {
		// 请求url
		String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
		String img = Base64Util.encode(arg0);
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("image", img);
			map.put("image_type", "BASE64");
			map.put("face_field", "age,beauty,expression,face_shape,gender,glasses,race,quality,eye_status,emotion,face_type");
			map.put("max_face_num", max_face_num);
			map.put("face_type", "LIVE");

			String param = GsonUtils.toJson(map);

			// 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
			String accessToken = AuthService.getAuth();
			String result = HttpUtil.post(url, accessToken, "application/json", param);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 人脸检测
	 * @param file
	 * @param max_face_num
	 * @return
	 */
	public static String detect(File file, String max_face_num) {
		try {
			String json=detect(FileUtil.FileToByte(file), max_face_num);
			JSONObject jsonData = new JSONObject(json);
			int error_code=jsonData.getInt("error_code");
			if (error_code == 0 ) {
				String result=jsonData.get("result").toString();
				return result;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "查询失败";
	}

	
}