class Netflix {

    public static void createAccount(String name, String email, long phone, String password, String plan, String language, int screens) {

        System.out.println("Netflix Account Creation Started");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("Plan : " + plan);
        System.out.println("Language : " + language);
        System.out.println("Screens : " + screens);

        System.out.println("Netflix Account Created");
    }

    public static void main(String[] bindu) {

        createAccount("Bidu", "bindu11@gmail.com", 9568412217l, "Netflix123", "Premium", "English", 4);
    }
}