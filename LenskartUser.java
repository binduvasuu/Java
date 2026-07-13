class LenskartUser {

    static String fullName;
    static String emailId;
    static long mobileNumber;
    static String password;
    static String city;
    static String eyePower;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        emailId = "bindu11@gmail.com";
        mobileNumber = 6549831579L;
        password = "12345";
        city = "Bengaluru";
        eyePower = "-1.50";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Password is " + password);
        System.out.println("The City is " + city);
        System.out.println("The Eye Power is " + eyePower);

        System.out.println("The updated data is ");

        fullName = "Bhuvi Rao";
        emailId = "bhuvi.rao@gmail.com";
        mobileNumber = 9876543210L;
        password = "bhuvi@2026";
        city = "Chennai";
        eyePower = "-2.00";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Password is " + password);
        System.out.println("The City is " + city);
        System.out.println("The Eye Power is " + eyePower);
    }
}