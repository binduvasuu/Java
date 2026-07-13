class Agriculture{
    public static void main(String bindu[]) {
        String purpose = "Crop Cultivation";
        String farmingType = "Modern Farming";
        String powerSource = "Manual and Machine";
        String irrigation = "Drip, Sprinkler, Canal";
        String crops = "Rice, Wheat, Maize, Sugarcane, Cotton";
        String country = "India";
		
        System.out.println("About Agriculture");
        System.out.println("The Purpose of the agriculture" + purpose);
        System.out.println("The type of Farming is" + farmingType);
        System.out.println("The Source of the power is" + powerSource);
        System.out.println("The method of Irrigation is" + irrigation);
        System.out.println("The Major Crops are" + crops);
        System.out.println("The Country is" + country);
		
        String farmingTools[] = {"Plough", "Tractor", "Cultivator", "Harrow",
		"Seed Drill", "Rotavator", "Hoe", "Spade", "Shovel", "Sickle", "Rake",
		"Wheelbarrow", "Sprayer", "Water Pump", "Irrigation Pipe", "Thresher",
		"Combine Harvester", "Power Tiller", "Weeder", "Pruning Shears", "Axe",
		"Pickaxe", "Leveler", "Fertilizer Spreader", "Crop Duster"};
		
        System.out.println("The farming Tools are ");
        for (String farmingtool : farmingTools){
        System.out.println(farmingtool);
        }
    }
}