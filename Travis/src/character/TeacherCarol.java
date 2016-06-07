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
		this.name = "Carol";
		this.costume = new CostumeCop();
		
		this.setTotalHP(500);
		this.setCurrentHP(500);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.setAttack(50);
		this.quotes = new String[4];
		this.quotes[0] = "So what are your thoughts on open sourcing?"; 
		this.quotes[1] = "Can you believe the government is trying to control the internet?"; 
		this.quotes[2] = ""; 
		this.quotes[3] = ""; 
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Carol disiabled your Eagle card and runs though a locked door lose a turn!");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You are close to the end of long journey through the CEB, and you unleash a massive attack against Carol in hope of finally being done");
		this.setCurrentHP(this.getCurrentHP()-150);
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