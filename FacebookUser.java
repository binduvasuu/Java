class FacebookUser {

    static String firstName;
    static String surName;
    static String dateOfBirth;
    static String gender;
    static long mobileNo;
    static boolean receiveNotifications;
    static String password;

    public static void main(String Facebook[]) {

        firstName = "Bindu";
        surName = "KV";
        dateOfBirth = "11 April 2004";
        gender = "Female";
        mobileNo = 9567843168L;
        receiveNotifications = true;
        password = "bindu5";

        System.out.println("The first name is " + firstName);
        System.out.println("The surname is " + surName);
        System.out.println("The date of birth is " + dateOfBirth);
        System.out.println("The gender is " + gender);
        System.out.println("The mobile number or email address is " + mobileNo);
        System.out.println("Receive notifications from Facebook: " + receiveNotifications);
        System.out.println("The password is " + password);

        
        System.out.println("The updated data is ");

        firstName = "Bindu K";
        surName = "V";
        dateOfBirth = "12 April 2004";
        gender = "Female";
        mobileNo = 9876543210L;
        receiveNotifications = false;
        password = "newFBpass@123";

        System.out.println("The first name is " + firstName);
        System.out.println("The surname is " + surName);
        System.out.println("The date of birth is " + dateOfBirth);
        System.out.println("The gender is " + gender);
        System.out.println("The mobile number or email address is " + mobileNo);
        System.out.println("Receive notifications from Facebook: " + receiveNotifications);
        System.out.println("The password is " + password);
    }
}