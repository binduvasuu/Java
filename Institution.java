class Institution {

    static String institutionName;
    static String location;
    static String principalName;
    static String studentName;
    static int studentAge;
    static String course;
    static long contactNumber;
    static int studentId;

    public static boolean nationalInstitution(String iName, String place, String pName, String sName, int age, String cName, long contact, int id) {

        boolean isStarted = false;

        boolean isInstitutionNameValid = false;
        boolean isLocationValid = false;
        boolean isPrincipalNameValid = false;
        boolean isStudentNameValid = false;
        boolean isStudentAgeValid = false;
        boolean isCourseValid = false;
        boolean isContactNumberValid = false;
        boolean isStudentIdValid = false;

        if (iName != null) {
            institutionName = iName;
            isInstitutionNameValid = true;
        } else {
            System.out.println("Invalid Institution Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (pName != null) {
            principalName = pName;
            isPrincipalNameValid = true;
        } else {
            System.out.println("Invalid Principal Name");
        }

        if (sName != null) {
            studentName = sName;
            isStudentNameValid = true;
        } else {
            System.out.println("Invalid Student Name");
        }

        if (age > 0) {
            studentAge = age;
            isStudentAgeValid = true;
        } else {
            System.out.println("Invalid Student Age");
        }

        if (cName != null) {
            course = cName;
            isCourseValid = true;
        } else {
            System.out.println("Invalid Course");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (id > 0) {
            studentId = id;
            isStudentIdValid = true;
        } else {
            System.out.println("Invalid Student ID");
        }

        if (isInstitutionNameValid == true && isLocationValid == true && isPrincipalNameValid == true &&
            isStudentNameValid == true && isStudentAgeValid == true && isCourseValid == true &&
            isContactNumberValid == true && isStudentIdValid == true) {

            isStarted = true;
        }

        return isStarted;
    }

    public static void getInstitution() {

        System.out.println("Institution Name is " + institutionName);
        System.out.println("Location is " + location);
        System.out.println("Principal Name is " + principalName);
        System.out.println("Student Name is " + studentName);
        System.out.println("Student Age is " + studentAge);
        System.out.println("Course is " + course);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Student ID is " + studentId);
    }
}