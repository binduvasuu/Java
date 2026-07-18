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

        libraryName = lName;
        location = place;
        librarianName = libName;
        memberName = mName;
        memberAge = age;
        bookName = bName;
        contactNumber = contact;
        membershipId = memberId;

        isStarted = true;

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