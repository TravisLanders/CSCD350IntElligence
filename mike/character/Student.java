package character;

import costume.*;
import item.Weapon;

public class Student extends A_Character
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	private A_Costume costume;
	// private SpecialAttack sa;
	private Weapon weapon;
	private boolean goodStudent;
	private double attack;
	private boolean isTheLeader;

	public Student(String name, A_Costume costume, boolean goodStudent)// SpecialAttack
																		// sa,Weapon
																		// weapon)
	{
		super(name, 100.0, 100.0, 0.50, costume, 15.0, false);
		this.goodStudent = goodStudent;
		this.isTheLeader = false;
		this.weapon = null;
	}
	
	public void levelMultiplier(int level)
	{
		this.attack = level * this.attack;
		this.defence = level * this.defence;
		this.totalHP = level * this.totalHP;
		this.currentHP = level * this.currentHP;
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

	public void equipWeapon(Weapon weaponIn)
	{
		this.weapon = weaponIn;
		this.attack = this.attack * this.weapon.getAttack();
	}
	
	public Weapon getWeapon()
	{
		return this.weapon;
	}
	
	public Weapon disarm()
	{
		Weapon toGo = this.weapon;
		this.weapon = null;
		return toGo;
	}
}
