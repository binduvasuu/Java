class DigiLockerUser {

    static String fullName;
    static String dateOfBirth;
    static String gender;
    static String mobileNumber;
    static String emailId;
    static String aadhaarNumber;
    static String password;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        dateOfBirth = "11-01-2003";
        gender = "Female";
        mobileNumber = "6549831579";
        emailId = "bindu11@gmail.com";
        aadhaarNumber = "123456789012";
        password = "12345";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Gender is " + gender);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Aadhaar Number is " + aadhaarNumber);
        System.out.println("The Password is " + password);

        System.out.println("The updated data is ");

        fullName = "Bhuvi Rao";
        dateOfBirth = "15-07-2003";
        gender = "Female";
        mobileNumber = "9876543210";
        emailId = "bhuvi.rao@gmail.com";
        aadhaarNumber = "987654321098";
        password = "bhuvi@2026";

        System.out.println("The Full Name is " + fullName);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Gender is " + gender);
        System.out.println("The Mobile Number is " + mobileNumber);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Aadhaar Number is " + aadhaarNumber);
        System.out.println("The Password is " + password);
    }
}