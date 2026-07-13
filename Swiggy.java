class Swiggy {
		
		public static void search(String item) {
			System.out.println("Serach started");
			double price = 99.00;
        System.out.println("Price of " + item + "is " + price);
		System.out.println("Search ended");
    }

	
	
	public static void main (String [] bindu)  {
		System.out.println("Main started");
		
	
		//search("Burger");
		
		
		 String item = "Burger";
		search(item); 
		
		System.out.println("Main ended");
			                    
	
	}

}