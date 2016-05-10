package Final;

public class PermanentBuffWaterBottle extends PermanentBuffs
{
	
	private String name;
	private String affects;
	private double amount;
	

	public PermanentBuffWaterBottle()
	{
		this.name = "Armor";
		this.affects = "Health";
		this.amount = .10;
	}

	
	
	
	
	public void performAdjustment(Student s1)
	{
		s1.setTotalHP(s1.getTotalHP()+this.amount);
	}
	
	
public String getName() 
{
	return this.name;
}

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
