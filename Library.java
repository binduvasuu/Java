class Library {

    static String libraryName;
    static String location;
    static String librarianName;
    static String memberName;
    static int memberAge;
    static String bookName;
    static long contactNumber;
    static int membershipId;

    public static boolean cityLibrary(String lName, String place, String libName,
            String mName, int age, String bName, long contact, int memberId) {

        boolean isStarted = false;

        boolean isLibraryNameValid = false;
        boolean isLocationValid = false;
        boolean isLibrarianNameValid = false;
        boolean isMemberNameValid = false;
        boolean isMemberAgeValid = false;
        boolean isBookNameValid = false;
        boolean isContactNumberValid = false;
        boolean isMembershipIdValid = false;

        if (lName != null) {
            libraryName = lName;
            isLibraryNameValid = true;
        } else {
            System.out.println("Invalid Library Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (libName != null) {
            librarianName = libName;
            isLibrarianNameValid = true;
        } else {
            System.out.println("Invalid Librarian Name");
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

        if (bName != null) {
            bookName = bName;
            isBookNameValid = true;
        } else {
            System.out.println("Invalid Book Name");
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

        if (isLibraryNameValid == true && isLocationValid == true &&  isLibrarianNameValid == true &&
            isMemberNameValid == true && isMemberAgeValid == true && isBookNameValid == true &&
            isContactNumberValid == true && isMembershipIdValid == true) {

            isStarted = true;
        }

        return isStarted;
    }

    public static void getLibrary() {

        System.out.println("Library Name is " + libraryName);
        System.out.println("Location is " + location);
        System.out.println("Librarian Name is " + librarianName);
        System.out.println("Member Name is " + memberName);
        System.out.println("Member Age is " + memberAge);
        System.out.println("Book Name is " + bookName);
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Membership ID is " + membershipId);
    }
}