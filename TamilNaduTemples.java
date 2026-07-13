class TamilNaduTemples {
    public static void main(String bindu[]) {
        String state = "Tamil Nadu";
        String capital = "Chennai";
        String famousFor = "Ancient Hindu Temples";
        String language = "Tamil";
        String majorReligion = "Hinduism";
        String architecture = "Dravidian Architecture";
        String tourism = "One of the largest temple tourism destinations in India";
		
        System.out.println("About Tamil Nadu Temples");
        System.out.println("The State temples located" + state);
        System.out.println("The Capital of tamilnadu is" + capital);
        System.out.println("It is Famous For" + famousFor);0
        System.out.println("The Language used is " + language);
        System.out.println("The Major Religion in tamilnadu is " + majorReligion);
        System.out.println("The main Architecture of the tamilnadu is " + architecture);
        System.out.println("The main Tourism is " + tourism);
		
        String temples[] = {"Meenakshi Amman Temple, Madurai", "Brihadeeswarar Temple, Thanjavur", "Ramanathaswamy Temple, Rameswaram",
		"Arunachaleswarar Temple, Tiruvannamalai", "Nataraja Temple, Chidambaram", "Kanchi Kailasanathar Temple, Kanchipuram",
		"Ekambareswarar Temple, Kanchipuram", "Kamakshi Amman Temple, Kanchipuram", "Sri Ranganathaswamy Temple, Srirangam",
		"Jambukeswarar Temple, Tiruchirappalli", "Kapaleeshwarar Temple, Chennai", "Marundeeswarar Temple, Chennai", "Murugan Temple, Palani",
		"Subramanya Swamy Temple, Tiruchendur", "Nellaiappar Temple, Tirunelveli", "Kumbeshwarar Temple, Kumbakonam", "Airavatesvara Temple, Darasuram",
		"Annamalaiyar Temple, Tiruvannamalai", "Thyagaraja Temple, Tiruvarur", "Srivilliputhur Andal Temple, Srivilliputhur"};
        System.out.println("Famous Temples in Tamil Nadu:");
		
        for (String temple : temples) {
        System.out.println(temple);
        }
    }
}