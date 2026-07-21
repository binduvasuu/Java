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

        boolean isParkNameValid = false;
        boolean isLocationValid = false;
        boolean isManagerNameValid = false;
        boolean isVisitorNameValid = false;
        boolean isRideNameValid = false;
        boolean isTicketPriceValid = false;
        boolean isContactNumberValid = false;
        boolean isOpeningTimeValid = false;

        if (pName != null) {
            parkName = pName;
            isParkNameValid = true;
        } else {
            System.out.println("Invalid Park Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (manager != null) {
            managerName = manager;
            isManagerNameValid = true;
        } else {
            System.out.println("Invalid Manager Name");
        }

        if (visitor != null) {
            visitorName = visitor;
            isVisitorNameValid = true;
        } else {
            System.out.println("Invalid Visitor Name");
        }

        if (ride != null) {
            rideName = ride;
            isRideNameValid = true;
        } else {
            System.out.println("Invalid Ride Name");
        }

        if (price > 0) {
            ticketPrice = price;
            isTicketPriceValid = true;
        } else {
            System.out.println("Invalid Ticket Price");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (opening != null) {
            openingTime = opening;
            isOpeningTimeValid = true;
        } else {
            System.out.println("Invalid Opening Time");
        }

        if (isParkNameValid == true && isLocationValid == true &&
            isManagerNameValid == true && isVisitorNameValid == true &&
            isRideNameValid == true &&  isTicketPriceValid == true &&
            isContactNumberValid == true && isOpeningTimeValid == true) {

            isStarted = true;
        }

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