class Hospital {

    static String hospitalName;
    static String location;
    static String doctorName;
    static String patientName;
    static int patientAge;
    static String disease;
    static long contactNumber;
    static long roomNumber;

    public static boolean startHospital(String hName, String place, String dName, String pName, int age, String illness, long contact, long room) {

        boolean isStarted = false;

        boolean isHospitalNameValid = false;
        boolean isLocationValid = false;
        boolean isDoctorNameValid = false;
        boolean isPatientNameValid = false;
        boolean isPatientAgeValid = false;
        boolean isDiseaseValid = false;
        boolean isContactNumberValid = false;
        boolean isRoomNumberValid = false;

        if (hName != null) {
            hospitalName = hName;
            isHospitalNameValid = true;
        } else {
            System.out.println("Invalid Hospital Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (dName != null) {
            doctorName = dName;
            isDoctorNameValid = true;
        } else {
            System.out.println("Invalid Doctor Name");
        }

        if (pName != null) {
            patientName = pName;
            isPatientNameValid = true;
        } else {
            System.out.println("Invalid Patient Name");
        }

        if (age > 0) {
            patientAge = age;
            isPatientAgeValid = true;
        } else {
            System.out.println("Invalid Patient Age");
        }

        if (illness != null) {
            disease = illness;
            isDiseaseValid = true;
        } else {
            System.out.println("Invalid Disease");
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

        if (isHospitalNameValid == true && isLocationValid == true && isDoctorNameValid == true && isPatientNameValid == true &&
            isPatientAgeValid == true && isDiseaseValid == true && isContactNumberValid == true && isRoomNumberValid == true) {

            isStarted = true;
        }

        return isStarted;
    }

    public static void getHospital() {

        System.out.println("Hospital name is " + hospitalName);
        System.out.println("Location is " + location);
        System.out.println("Doctor name is " + doctorName);
        System.out.println("Patient name is " + patientName);
        System.out.println("Patient age is " + patientAge);
        System.out.println("Disease is " + disease);
        System.out.println("Contact number is " + contactNumber);
        System.out.println("Room number is " + roomNumber);
    }
}