package character;

import java.io.FileNotFoundException;

import costume.*;

public class TeacherTony extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	
	public TeacherTony() throws FileNotFoundException
	{
		super("Tony", new CostumeWizard());
		this.name = "Tony";
		this.costume = new CostumeWizard();
		
		this.setTotalHP(250);
		this.setCurrentHP(250);
		this.defence = .10;
		//this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "AGREE?!"; 
		this.quotes[1] = "AGREE?"; 
		this.quotes[2] = "AGREEEEEE?!"; 
		this.quotes[3] = "AGREE?"; 
	}
	
	
	public String getName(){return this.name;}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Tony does something that we havent decided yet, lose a turn just cuz");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You ask questions about subjects covered in earlier lectures, Tony loses a turn due to sheer rage");
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