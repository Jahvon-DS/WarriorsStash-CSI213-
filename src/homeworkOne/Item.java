package homeworkOne;

public class Item {
	public static void main (String[]args){
	}
		private String itemName; 
		private int itemWeight; 
		 
	public Item (String itemName,int itemWeight){
			this.itemName = itemName;
			this.itemWeight= itemWeight; 
		}
		
		public String getName(){
			return itemName;
		}
		public int getWeight(){
			return itemWeight;
		}
		public void examine(){
			System.out.println("Name:"+ getName() + "Weight:"+ getWeight());
			//(	"Name:" + getName()"Weight:"+getWeight(); 
			
			}
		}
		
		




