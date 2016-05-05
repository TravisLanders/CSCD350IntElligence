package Final;

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
	
	public LootTile(String input) {
		super(input);
		this.setTileAction(new LootAction());
	}
  
	
	
	
}
