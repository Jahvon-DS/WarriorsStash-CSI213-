package homeworkOne;


//allows for use of things declared in Item 
public class Weapon extends Item{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
private int damage;
public Weapon(String itemName, int itemWeight, int damage){
    super(itemName, itemWeight); 
    this.damage = damage; 

}
public int getDamage(){
    return damage;
}
}
