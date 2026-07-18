class RealEstate {

    static String companyName;
    static String location;
    static String agentName;
    static String customerName;
    static String propertyType;
    static double propertyPrice;
    static long contactNumber;
    static String propertyStatus;

    public static boolean startRealEstate(String cName, String place,String agent, String customer, String type, double price, long contact, String status) {

        boolean isStarted = false;

        companyName = cName;
        location = place;
        agentName = agent;
        customerName = customer;
        propertyType = type;
        propertyPrice = price;
        contactNumber = contact;
        propertyStatus = status;

        isStarted = true;

        return isStarted;
    }

    public static void getRealEstate() {

        System.out.println("Company Name is " + companyName);
        System.out.println("Location is " + location);
        System.out.println("Agent Name is " + agentName);
        System.out.println("Customer Name is " + customerName);
        System.out.println("Property Type is " + propertyType);
        System.out.println("Property Price is " + propertyPrice);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Property Status is " + propertyStatus);

    }
}