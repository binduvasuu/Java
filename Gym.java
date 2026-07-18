class Gym {

    static String gymName;
    static String location;
    static String trainerName;
    static String memberName;
    static int memberAge;
    static String workoutType;
    static long contactNumber;
    static int membershipId;

    public static boolean fitnessGym(String gName, String place, String tName, String mName, int age, String workout, long contact, int memberId) {

        boolean isStarted = false;

        gymName = gName;
        location = place;
        trainerName = tName;
        memberName = mName;
        memberAge = age;
        workoutType = workout;
        contactNumber = contact;
        membershipId = memberId;

        isStarted = true;

        return isStarted;
    }

    public static void getGym() {

        System.out.println("Gym Name is " + gymName);
        System.out.println("Location is " + location);
        System.out.println("Trainer Name is " + trainerName);
        System.out.println("Member Name is " + memberName);
        System.out.println("Member Age is " + memberAge);
        System.out.println("Workout Type is " + workoutType);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Membership ID is " + membershipId);
    }
}