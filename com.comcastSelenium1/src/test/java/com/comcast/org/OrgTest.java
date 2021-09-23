package com.comcast.org;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="SmokeTest")
	public void createorgTest() {
	
	System.out.println("execute createContactTest");
	String BROWSER=System.getProperty("browser");
	String ENV=System.getProperty("url");
	System.out.println("brower"+ BROWSER);
	System.out.println("url"+ENV);
	
	
	}
@Test(groups="SmokeTest")
public void createorgWithindustryTest() {
	System.out.println("execute ContactWithOrgTest");
}
@Test(groups="RegressionTest")
public void deleteorgTest() {
	System.out.println("execute deleteContactTest");
}
}
