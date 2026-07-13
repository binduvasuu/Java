class Instagram {

    public static void createAccount(String username, String email, long phone, String password, String bio, String gender, int age) {

        System.out.println("Instagram Account Creation Started");

        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("Bio : " + bio);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);

        System.out.println("Instagram Account Created");
    }

    public static void main(String[] bindu) {

        createAccount ("bindu11", "bindu@gmail.com", 9530124876l, "Insta23", "Trainee", "Female", 22);
    }
}