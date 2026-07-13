class InstagramUser {

    static String email;
    static long mobileNo;
    static String fullName;
    static String userName;
    static String password;
    static boolean rememberLoginInfo;
    static boolean receiveNotifications;

    public static void main(String bindu[]) {

        email = "bindu11@gmail.com";
        mobileNo = 9567843658L;
        fullName = "Bindu KV";
        userName = "bindu_kv";
        password = "12345";
        rememberLoginInfo = true;
        receiveNotifications = true;

        System.out.println("The Email Address is " + email);
        System.out.println("The Mobile Number is " + mobileNo);
        System.out.println("The Full Name is " + fullName);
        System.out.println("The User Name is " + userName);
        System.out.println("The Password is " + password);
        System.out.println("Remember Login Information: " + rememberLoginInfo);
        System.out.println("Receive Notifications: " + receiveNotifications);

        System.out.println("The updated data is ");

        email = "bhuvi.rao@gmail.com";
        mobileNo = 9876543210L;
        fullName = "Bhuvi Rao";
        userName = "bhuvi_rao";
        password = "insta@2026";
        rememberLoginInfo = false;
        receiveNotifications = false;

        System.out.println("The Email Address is " + email);
        System.out.println("The Mobile Number is " + mobileNo);
        System.out.println("The Full Name is " + fullName);
        System.out.println("The User Name is " + userName);
        System.out.println("The Password is " + password);
        System.out.println("Remember Login Information: " + rememberLoginInfo);
        System.out.println("Receive Notifications: " + receiveNotifications);
    }
}