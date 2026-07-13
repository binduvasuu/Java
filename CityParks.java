class CityParks {
    public static void main(String city[]){
        String country = "India";
        String state = "Karnataka";
        String famousCity = "Bengaluru";
        String nickname = "Garden City of India";
        String climate = "Moderate";
        String famousFor = "Parks, IT Industry and Gardens";
        String totalParks = "Many Public Parks";
		
        System.out.println("About City Parks");
        System.out.println("The Country of the park is" + country);
        System.out.println("The State of the park is" + state);
        System.out.println("The Famous City is" + famousCity);
        System.out.println("The Nickname of the park is" + nickname);
        System.out.println("The Climate in the park is" + climate);
        System.out.println("The park is Famous For" + famousFor);
        System.out.println("The Total no Parks are" + totalParks);
		
        String parks[] = {"Lalbagh Botanical Garden", "Cubbon Park", "Freedom Park", "JP Park", "Bugle Rock Park",
		"Cariappa Memorial Park", "M. N. Krishna Rao Park", "Bannerghatta Biological Park", "National Military Memorial Park",
		"Turahalli Forest", "Nisarga Park", "Hesaraghatta Grassland", "Agara Lake Park", "Kaikondrahalli Lake Park",
		"Ulsoor Lake Park", "Sankey Tank Park", "Lumbini Gardens", "Butterfly Park", "Kittur Rani Chennamma Park", "Joggers Park"};
		
        System.out.println("Famous Parks:");
        for (String park : parks) {
        System.out.println(park);
        }
    }
}