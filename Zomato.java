class Zomato {

	public static void createAccount (String name, String emial, long phoneNumber, String location, boolean veg, int age) {
	
	System.out.println("Account creation started");
	
	System.out.println("Name is " + name);
	System.out.println("Email is " + emial);
	System.out.println("Phone number is " + phoneNumber);
	System.out.println("Loaction is " + location);
	System.out.println("Is veg " + veg);
	System.out.println("Age is " + age);
	
	} 

	public static void main (String[] bindu) {
	
	createAccount("Bindu", "bindu11@gmail.com", 9844301625l, "Bangalore", true, 22);
	
	}


}