package homeworkOne;
// allows for me to use this declared in Item
public class Armor extends Item{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
private int defense;
//inheritting info from Item clas

public Armor(String itemName, int itemWeight, int defense){
	super(itemName, itemWeight);
	this.defense= defense;
	
}
public int getDefense(){
	return defense; 
}
}
