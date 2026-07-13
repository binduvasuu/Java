class BuildingToys {

    static String productName;
    static int price;
    static int numberOfPieces;
    static String colour;
    static String materialType;
    static String recommendedAge;
    static int netQuantity;
    static String type;
    static String productDimensions;
    static String genericName;
    static String includedComponents;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "Building Toys";
        price = 146;
        numberOfPieces = 110;
        colour = "Multicolor";
        materialType = "Plastic";
        recommendedAge = "4-6 Years";
        netQuantity = 1;
        type = "Building Sets";
        productDimensions = "8x10x2 cm";
        genericName = "Building Toys";
        includedComponents = "NA";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Number of Pieces is " + numberOfPieces);
        System.out.println("Colour is " + colour);
        System.out.println("Material Type is " + materialType);
        System.out.println("Recommended Age is " + recommendedAge);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Type is " + type);
        System.out.println("Product Dimensions are " + productDimensions);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Included Components are " + includedComponents);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}