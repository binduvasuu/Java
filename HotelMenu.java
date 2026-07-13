class HotelMenu {
    public static void main(String hotel[]) {
        String hotelName = "Udupi Grand";
        String location = "Bengaluru";
        String type = "Vegetarian Restaurant";
        String established = "2005";
        String speciality = "South Indian, North Indian and Chinese";
        String timing = "7:00 AM to 11:00 PM";
        String payment = "Cash, UPI, Credit/Debit Card";
		
        System.out.println("About Hotel");
        System.out.println("The name of the Hotel is" + hotelName);
        System.out.println("The Location of the hotel is" + location);
        System.out.println("The Type of the hotel is" + type);
        System.out.println("The hotel is Establishedin the year" + established);
        System.out.println("The Speciality of the hotel is" + speciality);
        System.out.println("The Timings of the hotel is" + timing);
        System.out.println("The Payment Methods accepted in the hotel is " + payment);
        String menu[] = {"Idli", "Vada", "Dosa", "Masala Dosa", "Set Dosa", "Rava Dosa",  
		"Paneer Butter Masala", "Palak Paneer", "Mushroom Curry", "Gobi Manchurian", 
		"Noodles", "Tomato Soup", "Ice Cream", "Coffee", "Tea", "Fresh Lime Juice"
		"Poori", "Chapati", "Parotta", "Veg Fried Rice", "Jeera Rice", "Veg Biryani",};
		
        System.out.println("Hotel Menu:");
        for (String item : menu) {
            System.out.println(item);
        }
    }
}