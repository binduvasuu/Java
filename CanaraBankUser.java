class CanaraBankUser {
	public static void main(String bindu[]) {
		long accountNumber = 123456789012L;
		long debitCardNumber = 5678123412345678L;
		long registeredMobileNumber = 6549831579L;
		String customerId = "CUST12345";
		String debitTransactions = "9876";
		String creditTransactions = "5432";
		String captcha = "J8WT7";
		boolean imageCaptcha = true;
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