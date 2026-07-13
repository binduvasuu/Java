class GrowwUser {

    static String fullName;
    static String emailId;
    static long mobileNumber;
    static String password;
    static String panNumber;
    static String bankAccountNumber;
    static boolean agreeTerms;

    public static void main(String bindu[]) {

        fullName = "Bindu KV";
        emailId = "bindu11@gmail.com";
        mobileNumber = 6549831579L;
        password = "Bindu@123";
        panNumber = "ABCDE1234F";
        bankAccountNumber = "123456789012";
        agreeTerms = true;

        System.out.println("The full name is " + fullName);
        System.out.println("The email id is " + emailId);
        System.out.println("The mobile number is " + mobileNumber);
        System.out.println("The password is " + password);
        System.out.println("The PAN number is " + panNumber);
        System.out.println("The bank account number is " + bankAccountNumber);
        System.out.println("Agreed to terms and conditions: " + agreeTerms);

        
        System.out.println("The updated data is ");

        fullName = "Bindu K V";
        emailId = "binduupdated@gmail.com";
        mobileNumber = 9876543210L;
        password = "NewPass@123";
        panNumber = "ABCDE1234F";
        bankAccountNumber = "987654321098";
        agreeTerms = true;

        System.out.println("The full name is " + fullName);
        System.out.println("The email id is " + emailId);
        System.out.println("The mobile number is " + mobileNumber);
        System.out.println("The password is " + password);
        System.out.println("The PAN number is " + panNumber);
        System.out.println("The bank account number is " + bankAccountNumber);
        System.out.println("Agreed to terms and conditions: " + agreeTerms);
    }
}