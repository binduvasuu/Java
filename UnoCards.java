class UnoCards {

    static String productName;
    static int price;
    static String character;
    static String colour;
    static String materialType;
    static String genericName;
    static String assemblyRequired;
    static int netQuantity;
    static String type;
    static String recommendedAge;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "UNO Cards";
        price = 123;
        character = "Not Applicable";
        colour = "Multicolor";
        materialType = "Paper";
        genericName = "Playing Cards";
        assemblyRequired = "No";
        netQuantity = 2;
        type = "UNO";
        recommendedAge = "Upto 10 Years";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Character is " + character);
        System.out.println("Colour is " + colour);
        System.out.println("Material Type is " + materialType);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Assembly Required is " + assemblyRequired);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Type is " + type);
        System.out.println("Recommended Age is " + recommendedAge);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}