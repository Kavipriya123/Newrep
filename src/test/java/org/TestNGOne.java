package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOne {
	
	@BeforeClass
	public void tc345678() {
		System.out.println(123);
	}
	@AfterClass
	public void tc1098765() {
		System.out.println(12345);
	}
	
	public void tc7654() {
		System.out.println("tc7");
}
	@Test
	public void tc9876548() {
		System.out.println("tc8");
	}}