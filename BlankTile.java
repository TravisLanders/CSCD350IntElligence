package Final;

public class BlankTile extends A_Tile
{

	
    private boolean visibility;
	
	public BlankTile() 
	{
		
		this.visibility =false;
	}
	
	public void blankAction()
	{
		
		this.visibility = true;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public String getType()
	{
		return "blank";
	}
	
	
}
