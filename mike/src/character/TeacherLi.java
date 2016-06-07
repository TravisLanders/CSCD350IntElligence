package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherLi extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherLi() throws FileNotFoundException
	{
		super("Dan Li", new CostumeMiner());
		this.name = "Dan Li";
		this.costume = new CostumeMiner();
		
		this.totalHP = 150;
		this.currentHP = 150;
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "";
		this.quotes[1] = "";
		this.quotes[2] = "";
		this.quotes[3] = "";
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Dan Li uses he databases to fudge with your stats! They have been altered");
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("Nothing yet");
		return false;
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