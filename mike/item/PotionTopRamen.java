package item;

import character.Student;

public class PotionTopRamen extends Potion
{
	private String name;
	private String affects;
	private double amount;
	
	public PotionTopRamen()
	{
		super("Top Ramen", "Adds 10 hp");
		this.amount = 10;
	}
	
	@Override
	public Student usePotion(Student s1)
	{
		s1.setCurrentHP(s1.getCurrentHP() + this.amount);
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