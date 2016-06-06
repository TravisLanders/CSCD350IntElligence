package item;

import java.util.Random;


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

	public Student usePotion(Student s1)
	{
		return s1;
	}
	
	public static Potion getRandomPotion()
	{
		Random rand = new Random();
		int num = rand.nextInt(2);
		
		
	    if(num ==0)
		{
			return new PotionBeer();
		}
		
		else if(num ==1)
		{
			return new PotionMountainDew();
		}
		
		else if(num ==3)
		{
			return new PotionTopRamen();
		}
		return null;
	}
}