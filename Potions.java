package Final;

public class Potions  extends A_Item
{

	
		private String name;
		private String affects;
		private double amount;
		
		
		
	
	
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
