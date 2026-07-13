class NammaMetro{
	public static void main (String metro[]){
		String startedOperations = "20th october 2011";
		String operator = "Bengaluru metro rail corporation limited";
		String powerSystem = "750 V DC third rail";
		String trackTypes = "Elevated,underground,and at-gate.";
		String networkLength = "About 96 km of operational routes";
		String operationalStations ="Around 83 stations";
		String lines = "purple and green";
		
		System.out.println("Namma Metro Information");
		System.out.println("Namma Metro started operations in: " + startedOperations);
		System.out.println("The metro is operated by: " + operator);
		System.out.println("The power supply system used is: " + powerSystem);
		System.out.println("The type of track used is: " + trackTypes);
		System.out.println("The total network length is: " + networkLength + " km");
		System.out.println("The number of operational stations is: " + operationalStations);
		System.out.println("The metro currently has: " + lines + " lines");
		System.out.println(" ");
		
		String purpleLines[] = {"Whitefield (Kadugodi)", "Hopefarm Channasandra", "Kadugodi Tree Park", "Pattandur Agrahara",
		"Sri Sathya Sai Hospital", "Nallurhalli", "Kundalahalli", "Seetharamapalya", "Hoodi", "Garudacharpalya", "Singayyanapalya",
		"KR Puram", "Benniganahalli", "Baiyappanahalli", "Swami Vivekananda Road", "Indiranagar", "Halasuru", "Trinity", "MG Road",
		"Cubbon Park", "Dr. B. R. Ambedkar Station, Vidhana Soudha", "Sir M. Visvesvaraya Station, Central College",
		"Nadaprabhu Kempegowda Station (Majestic)", "Krantivira Sangolli Rayanna Railway Station", "Magadi Road", "Hosahalli",
		"Vijayanagar", "Attiguppe", "Deepanjali Nagar", "Mysuru Road", "Pantharapalya", "Rajarajeshwari Nagar", "Jnanabharathi",
		"Pattanagere", "Kengeri Bus Terminal", "Kengeri", "Challaghatta"};
		
		String greenLines[] = {"Madavara", "Chikkabidarakallu (Nagasandra)", "Manjunathanagar", "Peenya Industry", "Peenya",
		"Goraguntepalya", "Yeshwanthpur", "Sandal Soap Factory", "Mahalakshmi", "Rajajinagar", "Kuvempu Road", "Srirampura", 
		"Mantri Square Sampige Road", "Nadaprabhu Kempegowda Station (Majestic)", "Chickpet", "Krishna Rajendra Market",
		"National College", "Lalbagh", "South End Circle", "Jayanagar", "Rashtreeya Vidyalaya Road (RV Road)", "Banashankari",
		"Jaya Prakash Nagar", "Yelachenahalli", "Konanakunte Cross", "Doddakallasandra", "Vajarahalli", "Thalaghattapura", "Silk Institute"};
		
		for (String purpleLine : purpleLines) {
			System.out.println("The stations in purple line is " + purpleLine);
			}
			 
			System.out.println(" ");
			 
			 
			for (String greenLine : greenLines) {
				System.out.println("The stations in green line is " + greenLine);
		}
	}
}