class Showpiece {

    static String productName;
    static String material;
    static String color;
    static String productWeight;
    static String productHeight;
    static String productLength;
    static int netQuantity;
    static String productBreadth;
    static String type;
    static String weightUnit;
    static String dimensionUnit;
    static String countryOfOrigin;
    static int price;

    public static void main(String bindu[]) {

        productName = "Showpiece";
        material = "Resin";
        color = "Multi";
        productWeight = "0.5";
        productHeight = "1";
        productLength = "1.5";
        netQuantity = 4;
        productBreadth = "2";
        type = "Figurines";
        weightUnit = "g";
        dimensionUnit = "Inch";
        countryOfOrigin = "India";
        price = 145;

        System.out.println("Product Name is " + productName);
        System.out.println("Material is " + material);
        System.out.println("Color is " + color);
        System.out.println("Product Weight is " + productWeight + " " + weightUnit);
        System.out.println("Product Height is " + productHeight + " " + dimensionUnit);
        System.out.println("Product Length is " + productLength + " " + dimensionUnit);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Product Breadth is " + productBreadth + " " + dimensionUnit);
        System.out.println("Type is " + type);
        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Price is " + price);
    }
}