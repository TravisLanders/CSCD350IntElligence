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
	
	public TeacherTom() throws FileNotFoundException
	{
		super("Tom",new CostumeOptometrist(),new Weapon());
		
		this.totalHP = 350;
		this.currentHP = 3500;
		this.defence = .15;
		this.weapon = new Weapon();
		this.attack = 30;
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
