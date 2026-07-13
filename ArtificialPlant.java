class ArtificialPlant {

    static String productName;
    static String weight;
    static String color;
    static String material;
    static String type;
    static String productBreadth;
    static String productLength;
    static String productHeight;
    static int netQuantity;
    static String weightUnit;
    static String productUnit;
    static String brand;
    static String genericName;
    static String countryOfOrigin;
    static int price;

    public static void main(String bindu[]) {

        productName = "Artificial Plant";
        weight = "0.1";
        color = "Green";
        material = "Nylon";
        type = "Artificial Plants";
        productBreadth = "10";
        productLength = "45";
        productHeight = "60";
        netQuantity = 1;
        weightUnit = "g";
        productUnit = "cm";
        brand = "Brand Tree Shop";
        genericName = "Artificial Plant, Flower And Shrubs";
        countryOfOrigin = "India";
        price = 390;

        System.out.println("Product Name is " + productName);
        System.out.println("Weight is " + weight + " " + weightUnit);
        System.out.println("Color is " + color);
        System.out.println("Material is " + material);
        System.out.println("Type is " + type);
        System.out.println("Product Breadth is " + productBreadth + " " + productUnit);
        System.out.println("Product Length is " + productLength + " " + productUnit);
        System.out.println("Product Height is " + productHeight + " " + productUnit);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Brand is " + brand);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Price is " + price);
    }
}