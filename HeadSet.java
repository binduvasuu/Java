class HeadSet {
	
	
	static boolean isConnected;
	static int currentVolume;
	static int maxVolume = 10;
	
	
	
	public static void onOrOff() {
		
		if (isConnected	== false) {
			 isConnected = true;
			 
			 System.out.println("Headphone is connected");
			 } 
			 else if (isConnected	== true) {
				 
			 isConnected = false;
			 System.out.println("Headphoneis disconnected");
			 }
			 
			 return; 
		

	}
	
	public static void increaseVolume() {
		if (isConnected == true ) {
			if (currentVolume < maxVolume ){
				
			currentVolume = currentVolume + 1;
			System.out.println("The currentVolume is " + currentVolume);
			} else {
				System.out.println("Max volume reached");
			}
		}else {
			System.out.println("Turn on the HeadSet");
		
	}
		}
		public static void decreaseVolume() {
		if (isConnected == true) {
			if (currentVolume > 0) {
				
			currentVolume = currentVolume - 1;
			System.out.println("The current volume is " + currentVolume);
		} else {
			System.out.println("Minimum value reached");
			}
		}
		else {
			System.out.println("Turn on the HeadSet");
		}
		
		
		
}


		
		
	
		
		
	
	

	 

}