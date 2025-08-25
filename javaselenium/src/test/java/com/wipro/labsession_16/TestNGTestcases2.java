package com.wipro.labsession_16;

import org.testng.annotations.Test;

 public  class TestNGTestcases2 {
	@Test (groups = {"Sanity"})
	public void createUser() {
		System.out.println("User is created");
	}
	@Test (groups = {"Regression"})
	public void Updateuser() {
		System.out.println("updating from user");
	}
	@Test (groups = {"Sanity","Regression"})
	public void Deleteuser() {
		System.out.println("Deleting by user");
	}
	@Test (groups = {"Smoke"})
	public void Viewuser() {
		System.out.println("Viewed by user");
	}

}
