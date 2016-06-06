package tile;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import item.*;

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
	private Potion item;
	private boolean visibility;
	private String type;
	
	public LootTile() throws FileNotFoundException 
	{
		this.type = "loot";
		this.visibility=false;
		this.weapon = new Weapon();
		this.item = getRandomPotion();
		
		//need to create a method that returns a random item
	}
	
	public  Potion getRandomPotion()
	{
		Random rand = new Random();
		int num = rand.nextInt(2);
		
		
	    if(num ==0)
		{
			this.item = new PotionBeer();
		}
		
		else if(num ==1)
		{
			this.item = new PotionMountainDew();
		}
		
		else if(num ==3)
		{
			this.item =new PotionTopRamen();
		}
		return new PotionMountainDew();
		
	}
	
	public  void lootAction(Backpack backpack) throws FileNotFoundException
	{
		backpack.addWeapon(new Weapon());
		backpack.addPotion(randomPotion());	
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Potion getItem() {
		return item;
	}

	public void setItem(Potion item) {
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