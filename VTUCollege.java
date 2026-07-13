class VTUCollege {
    public static void main(String vtu[]) {
        String university = "Visvesvaraya Technological University (VTU)";
        String established = "1998";
        String headquarters = "Belagavi, Karnataka";
        String type = "State Public University";
        String affiliatedColleges = "More than 200";
        String courses = "Engineering, Technology, Architecture and Management";
        String state = "Karnataka";
		
        System.out.println("About VTU");
        System.out.println("The name of the University is" + university);
        System.out.println("It is Established in" + established);
        System.out.println("The Headquartersis located in" + headquarters);
        System.out.println("The type is" + type);
        System.out.println("The no of Affiliated Colleges are" + affiliatedColleges);
        System.out.println("The courses offered by the vtu are" + courses);
        System.out.println("Ther stste is" + state);
		
        String colleges[] = {"R. V. College of Engineering, Bengaluru", "BMS College of Engineering, Bengaluru",
		"M. S. Ramaiah Institute of Technology, Bengaluru", "Bangalore Institute of Technology, Bengaluru",
		"Dayananda Sagar College of Engineering, Bengaluru", "BMS Institute of Technology and Management, Bengaluru",
		"Nitte Meenakshi Institute of Technology, Bengaluru", "RNS Institute of Technology, Bengaluru",
		"Dr. Ambedkar Institute of Technology, Bengaluru", "Sir M. Visvesvaraya Institute of Technology, Bengaluru",
		"New Horizon College of Engineering, Bengaluru", "CMR Institute of Technology, Bengaluru",
		"Acharya Institute of Technology, Bengaluru", "JSS Science and Technology University, Mysuru",
		"PES College of Engineering, Mandya", "Malnad College of Engineering, Hassan", "Sahyadri College of Engineering and Management, Mangaluru",
		"SDM College of Engineering and Technology, Dharwad", "KLE Technological University, Hubballi", 
		"University BDT College of Engineering, Davanagere"};
		
		System.out.println("VTU colleges that are in Karnataka are ");
			for (String college : colleges ) {
				System.out.println(college);
}
    }
}