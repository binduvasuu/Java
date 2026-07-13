class TruecallerUser {

    static String fullName;
    static String mobileNumber;
    static String emailId;
    static String password;
    static String country;
    static boolean receiveNotifications;

    public static void main(String bindu[]) {

        fullName = "Bindu";
        mobileNumber = "9876543210";
        emailId = "arjun@gmail.com";
        password = "Arjun@123";
        country = "India";
        receiveNotifications = true;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Country is " + country);
        System.out.println("Receive Notifications: " + receiveNotifications);

        

        System.out.println("The updated data is ");

        fullName = "Priya";
        mobileNumber = "9123456789";
        emailId = "priya@gmail.com";
        password = "Priya@456";
        country = "Singapore";
        receiveNotifications = false;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Country is " + country);
        System.out.println("Receive Notifications: " + receiveNotifications);
    }
}