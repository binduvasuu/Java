class Spotify {

    public static void createAccount(String name, String email, long phone, String password, String plan, String musicType, int age) {

        System.out.println("Spotify Account Creation Started");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("Plan : " + plan);
        System.out.println("Music Type : " + musicType);
        System.out.println("Age : " + age);

        System.out.println("Spotify Account Created");
    }

    public static void main(String[] bindu) {

	createAccount("Bindu", "bindu2gmail.com", 9865541370l, "Spotify@123", "Premium", "Divine", 22);


        }
}