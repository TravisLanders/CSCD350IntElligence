package item;

import character.Student;

public class PotionMountainDew extends Potion
{
	private String name;
	private String effects;
	private double amount;
	
	public PotionMountainDew()
	{
		super("Moutnain Dew", "Attack");
		this.amount=50;
	}
	
	public Student usePotion(Student s1)
	{
		s1.setAttack(s1.getAttack() + this.amount);
		return s1;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}
}