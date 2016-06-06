package item;

import character.Student;

public class PotionMountainDew extends Potion
{
	private String name;
	private String effects;
	private double amount;
	
	public PotionMountainDew()
	{
		super("Mountain Dew", "Attack");
		this.amount=50;
	}
	
	@Override
	public Student usePotion(Student s1)
	{
		s1.setAttack(s1.getAttack()+this.amount);
		System.out.println("Used Mountain Dew");
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