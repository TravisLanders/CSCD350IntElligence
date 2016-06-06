package character;

import java.io.FileNotFoundException;
import java.util.Random;

import costume.*;

public class TeacherStu extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherStu() throws FileNotFoundException
	{
		super("Stu", new CostumePenguin());
		this.name = "Stu";
		this.costume = new CostumePenguin();
		
		this.totalHP = 150;
		this.currentHP = 150;
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "Im thinking of dropping the shell assignment monday and having it due monday night what do you think?";
		this.quotes[1] = "Just rememeber don't leak memory or else I'll take off points off you and maybe the next guy on roster";
		this.quotes[2] = "Dont you just love listening to this dead sexy voice?";
		this.quotes[3] = "Isn't this stuff just boring?";
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		Random rand = new Random(150);
		int damage = rand.nextInt();
		System.out.println("Stu uses Valgrind to check for memory leaks and finds " + damage + ", you have been dealt this much damage");
		s1.setCurrentHP(s1.getCurrentHP()-damage);
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You call up the University of Idaho and let them know that Stu has been slacking while persuing his PHD, they give him an impromptu assignment, he will miss his next turn");
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