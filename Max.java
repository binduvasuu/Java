class Max {

	public static void personalDetails (String firstName, String lastName, long phoneNumber, String emailID, String birthday, String gender) {
	
	System.out.println("Personal details creation started");
	
	
	if (firstName!= null){	
	System.out.println("First Name is " + firstName);
	}  else  {
		
		System.out.println("Invalid First name");
	}
	
	if (lastName!= null){
	System.out.println("Last Name is " + lastName);
	}else {
		System.out.println("Invalid Last name");
	}
	
	if (phoneNumber > 0 ) {
	System.out.println("Phone number is " + phoneNumber);
	}else {
		System.out.println("Invalid Phone number");
	}
	
	if (emailID != null) {
	System.out.println("Email is " + emailID);
	} else {
		System.out.println("Invalid Email ID");
	}
	
	if (birthday != null ) {
	System.out.println("Birthday is " + birthday);
	} else {
		System.out.println ("Invalid Birthday");
	}
	
	if (gender != null ) {
	System.out.println("Gender is " + gender);
	} else {
		System.out.println("Invalid Gender specified");
	}
	
	System.out.println("Creation ended");

	
	}
  
	public static void main (String [] bindu) {
	
	personalDetails("Bindu", "K V", 9865547165l ,"bindupoorvi@gmail.com", "11 April 2004", "Female");
	
	
	}

}