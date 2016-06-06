package character;

import costume.*;

public class TeacherApe extends Teacher
{
	protected int counter = 0;
	public TeacherApe()
	{
		super("APE", new CostumeFreshman());
		this.quotes[0] = ""; 
		this.quotes[1] = ""; 
		this.quotes[2] = ""; 
		this.quotes[3] = ""; 
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("You get nervous about having a finite number of chances to fight the ape. Lose a turn!");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("This quarter's APE is easier than usual. The APE loses a turn!");
		return true;
	}
	
	public int getCount()
	{
		return this.counter;
	}
	
	public void beginApeBattle()
	{
		counter++;
	}
}