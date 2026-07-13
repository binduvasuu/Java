class Calculator{  
	public static void main (String [] cal) {
	
		System.out.println("Main started");
	 
		add (56,89);
		
		add (34,91);
		
		add (49,73);
		
		System.out.println(" ");
		
		multiply (2, 3);
	 
		multiply (6 ,91);
		
		multiply (3, 43);
		
		System.out.println(" ");
		
		subtract (8,2);
		
		subtract (65, 21);
		
		subtract (94, 34);
		
		System.out.println(" ");
		
		mod (5, 4);
		
		mod (21,3);
		
		mod (80,6);
		
		System.out.println(" ");
		
		divide (40,4);
		
		divide (100,25);
		
		divide (50,2);
		
		System.out.println(" ");
		
		expo (2,2);
		
		expo (6, 4);
		
		expo(5,2);
	 
		System.out.println("Main ended");
	 
	 }
	 
	 
	public static void add (int first, int second) {
		int total = first + second ;
		System.out.println(total);
	}
	
	
	public static void multiply (int first , int second) {
		int total = first * second;
		System.out.println(total);
	}


	public static void subtract (int first, int second) {
		int total = first - second;
		System.out.println(total);	
	}
	
	public static void mod (int first, int second ) {
		int total = first % second ;
		System.out.println(total);
	}
	
	public static void divide (int first, int second) {
		int total = first / second ;
		System.out.println(total);
	}
	
	public static void expo (int first, int second) {
		int total = first ^ second ;
		System.out.println(total);
	}



}