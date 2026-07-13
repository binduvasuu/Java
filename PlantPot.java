class PlantPot {

    static String productName;
    static String material;
    static String shape;
    static String type;
    static String productBreadth;
    static String productHeight;
    static String productLength;
    static String netQuantity;
    static String description;
    static String countryOfOrigin;
    static int price;

    public static void main(String bindu[]) {

        productName = "FANCY 5 PIS COMBO Plastic Round Flower Pots";
        material = "Plastic";
        shape = "Oval";
        type = "Pot";
        productBreadth = "0.5 Cm";
        productHeight = "1.5 Cm";
        productLength = "0.5 Cm";
        netQuantity = "Pack Of 5";
        description = "Styled plant pots with matte finishing, drainage hole, lightweight durable eco-friendly plastic, suitable for indoor & outdoor gardening";
        countryOfOrigin = "India";
        price = 265;

        System.out.println("Product Name is " + productName);
        System.out.println("Material is " + material);
        System.out.println("Shape is " + shape);
        System.out.println("Type is " + type);
        System.out.println("Product Breadth is " + productBreadth);
        System.out.println("Product Height is " + productHeight);
        System.out.println("Product Length is " + productLength);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Description is " + description);
        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Price is " + price);
    }
}