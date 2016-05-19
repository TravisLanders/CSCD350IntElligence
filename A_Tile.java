package Final;

/*Tile Class created by Homero Gonzalez team Int-Elligence
 * Abstract class will handle tile actions based on type of tile
 * Tile Actions are passed through the TileAction interface and handled 
 * according to the concrete Tile Classes
 */

public abstract class A_Tile 
{
	private String type;
    
    private boolean visibility;
    
    
	public A_Tile()
	{
		
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
	
	
	
	

	
}
