package face;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bjym.util.FileUtil;



public class TestIo {

	
	@Test
	public void testName() throws Exception {
		byte[] var7=FileUtil.readFileByBytes("src/main/resources/properties/log4j.properties");
		System.out.println(var7);
	}
}
