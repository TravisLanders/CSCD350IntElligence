package Final;

public class BossTile extends A_Tile
{
	private Teacher teach;
	public BossTile(String input,Teacher teach) 
	{
		super(input);
		this.setTileAction(new BattleAction());
		this.teach = teach;
		
	}
	
	
	   
		
		
		
}
