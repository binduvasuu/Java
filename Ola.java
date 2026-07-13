class Ola {

    public static void createAccount(String name, String email, long phone, String password, String city, String vehicleType, int age) {

        System.out.println("Ola Account Creation Started");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("City : " + city);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Age : " + age);

        System.out.println("Ola Account Created");
    }

    public static void main(String[] bindu) {

        createAccount("Bindu", "bindu5@gmail.com", 9853102164l, "Ola@123", "Bangalore", "Wagonar", 22);
    }
}