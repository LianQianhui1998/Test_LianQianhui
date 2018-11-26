package mail;

import org.testng.annotations.Test;

public class Testzip {
	@Test
	 public void nihao(){  
	        ZipCompressor zc = new  ZipCompressor("D:\\auto2018\\test-output\\html.zip");  
	        zc.compressExe("D:\\auto2018\\test-output\\html");
	    }  
}
