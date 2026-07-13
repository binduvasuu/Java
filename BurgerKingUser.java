class BurgerKingUser {

    static String fullName;
    static String mobileNumber;
    static String emailId;
    static String password;
    static String address;
    static String paymentMethod;
    static boolean receiveOffers;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        mobileNumber = "6549831579";
        emailId = "bindu11@gmail.com";
        password = "Bindu@123";
        address = "Bengaluru";
        paymentMethod = "UPI";
        receiveOffers = true;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Address is " + address);
        System.out.println("The Payment Method is " + paymentMethod);
        System.out.println("Receive Offers and Notifications: " + receiveOffers);

        System.out.println("The updated data is ");

        fullName = "Bhuvi KV";
        mobileNumber = "9876543210";
        emailId = "bhuvi11@gmail.com";
        password = "Bhuvi@456";
        address = "Mysuru";
        paymentMethod = "Credit Card";
        receiveOffers = false;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Address is " + address);
        System.out.println("The Payment Method is " + paymentMethod);
        System.out.println("Receive Offers and Notifications: " + receiveOffers);
    }
}