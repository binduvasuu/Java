class Team{
	String name;
	int matches;
	int won;
	int lost;
	int pts;
	String nrr;
	int last5[] = {1,1,0,0,1};
	
	public void  getTeamDetails(){
		System.out.println("Name    M       W     L     pts    nrr    last5");     
		System.out.print( name + "     "   + matches+ "       " + won + "     " + lost + "     " + pts+ "    " + nrr + "   " );
		
		for(int match:last5){
			System.out.print(match);
		}
		
	}
	  

}