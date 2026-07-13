class LEDLamp {

    static String productName;
    static String material;
    static String isAssemblyRequired;
    static String typeOfBulb;
    static String powerSource;
    static String productBreadth;
    static String productHeight;
    static String productLength;
    static String countryOfOrigin;

    public static void main(String bindu[]) {

        productName = "LED Lamp";
        material = "Others";
        isAssemblyRequired = "No";
        typeOfBulb = "LED";
        powerSource = "Battery Powered";
        productBreadth = "0.5 cm";
        productHeight = "0.5 cm";
        productLength = "0.5 cm";
        countryOfOrigin = "India";

        System.out.println("Product Name is " + productName);
        System.out.println("Material is " + material);
        System.out.println("Is Assembly Required: " + isAssemblyRequired);
        System.out.println("Type of Bulb is " + typeOfBulb);
        System.out.println("Power Source is " + powerSource);
        System.out.println("Product Breadth is " + productBreadth);
        System.out.println("Product Height is " + productHeight);
        System.out.println("Product Length is " + productLength);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}