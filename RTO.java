class RTO {

    static String officeName;
    static String location;
    static String officerName;
    static String applicantName;
    static String serviceType;
    static String vehicleNumber;
    static long contactNumber;
    static String licenseNumber;

    public static boolean startRTO(String oName, String place,String officer, String applicant,String service, String vehicle,long contact, String license) {

        boolean isStarted = false;

        officeName = oName;
        location = place;
        officerName = officer;
        applicantName = applicant;
        serviceType = service;
        vehicleNumber = vehicle;
        contactNumber = contact;
        licenseNumber = license;

        isStarted = true;

        return isStarted;
    }

    public static void getRTO() {

        System.out.println("Office Name is " + officeName);
        System.out.println("Location is " + location);
        System.out.println("Officer Name is " + officerName);
        System.out.println("Applicant Name is " + applicantName);
        System.out.println("Service Type is " + serviceType);
        System.out.println("Vehicle Number is " + vehicleNumber);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("License Number is " + licenseNumber);

    }
}