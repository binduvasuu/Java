class Hotel {
	
	static String hotelName ;
	static int noOfWorkers ;
	static String timings ;
	static String hotelAddress ;
	static long contactNo;
	static double ratings;
	static boolean isOpen;
	static char menu;
	
	
	public static void main (String hotel[]) {
		
	hotelName = "Mayura";
	noOfWorkers = 5;
	timings = "4:00am - 8:00pm";
	hotelAddress = "Vijayanagar";
	contactNo = 9865978569l;
	ratings = 4.9;
	String gstNo = "Gst58F";
	int roomsAvailable = 5; 
	boolean isOpen = true;
	char menu = '5';
		System.out.println("Is the hotel open " + isOpen);
		System.out.println("Hotel name is " + hotelName);
		System.out.println("No of workers: " + noOfWorkers);
		System.out.println("Hotel timings is " + timings);
		System.out.println("Hotel address is " + hotelAddress);
		System.out.println("Contact number of hotel is " + contactNo);
		System.out.println("Ratings of the hotel is " + ratings);
		System.out.println("GST no of the hotel is " +gstNo);
		System.out.println("Number of rooms available is " + roomsAvailable);
		System.out.println("Menu option available is " + menu );
		
	}
}