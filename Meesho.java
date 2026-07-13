class Meesho {

	public static void login (Long phoneNumber, String email, String password,int otp) {
	
		System.out.println("The Phone Number is " + phoneNumber);
		System.out.println("E-mail is " + email);
		System.out.println("The password is " + password);
		System.out.println("The otp is " + otp);
		
	
	}
	
	public static void forgotPassword (String code) {
		System.out.println("The verification code is " + code);
	}
	
	
	public static void search (String items, String product) {
		System.out.println("The items are of :" + items);
		System.out.println("The search is for " + product);
	}
	
	


	

	public static void main (String [] bindu) {
	
		login (94625887621L ,"bindu@11", "binduuu", 2394);
		forgotPassword("bU5pt");
		search ("General Categories", "Popular products");
	
	
	}




}