class ZeptoCafe {

    public static double search(String item) {

        System.out.println("Search started");

        double price = 0.0;

        if (item == "Veg Momos") {
            price = 149.00;
        }
        else if (item == "Chicken Momos") {
            price = 179.00;
        }
        else if (item == "Cheese Momos") {
            price = 189.00;
        }
        else if (item == "Veg Roll") {
            price = 119.00;
        }
        else if (item == "Egg Roll") {
            price = 139.00;
        }
        else if (item == "Chicken Roll") {
            price = 169.00;
        }
        else if (item == "Veg Puff") {
            price = 45.00;
        }
        else if (item == "Egg Puff") {
            price = 55.00;
        }
        else if (item == "Chicken Puff") {
            price = 69.00;
        }
        else if (item == "Veg Cutlet") {
            price = 59.00;
        }
        else if (item == "Aloo Tikki") {
            price = 79.00;
        }
        else if (item == "Veg Nuggets") {
            price = 129.00;
        }
        else if (item == "Cheese Balls") {
            price = 149.00;
        }
        else if (item == "Garlic Breadsticks") {
            price = 129.00;
        }
        else if (item == "Paneer Wrap") {
            price = 179.00;
        }
        else if (item == "Mexican Rice") {
            price = 199.00;
        }
        else if (item == "Veg Lasagna") {
            price = 249.00;
        }
        else if (item == "Chicken Lasagna") {
            price = 289.00;
        }
        else if (item == "Mushroom Soup") {
            price = 159.00;
        }
        else if (item == "Sweet Corn Soup") {
            price = 149.00;
        }
        else if (item == "Hot Chocolate") {
            price = 169.00;
        }
        else if (item == "Vanilla Shake") {
            price = 159.00;
        }
        else if (item == "Strawberry Shake") {
            price = 169.00;
        }
        else if (item == "Blueberry Smoothie") {
            price = 219.00;
        }
        else if (item == "Chocolate Muffin") {
            price = 89.00;
        }
        else if (item == "Blueberry Muffin") {
            price = 99.00;
        }
        else if (item == "Croissant") {
            price = 119.00;
        }
        else if (item == "Garlic Toast") {
            price = 99.00;
        }
        else if (item == "Veg Taco") {
            price = 149.00;
        }
        else if (item == "Chicken Taco") {
            price = 179.00;
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

        if (item == "Veg Momos") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Chicken Momos") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Cheese Momos") {
            totalPrice = 189.00 * quantity;
        }
        else if (item == "Veg Roll") {
            totalPrice = 119.00 * quantity;
        }
        else if (item == "Egg Roll") {
            totalPrice = 139.00 * quantity;
        }
        else if (item == "Chicken Roll") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Veg Puff") {
            totalPrice = 45.00 * quantity;
        }
        else if (item == "Egg Puff") {
            totalPrice = 55.00 * quantity;
        }
        else if (item == "Chicken Puff") {
            totalPrice = 69.00 * quantity;
        }
        else if (item == "Veg Cutlet") {
            totalPrice = 59.00 * quantity;
        }
        else if (item == "Aloo Tikki") {
            totalPrice = 79.00 * quantity;
        }
        else if (item == "Veg Nuggets") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Cheese Balls") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Garlic Breadsticks") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Paneer Wrap") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Mexican Rice") {
            totalPrice = 199.00 * quantity;
        }
        else if (item == "Veg Lasagna") {
            totalPrice = 249.00 * quantity;
        }
        else if (item == "Chicken Lasagna") {
            totalPrice = 289.00 * quantity;
        }
        else if (item == "Mushroom Soup") {
            totalPrice = 159.00 * quantity;
        }
        else if (item == "Sweet Corn Soup") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Hot Chocolate") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Vanilla Shake") {
            totalPrice = 159.00 * quantity;
        }
        else if (item == "Strawberry Shake") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Blueberry Smoothie") {
            totalPrice = 219.00 * quantity;
        }
        else if (item == "Chocolate Muffin") {
            totalPrice = 89.00 * quantity;
        }
        else if (item == "Blueberry Muffin") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Croissant") {
            totalPrice = 119.00 * quantity;
        }
        else if (item == "Garlic Toast") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Veg Taco") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Chicken Taco") {
            totalPrice = 179.00 * quantity;
        }
        else {
            System.out.println("Item not found");
        }

        System.out.println("Search with Quantity ended");
        return totalPrice;
		
    }

    public static void main(String[] eat) {

        System.out.println("Main started");

        String itemName = "Veg Momos";
        int quantity = 2;

        double price = search(itemName);
        System.out.println("Price of " + itemName + " is Rs." + price);

        double totalPrice = search(itemName, quantity);
        System.out.println("Total price of " + quantity + " " + itemName + " is Rs." + totalPrice);

        System.out.println("Main ended");
    }
	
	
	
	
}