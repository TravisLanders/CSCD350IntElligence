package Final;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EnemyTile extends A_Tile
{
	private Student stu;
	private boolean visibility;
	private String type;
	public EnemyTile(Student stu) 
	{
		
		this.setType("student");
		this.stu = stu;
		this.visibility = false;
	}
	
	public void initiateBattle(Backpack bp) throws FileNotFoundException 
	{
		// call student battle method with this student and our student
		this.visibility = true;
		bp.addWeapon(new Weapon());
		bp.addPotion(Potion.getRandomItem());
		
	}

	public boolean isVisibility() {
		return this.visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public String getType()
	{
		return "student";
	}

	public void setType(String type) {
		this.type = type;
	}
	public Student getStudent()
	{
		return this.stu;
	}

	
    
	
	
	
	
}
