class FirstCryUser {

    static String fullName;
    static String emailId;
    static long mobileNo;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        emailId = "bindu@gmail.com";
        mobileNo = 9876543210L;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNo);

        System.out.println("The updated data is ");

        fullName = "Bhuvi KV";
        emailId = "bhuvi@gmail.com";
        mobileNo = 9123456789L;

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobileNo);
    }
}