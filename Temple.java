class Temple {

    static String templeName;
    static String location;
    static String godName;
    static String priestName;
    static int donationAmount;
    static String openingTime;
    static String closingTime;
    static long contactNumber;

    public static boolean startTemple(String tName, String place, String deity, String priest, int donation, String openTime, String closeTime, long contact) {

        boolean isStarted = false;

        templeName = tName;
        location = place;
        godName = deity;
        priestName = priest;
        donationAmount = donation;
        openingTime = openTime;
        closingTime = closeTime;
        contactNumber = contact;

        isStarted = true;

        return isStarted;
    }

    public static void getTemple() {

        System.out.println("Temple Name is " + templeName);
        System.out.println("Location is " + location);
        System.out.println("God Name is " + godName);
        System.out.println("Priest Name is " + priestName);
        System.out.println("Donation Amount is " + donationAmount);
        System.out.println("Opening Time is " + openingTime);
        System.out.println("Closing Time is " + closingTime);
        System.out.println("Contact Number is " + contactNumber);

    }
}