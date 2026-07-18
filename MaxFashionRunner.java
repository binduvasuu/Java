class MaxFashionRunner {


	public static void main (String [] bindu) {
		
	
	
	

	boolean isCreated =  MaxFashion.saveMaxAccount("Bindu", null, "20-05-2004", 9876543210L, "bindu@gmail.com", "Bindu@123");
	System.out.println ("Account is created " + isCreated);
	
	if (isCreated == true)
		MaxFashion.getMaxAccount();
			else
				System.out.println("No Account Details Found");
		
		
	
	
	


	
	}

}