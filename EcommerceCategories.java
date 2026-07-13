class EcommerceCategories{
    public static void main(String Ecommerce[]) {
        String company = "Amazon";
        String founded = "1994";
        String founder = "Jeff Bezos";
        String headquarters = "Seattle, Washington, USA";
        String platformType = "E-commerce";
        String countries = "100+ Countries";
        String paymentMethods = "UPI, Credit Card, Debit Card, Net Banking, EMI, Cash on Delivery";
		
        System.out.println("About E-commerce");
        System.out.println("The name of the Company is" + company);
        System.out.println("It is Founded in the year" + founded);
        System.out.println("The Founder is" + founder);
        System.out.println("The Headquarters is located in" + headquarters);
        System.out.println("The type of Platform is" + platformType);
        System.out.println("It is Available In" + countries);
        System.out.println("The Payment Methods accepted are" + paymentMethods);
		
        String categories[] = {"Mobiles", "Laptops", "Computers", "Electronics", "Televisions", "Home Appliances", 
		"Fashion", "Men's Clothing", "Women's Clothing", "Kid's Fashion", "Footwear", "Watches", "Beauty & Personal Care", 
		"Health Care", "Books", "Sports & Fitness", "Toys & Games", "Grocery", "Furniture", "Home & Kitchen", "Jewellery",
		"Bags & Luggage", "Automotive", "Pet Supplies", "Office Products"};
		
		System.out.println("The E-commerce Categories are:");
		for(String category:categories){
		System.out.println(category);
        }
    }
}