package Tile;
/*STileAction Interface created by Homero Gonzalez team Int-Elligence
 * Abstract class will handle tile actions based on type of tile
 * Tile Actions are passed through the TileAction interface and handled 
 * according to the concrete Tile Classes
 */
public interface I_TileAction 
{
		// method may need to have some way of allowing items and characters to pass 
		// through for battles and loot pick ups
	public void TakeAction();
	
}
