package face;

import static org.junit.Assert.*;

import java.io.File;
import java.math.BigDecimal;

import org.junit.Test;

import com.baidu.aip.face.AipFace;
import com.bjym.faceUtil.AuthService;
import com.bjym.faceUtil.FaceDetect;
import com.bjym.util.FaceIdentifyUtil;
import com.bjym.util.FileUtil;



public class TestGetAuth {
	static File file = null;
	static {
		file=new File("D:\\img\\3.jpg");
	}
	
	@Test
	public void getAuth() throws Exception {
		
		System.out.println(AuthService.getAuth());
		
	}
	
	
	@Test
	public void detectFace() throws Exception {
		FaceDetect.detect(file, "1");
		
	}
	
	@Test
	public void detect() throws Exception {
		BigDecimal a=new BigDecimal("0.3423423");
		System.out.println(a);
		
	}
}
