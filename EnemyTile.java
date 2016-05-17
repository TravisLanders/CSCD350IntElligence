package Final;

public class EnemyTile extends A_Tile
{
	private Student stu;
	public EnemyTile(String input,Student stu) {
		super(input);
		this.setTileAction(new BattleAction());
		this.stu = stu;
	}
	
	public void initiateBattle() 
	{
		// call student battle method with this student and our student
		
	}

	
    
	
	
	
	
}
