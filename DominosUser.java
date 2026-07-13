class DominosUser {

    static String name;
    static String password;
    static String confirmPassword;
    static String address;
    static String state;
    static String city;
    static String emailId;
    static long mobile;
    static long landlineNo;
    static String dateOfBirth;
    static String dateOfAnniversary;
    static boolean captchaVerified;

    public static void main(String bindu[]) {

        
        name = "Bindu KV";
        password = "12345";
        confirmPassword = "12345";
        address = "Bengaluru";
        state = "Karnataka";
        city = "Bengaluru";
        emailId = "bindu11@gmail.com";
        mobile = 6549831579L;
        landlineNo = 8023456789L;
        dateOfBirth = "11-01-2003";
        dateOfAnniversary = "25-06-2026";
        captchaVerified = true;

        System.out.println("The Name is " + name);
        System.out.println("The Password is " + password);
        System.out.println("The Confirm Password is " + confirmPassword);
        System.out.println("The Address is " + address);
        System.out.println("The State is " + state);
        System.out.println("The City is " + city);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobile);
        System.out.println("The Landline Number is " + landlineNo);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Date Of Anniversary is " + dateOfAnniversary);
        System.out.println("Captcha Verified: " + captchaVerified);

        System.out.println("The updated data is ");

        name = "Bhuvi Rao";
        password = "bhuvi@2026";
        confirmPassword = "bhuvi@2026";
        address = "Chennai";
        state = "Tamil Nadu";
        city = "Chennai";
        emailId = "bhuvi.rao@gmail.com";
        mobile = 9876543210L;
        landlineNo = 8045678912L;
        dateOfBirth = "15-07-2003";
        dateOfAnniversary = "10-10-2026";
        captchaVerified = false;

        System.out.println("The Name is " + name);
        System.out.println("The Password is " + password);
        System.out.println("The Confirm Password is " + confirmPassword);
        System.out.println("The Address is " + address);
        System.out.println("The State is " + state);
        System.out.println("The City is " + city);
        System.out.println("The Email ID is " + emailId);
        System.out.println("The Mobile Number is " + mobile);
        System.out.println("The Landline Number is " + landlineNo);
        System.out.println("The Date Of Birth is " + dateOfBirth);
        System.out.println("The Date Of Anniversary is " + dateOfAnniversary);
        System.out.println("Captcha Verified: " + captchaVerified);
    }
}