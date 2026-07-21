class MaxFashion {

	static String firstName;
	static String lastName;
	static String dOB;
	static long phoneNumber;
	static String email;
	static String password;


	 public static boolean saveMaxAccount (String fName,String lName,String dateofBirth, long contactNumber, String eID, String pwd) {
	 
	 
	 boolean isCreated = false;
	 
	 
	 boolean isFirstNameValid = false;
	 boolean isLastNameValid = false;
	 boolean isdOBValid = false;
	 boolean isPhonenumberValid = false;
	 boolean isEmailValid = false;
	 boolean isPasswordValid = false;
	 
	 
	 
	 
	 if (fName != null) {
	 firstName = fName;
	 isFirstNameValid = true;
	 } else System.out.println("Invlid First Name");
	 
	 if (lName != lastName) {
	 lastName = lName;
	 isLastNameValid = true;
	 } else System.out.println("Invalid Last name");
	 
	 if (dateofBirth != dOB) {
	 dOB = dateofBirth;
	 isdOBValid = true;
	 } else System.out.println("Inva;id Date of Birth");
	 
	 if (contactNumber != phoneNumber) {
	 phoneNumber = contactNumber;
	 isPhonenumberValid = true;
	 } else System.out.println("Invalid Contact Number");
	 
	 if (eID != email) {
	 email = eID;
	 isEmailValid = true;
	 } else System.out.println("Invalid Email ID");
	 
	 if (pwd != password) {
	 password = pwd;
	 isPasswordValid = true;
	 } else System.out.println("Invalid Password");
	 
	 
	 if (isFirstNameValid == true && isLastNameValid == true && isdOBValid == true && 
			isPhonenumberValid == true && isEmailValid == true && isPasswordValid == true) {
		 isCreated = true;
	 }
	 
	 
	  return isCreated;
	 
	 
	 }
	 
	 public static void getMaxAccount() {
	 
	
	System.out.println("The First Name is " + firstName);
    System.out.println("The Last Name is " + lastName);
    System.out.println("Date of Birth is " + dOB);
    System.out.println("Phone Number is " + phoneNumber);
    System.out.println("Email is " + email);
    System.out.println("The Password is " + password);
	 
	 }
}