package item;

import character.Student;

public class Potion extends A_Item
{
	private String name;
	private String affects;
	private double amount;
	
	public Potion(String nameIn, String effectsIn)
	{
		super(nameIn, effectsIn);
	}

	public double getAmount()
	{
		return this.amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public void usePotion(Student s1)
	{
		// TODO Auto-generated method stub
		
	}
}