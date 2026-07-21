class RealEstate {

    static String companyName;
    static String location;
    static String agentName;
    static String customerName;
    static String propertyType;
    static double propertyPrice;
    static long contactNumber;
    static String propertyStatus;

    public static boolean startRealEstate(String cName, String place, String agent, String customer, String type, double price, long contact, String status) {

        boolean isStarted = false;

        boolean isCompanyNameValid = false;
        boolean isLocationValid = false;
        boolean isAgentNameValid = false;
        boolean isCustomerNameValid = false;
        boolean isPropertyTypeValid = false;
        boolean isPropertyPriceValid = false;
        boolean isContactNumberValid = false;
        boolean isPropertyStatusValid = false;

        if (cName != null) {
            companyName = cName;
            isCompanyNameValid = true;
        } else {
            System.out.println("Invalid Company Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (agent != null) {
            agentName = agent;
            isAgentNameValid = true;
        } else {
            System.out.println("Invalid Agent Name");
        }

        if (customer != null) {
            customerName = customer;
            isCustomerNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        if (type != null) {
            propertyType = type;
            isPropertyTypeValid = true;
        } else {
            System.out.println("Invalid Property Type");
        }

        if (price > 0) {
            propertyPrice = price;
            isPropertyPriceValid = true;
        } else {
            System.out.println("Invalid Property Price");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (status != null) {
            propertyStatus = status;
            isPropertyStatusValid = true;
        } else {
            System.out.println("Invalid Property Status");
        }

        if (isCompanyNameValid == true && isLocationValid == true &&
            isAgentNameValid == true && isCustomerNameValid == true &&
            isPropertyTypeValid == true && isPropertyPriceValid == true &&
            isContactNumberValid == true && isPropertyStatusValid == true) {

            isStarted = true;
        }

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