package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherChris extends Teacher
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
	
	public TeacherChris() throws FileNotFoundException
	{
		super("Chris",new CostumeCoffeeCup(),null,new Weapon());
		
		this.totalHP = 100;
		this.currentHP = 100;
		this.defence = .05;
		this.weapon = new Weapon();
		this.attack = 10;
		this.quotes = new String[4];
		this.quotes[0] = "Lets Watch a Photo Shop cat video";
		this.quotes[1] = "Reverand pimp daddy peters really Stu....";
		this.quotes[2] = "Just Remember super class reference to a super class object";
		this.quotes[3] = "";
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Chris is just a great guy, he heals 20 health for being so cool");
		this.setCurrentHP(this.getCurrentHP()+20);
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("Chris is such a great guy, your special move against him is nothing because he is so awesome");
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
