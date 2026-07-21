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

        boolean isTempleNameValid = false;
        boolean isLocationValid = false;
        boolean isGodNameValid = false;
        boolean isPriestNameValid = false;
        boolean isDonationAmountValid = false;
        boolean isOpeningTimeValid = false;
        boolean isClosingTimeValid = false;
        boolean isContactNumberValid = false;

        if (tName != null) {
            templeName = tName;
            isTempleNameValid = true;
        } else {
            System.out.println("Invalid Temple Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (deity != null) {
            godName = deity;
            isGodNameValid = true;
        } else {
            System.out.println("Invalid God Name");
        }

        if (priest != null) {
            priestName = priest;
            isPriestNameValid = true;
        } else {
            System.out.println("Invalid Priest Name");
        }

        if (donation > 0) {
            donationAmount = donation;
            isDonationAmountValid = true;
        } else {
            System.out.println("Invalid Donation Amount");
        }

        if (openTime != null) {
            openingTime = openTime;
            isOpeningTimeValid = true;
        } else {
            System.out.println("Invalid Opening Time");
        }

        if (closeTime != null) {
            closingTime = closeTime;
            isClosingTimeValid = true;
        } else {
            System.out.println("Invalid Closing Time");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (isTempleNameValid == true && isLocationValid == true &&
            isGodNameValid == true && isPriestNameValid == true &&
            isDonationAmountValid == true && isOpeningTimeValid == true &&
            isClosingTimeValid == true && isContactNumberValid == true) {

            isStarted = true;
        }

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