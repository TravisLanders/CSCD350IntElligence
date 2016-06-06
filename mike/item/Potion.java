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

	
	public Student usePotion(Student s1) //taken care of in subclasses
	{
		
		/*
		if(this.name == "Mountain Dew")
		{
			s1.setCurrentHP(s1.getCurrentHP() + 20);
		}
		
		else if(this.name == "Top Ramen")
		{
			s1.setCurrentHP(s1.getCurrentHP() + 25);
		}
		
		else
		{
			s1.setCurrentHP(s1.getCurrentHP() + 30);
		}
		return s1;
		*/
		return s1;
	}
}