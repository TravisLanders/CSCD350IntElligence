package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherTom extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherTom() throws FileNotFoundException
	{
		super("Tom", new CostumeOptometrist());
		this.name = "Tom";
		this.costume = new CostumeOptometrist();
		
		this.setTotalHP(400);
		this.setCurrentHP(400);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.setAttack(40);
		this.quotes = new String[4];
        this.quotes[0] = "Why is there a public variable in your Student Class!";
        this.quotes[1] = "Well looks like team IntElligence wins the steak!";
        this.quotes[2] = "For todays lecture we will be listening to the musical stylings of Mac Sabbath";
        this.quotes[3] = "I dont always make a home brew but when I do I make Hopolopagus IPAs. Stay thirsty my class";
	}
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Tom cracks another unwanted nerdy pun, you feel bad and miss a turn giving him pity laughter");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You declare all your member variable public, Tom finds out and misses a turn due to a combination of frustration and dissapointment");
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