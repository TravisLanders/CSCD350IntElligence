package Tile;

/*Tile Class created by Homero Gonzalez team Int-Elligence
 * Abstract class will handle tile actions based on type of tile
 * Tile Actions are passed through the TileAction interface and handled 
 * according to the concrete Tile Classes
 */

public abstract class A_Tile 
{
	private String type;
    private I_TileAction CurrentAction;
    private boolean visibility;
    
	public A_Tile(String input)
	{
		this.type = input;
		this.visibility = false;
	}
	
	public boolean getVisibility()
	{
		return this.visibility;
	}
	
	public void setVisibility(Boolean bol)
	{
		this.visibility = bol;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setTileAction(I_TileAction action)
	{
		this.CurrentAction = action;
	}
	
	public void setType(String input)
	{
		if(input.equals("Blank"))
		{
			setTileAction (new BlankAction());
		}
		else if(input.equals("Loot"))
		{
			setTileAction( new LootAction());
		}
	}
	
	public void HandleEvent()
	{
		this.CurrentAction.TakeAction();
	}

	
}
