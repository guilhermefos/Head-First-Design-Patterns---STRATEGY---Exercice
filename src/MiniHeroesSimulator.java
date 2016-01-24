
public class MiniHeroesSimulator {
	
	public static void main(String[] args){
		
		Queen queen = new Queen();
		queen.fight();
		
		King king = new King();
		king.fight();
		
		Troll troll = new Troll();
		troll.fight();
		
		Knight knight = new Knight();
		knight.fight();
		
		queen.setWeapon(new SwordBehavior());
		queen.fight();
		
	}

}
