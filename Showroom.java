class Showroom {

    static String showroomName;
    static String location;
    static String managerName;
    static String customerName;
    static String vehicleBrand;
    static String vehicleModel;
    static long contactNumber;
    static double vehiclePrice;

    public static boolean startShowroom(String sName, String place,String manager, String customer,String brand, String model,long contact, double price) {

        boolean isStarted = false;

        showroomName = sName;
        location = place;
        managerName = manager;
        customerName = customer;
        vehicleBrand = brand;
        vehicleModel = model;
        contactNumber = contact;
        vehiclePrice = price;

        isStarted = true;

        return isStarted;
    }

    public static void getShowroom() {

        System.out.println("Showroom Name is " + showroomName);
        System.out.println("Location is " + location);
        System.out.println("Manager Name is " + managerName);
        System.out.println("Customer Name is " + customerName);
        System.out.println("Vehicle Brand is " + vehicleBrand);
        System.out.println("Vehicle Model is " + vehicleModel);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Vehicle Price is " + vehiclePrice);

    }
}