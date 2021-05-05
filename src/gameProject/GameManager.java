package gameProject;

public class GameManager implements GameService {
	MernisControllerManager mernisControllerManager;
	
	public GameManager(MernisControllerManager mernisControllerManager) {
		this.mernisControllerManager = mernisControllerManager;
	}

	public MernisControllerManager getMernisControllerManager() {
		return mernisControllerManager;
	}

	public void setMernisControllerManager(MernisControllerManager mernisControllerManager) {
		this.mernisControllerManager = mernisControllerManager;
	}

	@Override
	public void add(Game game, Gamer gamer) {
		 if (this.mernisControllerManager.validatePerson(gamer)) {
			 System.out.println("Game is added: " + game.getName());
		 }
		 else {
			 System.out.println("Couldn't add game: "+ game.getName());
		 }
		
	}

	@Override
	public void update(Game game) {
		System.out.println("The game is updated: "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("The game is deleted: "+game.getName());
		
	}
}
