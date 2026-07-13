class BigBasket {

    public static void createAccount(String name, String email, long phone, String password, String address, boolean member, int pincode) {

        System.out.println("BigBasket Account Creation Started");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("Address : " + address);
        System.out.println("Member : " + member);
        System.out.println("Pincode : " + pincode);

        System.out.println("BigBasket Account Created");
    }

    public static void main(String[] bindu) {

        createAccount("Bindu", "bindu@gmail.com", 9874432614l, "Book342", "Bangalore", true, 560012);
}
}