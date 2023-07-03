package com.fssa.sk.holidayhomework;

import java.util.regex.Pattern;

/*
 * This code for validate Mobile phone data  
 */
	
	class MobValidate {
		
		public static boolean validate(Mobile mobile)
				throws IllegalArgumentException {

			// check for nullity of the parameter
			if (mobile == null) {
				throw new IllegalArgumentException("Argument is " + "NULL");
			}
			// Check for name, name should only have alphabets
			// For Simplicity, Check if name has length of 2.
			validateName(mobile.name);
			validatePrice(mobile.price);
			validateRam(mobile.ram);
			validateStorage(mobile.storage);
			return true;
			}

		
		
		
		//Validate the mobile name
		public static boolean validateName(String name)
				throws IllegalArgumentException {
			if (name == null || "".equals(name.trim()) || name.length() < 4) {
				throw new IllegalArgumentException(
						"Name cannot " + "be empty or null");
			}
			return true;
		}
		
		//validate the mobile price
		public static boolean validatePrice(String price) throws IllegalArgumentException{
			
			String pricePattern = "\\$\\d+(\\.\\d{2})?";
			Pattern regexPattern = Pattern.compile(pricePattern);
			Boolean isPriceMatch = Pattern.matches(pricePattern,price);
			
			if(isPriceMatch) {
				return true;
			}
			else
				throw new IllegalArgumentException("Mobile price is invalid");
		}
		
		//verify Mobile ram
		public static boolean validateRam(int ram) throws IllegalArgumentException{
			if(ram == 1 || ram == 2 || ram == 3 || ram == 4 || ram == 6 || ram == 8 || ram == 12) {
				return true;
			}
			else
				throw new IllegalArgumentException("Mobile ram is invalid");
		}
		
		//Verify Mobile storage
		public static boolean validateStorage(int storage) throws IllegalArgumentException{
			if(storage == 16 || storage == 32 || storage == 64 || storage == 128 || storage == 256 || storage == 512) {
				return true;
			}
			else
				throw new IllegalArgumentException("Mobile storage is invalid");
		}
		
		
	}

public class MobileValidate {
	public static void main(String[] args) {
		
		Mobile redmi = new Mobile();
		redmi.setName("Redmi 12 pro");
		redmi.setPrice("$9999");
		redmi.setRam(12);
		redmi.setStorage(128);
		MobValidate.validate(redmi);
		
	}
}
