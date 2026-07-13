class BookMyShow {

    public static void createAccount(String name, String email, long phone, String password, String city, String language, int age) {

        System.out.println("BookMyShow Account Creation Started");

        System.out.println("Name is " + name);
        System.out.println("Email is " + email);
        System.out.println("Phone is " + phone);
        System.out.println("Password is " + password);
        System.out.println("City is " + city);
        System.out.println("Preferred Language is " + language);
        System.out.println("Age is " + age);

        System.out.println("BookMyShow Account Created");
    }

    public static void main(String[] bindu) {

        createAccount("Bindu", "bindu@gmail.com", 9876543210L, "Book@123", "Bangalore", "Kannada", 22);
    }
}