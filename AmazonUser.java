class AmazonUser {

    static String fullName;
    static String emailId;
    static long mobileNo;
    static String address;
    static String password;

    public static void main(String amazon[]) {

        fullName = "Bindu KV";
        emailId = "bindu@gmail.com";
        mobileNo = 9876543210L;
        address = "Bangalore";
        password = "Amazon@123";

        System.out.println("Full Name: " + fullName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Address: " + address);
        System.out.println("Password: " + password);

        System.out.println("The updated data is ");

        fullName = "Bhuvi KV";
        emailId = "bhuvi@gmail.com";
        mobileNo = 9123456789L;
        address = "Mysuru";
        password = "Bhuvi@456";

        System.out.println("Full Name: " + fullName);
        System.out.println("Email ID: " + emailId);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Address: " + address);
        System.out.println("Password: " + password);
    }
}