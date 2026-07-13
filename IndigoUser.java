class IndigoUser {

    static String name;
    static String email;
    static String captchaText;
    static boolean captchaVerified;

    public static void main(String bindu[]) {

        name = "Bindu KV";
        email = "bindu11@gmail.com";
        captchaText = "ABCD123";
        captchaVerified = true;

        System.out.println("The Name is " + name);
        System.out.println("The Email is " + email);
        System.out.println("The Captcha Text is " + captchaText);
        System.out.println("Captcha Verified: " + captchaVerified);

        System.out.println("The updated data is ");

        name = "Bhuvi Rao";
        email = "bhuvi.rao@gmail.com";
        captchaText = "XYZ7890";
        captchaVerified = false;

        System.out.println("The Name is " + name);
        System.out.println("The Email is " + email);
        System.out.println("The Captcha Text is " + captchaText);
        System.out.println("Captcha Verified: " + captchaVerified);
    }
}