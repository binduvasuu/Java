class RTO {

    static String officeName;
    static String location;
    static String officerName;
    static String applicantName;
    static String serviceType;
    static String vehicleNumber;
    static long contactNumber;
    static String licenseNumber;

    public static boolean startRTO(String oName, String place, String officer, String applicant, String service, String vehicle, long contact, String license) {

        boolean isStarted = false;

        boolean isOfficeNameValid = false;
        boolean isLocationValid = false;
        boolean isOfficerNameValid = false;
        boolean isApplicantNameValid = false;
        boolean isServiceTypeValid = false;
        boolean isVehicleNumberValid = false;
        boolean isContactNumberValid = false;
        boolean isLicenseNumberValid = false;

        if (oName != null) {
            officeName = oName;
            isOfficeNameValid = true;
        } else {
            System.out.println("Invalid Office Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (officer != null) {
            officerName = officer;
            isOfficerNameValid = true;
        } else {
            System.out.println("Invalid Officer Name");
        }

        if (applicant != null) {
            applicantName = applicant;
            isApplicantNameValid = true;
        } else {
            System.out.println("Invalid Applicant Name");
        }

        if (service != null) {
            serviceType = service;
            isServiceTypeValid = true;
        } else {
            System.out.println("Invalid Service Type");
        }

        if (vehicle != null) {
            vehicleNumber = vehicle;
            isVehicleNumberValid = true;
        } else {
            System.out.println("Invalid Vehicle Number");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (license != null) {
            licenseNumber = license;
            isLicenseNumberValid = true;
        } else {
            System.out.println("Invalid License Number");
        }

        if (isOfficeNameValid == true && isLocationValid == true &&
            isOfficerNameValid == true && isApplicantNameValid == true &&
            isServiceTypeValid == true && isVehicleNumberValid == true &&
            isContactNumberValid == true && isLicenseNumberValid == true) {

            isStarted = true;
        }

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