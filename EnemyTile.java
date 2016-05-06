package Final;

public class EnemyTile extends A_Tile
{
	private Student stu;
	public EnemyTile(String input,Student stu) {
		super(input);
		this.setTileAction(new BattleAction());
		this.stu = stu;
	}

	
    
	
	
	
	
}
