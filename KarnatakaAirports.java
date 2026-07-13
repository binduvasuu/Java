class KarnatakaAirports {
    public static void main(String bindu[]) {
        String state = "Karnataka";
        String capital = "Bengaluru";
        String internationalAirports = "2";
        String domesticAirports = "7";
        String authority = "Airports Authority of India (AAI) and Private Operators";
        String busiestAirport = "Kempegowda International Airport";
        String famousFor = "Domestic and International Air Connectivity";
		
        System.out.println("About Karnataka Airports");
        System.out.println("The State is" + state);
        System.out.println("The Capital is" + capital);
        System.out.println("The no of International Airports are" + internationalAirports);
        System.out.println("The no of Domestic Airports are " + domesticAirports);
        System.out.println("The Authority is " + authority);
        System.out.println("The Busiest Airport among them is" + busiestAirport);
        System.out.println("It is Famous For" + famousFor);
		
        String airports[] = {"Kempegowda International Airport, Bengaluru", "Mangaluru International Airport, Mangaluru",
		"Belagavi Airport, Belagavi", "Hubballi Airport, Hubballi", "Mysuru Airport, Mysuru", "Kalaburagi Airport, Kalaburagi",
		"Bidar Airport, Bidar", "Shivamogga Airport", "Jindal Vijayanagar Airport, Ballari"};
		
        System.out.println("Airports in Karnataka:");
        for (String airport : airports) {
        System.out.println(airport);
        }
    }
}