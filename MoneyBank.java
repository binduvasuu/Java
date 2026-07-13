class MoneyBank {

    static String productName;
    static int price;
    static String material;
    static String recommendedAge;
    static String color;
    static String type;
    static String batteryIncluded;
    static String batteryRequired;
    static String productDimensions;
    static String genericName;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "Money Bank";
        price = 145;
        material = "Wood";
        recommendedAge = "Above 4-6 Years";
        color = "Brown";
        type = "Handicraft Piggy Bank";
        batteryIncluded = "No";
        batteryRequired = "No";
        productDimensions = "10*7.5*18 cm";
        genericName = "Money Banks";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Material is " + material);
        System.out.println("Recommended Age is " + recommendedAge);
        System.out.println("Color is " + color);
        System.out.println("Type is " + type);
        System.out.println("Battery Included is " + batteryIncluded);
        System.out.println("Battery Required is " + batteryRequired);
        System.out.println("Product Dimensions are " + productDimensions);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}