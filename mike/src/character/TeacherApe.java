package character;

import java.io.FileNotFoundException;
import java.util.Random;

import costume.*;

public class TeacherApe extends Teacher
{
	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherApe() throws FileNotFoundException
	{
		super("APE", new CostumeFreshman());
		this.name = "APE";
		this.costume = new CostumeFreshman();
		
		this.setTotalHP(200);
		this.setCurrentHP(200);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 25;
		this.quotes = new String[4];
		this.quotes[0] = "Towers of Hanoi... GO!"; 
		this.quotes[1] = "I'm gonna data abstract your heart from your chest!"; 
		this.quotes[2] = "I'm going to make a LinkedList out of your bones!"; 
		this.quotes[3] = "I'm going to take your body as input and output it to a grave";
	}
	
public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		
		System.out.println("Sorry guys.. Stu wrote the APE this quarter, enjoy constantly re-reading poorly written instructions, lose a turn");
		return true;
		
		
			
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You worked hard and did all the pratice APES online, and luckily you get a repeat problem, enjoy an extra turn.");
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