class Myntra {

    public static void createAccount(String name, String email, long phone, String password, String gender, String size, int age) {

        System.out.println("Myntra Account Creation Started");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Password : " + password);
        System.out.println("Gender : " + gender);
        System.out.println("Preferred Size : " + size);
        System.out.println("Age : " + age);

        System.out.println("Myntra Account Created");
    }

    public static void main(String[] bindu) {

        createAccount("Bindu", "bindu11@gmail.com", 8942312046l, "Myntra123", "Female", "S", 22);
    }
}