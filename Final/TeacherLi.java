package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherLi extends Teacher
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
	
	public TeacherLi() throws FileNotFoundException
	{
		super("Li",new CostumeMiner(),null,new Weapon());
		
		this.totalHP = 450;
		this.currentHP = 450;
		this.defence = .15;
		this.weapon = new Weapon();
		this.attack = 80;
		this.quotes = new String[4];
		this.quotes[0] = "";
		this.quotes[1] = "";
		this.quotes[2] = "";
		this.quotes[3] = "";
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Dan Li uses he databases to fudge with your stats! They have been altered");
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("Nothing yet");
		return false;
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
