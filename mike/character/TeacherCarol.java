package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherCarol extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherCarol() throws FileNotFoundException
	{
		super("Carol", new CostumeCop());
		
		this.totalHP = 150;
		this.currentHP = 150;
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "So what are your thoughts on open sourcing?"; 
		this.quotes[1] = "Can you believe the government is trying to control the internet?"; 
		this.quotes[2] = ""; 
		this.quotes[3] = ""; 
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Brian animates a huge bat and whacks you with it somehow, you lose 45 health");
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You never show up to his class and still turn in assignments, Brian doesn't like that, he is frustrated and misses a turn");
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