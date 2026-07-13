class PlayTent {

    static String productName;
    static int price;
    static String assemblyRequired;
    static String material;
    static String color;
    static String includedComponents;
    static String genericName;
    static String productDimensions;
    static int netQuantity;
    static String type;
    static String recommendedAge;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "Play Tent";
        price = 281;
        assemblyRequired = "Yes";
        material = "Polyester";
        color = "Multicolor";
        includedComponents = "paip, Aelba";
        genericName = "Play Tents";
        productDimensions = "6x3x24 cm";
        netQuantity = 1;
        type = "Doll House";
        recommendedAge = "6-8 Years";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Assembly Required is " + assemblyRequired);
        System.out.println("Material is " + material);
        System.out.println("Color is " + color);
        System.out.println("Included Components are " + includedComponents);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Product Dimensions are " + productDimensions);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Type is " + type);
        System.out.println("Recommended Age is " + recommendedAge);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}