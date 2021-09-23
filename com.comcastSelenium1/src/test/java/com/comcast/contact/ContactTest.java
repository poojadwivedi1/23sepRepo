package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="SmokeTest")

	public void createContactTest() {
		System.out.println("execute createContactTest");
	}
	@Test(groups="SmokeTest")

public void createContactWithOrgTest() {
	System.out.println("execute ContactWithOrgTest");
}
@Test(groups="RegressionTest")
public void deleteContactTest() {
	System.out.println("execute deleteContactTest");
}

}
