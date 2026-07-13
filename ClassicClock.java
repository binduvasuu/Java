class ClassicClock {

    static String productName;
    static String material;
    static String type;
    static String idealFor;
    static String productLength;
    static String productHeight;
    static String productBreadth;
    static int netQuantity;
    static int price;

    public static void main(String bindu[]) {

        productName = "Wall Clock";
        material = "Plastic";
        type = "Analog";m
        idealFor = "All Purpose";
        productLength = "9.5 Inch";
        productHeight = "10 Inch";
        productBreadth = "1.5 Inch";
        netQuantity = 1;
        price = 360;

        System.out.println("Product Name is " + productName);
        System.out.println("Material is " + material);
        System.out.println("Type is " + type);
        System.out.println("Ideal For is " + idealFor);
        System.out.println("Product Length is " + productLength);
        System.out.println("Product Height is " + productHeight);
        System.out.println("Product Breadth is " + productBreadth);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Price is " + price);
    }
}