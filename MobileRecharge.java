class MobileRecharge {

    static String customerName;
    static long mobileNumber;
    static String serviceProvider;
    static String rechargePlan;
    static double rechargeAmount;
    static String paymentMethod;
    static String rechargeStatus;
    static String rechargeDate;

    public static boolean rechargeMobile(String cName, long mobile, String provider, String plan, double amount, String payment, String status, String date) {

        boolean isRecharged = false;

        boolean isCustomerNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isServiceProviderValid = false;
        boolean isRechargePlanValid = false;
        boolean isRechargeAmountValid = false;
        boolean isPaymentMethodValid = false;
        boolean isRechargeStatusValid = false;
        boolean isRechargeDateValid = false;

        if (cName != null) {
            customerName = cName;
            isCustomerNameValid = true;
        } else {
            System.out.println("Invalid Customer Name");
        }

        if (mobile > 0) {
            mobileNumber = mobile;
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        if (provider != null) {
            serviceProvider = provider;
            isServiceProviderValid = true;
        } else {
            System.out.println("Invalid Service Provider");
        }

        if (plan != null) {
            rechargePlan = plan;
            isRechargePlanValid = true;
        } else {
            System.out.println("Invalid Recharge Plan");
        }

        if (amount > 0) {
            rechargeAmount = amount;
            isRechargeAmountValid = true;
        } else {
            System.out.println("Invalid Recharge Amount");
        }

        if (payment != null) {
            paymentMethod = payment;
            isPaymentMethodValid = true;
        } else {
            System.out.println("Invalid Payment Method");
        }

        if (status != null) {
            rechargeStatus = status;
            isRechargeStatusValid = true;
        } else {
            System.out.println("Invalid Recharge Status");
        }

        if (date != null) {
            rechargeDate = date;
            isRechargeDateValid = true;
        } else {
            System.out.println("Invalid Recharge Date");
        }

        if (isCustomerNameValid == true && isMobileNumberValid == true &&
            isServiceProviderValid == true &&  isRechargePlanValid == true &&
            isRechargeAmountValid == true &&  isPaymentMethodValid == true &&
            isRechargeStatusValid == true &&  isRechargeDateValid == true) {

            isRecharged = true;
        }

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