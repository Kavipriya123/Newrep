package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOne {
	
	@BeforeClass
	public void tc() {
		System.out.println(123);
	}
	@AfterClass
	public void tc1() {
		System.out.println(12345);
	}
	@BeforeMethod
	public void tc2() {
		System.out.println(123123);
	}
	@AfterMethod
	public void tc3() {
		System.out.println("1234567asdfg");
	}
	@Test
	public void tc4() {
		System.out.println("asdf");
	}
	@Test
	public void tc5() {
		System.out.println("tc5");
	}
	@Test
	public void tc6() {
		System.out.println("tc6");
}
	@Test
	public void tc7() {
		System.out.println("tc7");
}
	@Test
	public void tc8() {
		System.out.println("tc8");
	}}