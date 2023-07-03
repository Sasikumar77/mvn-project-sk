package com.fssa.sk.holidayhomework;

import org.junit.jupiter.api.Assertions;

public class MobileTestCase {
	//@Test 1
	public void testName() {
		String name = "IQOO z6 5g";
		Assertions.assertTrue(MobValidate.validateName(name));
	}
	
	//@Test 2
	public void testPrice() {
		String price = "$999";
		Assertions.assertTrue(MobValidate.validatePrice(price));
	}
	
	//@Test 3
	public void testRam() {
		int ram = 6;
		Assertions.assertTrue(MobValidate.validateRam(ram));
	}
	
	//@Test 4
	public void testStorage() {
		int storage = 128;
		Assertions.assertTrue(MobValidate.validateRam(storage));
	}
}
