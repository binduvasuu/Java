class VRLLogistics {

    static String branchName;
    static String location;
    static String senderName;
    static String receiverName;
    static String parcelType;
    static double parcelWeight;
    static long contactNumber;
    static String trackingId;

    public static boolean startVRL(String bName, String place, String sender, String receiver, String type, double weight, long contact, String trackId) {

        boolean isStarted = false;

        boolean isBranchNameValid = false;
        boolean isLocationValid = false;
        boolean isSenderNameValid = false;
        boolean isReceiverNameValid = false;
        boolean isParcelTypeValid = false;
        boolean isParcelWeightValid = false;
        boolean isContactNumberValid = false;
        boolean isTrackingIdValid = false;

        if (bName != null) {
            branchName = bName;
            isBranchNameValid = true;
        } else {
            System.out.println("Invalid Branch Name");
        }

        if (place != null) {
            location = place;
            isLocationValid = true;
        } else {
            System.out.println("Invalid Location");
        }

        if (sender != null) {
            senderName = sender;
            isSenderNameValid = true;
        } else {
            System.out.println("Invalid Sender Name");
        }

        if (receiver != null) {
            receiverName = receiver;
            isReceiverNameValid = true;
        } else {
            System.out.println("Invalid Receiver Name");
        }

        if (type != null) {
            parcelType = type;
            isParcelTypeValid = true;
        } else {
            System.out.println("Invalid Parcel Type");
        }

        if (weight > 0) {
            parcelWeight = weight;
            isParcelWeightValid = true;
        } else {
            System.out.println("Invalid Parcel Weight");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number");
        }

        if (trackId != null) {
            trackingId = trackId;
            isTrackingIdValid = true;
        } else {
            System.out.println("Invalid Tracking ID");
        }

        if (isBranchNameValid == true && isLocationValid == true &&
            isSenderNameValid == true && isReceiverNameValid == true &&
            isParcelTypeValid == true && isParcelWeightValid == true &&
            isContactNumberValid == true && isTrackingIdValid == true) {

            isStarted = true;
        }

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