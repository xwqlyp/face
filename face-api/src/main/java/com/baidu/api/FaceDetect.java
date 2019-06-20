package com.baidu.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.baidu.ai.utils.Base64Util;
import com.baidu.ai.utils.FileUtil;
import com.baidu.ai.utils.GsonUtils;
import com.baidu.ai.utils.HttpUtil;


/**
 * 人脸检测与属性分析
 */
public class FaceDetect {
	


	private static final Class String = null;

	/**
	 * 人脸检测
	 * @param file
	 * @param max_face_num
	 * @return
	 */

	public static String detect(byte[] arg0, String max_face_num) {
		// 请求url
		String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
		String img = Base64Util.encode(arg0);
		try {
			Map<String, Object> map = new HashMap<String, Object>();
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

	}