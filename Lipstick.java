class Lipstick {

    static String productName;
    static int price;
    static String shelfLife;
    static int netQuantity;
    static String color;
    static String type;
    static String concern;
    static String finish;
    static String brand;
    static String genericName;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "Lipstick";
        price = 208;
        shelfLife = "24 Months";
        netQuantity = 1;
        color = "Light Brown";
        type = "Liquid";
        concern = "No Concern";
        finish = "Gloss";
        brand = "Mila Beaute";
        genericName = "Lip Gloss";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Shelf Life is " + shelfLife);
        System.out.println("Net Quantity is " + netQuantity);
        System.out.println("Color is " + color);
        System.out.println("Type is " + type);
        System.out.println("Concern is " + concern);
        System.out.println("Finish is " + finish);
        System.out.println("Brand is " + brand);
        System.out.println("Generic Name is " + genericName);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}