class NetflixUser {

    static String emailId;
    static String password;
    static String plan;
    static String mobileNumber;
    static String paymentMethod;
    static boolean autoRenewal;

    public static void main(String bindu[]) {

        emailId = "bindu11@gmail.com";
        password = "12345";
        plan = "Premium";
        mobileNumber = "6549831579";
        paymentMethod = "UPI";
        autoRenewal = true;

        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Plan is " + plan);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Payment Method is " + paymentMethod);
        System.out.println("Auto Renewal Enabled: " + autoRenewal);

        System.out.println("The updated data is ");

        emailId = "bhuvi.rao@gmail.com";
        password = "netflix@2026";
        plan = "Standard";
        mobileNumber = "9876543210";
        paymentMethod = "Credit Card";
        autoRenewal = false;

        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Plan is " + plan);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Payment Method is " + paymentMethod);
        System.out.println("Auto Renewal Enabled: " + autoRenewal);
    }
}