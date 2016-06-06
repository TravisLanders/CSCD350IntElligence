package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherKosuke extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherKosuke() throws FileNotFoundException
	{
		super("Kosuke", new CostumeConstructionWorker());
		this.name = "Kosuke";
		this.costume = new CostumeConstructionWorker();
		
		this.totalHP = 150;
		this.currentHP = 150;
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "NOOO People of the world... what was I talking about?";
		this.quotes[1] = "I'm making a water powered computer but I have to keep moving the buckets of water by myself";
		this.quotes[2] = "We need to invest money on important inventions like the Japanese Toilet not the atomic missile";
		this.quotes[3] = "You know where IBM made its money during World war II?";
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Kosuke won't stop talking about his fancy Japanese toilet, you lose a turn trying to figure out why this is important");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("No move against yet, just lose a turn");
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