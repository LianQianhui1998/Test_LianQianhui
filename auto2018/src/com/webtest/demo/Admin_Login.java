package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Admin_Login extends BaseTest{
	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void testLogin(String u_name,String u_pwd) {
		//��ҳ��
		webtest.open("http://localhost:8032/MyMovie/admin.php/Login/index.html");
		if(webtest.isTextPresent("�˳�")) {
			webtest.click("link=�˳�");
		}
		//�ı�������
		webtest.type("name=username",u_name);
		webtest.type("name=password",u_pwd);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("�˳�"));
	}
}
