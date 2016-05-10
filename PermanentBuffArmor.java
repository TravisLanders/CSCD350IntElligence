package Final;

public class PermanentBuffArmor extends PermanentBuffs
{
	
	private String name;
	private String affects;
	private double amount;
	

	public PermanentBuffArmor()
	{
		this.name = "Armor";
		this.affects = "Defence";
		this.amount = .10;
	}

	
	
	
	
	public void performAdjustment(Student s1)
	{
		s1.setDefence(s1.getDefence()+this.amount);
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

	

