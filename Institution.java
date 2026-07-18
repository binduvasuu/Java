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

        institutionName = iName;
        location = place;
        principalName = pName;
        studentName = sName;
        studentAge = age;
        course = cName;
        contactNumber = contact;
        studentId = id;

        isStarted = true;

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