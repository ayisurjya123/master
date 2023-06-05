package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.ActiTimeLoginPage;


@Listeners(com.actitime.generic.Screenshot.class)
public class TC_1 extends BaseTest
{
	@Test
	public void login1() throws IOException, InterruptedException
	{
		ActiTimeLoginPage a1=new ActiTimeLoginPage(driver);
		a1.loginMethod();
	}

}
