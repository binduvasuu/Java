class SnapchatUser {

    static String firstName;
    static String lastName;
    static String month;
    static int day;
    static int year;
    static String userName;
    static String password;

    public static void main(String bindu[]) {

        firstName = "Rahul";
        lastName = "sharma";
        month = "January";
        day = 5;
        year = 2001;
        userName = "rahul01";
        password = "rahul@123";

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Birth Month is " + month);
        System.out.println("The Birth Day is " + day);
        System.out.println("The Birth Year is " + year);
        System.out.println("The Username is " + userName);
        System.out.println("The Password is " + password);

        

        System.out.println("The updated data is ");

        firstName = "Sneha";
        lastName = "Reddy";
        month = "September";
        day = 18;
        year = 2003;
        userName = "sneha18";
        password = "sneha@456";

        System.out.println("The First Name is " + firstName);
        System.out.println("The Last Name is " + lastName);
        System.out.println("The Birth Month is " + month);
        System.out.println("The Birth Day is " + day);
        System.out.println("The Birth Year is " + year);
        System.out.println("The Username is " + userName);
        System.out.println("The Password is " + password);
    }
}