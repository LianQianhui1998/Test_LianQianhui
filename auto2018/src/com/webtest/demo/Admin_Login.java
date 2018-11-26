package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Admin_Login extends BaseTest{
	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void testLogin(String u_name,String u_pwd) {
		//打开页面
		webtest.open("http://localhost:8032/MyMovie/admin.php/Login/index.html");
		if(webtest.isTextPresent("退出")) {
			webtest.click("link=退出");
		}
		//文本框输入
		webtest.type("name=username",u_name);
		webtest.type("name=password",u_pwd);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("退出"));
	}
}
