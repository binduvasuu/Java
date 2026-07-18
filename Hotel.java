class Hotel {

    static String hotelName;
    static String location;
    static String ownerName;
    static String customerName;
    static int customerAge;
    static String roomType;
    static long contactNumber;
    static long roomNumber;

    public static boolean tajHotel(String hName, String place, String oName,String cName, int age, String type, long contact, int room) {

        boolean isStarted = false;

        hotelName = hName;
        location = place;
        ownerName = oName;
        customerName = cName;
        customerAge = age;
        roomType = type;
        contactNumber = contact;
        roomNumber = room;

        isStarted = true;
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