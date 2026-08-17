class HotelRunner {

    public static void main(String[] args) {

        
        Hotel hotel1 = new Hotel();

        hotel1.hotelName = "WoodLands Hotel";
        hotel1.hotelId = 101;
        hotel1.managerName = "Rahul";
        hotel1.hotelAddress = "Bangalore";

        Floor floor1 = new Floor();

        floor1.floorNumber = 1;
        floor1.numberOfRooms = 20;
        floor1.floorType = "Luxury";

        hotel1.floor = floor1;
        floor1.hotel = hotel1;


        
		
		
		
        Hotel hotel2 = new Hotel();

        hotel2.hotelName = "Lalitha Mahal Palace";
        hotel2.hotelId = 102;
        hotel2.managerName = "Arun";
        hotel2.hotelAddress = "Mysore";

        Floor floor2 = new Floor();

        floor2.floorNumber = 2;
        floor2.numberOfRooms = 30;
        floor2.floorType = "Deluxe";

        hotel2.floor = floor2;
        floor2.hotel = hotel2;


        
		
		
		
        Hotel hotel3 = new Hotel();

        hotel3.hotelName = "SS Residency";
        hotel3.hotelId = 103;
        hotel3.managerName = "Kiran";
        hotel3.hotelAddress = "Hassan";

        Floor floor3 = new Floor();

        floor3.floorNumber = 3;
        floor3.numberOfRooms = 25;
        floor3.floorType = "Standard";

        hotel3.floor = floor3;
        floor3.hotel = hotel3;


        
		
		
		
        Hotel hotel4 = new Hotel();

        hotel4.hotelName = "Trivik";
        hotel4.hotelId = 104;
        hotel4.managerName = "Vijay";
        hotel4.hotelAddress = "Chikmagalur";

        Floor floor4 = new Floor();

        floor4.floorNumber = 4;
        floor4.numberOfRooms = 15;
        floor4.floorType = "Premium";

        hotel4.floor = floor4;
        floor4.hotel = hotel4;


       
	   
	   
	   
        Hotel hotel5 = new Hotel();

        hotel5.hotelName = "Lake View Hotel";
        hotel5.hotelId = 105;
        hotel5.managerName = "Manoj";
        hotel5.hotelAddress = "Mangalore";

        Floor floor5 = new Floor();

        floor5.floorNumber = 5;
        floor5.numberOfRooms = 40;
        floor5.floorType = "Grand";

        hotel5.floor = floor5;
        floor5.hotel = hotel5;


       
        hotel1.displayHotelDetails();
        hotel2.displayHotelDetails();
        hotel3.displayHotelDetails();
        hotel4.displayHotelDetails();
        hotel5.displayHotelDetails();
    }
}