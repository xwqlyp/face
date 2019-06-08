package face;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.baidu.ai.aip.utils.GsonUtils;
import com.baidu.aip.face.AipFace;
import com.bjym.faceUtil.AuthService;
import com.bjym.faceUtil.FaceDetect;
import com.bjym.pojo.Angle;
import com.bjym.pojo.Emotion;
import com.bjym.pojo.Expression;
import com.bjym.pojo.Eye_Status;
import com.bjym.pojo.Face_List;
import com.bjym.pojo.Face_Shape;
import com.bjym.pojo.Face_Type;
import com.bjym.pojo.Gender;
import com.bjym.pojo.Glasses;
import com.bjym.pojo.Location;
import com.bjym.pojo.Quality;
import com.bjym.pojo.Race;
import com.bjym.util.FaceIdentifyUtil;
import com.bjym.util.FileUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;



public class TestGetAuth {
	static File file = null;
	static {
		file=new File("D:\\img\\2.jpg");
	}
	
	@Test
	public void getAuth() throws Exception {
		
		System.out.println(AuthService.getAuth());
		
	}
	
	
	@Test
	public void detectFace() throws Exception {
		JSONObject jsonData = new JSONObject(FaceDetect.detect(file, "1"));
		String face_list=jsonData.getJSONArray("face_list").toString().replace("[", "").replace("]", "");	
		JSONObject json = new JSONObject(face_list);
		System.out.println(json);
		Expression expression=GsonUtils.fromJson(json.getJSONObject("expression").toString(), Expression.class);
		Face_Shape face_shape=GsonUtils.fromJson(json.getJSONObject("face_shape").toString(), Face_Shape.class);
		double beauty=Double.parseDouble(json.get("beauty").toString());
		Gender gender=GsonUtils.fromJson(json.getJSONObject("gender").toString(), Gender.class);
		Race race=GsonUtils.fromJson(json.getJSONObject("race").toString(), Race.class);
		Eye_Status eye_status=GsonUtils.fromJson(json.getJSONObject("eye_status").toString(), Eye_Status.class);
		double face_probability=Double.parseDouble(json.get("beauty").toString());
		Quality quality=GsonUtils.fromJson(json.get("quality").toString(), Quality.class);
		Glasses glasses=GsonUtils.fromJson(json.getJSONObject("glasses").toString(), Glasses.class);
		Emotion emotion=GsonUtils.fromJson(json.getJSONObject("emotion").toString(), Emotion.class);
		Face_Type face_type=GsonUtils.fromJson(json.getJSONObject("face_type").toString(), Face_Type.class);
		Angle angle=GsonUtils.fromJson(json.getJSONObject("angle").toString(), Angle.class);
		String face_token=json.getString("face_token");
		Location location=GsonUtils.fromJson(json.getJSONObject("location").toString(), Location.class);
		int age=Integer.parseInt(json.get("age").toString());	
				
		Face_List a=new Face_List( expression, face_shape, beauty, gender, race, eye_status, face_probability, quality, glasses, emotion, face_type, angle, face_token, location, age);
		System.out.println(a.toString());
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void Face() throws Exception {
		JSONObject jsonData = new JSONObject(FaceDetect.detect(file, "1"));
		String face_list=jsonData.getJSONArray("face_list").toString().replace("[", "").replace("]", "");	
		JSONObject json = new JSONObject(face_list);
		System.out.println(json);
		Face_List f1=GsonUtils.fromJson(json.toString(), Face_List.class);
		
		System.out.println(f1.toString());
		
	}
	
	
	
	
	@Test
	public void Face1() throws Exception {

		Map map = new HashMap();
		Map result= new HashMap();
		result.put("src","http://cdn.layui.com/123.jpg");
		map.put("code", new Integer(0));
		map.put("msg", "cg");
		map.put("data", result);

		JSONObject json=new JSONObject(map);
		
		System.out.println(json);
		
	}
	
	
	
	
	
	
	
	
}
