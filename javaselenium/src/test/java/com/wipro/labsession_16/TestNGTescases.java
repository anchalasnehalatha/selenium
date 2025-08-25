package com.wipro.labsession_16;

import org.testng.annotations.Test;

public class TestNGTescases {
	@Test (groups = {"Smoke"})
	public void loginTest() {
		System.out.println("Testcase1 is executed");
		
	}
	@Test (groups = {"Regression"})
    public void paymentTest() {
		System.out.println("Testcase2 is executed");
		
	}
	@Test (groups = {"Smoke","Regression"})
    public void payoutTest() {
		System.out.println("Testcase3 is executed");
	
   }

}
