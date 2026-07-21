class RailwayStation {

    static String stationName;
    static String location;
    static String stationMaster;
    static String trainName;
    static int platformNumber;
    static double ticketPrice;
    static long enquiryNumber;
    static String arrivalTime;

    public static boolean startRailwayStation(String sName, String place, String master, String train,
            int platform, double price, long enquiry, String arrival) {

        boolean isStarted = false;

        boolean isStationNameValid = false;
        boolean isLocationValid = false;
        boolean isStationMasterValid = false;
        boolean isTrainNameValid = false;
        boolean isPlatformNumberValid = false;
        boolean isTicketPriceValid = false;
        boolean isEnquiryNumberValid = false;
        boolean isArrivalTimeValid = false;

        if (sName != null) {
            stationName = sName;
            isStationNameValid = true;
        } else {
            System.out.println("Invalid Station Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (master != null) {
            stationMaster = master;
            isStationMasterValid = true;
        } else {
            System.out.println("Invalid Station Master");
        }

        if (train != null) {
            trainName = train;
            isTrainNameValid = true;
        } else {
            System.out.println("Invalid Train Name");
        }

        if (platform > 0) {
            platformNumber = platform;
            isPlatformNumberValid = true;
        } else {
            System.out.println("Invalid Platform Number");
        }

        if (price > 0) {
            ticketPrice = price;
            isTicketPriceValid = true;
        } else {
            System.out.println("Invalid Ticket Price");
        }

        if (enquiry > 0) {
            enquiryNumber = enquiry;
            isEnquiryNumberValid = true;
        } else {
            System.out.println("Invalid Enquiry Number");
        }

        if (arrival != null) {
            arrivalTime = arrival;
            isArrivalTimeValid = true;
        } else {
            System.out.println("Invalid Arrival Time");
        }

        if (isStationNameValid == true &&  isLocationValid == true && isStationMasterValid == true &&
            isTrainNameValid == true && isPlatformNumberValid == true && isTicketPriceValid == true &&
            isEnquiryNumberValid == true && isArrivalTimeValid == true) {

            isStarted = true;
        }

        return isStarted;
    }

    public static void getRailwayStation() {

        System.out.println("Station Name is " + stationName);
        System.out.println("Location is " + location);
        System.out.println("Station Master is " + stationMaster);
        System.out.println("Train Name is " + trainName);
        System.out.println("Platform Number is " + platformNumber);
        System.out.println("Ticket Price is " + ticketPrice);
        System.out.println("Enquiry Number is " + enquiryNumber);
        System.out.println("Arrival Time is " + arrivalTime);
    }
}