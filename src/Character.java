
public class Character {
	
	WeaponBehavior weapon;
	
	public void fight(){ 
		weapon.useWeapon();
	};
	
	public void setWeapon(WeaponBehavior newWeapon){
		this.weapon = newWeapon;
	}

}
