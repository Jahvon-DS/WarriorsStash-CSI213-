package homeworkOne;

public class Food extends Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
private int nutrition; 
private int quantity; 

public int getNutrition(){
	return nutrition;
}
public int getQuantity(){
	return quantity; 
}
public void  setQuantity(int newQuantity){
	quantity= newQuantity;
}

public Food(String itemName, int itemWeight, int nutrition, int quantity){
	super(itemName, itemWeight); 
	this.nutrition= nutrition; 
	this.quantity= quantity; 
}
public int getWeight(){
	return super.getWeight()* getQuantity(); 
	
}


}
