package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherPaul extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherPaul() throws FileNotFoundException
	{
		super("Paul", new CostumeRobot());
		this.name = "Paul";
		this.costume = new CostumeRobot();
		
		this.setTotalHP(300);
		this.setCurrentHP(300);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "If You know a little about quantam mechanics this shouldnt be to difficult";
		this.quotes[1] = "";
		this.quotes[2] = "";
		this.quotes[3] = "";
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Paul talks way over your head because he's a genius and while you're trying to comprehend he sneaks the robot thing in his office up behind for 75 damage");
		s1.setCurrentHP(s1.getCurrentHP()-75);
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You tamper with Paul's fishing supplies, he misses a turn fixing it");
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