class Showroom {

    static String showroomName;
    static String location;
    static String managerName;
    static String customerName;
    static String vehicleBrand;
    static String vehicleModel;
    static long contactNumber;
    static double vehiclePrice;

    public static boolean startShowroom(String sName, String place, String manager, String customer, String brand, String model, long contact, double price) {

        boolean isStarted = false;

        boolean isShowroomNameValid = false;
        boolean isLocationValid = false;
        boolean isManagerNameValid = false;
        boolean isCustomerNameValid = false;
        boolean isVehicleBrandValid = false;
        boolean isVehicleModelValid = false;
        boolean isContactNumberValid = false;
        boolean isVehiclePriceValid = false;

        if (sName != null) {
            showroomName = sName;
            isShowroomNameValid = true;
        } else {
            System.out.println("Invalid Showroom Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (manager != null) {
            managerName = manager;
            isManagerNameValid = true;
        } else {
            System.out.println("Invalid Manager Name");
        }

        if (customer != null) {
            customerName = customer;
            isCustomerNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        if (brand != null) {
            vehicleBrand = brand;
            isVehicleBrandValid = true;
        } else {
            System.out.println("Invalid Vehicle Brand");
        }

        if (model != null) {
            vehicleModel = model;
            isVehicleModelValid = true;
        } else {
            System.out.println("Invalid Vehicle Model");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (price > 0) {
            vehiclePrice = price;
            isVehiclePriceValid = true;
        } else {
            System.out.println("Invalid Vehicle Price");
        }

        if (isShowroomNameValid == true && isLocationValid == true &&
            isManagerNameValid == true && isCustomerNameValid == true &&
            isVehicleBrandValid == true && isVehicleModelValid == true &&
            isContactNumberValid == true && isVehiclePriceValid == true) {

            isStarted = true;
        }

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