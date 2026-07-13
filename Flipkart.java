class Flipkart {

	public static void createAccount(String name, String email, long phone, String password, String city, String state, int pincode){
	
	System.out.println ("Account creation started");
	
	System.out.println("Name is " + name);
	System.out.println("Email is " + email);
	System.out.println("Phone number is " + phone);
	System.out.println("Passowrd is " + password);
	System.out.println("City is " + city);
	System.out.println("State is " + state);
	System.out.println("Pincode is " + pincode);
	
	System.out.println("Accounted created");
	
	}

	public static void main (String [] bindu) {
	
	createAccount("Bindu", "bindu@gmail.com", 9534661027l, "Flip@123", "Bangalore", "Karnataka", 568977);
	
	}



}