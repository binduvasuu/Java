class PinterestUser {

    static String emailId;
    static String password;
    static String dateOfBirth;
    static String gender;
    static String country;
    static boolean receiveNotifications;

    public static void main(String bindu[]) {

        emailId = "bindu11@gmail.com";
        password = "12345";
        dateOfBirth = "11-01-2003";
        gender = "Female";
        country = "India";
        receiveNotifications = true;

        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Gender is " + gender);
        System.out.println("The Country is " + country);
        System.out.println("Receive Notifications: " + receiveNotifications);

        System.out.println("The updated data is ");

        emailId = "bhuvi11@gmail.com";
        password = "67890";
        dateOfBirth = "15-08-2005";
        gender = "Female";
        country = "India";
        receiveNotifications = false;

        System.out.println("The Email ID is " + emailId);
        System.out.println("The Password is " + password);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Gender is " + gender);
        System.out.println("The Country is " + country);
        System.out.println("Receive Notifications: " + receiveNotifications);
    }
}