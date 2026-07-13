class MaggieIngredients {
    public static void main(String maggie[]) {
        String productName = "Maggi 2-Minute Noodles";
        String brand = "Nestle";
        String introduced = "1983";
        String type = "Instant Noodles";
        String cookingTime = "2 Minutes";
        String flavour = "Masala";
        String country = "India";
		
        System.out.println("About Maggi");
        System.out.println("The Product Name is" + productName);
        System.out.println("The Brand name is" + brand);
        System.out.println("It is Introduced in the year" + introduced);
        System.out.println("The Type of food is" + type);
        System.out.println("The time takes for Cooking is" + cookingTime);
        System.out.println("The Flavour is " + flavour);
        System.out.println("The Country is " + country);
		
		String ingredients[] = {"Refined Wheat Flour (Maida)", "Edible Vegetable Oil", "Iodized Salt", "Spices", 
		"Onion Powder", "Garlic Powder", "Sugar", "Flavour Enhancers", "Turmeric", "Red Chilli Powder", "Coriander Powder",
		"Cumin Powder", "Black Pepper", "Ginger Powder", "Acidity Regulator", "Thickener"};

        System.out.println("Maggi Ingredients are:");
        for (String ingredient : ingredients) {
        System.out.println(ingredient);
        }
    }
}