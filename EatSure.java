class EatSure {

    public static double search(String item) {
        System.out.println("Search started");
		

        double price = 0.0;

        if (item == "Veg Thali") {
            price = 249.00;
        }
        else if (item == "Mini Meals") {
            price = 179.00;
        }
        else if (item == "Chicken Thali") {
            price = 329.00;
        }
        else if (item == "Mutton Thali") {
            price = 429.00;
        }
        else if (item == "Egg Curry") {
            price = 199.00;
        }
        else if (item == "Veg Fried Momos") {
            price = 169.00;
        }
        else if (item == "Chicken Fried Momos") {
            price = 199.00;
        }
        else if (item == "Stuffed Garlic Bread") {
            price = 189.00;
        }
        else if (item == "Cheese Sandwich") {
            price = 149.00;
        }
        else if (item == "Paneer Sandwich") {
            price = 179.00;
        }
        else if (item == "Chicken Sandwich") {
            price = 199.00;
        }
        else if (item == "Veg Hot Dog") {
            price = 159.00;
        }
        else if (item == "Chicken Hot Dog") {
            price = 189.00;
        }
        else if (item == "Veg Quesadilla") {
            price = 219.00;
        }
        else if (item == "Chicken Quesadilla") {
            price = 259.00;
        }
        else if (item == "Nachos") {
            price = 169.00;
        }
        else if (item == "Cheese Nachos") {
            price = 199.00;
        }
        else if (item == "Veg Sizzler") {
            price = 349.00;
        }
        else if (item == "Chicken Sizzler") {
            price = 399.00;
        }
        else if (item == "Paneer Sizzler") {
            price = 369.00;
        }
        else if (item == "Chocolate Pastry") {
            price = 99.00;
        }
        else if (item == "Pineapple Pastry") {
            price = 99.00;
        }
        else if (item == "Butterscotch Pastry") {
            price = 109.00;
        }
        else if (item == "Vanilla Ice Cream") {
            price = 79.00;
        }
        else if (item == "Mango Ice Cream") {
            price = 89.00;
        }
        else if (item == "Butter Scotch Ice Cream") {
            price = 99.00;
        }
        else if (item == "Lassi") {
            price = 89.00;
        }
        else if (item == "Sweet Lassi") {
            price = 99.00;
        }
        else if (item == "Badam Milk") {
            price = 129.00;
        }
        else if (item == "Fresh Lime Juice") {
            price = 79.00;
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

        if (item == "Veg Thali") {
            totalPrice = 249.00 * quantity;
        }
        else if (item == "Mini Meals") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Chicken Thali") {
            totalPrice = 329.00 * quantity;
        }
        else if (item == "Mutton Thali") {
            totalPrice = 429.00 * quantity;
        }
        else if (item == "Egg Curry") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Veg Fried Momos") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Chicken Fried Momos") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Stuffed Garlic Bread") {
            totalPrice = 189.00 * quantity;
        }
        else if (item == "Cheese Sandwich") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Paneer Sandwich") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Chicken Sandwich") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Veg Hot Dog") {
            totalPrice = 159.00 * quantity;
        }
        else if (item == "Chicken Hot Dog") {
            totalPrice = 189.00 * quantity;
        }
        else if (item == "Veg Quesadilla") {
            totalPrice = 219.00 * quantity;
        }
        else if (item == "Chicken Quesadilla") {
            totalPrice = 259.00 * quantity;
        }
        else if (item == "Nachos") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Cheese Nachos") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Veg Sizzler") {
            totalPrice = 349.00 * quantity;
        }
        else if (item == "Chicken Sizzler") {
            totalPrice = 399.00 * quantity;
        }
        else if (item == "Paneer Sizzler") {
            totalPrice = 369.00 * quantity;
        }
        else if (item == "Chocolate Pastry") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Pineapple Pastry") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Butterscotch Pastry") {
            totalPrice = 109.00 * quantity;
        }
        else if (item == "Vanilla Ice Cream") {
            totalPrice = 79.00 * quantity;
        }
        else if (item == "Mango Ice Cream") {
            totalPrice = 89.00 * quantity;
        }
        else if (item == "Butter Scotch Ice Cream") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Lassi") {
            totalPrice = 89.00 * quantity;
        }
        else if (item == "Sweet Lassi") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Badam Milk") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Fresh Lime Juice") {
            totalPrice = 79.00 * quantity;
        }
        else {
            System.out.println("Item not found");
        }
		

        System.out.println("Search with Quantity ended");
        return totalPrice;
		
    }
    public static void main(String[]eat) {


        System.out.println("Main started");

        String itemName = "Veg Thali";
		
        int quantity = 2;

        double price = search(itemName);
        System.out.println("Price of " + itemName + " is Rs." + price);

        double totalPrice = search(itemName, quantity);
        System.out.println("Total price of " + quantity + " " + itemName + " is Rs." + totalPrice);

        System.out.println("Main ended");
		
		
    }
	
	
	
}