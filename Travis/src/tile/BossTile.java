package tile;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import item.*;
import character.*;

public class BossTile extends A_Tile
{
	private Teacher teach;
	private boolean visibility;
	private String type;
	private Potion item;
	
	
	public BossTile(String input,Teacher teach) 
	{
		
		this.type = "teacher";
		this.teach = teach;
		this.visibility = false;
		
	}
	public void initiateBattle(Backpack backpack) throws FileNotFoundException
	{
		
		//call mikes boss battle class with student, teacher and party
		this.setVisibility(true);
		backpack.addWeapon(new Weapon());
		backpack.addPotion(randomPotion());
		
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
	
	public Teacher getTeacher(){return this.teach;}
		
}