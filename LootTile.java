package Final;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

//import A_Item loot;
/*BlankTile created by Homero Gonzalez team Int-Elligence
*LootTile handles all loot tiles in game and will display loot information 
*as well as trigger any in game events involving Loot
*
*This assumes the random item generator is outside the class
*if in class generation is determined then changes need to be made
*/
public class LootTile extends A_Tile
{
	//A_Item loot;
	private Weapon weapon;
	private A_Item item;
	private boolean visibility;
	private String type;
	
	public LootTile() throws FileNotFoundException 
	{
		this.type = "loot";
		this.visibility=false;
		this.weapon = new Weapon();
		//need to create a method that returns a random item
	}
	
	public  void lootAction(ArrayList<A_Item> inventory)
	{
		inventory.add(getWeapon());
		inventory.add(A_Item.getRandomItem());
		
		
	}
	
	
	
	
	

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public A_Item getItem() {
		return item;
	}

	public void setItem(A_Item item) {
		this.item = item;
	}
	
	public String getType()
	{
		return "loot";
	}






	public boolean isVisibility() {
		return visibility;
	}






	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}



	
  
	
	
	
}
