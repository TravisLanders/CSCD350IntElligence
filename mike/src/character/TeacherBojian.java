package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherBojian extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherBojian() throws FileNotFoundException
	{
		super("Bojian", new CostumePie());
		this.name = "Bojian";
		this.costume = new CostumePie();
		
		this.setTotalHP(200);
		this.setCurrentHP(200);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.setAttack(25);
		this.quotes = new String[4];
		this.quotes[0] = "This is easy right?"; 
		this.quotes[1] = "Pay attention to me. You don't need to take notes- the lecture slides are on canvas"; 
		this.quotes[2] = "For every minute of class you waste or dont come to class its 50 cents"; 
		this.quotes[3] = ""; 
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Bojian lectures you over a complex topic and ends the conversation saying how easy it is, you feel demoralized and miss a turn");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You issue an onslaught of English idioms and metaphors, he misses a turn doing some translating");
		return true;
	}
	
	
	public double getAttack(){return this.attack;}
	public void setAttack(double attack)
	{
		this.attack = attack;
	}
	
	
//	public Weapon getWeapon() {return this.getWeapon();}
//	public void setWeapon(Weapon weapon) 
//	{
//		this.weapon = weapon;
//		
//	}
//	
//	public SpecialAttack getSA(){return this.sa;}
//	public void setSA(SpecialAttack sa) 
//	{
//		this.sa = sa;
//		
//	}

	public A_Costume getCostume() {return this.costume;}
	public void setCostume(A_Costume costume) 
	{
		this.costume = costume;
	}
}