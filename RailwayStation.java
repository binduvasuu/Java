class RailwayStation {

    static String stationName;
    static String location;
    static String stationMaster;
    static String trainName;
    static int platformNumber;
    static double ticketPrice;
    static long enquiryNumber;
    static String arrivalTime;

    public static boolean startRailwayStation(String sName,String place,String master,String train,
            int platform,double price,long enquiry,String arrival) {

        boolean isStarted = false;

        stationName = sName;
        location = place;
        stationMaster = master;
        trainName = train;
        platformNumber = platform;
        ticketPrice = price;
        enquiryNumber = enquiry;
        arrivalTime = arrival;

        isStarted = true;

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