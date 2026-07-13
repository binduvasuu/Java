class Blinkit {

    public static double search(String item) {
        System.out.println("Search started");

        double price = 0.0;

        if (item == "Basmati Rice 5kg") {
            price = 549.00;
        }
        else if (item == "Wheat Flour 5kg") {
            price = 269.00;
        }
        else if (item == "Sugar 1kg") {
            price = 52.00;
        }
        else if (item == "Salt 1kg") {
            price = 28.00;
        }
        else if (item == "Turmeric Powder") {
            price = 45.00;
        }
        else if (item == "Chilli Powder") {
            price = 65.00;
        }
        else if (item == "Coriander Powder") {
            price = 55.00;
        }
        else if (item == "Cumin Seeds") {
            price = 89.00;
        }
        else if (item == "Mustard Seeds") {
            price = 42.00;
        }
        else if (item == "Sunflower Oil 1L") {
            price = 179.00;
        }
        else if (item == "Groundnut Oil 1L") {
            price = 199.00;
        }
        else if (item == "Milk 1L") {
            price = 68.00;
        }
        else if (item == "Curd 500g") {
            price = 42.00;
        }
        else if (item == "Butter 500g") {
            price = 289.00;
        }
        else if (item == "Cheese Slices") {
            price = 145.00;
        }
        else if (item == "Paneer 200g") {
            price = 95.00;
        }
        else if (item == "Bread") {
            price = 45.00;
        }
        else if (item == "Eggs 12 pcs") {
            price = 96.00;
        }
        else if (item == "Banana") {
            price = 60.00;
        }
        else if (item == "Apple") {
            price = 180.00;
        }
        else if (item == "Orange") {
            price = 120.00;
        }
        else if (item == "Mango") {
            price = 160.00;
        }
        else if (item == "Potato 1kg") {
            price = 48.00;
        }
        else if (item == "Onion 1kg") {
            price = 55.00;
        }
        else if (item == "Tomato 1kg") {
            price = 42.00;
        }
        else if (item == "Carrot 500g") {
            price = 40.00;
        }
        else if (item == "Cabbage") {
            price = 38.00;
        }
        else if (item == "Cauliflower") {
            price = 55.00;
        }
        else if (item == "Capsicum") {
            price = 70.00;
        }
        else if (item == "Green Peas") {
            price = 85.00;
        }
        else {
            System.out.println("Item not found");
			
        }

        System.out.println("Search ended");
        return price;
    }

    public static double search(String item, int quantity) {
        System.out.println("Search with Quantity started");

        double totalPrice = 0.0;

        if (item == "Basmati Rice 5kg") {
            totalPrice = 549.00 * quantity;
        }
        else if (item == "Wheat Flour 5kg") {
            totalPrice = 269.00 * quantity;
        }
        else if (item == "Sugar 1kg") {
            totalPrice = 52.00 * quantity;
        }
        else if (item == "Salt 1kg") {
            totalPrice = 28.00 * quantity;
        }
        else if (item == "Turmeric Powder") {
            totalPrice = 45.00 * quantity;
        }
        else if (item == "Chilli Powder") {
            totalPrice = 65.00 * quantity;
        }
        else if (item == "Coriander Powder") {
            totalPrice = 55.00 * quantity;
        }
        else if (item == "Cumin Seeds") {
            totalPrice = 89.00 * quantity;
        }
        else if (item == "Mustard Seeds") {
            totalPrice = 42.00 * quantity;
        }
        else if (item == "Sunflower Oil 1L") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Groundnut Oil 1L") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Milk 1L") {
            totalPrice = 68.00 * quantity;
        }
        else if (item == "Curd 500g") {
            totalPrice = 42.00 * quantity;
        }
        else if (item == "Butter 500g") {
            totalPrice = 289.00 * quantity;
        }
        else if (item == "Cheese Slices") {
            totalPrice = 145.00 * quantity;
        }
        else if (item == "Paneer 200g") {
            totalPrice = 95.00 * quantity;
        }
        else if (item == "Bread") {
            totalPrice = 45.00 * quantity;
        }
        else if (item == "Eggs 12 pcs") {
            totalPrice = 96.00 * quantity;
        }
        else if (item == "Banana") {
            totalPrice = 60.00 * quantity;
        }
        else if (item == "Apple") {
            totalPrice = 180.00 * quantity;
        }
        else if (item == "Orange") {
            totalPrice = 120.00 * quantity;
        }
        else if (item == "Mango") {
            totalPrice = 160.00 * quantity;
        }
        else if (item == "Potato 1kg") {
            totalPrice = 48.00 * quantity;
        }
        else if (item == "Onion 1kg") {
            totalPrice = 55.00 * quantity;
        }
        else if (item == "Tomato 1kg") {
            totalPrice = 42.00 * quantity;
        }
        else if (item == "Carrot 500g") {
            totalPrice = 40.00 * quantity;
        }
        else if (item == "Cabbage") {
            totalPrice = 38.00 * quantity;
        }
        else if (item == "Cauliflower") {
            totalPrice = 55.00 * quantity;
        }
        else if (item == "Capsicum") {
            totalPrice = 70.00 * quantity;
        }
        else if (item == "Green Peas") {
            totalPrice = 85.00 * quantity;
        }
        else {
            System.out.println("Item not found");
        }
		

        System.out.println("Search with Quantity ended");
        return totalPrice;
		
		
		
		
    }

    public static void main(String[] eat) {

        System.out.println("Main started");

        String itemName = "Milk 1L";
		
        int quantity = 3;

        double price = search(itemName);
        System.out.println("Price of " + itemName + " is Rs." + price);

        double totalPrice = search(itemName, quantity);
        System.out.println("Total price of " + quantity + " " + itemName + " is Rs." + totalPrice);

        System.out.println("Main ended");
    }
	
}