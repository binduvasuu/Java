class Headphone{
	
	public static double getPrice(){
		return 1099.00;
	}
	
	public static String getBrand(){
		return "Boat";
	}
	
	public static String getColor(){
		return "Blue";
	}
	
	public static String getNoiseControl(){
		return "Active Noise Cancellation";
	}
	
	public static String getModelName(){
		return "Rockerz";
	}
	
	public static String getEnclosureMaterialType(){
		return "Plastic";
	}
	
	public static String getAudioDriverType(){
		return "Dynamic Driver";
	}
	
	public static void main(String ear[]){
		
		System.out.println("Features of the Headphone:");
		
		double price = getPrice();
		System.out.println("Price of the headphone is " + price);
		
		String brand = getBrand();
		System.out.println("Brand of the headphone is " + brand);
		
		String color = getColor();
		System.out.println("Color of the headphone is " + color);
		
		String noiseControll = getNoiseControl();
		System.out.println("The headphone gives " + noiseControll);
		
		String modelName = getModelName();
		System.out.println("The model name is " + modelName);
		
		String materialType = getEnclosureMaterialType();
		System.out.println("Enclosure material type is " + materialType);
		
		String audioDriverType = getAudioDriverType();
		System.out.println("The audio driver type is " + audioDriverType);
	}
}