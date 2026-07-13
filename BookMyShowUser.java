class BookMyShowUser {

    static String fullName;
    static String emailId;
    static long mobileNumber;
    static String password;
    static String city;
    static String preferredLanguage;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        emailId = "bindu11@gmail.com";
        mobileNumber = 6549831579L;
        password = "12345";
        city = "Bengaluru";
        preferredLanguage = "English";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Password is " + password);
        System.out.println("The City is " + city);
        System.out.println("The Preferred Language is " + preferredLanguage);

        System.out.println("The updated data is ");

        fullName = "Bhuvi Rao";
        emailId = "bhuvi.rao@gmail.com";
        mobileNumber = 9876543210L;
        password = "bhuvi@2026";
        city = "Chennai";
        preferredLanguage = "Tamil";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Password is " + password);
        System.out.println("The City is " + city);
        System.out.println("The Preferred Language is " + preferredLanguage);
    }
}