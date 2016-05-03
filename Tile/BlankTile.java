package Tile;
/*BlankTile created by Homero Gonzalez team Int-Elligence
 *BlankTile handles on normal tiles in game and does not have an action
 */
public class BlankTile extends A_Tile
{

	public BlankTile(String input) 
	{
		super(input);
		this.setTileAction(new BlankAction());
	}
	
	
}
