class Amazon {

	public static void createAccount (String name, String email, long phoneNumber, String password, String address, String gender, int age) {
	
	System.out.println("Account creation started");
	
	System.out.println("Name is " + name);
	System.out.println("Email is " + email);
	System.out.println("Phone number is " + phoneNumber);
	System.out.println("Password is " + password);
	System.out.println("Address is " + address);
	System.out.println("Gender is " + gender);
	System.out.println("Age is " + age);
	
	System.out.println("Account creation done");
	
	}
	
	
	public static void main (String [] bindu) {
		createAccount("Bindu", "bindu11@gmailcom", 9846658743l, "Bindu@123", "Bangalore", "Female", 22);
	
	}
}