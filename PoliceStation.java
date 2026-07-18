class PoliceStation {

    static String stationName;
    static String location;
    static String inspectorName;
    static String complainantName;
    static int complainantAge;
    static String complaintType;
    static long contactNumber;
    static int caseNumber;

    public static boolean policeStation(String sName, String place,  String iName, String cName, int age, String complaint,long contact, int caseNo) {

        boolean isStarted = false;

        stationName = sName;
        location = place;
        inspectorName = iName;
        complainantName = cName;
        complainantAge = age;
        complaintType = complaint;
        contactNumber = contact;
        caseNumber = caseNo;

        isStarted = true;

        return isStarted;
    }

    public static void getPoliceStation() {

        System.out.println("Police Station Name is " + stationName);
        System.out.println("Location is " + location);
        System.out.println("Inspector Name is " + inspectorName);
        System.out.println("Complainant Name is " + complainantName);
        System.out.println("Complainant Age is " + complainantAge);
        System.out.println("Complaint Type is " + complaintType);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Case Number is " + caseNumber);
    }
}