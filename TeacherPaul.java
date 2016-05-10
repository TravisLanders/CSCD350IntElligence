package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherPaul extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
	
	public TeacherPaul() throws FileNotFoundException
	{
		super("Paul",new CostumeRobot(),new Weapon());
		
		this.totalHP = 300;
		this.currentHP = 300;
		this.defence = .12;
		this.weapon = new Weapon();
		this.attack = 20;
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Paul talks way over your head because he's a genius and while you're trying to comprehend he sneaks the robot thing in his office up behind for 75 damage");
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You tamper with Paul's fishing supplies, he misses a turn fixing it");
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
