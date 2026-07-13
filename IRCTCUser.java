class IRCTCUser {

    static String userName;
    static String fullName;
    static String password;
    static String emailId;
    static String mobileNumber;
    static String dateOfBirth;
    static String preferredLanguage;

    public static void main(String bindu[]) {

        userName = "bindu123";
        fullName = "Bindu KV";
        password = "12345";
        emailId = "bindu11@gmail.com";
        mobileNumber = "9864579865";
        dateOfBirth = "11-04-2004";
        preferredLanguage = "English";

        System.out.println("The User Name is " + userName);
        System.out.println("The Full Name is " + fullName);
        System.out.println("The Password is " + password);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Preferred Language is " + preferredLanguage);

        System.out.println("The updated data is ");

        userName = "bhuvi456";
        fullName = "Bhuvi KV";
        password = "67890";
        emailId = "bhuvi11@gmail.com";
        mobileNumber = "9876543210";
        dateOfBirth = "15-08-2005";
        preferredLanguage = "Kannada";

        System.out.println("The User Name is " + userName);
        System.out.println("The Full Name is " + fullName);
        System.out.println("The Password is " + password);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Preferred Language is " + preferredLanguage);
    }
}