package Final;

public class PermanentBuffs  extends A_Item
{

	
		private String name;
		private String affects;
		private double amount;
		
	
	
		public void performAdjustment(Student s1)
		{
			//permanently increases certain attribute.
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
