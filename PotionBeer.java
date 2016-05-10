package Final;

public class PotionBeer extends Potions
{
	private String name;
	private String affects;
	private double amount;
	
	public PotionBeer()
	{
		this.name ="Beer";
		this.affects= "Defence";
		this.amount=.50;
	}
	
	public void usePotion(Student s1)
	{
		s1.setDefence(s1.getDefence()+this.amount);
	}
	
	
	
	@Override
	public String getName() 
	{
		return this.name;
	}

	@Override
	public String getAffects() 
	{

		return this.affects;
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
