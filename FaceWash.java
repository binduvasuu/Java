class FaceWash {

    static String productName;
    static int price;
    static String capacity;
    static int netQuantity;
    static String type;
    static String flavour;
    static String skinType;
    static String brand;
    static String concern;
    static String addOn;
    static String shelfLife;
    static String genericName;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "Face Wash";
        price = 309;
        capacity = "100ml";
        netQuantity = 1;
        type = "Gel";
        flavour = "Sandalwood";
        skinType = "All Skin Types";
        brand = "Ghar Soaps";
        concern = "No Concern";
        addOn = "Others";
        shelfLife = "18 Months";
        genericName = "AquaFresh Cleanser";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Capacity is " + capacity);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Type is " + type);
        System.out.println("Flavour is " + flavour);
        System.out.println("Skin Type is " + skinType);
        System.out.println("Brand is " + brand);
        System.out.println("Concern is " + concern);
        System.out.println("Add On is " + addOn);
        System.out.println("Shelf Life is " + shelfLife);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}