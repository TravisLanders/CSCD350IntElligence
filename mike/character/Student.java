package character;

import costume.*;

public class Student extends A_Character
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	private A_Costume costume;
	// private SpecialAttack sa;
	// private Weapon weapon;
	private boolean goodStudent;
	private double attack;
	private boolean isTheLeader;

	public Student(String name, A_Costume costume, boolean goodStudent)// SpecialAttack
																		// sa,Weapon
																		// weapon,
																		// boolean
																		// goodStudent)
	{
		super(name, 100.0, 100.0, 0.50, costume, 15.0);
		this.goodStudent = goodStudent;
		this.isTheLeader = false;
	}

	// public Weapon getWeapon() {return this.getWeapon();}
	/*
	 * public void setWeapon(Weapon weapon) { this.weapon = weapon;
	 * 
	 * }
	 * 
	 * 
	 * public SpecialAttack getSA(){return this.sa;} public void
	 * setSA(SpecialAttack sa) { this.sa = sa;
	 * 
	 * }
	 */

	public boolean isGoodStudent()
	{
		return goodStudent;
	}

	public void setGoodStudent(boolean goodStudent)
	{
		this.goodStudent = goodStudent;
	}
	
	public void setLeader()
	{
		this.isTheLeader = true;
	}
	
	public boolean isLeader()
	{
		return this.isTheLeader;
	}

}
