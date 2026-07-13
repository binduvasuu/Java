class Toing {
    public static double search(String item) {
        System.out.println("Search started");

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
        } else if (item == "Dosa") {
            price = 80.00;
        } else if (item == "Idli") {
            price = 40.00;
        } else if (item == "Vada") {
            price = 35.00;
        } else if (item == "Pasta") {
            price = 149.00;
        } else if (item == "Noodles") {
            price = 99.00;
        } else if (item == "Fried Rice") {
            price = 139.00;
        } else if (item == "Paneer Butter Masala") {
            price = 189.00;
        } else if (item == "Chapathi") {
            price = 25.00;
        } else if (item == "Parotta") {
            price = 30.00;
        } else if (item == "Chicken Biryani") {
            price = 249.00;
        } else if (item == "French Fries") {
            price = 89.00;
        } else if (item == "Ice Cream") {
            price = 60.00;
        } else if (item == "Milk Shake") {
            price = 110.00;
        } else if (item == "Tea") {
            price = 20.00;
        } else if (item == "Coffee") {
            price = 25.00;
        } else if (item == "Lemon Juice") {
            price = 35.00;
        } else if (item == "Mojito") {
            price = 99.00;
        } else if (item == "Samosa") {
            price = 20.00;
        } else if (item == "Pani Puri") {
            price = 40.00;
        } else if (item == "Gobi Manchurian") {
            price = 129.00;
        } else if (item == "Spring Roll") {
            price = 99.00;
        } else if (item == "Chocolate Cake") {
            price = 180.00;
        } else if (item == "Donut") {
            price = 70.00;
        } else if (item == "Brownie") {
            price = 90.00;
        }

        System.out.println("Search ended");
        return price;
		
		
		
    }
	
	
    public static double search(String item, int quantity) {
        System.out.println("Search with Quantity started");

        double totalPrice = 0.0;

        if (item == "Burger") {
            totalPrice = 99.00 * quantity;
        } else if (item == "Pizza") {
            totalPrice = 129.00 * quantity;
        } else if (item == "Veg Biriyani") {
            totalPrice = 224.00 * quantity;
        } else if (item == "Sandwich") {
            totalPrice = 67.00 * quantity;
        } else if (item == "Cold Coffee") {
            totalPrice = 119.00 * quantity;
        } else if (item == "Maggie") {
            totalPrice = 79.00 * quantity;
        } else if (item == "Dosa") {
            totalPrice = 80.00 * quantity;
        } else if (item == "Idli") {
            totalPrice = 40.00 * quantity;
        } else if (item == "Vada") {
            totalPrice = 35.00 * quantity;
        } else if (item == "Pasta") {
            totalPrice = 149.00 * quantity;
        } else if (item == "Noodles") {
            totalPrice = 99.00 * quantity;
        } else if (item == "Fried Rice") {
            totalPrice = 139.00 * quantity;
        } else if (item == "Paneer Butter Masala") {
            totalPrice = 189.00 * quantity;
        } else if (item == "Chapathi") {
            totalPrice = 25.00 * quantity;
        } else if (item == "Parotta") {
            totalPrice = 30.00 * quantity;
        } else if (item == "Chicken Biryani") {
            totalPrice = 249.00 * quantity;
        } else if (item == "French Fries") {
            totalPrice = 89.00 * quantity;
        } else if (item == "Ice Cream") {
            totalPrice = 60.00 * quantity;
        } else if (item == "Milk Shake") {
            totalPrice = 110.00 * quantity;
        } else if (item == "Tea") {
            totalPrice = 20.00 * quantity;
        } else if (item == "Coffee") {
            totalPrice = 25.00 * quantity;
        } else if (item == "Lemon Juice") {
            totalPrice = 35.00 * quantity;
        } else if (item == "Mojito") {
            totalPrice = 99.00 * quantity;
        } else if (item == "Samosa") {
            totalPrice = 20.00 * quantity;
        } else if (item == "Pani Puri") {
            totalPrice = 40.00 * quantity;
        } else if (item == "Gobi Manchurian") {
            totalPrice = 129.00 * quantity;
        } else if (item == "Spring Roll") {
            totalPrice = 99.00 * quantity;
        } else if (item == "Chocolate Cake") {
            totalPrice = 180.00 * quantity;
        } else if (item == "Donut") {
            totalPrice = 70.00 * quantity;
        } else if (item == "Brownie") {
            totalPrice = 90.00 * quantity;
        }

        System.out.println("Search with Quantity ended");
        return totalPrice;
		
		
    }

    public static void main(String[] food) {

        System.out.println("Main started");

        String itemName = "Pizza";
        int quantity = 3;

        double price = search(itemName);
        System.out.println("Price of " + itemName + " is Rs." + price);

        double totalPrice = search(itemName, quantity);
        System.out.println("Total price of " + quantity + " " + itemName + " is Rs." + totalPrice);

        System.out.println("Main ended");
    }
	
	
}