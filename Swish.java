class Swish {

	public static double search (String item) {
		System.out.println ("Search started");
		
	double price = 0.0;
	
	if (item == "Burger") {
		price = 99.00;
		} else if (item == "Pizza") {
		price = 129.00;
		} else if (item == "Veg Biriyani") {
		price = 224.00;
		} else if (item == "Sandwich") {
		price = 67.00;
		} else if (item == "Cold Coffee") {
		price = 119.00;
		} else if (item == "Maggie") {
			price = 79.00;
		} 
			
		
	System.out.println("Search ended");
		return price;
	}
	
	public static void main (String [] food) {
		System.out.println("Main started");
		
	String itemName = "Cold Coffee";
	
	double price = search(itemName);
		System.out.println("The price of " + itemName + " is " + price);
		
		System.out.println("Main ended");
		
	}
	
}