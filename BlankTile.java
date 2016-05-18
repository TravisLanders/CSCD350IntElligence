package Final;

public class BlankTile extends A_Tile
{

	public BlankTile(String input) 
	{
		super(input);
		this.setTileAction(new BlankAction());
	}
	
	
}
