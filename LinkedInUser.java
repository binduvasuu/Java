class LinkedInUser {

    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static String country;
    static boolean agreeTerms;

    public static void main(String bindu[]) {

        firstName = "Bindu";
        lastName = "KV";
        email = "bindu11@gmail.com";
        password = "12345";
        country = "India";
        agreeTerms = true;

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Email Address is " + email);
        System.out.println("The Password is " + password);
        System.out.println("The Country is " + country);
        System.out.println("Agreed to Terms and Conditions: " + agreeTerms);

        System.out.println("The updated data is ");

        firstName = "Bhuvi";
        lastName = "Sharma";
        email = "bhuvi@gmail.com";
        password = "67890";
        country = "USA";
        agreeTerms = false;

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Email Address is " + email);
        System.out.println("The Password is " + password);
        System.out.println("The Country is " + country);
        System.out.println("Agreed to Terms and Conditions: " + agreeTerms);
    }
}