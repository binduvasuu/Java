class VRLLogistics {

    static String branchName;
    static String location;
    static String senderName;
    static String receiverName;
    static String parcelType;
    static double parcelWeight;
    static long contactNumber;
    static String trackingId;

    public static boolean startVRL(String bName, String place, String sender, String receiver, String type, double weight,long contact, String trackId) {

        boolean isStarted = false;

        branchName = bName;
        location = place;
        senderName = sender;
        receiverName = receiver;
        parcelType = type;
        parcelWeight = weight;
        contactNumber = contact;
        trackingId = trackId;

        isStarted = true;

        return isStarted;
    }

    public static void getVRL() {

        System.out.println("Branch Name is " + branchName);
        System.out.println("Location is " + location);
        System.out.println("Sender Name is " + senderName);
        System.out.println("Receiver Name is " + receiverName);
        System.out.println("Parcel Type is " + parcelType);
        System.out.println("Parcel Weight is " + parcelWeight + " kg");
        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Tracking ID is " + trackingId);

    }
}