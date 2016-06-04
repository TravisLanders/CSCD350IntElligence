package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherBrian extends Teacher
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
	
	public TeacherBrian() throws FileNotFoundException
	{
		super("Brian",new CostumeSnake(),null,new Weapon());
		
		this.totalHP = 150;
		this.currentHP = 150;
		this.defence = .10;
		this.weapon = new Weapon();
		this.attack = 20;
		this.quotes = new String[4];
		this.quotes[0] = "Yes we use 0 based indexing in CS -_- \"shakes head\"";
		this.quotes[1] = "Why do I have to deal with the nubes that should be Stu's job";
		this.quotes[2] = "";
		this.quotes[3] = "";
	}
	
	public boolean performSpecial(Student s1)
	{
		System.out.println("Brian animates a huge bat and whacks you with it somehow, you lose 45 health");
		return false;
	}
	
	public boolean specialAgainst()
	{
		System.out.println("You never show up to his class and still turn in assignments, Brian doesn't like that, he is frustrated and misses a turn");
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
