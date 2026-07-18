class Airport {

    static String airportName;
    static String location;
    static String airlineName;
    static String passengerName;
    static int passengerAge;
    static String destination;
    static long contactNumber;
    static int terminalNumber;

    public static boolean startAirport(String aName, String place, String airName, String pName, int age, String dest, long contact, int terminal) {

        boolean isStarted = false;

        airportName = aName;
        location = place;
        airlineName = airName;
        passengerName = pName;
        passengerAge = age;
        destination = dest;
        contactNumber = contact;
        terminalNumber = terminal;

        isStarted = true;

        return isStarted;
    }

    public static void getAirport() {

        System.out.println("Airport Name is " + airportName);
        System.out.println("Location is " + location);
        System.out.println("Airline Name is " + airlineName);
        System.out.println("Passenger Name is " + passengerName);
        System.out.println("Passenger Age is " + passengerAge);
        System.out.println("Destination is " + destination);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Terminal Number is " + terminalNumber);
    }
}