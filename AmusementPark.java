class AmusementPark {

    static String parkName;
    static String location;
    static String managerName;
    static String visitorName;
    static String rideName;
    static double ticketPrice;
    static long contactNumber;
    static String openingTime;

    public static boolean startAmusementPark(String pName, String place,
            String manager, String visitor,
            String ride, double price,
            long contact, String opening) {

        boolean isStarted = false;

        parkName = pName;
        location = place;
        managerName = manager;
        visitorName = visitor;
        rideName = ride;
        ticketPrice = price;
        contactNumber = contact;
        openingTime = opening;

        isStarted = true;

        return isStarted;
    }

    public static void getAmusementPark() {

        System.out.println("Park Name is " + parkName);
        System.out.println("Location is " + location);
        System.out.println("Manager Name is " + managerName);
        System.out.println("Visitor Name is " + visitorName);
        System.out.println("Ride Name is " + rideName);
        System.out.println("Ticket Price is " + ticketPrice);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Opening Time is " + openingTime);

    }
}