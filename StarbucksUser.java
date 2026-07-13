class StarbucksUser {

    static String firstName;
    static String lastName;
    static String emailId;
    static String userName;
    static String password;
    static String giftCardNumber;
    static boolean agreeTerms;

    public static void main(String bindu[]) {

        firstName = "Rahul";
        lastName = "Sharma";
        emailId = "rahul@gmail.com";
        userName = "rahul_01";
        password = "Rahul@123";
        giftCardNumber = "SB987654321";
        agreeTerms = true;

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Username is " + userName);
        System.out.println("The Password is " + password);
        System.out.println("The Gift Card Number is " + giftCardNumber);
        System.out.println("Agreed to Terms and Conditions: " + agreeTerms);

        

        System.out.println("The updated data is ");

        firstName = "Sneha";
        lastName = "Reddy";
        emailId = "sneha@gmail.com";
        userName = "sneha_22";
        password = "Sneha@456";
        giftCardNumber = "SB123789456";
        agreeTerms = false;

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Username is " + userName);
        System.out.println("The Password is " + password);
        System.out.println("The Gift Card Number is " + giftCardNumber);
        System.out.println("Agreed to Terms and Conditions: " + agreeTerms);
    }
}