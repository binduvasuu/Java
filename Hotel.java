class Hotel {

    static String hotelName;
    static String location;
    static String ownerName;
    static String customerName;
    static int customerAge;
    static String roomType;
    static long contactNumber;
    static long roomNumber;

    public static boolean tajHotel(String hName, String place, String oName, String cName, int age, String type, long contact, long room) {

        boolean isStarted = false;

        boolean isHotelNameValid = false;
        boolean isLocationValid = false;
        boolean isOwnerNameValid = false;
        boolean isCustomerNameValid = false;
        boolean isCustomerAgeValid = false;
        boolean isRoomTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isRoomNumberValid = false;

        if (hName != null) {
            hotelName = hName;
            isHotelNameValid = true;
        } else {
            System.out.println("Invalid Hotel Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (oName != null) {
            ownerName = oName;
            isOwnerNameValid = true;
        } else {
            System.out.println("Invalid Owner Name");
        }

        if (cName != null) {
            customerName = cName;
            isCustomerNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        if (age > 0) {
            customerAge = age;
            isCustomerAgeValid = true;
        } else {
            System.out.println("Invalid Customer Age");
        }

        if (type != null) {
            roomType = type;
            isRoomTypeValid = true;
        } else {
            System.out.println("Invalid Room Type");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (room > 0) {
            roomNumber = room;
            isRoomNumberValid = true;
        } else {
            System.out.println("Invalid Room Number");
        }

        if (isHotelNameValid == true && isLocationValid == true && isOwnerNameValid == true && isCustomerNameValid == true &&
            isCustomerAgeValid == true && isRoomTypeValid == true && isContactNumberValid == true && isRoomNumberValid == true) {

            isStarted = true;
        }

        return isStarted;
    }

    public static void getHotel() {

        System.out.println("Hotel name is " + hotelName);
        System.out.println("Location is " + location);
        System.out.println("Owner name is " + ownerName);
        System.out.println("Customer name is " + customerName);
        System.out.println("Customer age is " + customerAge);
        System.out.println("Room type is " + roomType);
        System.out.println("Contact number is " + contactNumber);
        System.out.println("Room number is " + roomNumber);
    }
}