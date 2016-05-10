package Final;

public class PotionMountainDew extends Potions
{
	private String name;
	private String affects;
	private double amount;
	
	public PotionMountainDew()
	{
		this.name ="Mountain Dew";
		this.affects= "Attack";
		this.amount=50;
	}
	
	public void usePotion(Student s1)
	{
		s1.setAttack(s1.getAttack()+this.amount);
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
