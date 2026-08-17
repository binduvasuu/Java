class Hotel {

    String hotelName;
    int hotelId;
    String managerName;
    String hotelAddress;

    Floor floor;

    public void displayHotelDetails() {
        System.out.println("Hotel Name is " + hotelName);
        System.out.println("Hotel ID is " + hotelId);
        System.out.println("Manager Name is " + managerName);
        System.out.println("Hotel Address is " + hotelAddress);
		System.out.println(" ");

            floor.displayFloorDetails();
        
    }
}