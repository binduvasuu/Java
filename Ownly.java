class Ownly {

    public static double search(String item) {
		
        System.out.println("Search started");

        double price = 0.0;

        if (item == "Masala Dosa") {
            price = 149.00;
        }
        else if (item == "Plain Dosa") {
            price = 99.00;
        }
        else if (item == "Rava Dosa") {
            price = 179.00;
        }
        else if (item == "Onion Dosa") {
            price = 159.00;
        }
        else if (item == "Mysore Dosa") {
            price = 169.00;
        }
        else if (item == "Set Dosa") {
            price = 129.00;
        }
        else if (item == "Poori Bhaji") {
            price = 149.00;
        }
        else if (item == "Uttapam") {
            price = 169.00;
        }
        else if (item == "Pongal") {
            price = 119.00;
        }
        else if (item == "Rava Idli") {
            price = 99.00;
        }
        else if (item == "Masala Vada") {
            price = 89.00;
        }
        else if (item == "Curd Rice") {
            price = 119.00;
        }
        else if (item == "Lemon Rice") {
            price = 129.00;
        }
        else if (item == "Tamarind Rice") {
            price = 139.00;
        }
        else if (item == "Coconut Rice") {
            price = 149.00;
        }
        else if (item == "Jeera Rice") {
            price = 149.00;
        }
        else if (item == "Veg Pulao") {
            price = 189.00;
        }
        else if (item == "Aloo Paratha") {
            price = 129.00;
        }
        else if (item == "Paneer Paratha") {
            price = 169.00;
        }
        else if (item == "Gobi Paratha") {
            price = 149.00;
        }
        else if (item == "Butter Naan") {
            price = 59.00;
        }
        else if (item == "Garlic Naan") {
            price = 79.00;
        }
        else if (item == "Tandoori Roti") {
            price = 35.00;
        }
        else if (item == "Rumali Roti") {
            price = 45.00;
        }
        else if (item == "Malai Kofta") {
            price = 299.00;
        }
        else if (item == "Dal Makhani") {
            price = 249.00;
        }
        else if (item == "Rajma Masala") {
            price = 219.00;
        }
        else if (item == "Palak Paneer") {
            price = 279.00;
        }
        else if (item == "Kadai Paneer") {
            price = 289.00;
        }
        else if (item == "Shahi Paneer") {
            price = 309.00;
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

        if (item == "Masala Dosa") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Plain Dosa") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Rava Dosa") {
            totalPrice = 179.00 * quantity;
        }
        else if (item == "Onion Dosa") {
            totalPrice = 159.00 * quantity;
        }
        else if (item == "Mysore Dosa") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Set Dosa") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Poori Bhaji") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Uttapam") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Pongal") {
            totalPrice = 119.00 * quantity;
        }
        else if (item == "Rava Idli") {
            totalPrice = 99.00 * quantity;
        }
        else if (item == "Masala Vada") {
            totalPrice = 89.00 * quantity;
        }
        else if (item == "Curd Rice") {
            totalPrice = 119.00 * quantity;
        }
        else if (item == "Lemon Rice") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Tamarind Rice") {
            totalPrice = 139.00 * quantity;
        }
        else if (item == "Coconut Rice") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Jeera Rice") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Veg Pulao") {
            totalPrice = 189.00 * quantity;
        }
        else if (item == "Aloo Paratha") {
            totalPrice = 129.00 * quantity;
        }
        else if (item == "Paneer Paratha") {
            totalPrice = 169.00 * quantity;
        }
        else if (item == "Gobi Paratha") {
            totalPrice = 149.00 * quantity;
        }
        else if (item == "Butter Naan") {
            totalPrice = 59.00 * quantity;
        }
        else if (item == "Garlic Naan") {
            totalPrice = 79.00 * quantity;
        }
        else if (item == "Tandoori Roti") {
            totalPrice = 35.00 * quantity;
        }
        else if (item == "Rumali Roti") {
            totalPrice = 45.00 * quantity;
        }
        else if (item == "Malai Kofta") {
            totalPrice = 299.00 * quantity;
        }
        else if (item == "Dal Makhani") {
            totalPrice = 249.00 * quantity;
        }
        else if (item == "Rajma Masala") {
            totalPrice = 219.00 * quantity;
        }
        else if (item == "Palak Paneer") {
            totalPrice = 279.00 * quantity;
        }
        else if (item == "Kadai Paneer") {
            totalPrice = 289.00 * quantity;
        }
        else if (item == "Shahi Paneer") {
            totalPrice = 309.00 * quantity;
        }
        else {
            System.out.println("Item not found");
        }
		
		

        System.out.println("Search with Quantity ended");
        return totalPrice;
		
    }

    public static void main(String[] eat) {

        System.out.println("Main started");

        String itemName = "Masala Dosa";
		
        int quantity = 2;

        double price = search(itemName);
        System.out.println("Price of " + itemName + " is Rs." + price);

        double totalPrice = search(itemName, quantity);
		
        System.out.println("Total price of " + quantity + " " + itemName + " is Rs." + totalPrice);

        System.out.println("Main ended");
    }
	
	
	
}