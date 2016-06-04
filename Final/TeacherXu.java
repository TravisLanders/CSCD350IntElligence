package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherXu extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
	private String[] quotes;
	
	public TeacherXu() throws FileNotFoundException
	{
		super("Xu",new CostumeOptometrist(),null,new Weapon());
		
		this.totalHP = 350;
		this.currentHP = 350;
		this.defence = .15;
		this.weapon = new Weapon();
		this.attack = 30;
		this.quotes = new String[4];
		this.quotes[0] = "This is easy right?"; 
		this.quotes[1] = "Pay attention to me you dont need to take notes the lecture slides are on canvas"; 
		this.quotes[2] = "For every minute of class you waste or dont come to class its 50 cents"; 
		this.quotes[3] = ""; 
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Xu lectures you over a complex topic and ends the conversation saying how easy it is, you feel demoralized and miss a turn");
		return true;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You issue an onslaught of English idioms and metaphors, he misses a turn doing some translating");
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
