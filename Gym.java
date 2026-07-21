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

        boolean isGymNameValid = false;
        boolean isLocationValid = false;
        boolean isTrainerNameValid = false;
        boolean isMemberNameValid = false;
        boolean isMemberAgeValid = false;
        boolean isWorkoutTypeValid = false;
        boolean isContactNumberValid = false;
        boolean isMembershipIdValid = false;

        if (gName != null) {
            gymName = gName;
            isGymNameValid = true;
        } else {
            System.out.println("Invalid Gym Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (tName != null) {
            trainerName = tName;
            isTrainerNameValid = true;
        } else {
            System.out.println("Invalid Trainer Name");
        }

        if (mName != null) {
            memberName = mName;
            isMemberNameValid = true;
        } else {
            System.out.println("Invalid Member Name");
        }

        if (age > 0) {
            memberAge = age;
            isMemberAgeValid = true;
        } else {
            System.out.println("Invalid Member Age");
        }

        if (workout != null) {
            workoutType = workout;
            isWorkoutTypeValid = true;
        } else {
            System.out.println("Invalid Workout Type");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (memberId > 0) {
            membershipId = memberId;
            isMembershipIdValid = true;
        } else {
            System.out.println("Invalid Membership ID");
        }

        if (isGymNameValid == true && isLocationValid == true &&
            isTrainerNameValid == true && isMemberNameValid == true &&
            isMemberAgeValid == true && isWorkoutTypeValid == true &&
            isContactNumberValid == true && isMembershipIdValid == true) {

            isStarted = true;
        }

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