package face;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.bjym.util.FaceIdentifyUtil;
import com.bjym.util.FileUtil;



public class TestIo2 {


	@Test
	public void testAddGroup() throws Exception {
		String groupId="js_1";
		String addGroup=FaceIdentifyUtil.addGroup(groupId);
		System.out.println(addGroup);
	}
	
	@Test
	public void testAddUser() throws Exception {
		File file=new File("D:\\img\\1.jpg");
		String userInfo="积极向上";
		String userId="ym_1";
		String groupId="js_1";
		String facematch=FaceIdentifyUtil.addUser(file, userInfo, userId, groupId);
		System.out.println(facematch);
	}
	
	
	
	
	
	
	
	
	
	
	
}
