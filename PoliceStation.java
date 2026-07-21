class PoliceStation {

    static String stationName;
    static String location;
    static String inspectorName;
    static String complainantName;
    static int complainantAge;
    static String complaintType;
    static long contactNumber;
    static int caseNumber;

    public static boolean policeStation(String sName, String place, String iName, String cName, int age, String complaint, long contact, int caseNo) {

        boolean isStarted = false;

        boolean isStationNameValid = false;
        boolean isLocationValid = false;
        boolean isInspectorNameValid = false;
        boolean isComplainantNameValid = false;
        boolean isComplainantAgeValid = false;
        boolean isComplaintTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isCaseNumberValid = false;

        if (sName != null) {
            stationName = sName;
            isStationNameValid = true;
        } else {
            System.out.println("Invalid Station Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (iName != null) {
            inspectorName = iName;
            isInspectorNameValid = true;
        } else {
            System.out.println("Invalid Inspector Name");
        }

        if (cName != null) {
            complainantName = cName;
            isComplainantNameValid = true;
        } else {
            System.out.println("Invalid Complainant Name");
        }

        if (age > 0) {
            complainantAge = age;
            isComplainantAgeValid = true;
        } else {
            System.out.println("Invalid Complainant Age");
        }

        if (complaint != null) {
            complaintType = complaint;
            isComplaintTypeValid = true;
        } else {
            System.out.println("Invalid Complaint Type");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (caseNo > 0) {
            caseNumber = caseNo;
            isCaseNumberValid = true;
        } else {
            System.out.println("Invalid Case Number");
        }

        if (isStationNameValid == true && isLocationValid == true && isInspectorNameValid == true && isComplainantNameValid == true &&
            isComplainantAgeValid == true && isComplaintTypeValid == true &&  isContactNumberValid == true && isCaseNumberValid == true) {

            isStarted = true;
        }

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