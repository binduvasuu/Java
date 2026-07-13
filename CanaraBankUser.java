class CanaraBankUser {

    static long accountNumber;
    static long debitCardNumber;
    static long registeredMobileNumber;
    static String customerId;
    static String debitTransactions;
    static String creditTransactions;
    static String captcha;
    static boolean imageCaptcha;

    public static void main(String bindu[]) {

        accountNumber = 123456789012L;
        debitCardNumber = 5678123412345678L;
        registeredMobileNumber = 6549831579L;
        customerId = "CUST12345";
        debitTransactions = "9876";
        creditTransactions = "5432";
        captcha = "J8WT7";
        imageCaptcha = true;

        System.out.println("The Account Number is " + accountNumber);
        System.out.println("The Debit Card Number is " + debitCardNumber);
        System.out.println("The Registered Mobile Number is " + registeredMobileNumber);
        System.out.println("The Customer ID is " + customerId);
        System.out.println("The Debit Transactions are " + debitTransactions);
        System.out.println("The Credit Transactions are " + creditTransactions);
        System.out.println("The Captcha is " + captcha);
        System.out.println("Image Captcha Selected: " + imageCaptcha);

        System.out.println("The updated data is ");

        accountNumber = 987654321098L;
        debitCardNumber = 4321876512348765L;
        registeredMobileNumber = 9876543210L;
        customerId = "CUST67890";
        debitTransactions = "1122";
        creditTransactions = "3344";
        captcha = "X9KPL2";
        imageCaptcha = false;

        System.out.println("The Account Number is " + accountNumber);
        System.out.println("The Debit Card Number is " + debitCardNumber);
        System.out.println("The Registered Mobile Number is " + registeredMobileNumber);
        System.out.println("The Customer ID is " + customerId);
        System.out.println("The Debit Transactions are " + debitTransactions);
        System.out.println("The Credit Transactions are " + creditTransactions);
        System.out.println("The Captcha is " + captcha);
        System.out.println("Image Captcha Selected: " + imageCaptcha);
    }
}