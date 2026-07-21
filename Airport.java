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

        boolean isAirportNameValid = false;
        boolean isLocationValid = false;
        boolean isAirlineNameValid = false;
        boolean isPassengerNameValid = false;
        boolean isPassengerAgeValid = false;
        boolean isDestinationValid = false;
        boolean isContactNumberValid = false;
        boolean isTerminalNumberValid = false;

        if (aName != null) {
            airportName = aName;
            isAirportNameValid = true;
        } else {
            System.out.println("Invalid Airport Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (airName != null) {
            airlineName = airName;
            isAirlineNameValid = true;
        } else {
            System.out.println("Invalid Airline Name");
        }

        if (pName != null) {
            passengerName = pName;
            isPassengerNameValid = true;
        } else {
            System.out.println("Invalid Passenger Name");
        }

        if (age > 0) {
            passengerAge = age;
            isPassengerAgeValid = true;
        } else {
            System.out.println("Invalid Passenger Age");
        }

        if (dest != null) {
            destination = dest;
            isDestinationValid = true;
        } else {
            System.out.println("Invalid Destination");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (terminal > 0) {
            terminalNumber = terminal;
            isTerminalNumberValid = true;
        } else {
            System.out.println("Invalid Terminal Number");
        }

        if (isAirportNameValid == true && isLocationValid == true &&  isAirlineNameValid == true && isPassengerNameValid == true &&
            isPassengerAgeValid == true &&  isDestinationValid == true &&  isContactNumberValid == true &&  isTerminalNumberValid == true) {

            isStarted = true;
        }

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