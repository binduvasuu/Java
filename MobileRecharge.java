class MobileRecharge {

    static String customerName;
    static long mobileNumber;
    static String serviceProvider;
    static String rechargePlan;
    static double rechargeAmount;
    static String paymentMethod;
    static String rechargeStatus;
    static String rechargeDate;

    public static boolean rechargeMobile(String cName,long mobile,String provider,String plan,double amount, String payment,String status,String date) {

        boolean isRecharged = false;

        customerName = cName;
        mobileNumber = mobile;
        serviceProvider = provider;
        rechargePlan = plan;
        rechargeAmount = amount;
        paymentMethod = payment;
        rechargeStatus = status;
        rechargeDate = date;

        isRecharged = true;

        return isRecharged;
    }

    public static void getRechargeDetails() {

        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Service Provider : " + serviceProvider);
        System.out.println("Recharge Plan : " + rechargePlan);
        System.out.println("Recharge Amount : " + rechargeAmount);
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Recharge Status : " + rechargeStatus);
        System.out.println("Recharge Date : " + rechargeDate);
    }
}