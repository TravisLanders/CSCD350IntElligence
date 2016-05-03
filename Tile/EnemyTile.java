package Tile;
//Import A_Character;



/*BlankTile created by Homero Gonzalez team Int-Elligence
 *EnemyTile handles all enemy tiles in game and will display enemy information 
 *as well as trigger any in game events involving Battles and enemies
 */
public class EnemyTile extends A_Tile
{
	//private A_Character enemy;
	public EnemyTile(String input) {
		super(input);
		this.setTileAction(new BattleAction());
	}

	
    
	
	
	
	
}


