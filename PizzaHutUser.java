class PizzaHutUser {

    static String fullName;
    static String emailId;
    static String password;
    static String confirmPassword;
    static long mobileNumber;
    static String address;
    static String city;
    static String state;
    static boolean receiveOffers;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        emailId = "bindu11@gmail.com";
        password = "Bindu@123";
        confirmPassword = "Bindu@123";
        mobileNumber = 6549831579L;
        address = "BTM Layout";
        city = "Bengaluru";
        state = "Karnataka";
        receiveOffers = true;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Confirm Password is " + confirmPassword);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Address is " + address);
        System.out.println("The City is " + city);
        System.out.println("The State is " + state);
        System.out.println("Receive Offers and Notifications: " + receiveOffers);

        System.out.println("The updated data is ");

        fullName = "Bhuvi KV";
        emailId = "bhuvi11@gmail.com";
        password = "Bhuvi@456";
        confirmPassword = "Bhuvi@456";
        mobileNumber = 9876543210L;
        address = "Jayanagar";
        city = "Mysuru";
        state = "Karnataka";
        receiveOffers = false;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Confirm Password is " + confirmPassword);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Address is " + address);
        System.out.println("The City is " + city);
        System.out.println("The State is " + state);
        System.out.println("Receive Offers and Notifications: " + receiveOffers);
    }
}