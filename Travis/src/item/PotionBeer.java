package item;

import character.Student;

public class PotionBeer extends Potion
{
	private String name;
	private String effects;
	private double amount;
	
	public PotionBeer()
	{
		super("Beer", "Defence");
		this.amount=.50;
	}
	
	public Student usePotion(Student s1)
	{
		s1.setDefence(s1.getDefence()+this.amount);
		System.out.println("Used Beer");
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