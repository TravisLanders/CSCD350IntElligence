package character;
import costume.*;
import battle.*;

public abstract class A_Character 
{
	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	private A_Costume costume;
	//private SpecialAttack sa;
	//private Weapon weapon;
	private double attack;
	private boolean isBoss;
	
	public A_Character(String nameIn, double totalHPIn, double currentHPIn, double defenceIn, A_Costume costumeIn, double attackIn, boolean isBossIn)
	{
		this.name = nameIn;
		this.totalHP = totalHPIn;
		this.currentHP = currentHPIn;
		this.defence = defenceIn;
		this.costume = costumeIn;
		this.attack = attackIn;
		this.isBoss = isBossIn;
	}
	
	public double getAttack()
	{
		return this.attack;
	}
	public void setAttack(double attackIn)
	{
		this.attack = attackIn;
	}
	
	//public abstract Weapon getWeapon();
	
	//public abstract void setWeapon(Weapon weapon);
	
	//public abstract SpecialAttack getSA();
	
	//public abstract void setSA(SpecialAttack sa);
	
	public A_Costume getCostume()
	{
		return this.costume;
	}
	
	public void setCostume(A_Costume costumeIn)
	{
		this.costume = costumeIn;
	}
		
	public double getDefence()
	{
		return this.defence;
	}
	
	public void setDefence(double defenceIn)
	{
		this.defence = defenceIn;
	}
	
	public double getCurrentHP()
	{
		return this.currentHP;
	}
	
	public void setCurrentHP(double currentHPIn)
	{
		this.currentHP = currentHPIn;
		if(this.currentHP >=this.totalHP)
			this.currentHP = this.totalHP;
	}
	
	public double getTotalHP()
	{
		return this.totalHP;
	}
	
	public void setTotalHP(double totalHPIn)
	{
		this.totalHP = totalHPIn;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String nameIn)
	{
		this.name = nameIn;
	}
	
	public boolean getIsBoss()
	{
		return this.isBoss;
	}
}
