package com.wipro.testng1;

import org.testng.annotations.Test;

public class TestNGTestcases {
	@Test(groups = {"Sanity" , "Regression"})
	public void testcase1() {
		System.out.println("testcase 1 is executed");
	}
	@Test(groups = {"Regression"})
	public void testcase2() {
		System.out.println("testcase 2 is executed");
	}
	@Test(groups = {"Sanity"})
	public void testcase3() {
		System.out.println("testcase 3 is executed");
	}
	@Test(groups = {"Regression"})
	public void testcase4() {
		System.out.println("testcase 4 is executed");
	}

}
