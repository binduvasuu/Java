class SBIBranches{
    public static void main(String sbi[]) {
        String bankName = "State Bank of India";
        String established = "1 July 1955";
        String headquarters = "Mumbai, Maharashtra";
        String chairman = "C. S. Setty";
        String type = "Public Sector Bank";
        String services = "Savings Account, Current Account, Loans, Credit Cards, Internet Banking";
        String state = "Karnataka";
		
        System.out.println("About State Bank of India");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Established: " + established);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Chairman: " + chairman);
        System.out.println("Type: " + type);
        System.out.println("Services: " + services);
        System.out.println("State: " + state);

		String sbiBranches[] = {"SBI Main Branch, Ashok Nagar", "SBI Koramangala", "SBI Jayanagar II Block", 
		"SBI Indiranagar (80 Ft Road)", "SBI Ulsoor", "SBI Banaswadi", "SBI Sahakar Nagar", "SBI Sarakki (JP Nagar)",
		"SBI RBI Layout (JP Nagar)", "SBI Wilson Garden", "SBI Bengaluru City Branch", "SBI IISc Branch", "SBI Richmond Road",
		"SBI MG Road", "SBI Whitefield", "SBI Electronic City", "SBI Yelahanka", "SBI Malleshwaram", "SBI Rajajinagar", "SBI Basavanagudi"};
		
        System.out.println("SBI Branches in Bengaluru:");
        for (String branch : sbiBranches) {
        System.out.println(branch);
        }
    }
}