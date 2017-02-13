package homeworkOne;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a weapon 
Weapon x = new Weapon("Gun",30,2);
x.examine();
//telling you damage taken 
System.out.println("Damage-->"+x.getDamage());

//making armor
Armor y = new Armor("Armor1", 30,5);
y.examine();
System.out.println("Defense-->"+y.getDefense());
//out put 

//telling you amount of health
Food f= new Food("Bread",100,50,2);
f.examine();
System.out.println("Tummy Power!:"+ f.getNutrition());

System.out.println("Quantity:"+f.getQuantity());

System.out.println("Weight:"+f.getWeight());
f.setQuantity(50);

System.out.println ("Quantity:"+f.getQuantity());

System.out.println("Weight:"+f.getWeight());
	}

}
