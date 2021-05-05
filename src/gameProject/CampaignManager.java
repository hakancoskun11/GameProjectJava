package gameProject;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println("Campaign added "+campaign.getName() + "% "+ campaign.getDiscountRate()+ "discount rate");
		double newPrice = game.getUnitPrice() - (game.getUnitPrice()* campaign.getDiscountRate() /100);
		System.out.println(game.getName() + "-" +game.getUnitPrice() + " => [%" + campaign.getDiscountRate() +"] "+ newPrice + "$");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign is removed: "+campaign.getName());
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Campaign is updated: "+campaign.getName());
		
	}
	
}
