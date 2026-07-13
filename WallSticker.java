class WallSticker {

    static String productName;
    static String productLength;
    static String theme;
    static String productHeight;
    static String productBreadth;
    static String idealFor;
    static String color;
    static int netQuantity;
    static String material;
    static String type;
    static String productUnit;
    static String brand;
    static String selfAdhesive;
    static String countryOfOrigin;
    static int price;

    public static void main(String bindu[]) {

        productName = "Wall Sticker";
        productLength = "70";
        theme = "Floral & Botanical";
        productHeight = "91";
        productBreadth = "0.5";
        idealFor = "All Purpose";
        color = "Multi";
        netQuantity = 1;
        material = "PVC Vinyl";
        type = "Wall Sticker";
        productUnit = "cm";
        brand = "Decor Villa";
        selfAdhesive = "Yes";
        countryOfOrigin = "India";
        price = 94;

        System.out.println("Product Name is " + productName);
        System.out.println("Product Length is " + productLength + " " + productUnit);
        System.out.println("Theme is " + theme);
        System.out.println("Product Height is " + productHeight + " " + productUnit);
        System.out.println("Product Breadth is " + productBreadth + " " + productUnit);
        System.out.println("Ideal For is " + idealFor);
        System.out.println("Color is " + color);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Material is " + material);
        System.out.println("Type is " + type);
        System.out.println("Brand is " + brand);
        System.out.println("Self Adhesive is " + selfAdhesive);
        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Price is " + price);
    }
}