package gameProject;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager(new MernisControllerManager());
		CampaignManager campaignManager = new CampaignManager();
		Gamer gamer1= new Gamer(0,"Hakan","Coþkun",1999,"28346412370");
		
		Game game1= new Game(1,"Call of Duty: Modern Warfare", "War Game",69,"FPS");
		Game game2= new Game(2,"GTA: San Andreas: Grand Theft Auto", "War Game",59,"FPS");
		
		
		
		Campaign campaign1 = new Campaign(0,"Game Campaign","Big Spring Sale!",10);
		
		campaignManager.add(campaign1, game1);
		gameManager.add(game1, gamer1);
		gameManager.add(game2, gamer1);
		
		
		
		
		
	}

}
