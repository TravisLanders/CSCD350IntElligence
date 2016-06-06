package tile;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BossTile extends A_Tile
{
	private Teacher teach;
	private boolean visibility;
	private String type;
	public BossTile(String input,Teacher teach) 
	{
		
		this.type = "teacher";
		this.teach = teach;
		this.visibility = false;
		
	}
	public void initiateBattle(ArrayList<A_Item> inventory) throws FileNotFoundException
	{
		
		//call mikes boss battle class with student, teacher and party
		this.setVisibility(true);
		inventory.add(new Weapon());
		inventory.add(A_Item.getRandomItem());
		
	}
	public boolean isVisibility() {
		return visibility;
	}
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public String getType()
	{
		return "teacher";
	}
	public void setType(String type) {
		this.type = type;
	}
		
}