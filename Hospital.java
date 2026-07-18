class Hospital { 

	static String hospitalName;
	static String location;
	static String doctorName;
	static String patientName;
	static int patientAge;
	static String disease;
	static long contactNumber;
	static long roomNumber;
	
	public static boolean startHospital ( String hName, String place, String dName, String pName, int age, String illness, long contact, int room) {
	
	
	boolean isStarted = false;
	
	hospitalName = hName;
	location = place;
	doctorName = dName;
	patientName = pName;
	patientAge = age;
	disease = illness;
	contactNumber = contact;
	roomNumber = room;
	
	 isStarted = true;

        return isStarted;
	
	
	}
	
	
	public static void getHospital () {
	
	System.out.println("Hospital name is " + hospitalName);
	System.out.println("Location is " + location);
	System.out.println("Doctor name is " + doctorName);
	System.out.println("Patient name is " + patientName);
	System.out.println("Patient age is " + patientAge);
	System.out.println("Diesease is " + disease);
	System.out.println("Contact number is " + contactNumber);
	System.out.println("Room number is " + roomNumber);
	
	
	}




}