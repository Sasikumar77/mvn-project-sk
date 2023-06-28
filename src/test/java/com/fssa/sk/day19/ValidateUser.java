package com.fssa.sk.day19;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Assertions;


//Create a class for assigning the value of user set the methods for set and get values
class User {

	int id;
	String name;
	String password;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

//Create a class for validating user info with a method called validate
class UserValidator {

	// This method validate a data of User
	static boolean validate(User user) throws IllegalArgumentException {

		// Regular expressions for separate data's
		String idRegex = "^[1-9][0-9]*$";
		String nameRegex = "^.{3,}$";
		String passwordREgex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		// Matching the Regular expressions with the string values
		Boolean isIdMatch = Pattern.matches(idRegex, user.id + "");
		Boolean isNameMatch = Pattern.matches(nameRegex, user.name);
		Boolean isPasswordMatch = Pattern.matches(passwordREgex, user.password);
		Boolean isEmailMatch = Pattern.matches(emailRegex, user.email);

		
		//count for verify all data
		int count = 0;
		// Print the values is valid or not valid
		if (isIdMatch) {
		 count++;
		} 

		if (isNameMatch) {
			count++;
		} 

		if (isPasswordMatch) {
			count++;
		} 

		if (isEmailMatch) {
			count++;
		} 
		
		if(count == 4) {
			return true;
		}
		else {
			throw new IllegalArgumentException("User is not valid");
		}
		
	}
}

public class ValidateUser {

	public static void main(String[] args) {

		//Create a new user object
		User user = new User();

		//Set the values with set methods
		user.setId(17);
		user.setName("sasikumar");
		user.setPassword("12092004#Sk");
		user.setEmail("sasigmail.com");

		//Validate the data by passing the object
		Assertions.assertTrue(UserValidator.validate(user));
		try {
			UserValidator.validate(user);
//			Assertions.fail("user invalid");
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}
}

