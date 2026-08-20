class IplRunner{

	public static void main(String[] bindu){
		
		Ipl ipl = new Ipl();
		Table table = new Table();
		Season season = new Season();
		Team team = new Team();
		
		team.name = "RCB";
		team.matches = 8;
		team.won = 6;
		team.lost = 2;
		team.pts = 12;
		team.nrr = "+1.24";
		
		ipl.table = table;
		table.season = season;
		season.team = team;
		
		
		ipl.getIplDetails();
		
		
		
	}
	
	
	

}