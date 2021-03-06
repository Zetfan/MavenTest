package com.exempel018.MavenTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods mrm = new MyRandomMethods();

	@Test
	public void testBetween1and10() {
		int result = mrm.randomBetween1and10();
		assertTrue((result >= 1) && (result <=10));

	}
	
	@Test
	public void testBetween11and20() {
		int result = mrm.randomBetween11and20();
		assertTrue((result >= 11) && (result <=20));

	}
	
	@Test
	public void testBetween21and30() {
		int result = mrm.randomBetween21and30();
		assertTrue((result >= 21) && (result <=30));

	}
	
	@Test
	public void testBetween31and40() {
		int result = mrm.randomBetween31and40();
		assertTrue((result >= 31) && (result <=40));

	}
	
	@Test
	public void testBetween41and50() {
		int result = mrm.randomBetween41and50();
		assertTrue((result >= 41) && (result <=50));

	}

}
