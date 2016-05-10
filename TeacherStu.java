package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class TeacherStu extends Teacher
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
	
	public TeacherStu() throws FileNotFoundException
	{
		super("Stu",new CostumePenguin(),new Weapon());
		
		this.totalHP = 400;
		this.currentHP = 400;
		this.defence = .20;
		this.weapon = new Weapon();
		this.attack = 35;
	}
	
	public boolean performSpecial(Student s1)
	{
		Random rand = new Random(150);
		int damage = rand.nextInt();
		System.out.println("Stu uses Valgrind to check for memory leaks and finds " + damage + ", you have been dealt this much damage");
		s1.setCurrentHP(s1.getCurrentHP()-damage);
		return false;
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

