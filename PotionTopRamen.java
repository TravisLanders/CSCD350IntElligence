package Final;

public class PotionTopRamen extends Potions
{
	private String name;
	private String affects;
	private double amount;
	
	public PotionTopRamen()
	{
		this.name ="Top Ramen";
		this.affects= "Health";
		this.amount=.50;
	}
	
	public void usePotion(Student s1)
	{
		s1.setCurrentHP(s1.getCurrentHP()+this.amount);
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
