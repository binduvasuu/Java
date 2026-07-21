class HospitalRunner {

	public static void main (String [] cure) {

	boolean isStarted;
	
	isStarted = Hospital.startHospital("Apollo Hospital", null, "Dr. Ramesh", "Asha", 25, "Fever", 9856423654l, 101);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Fortis Hospital", "Bengaluru", "Dr Kumar", "Rahul", 30, "Cold", 9236514451l, 102);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	
	isStarted = Hospital.startHospital("Manipal ", "Bengaluru", "Dr Meena", "Priya", 28, "Asthma", 6565988746l, 103);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Narayana Health", "Bengaluru", "Dr Raj", "Anil", 40, "Diabetes", 9856485312l, 104);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Aster CMI Hospital", "Bengaluru", "Dr Sneha", "Deepa", 35, "Migraine", 9865442145l, 105);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Victoria Hospital", "Bengaluru", "Dr Arun", "Kiran", 31, "Fracture", 9887546221l, 106);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Bowring Hospital", null, "Dr Ravi", "Pooja", 22, "Typhoid", 9856444124l, 107);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("St John's Medical College Hospital", "Bengaluru", "Dr Anita", "Ajay", 45, "BP",9855455126l, 108);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("MS Ramaiah Memorial Hospital", "Bengaluru", "Dr Mohan", "Neha", 33, "Allergy",7548845164l, 109);
	System.out.println("Hospital started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	
	isStarted = Hospital.startHospital(null, "Hyderabad", "Dr Rekha", "Vijay", 39, "Viral Fever", 7844454690l, 110);
	System.out.println("Health started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Yashoda Hospital", "Hyderabad", "Dr Vinay", "Arjun", 37, "Dengue", 8745110236l, 111);
	System.out.println("Health started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Care Hospitals", "Hyderabad", "Dr Shilpa", null, 26, "Cough", 9877742651l,112);
	System.out.println("Health started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Medicover Hospital", "Hyderabad", "Dr Geetha", "Rohit", 43, "Back pain", 7441201365l, 114);
	System.out.println("Health started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Sunshine Hospital", "Hyderabad", "Dr Ashok", "Keerthi", 32, "Kidney stone", 8952103647l, 115);
	System.out.println("Health started" + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	isStarted = Hospital.startHospital("Global Hospital", "Chennai", "Dr. Ashok", "Keerthi", 32, "Kidney Stone", 9876543224L, 115);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");

	isStarted = Hospital.startHospital("MIOT International", "Chennai", null, "Sanjay", 48, "Heart Disease", 9876543225L, 116);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");

    isStarted = Hospital.startHospital("SRM Medical College Hospital", "Chennai", "Dr. Latha", "Swathi", 21, "Food Poisoning", 9876543226L, 117);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");

    isStarted = Hospital.startHospital("Kauvery Hospital", "Chennai", "Dr. Prakash", "Ramesh", 36, "Ulcer", 9876543227L, 118);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");

    isStarted = Hospital.startHospital("SIMS Hospital", "Chennai", "Dr. Karthik", "Ananya", 27, "Migraine", 9876543228L, 119);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");

    isStarted = Hospital.startHospital("CMC Hospital", "Vellore", "Dr. Joseph", "David", 41, "Cancer", 9876543229L, 120);
    System.out.println("Hospital Started: " + isStarted);
	if (isStarted == true)
    Hospital.getHospital();
	else
    System.out.println("No Hospital Details Found");
	System.out.println(" ");
	
	
	

		isStarted = Hospital.startHospital("AIIMS Delhi", null, "Dr. Vivek", "Amit", 30, "Fever", 9876543230L, 121);
		System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Safdarjung Hospital", "New Delhi", "Dr. Nitin", "Rekha", 38, "Cold", 9876543231L, 122);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		

        isStarted = Hospital.startHospital("Max Super Speciality Hospital", "New Delhi", "Dr. Gupta", "Manoj", 46, "Diabetes", 9876543232L, 123);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("BLK-Max Hospital", "New Delhi", "Dr. Sharma", "Kavya", 24, null, 9876543233L, 124);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Sir Ganga Ram Hospital", "New Delhi", "Dr. Singh", "Ritu", 34, "BP", 9876543234L, 125);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Medanta Hospital", "Gurugram", "Dr. Kapoor", "Sahil", 42, "Heart Problem", 9876543235L, 126);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Artemis Hospital", "Gurugram", "Dr. Batra", "Komal", 31, "Fracture", 9876543236L, 127);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Paras Hospital", "Gurugram", "Dr. Yadav", "Tarun", 29, "Allergy", 9876543237L, 128);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Amrita Hospital", "Faridabad", "Dr. Thomas", "Sneha", 23, "Fever", 9876543238L, 129);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		

        isStarted = Hospital.startHospital("Ruby Hall Clinic", null, "Dr. Patil", "Om", 35, "Malaria", 9876543239L, 130);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Jehangir Hospital", "Pune", "Dr. Deshmukh", "Tejas", 28, "Typhoid", 9876543240L, 131);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Deenanath Mangeshkar Hospital", "Pune", "Dr. Kulkarni", "Pallavi", 40, "Arthritis", 9876543241L, 132);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Aditya Birla Memorial Hospital", "Pune", "Dr. Joshi", "Nitin", 37, "Kidney Stone", 9876543242L, 133);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Kokilaben Dhirubhai Ambani Hospital", "Mumbai", "Dr. Shah",null, 44, "Cancer", 9876543243L, 134);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Lilavati Hospital", "Mumbai", "Dr. Fernandes", "Reshma", 32, "Asthma", 9876543244L, 135);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		

        isStarted = Hospital.startHospital("Jaslok Hospital", "Mumbai", "Dr. Mehta", "Rakesh", 50, "Heart Disease", 9876543245L, 136);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Hinduja Hospital", "Mumbai", "Dr. Rao", "Lakshmi", 27, "Migraine", 9876543246L, 137);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Tata Memorial Hospital", "Mumbai", "Dr. Iyer", "Sunil", 56, "Cancer", 9876543247L, 138);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Wockhardt Hospital", "Mumbai", "Dr. Naik", "Bhavana", 30, "Fever", 9876543248L, 139);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("SevenHills Hospital", "Mumbai", "Dr. Khan", "Farhan", 38, "Dengue", 9876543249L, 140);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		
		
		

        isStarted = Hospital.startHospital("NIMS Hospital", "Jaipur", "Dr. Verma", "Anu", 33, "Cold", 9876543250L, 141);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("SMS Hospital", "Jaipur", "Dr. Choudhary", "Mahesh", 41, "BP", 9876543251L, 142);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("SGPGIMS", "Lucknow", "Dr. Mishra", "Rani", 36, "Diabetes", 9876543252L, 143);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital(null, "Lucknow", "Dr. Srivastava", "Ankit", 24, "Asthma", 9876543253L, 144);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Postgraduate Institute of Medical Education and Research", null, "Dr. Gill", "Rohini", 29, "Allergy", 9876543254L, 145);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		

        isStarted = Hospital.startHospital("Christian Medical College", "Ludhiana", "Dr. Sandhu", "Harpreet", 47, "Fracture", 9876543255L, 146);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		

        isStarted = Hospital.startHospital("SCB Medical College Hospital", "Cuttack", "Dr. Das", "Suman", 34, "Typhoid", 9876543256L, 147);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Government Medical College Hospital", "Kozhikode", null, "Athira", 28, "Viral Fever", 9876543257L, 148);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Kasturba Hospital", "Manipal", "Dr. Pai", "Girish", 39, "Pneumonia", 9876543258L, 149);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");

        isStarted = Hospital.startHospital("Sri Ramachandra Medical Centre", "Chennai", null, "Varsha", 26, "Food Poisoning", 9876543259L, 150);
        System.out.println("Hospital Started: " + isStarted);
		if (isStarted == true)
		Hospital.getHospital();
		else
		System.out.println("No Hospital Details Found");
		System.out.println(" ");
		
		
		

        



}


}