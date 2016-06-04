package Final;

import java.io.FileNotFoundException;
import java.util.Random;


public class TeacherTom extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
   private String[] quotes = {"Why is there a public variable in your Student Class!","Well looks like team IntElligence whens the steak!","For todays lecture we will be listening to the musical stylings of Mac Sabbath","I dont always make a home brew but when I do I make Hopolopagus IPAs staty thirsy my class"};

	
	public TeacherTom() throws FileNotFoundException
	{
		super("Tom",new CostumeOptometrist(),new Weapon());
		
		this.totalHP = 350;
		this.currentHP = 350;
		this.defence = .15;
		this.weapon = new Weapon();
		this.attack = 30;
  //    this.quotes = {"Why is there a public variable in your Student Class!","Well looks like team IntElligence whens the steak!","For todays lecture we will be listening to the musical stylings of Mac Sabbath","I dont always make a home brew but when I do I make Hopolopagus IPAs staty thirsy my class"};
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Tom cracks another unwanted nerdy pun, you feel bad and miss a turn giving him pity laughter");
		return true;
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
	
	
	public Weapon getWeapon() {return this.getWeapon();}
	public void setWeapon(Weapon weapon) 
	{
		this.weapon = weapon;
		
	}

	
	public SpecialAttack getSA(){return this.sa;}
	public void setSA(SpecialAttack sa) 
	{
		this.sa = sa;
		
	}

	
	public A_Costume getCostume() {return this.costume;}
	public void setCostume(A_Costume costume) 
	{
		this.costume = costume;
	}

	
	

	

	

	@Override
	public double getDefence() {
		return this.defence;
	}

	@Override
	public void setDefence(double defence) {
		this.defence=defence;
		
	}

	@Override
	public double getCurrentHP() {
		return this.currentHP;
	}

	@Override
	public void setCurrentHP(double currentHP) {
		this.currentHP= currentHP;
		
	}

	@Override
	public double getTotalHP() {
		return this.totalHP;
	}

	@Override
	public void setTotalHP(double totalHP) {
		this.totalHP= totalHP;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	

}
