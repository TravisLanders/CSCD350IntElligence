package Final;

public class PermanentBuffProteinShake extends PermanentBuffs
{
	
	private String name;
	private String affects;
	private double amount;
	

	public PermanentBuffProteinShake()
	{
		this.name = "Armor";
		this.affects = "Attack";
		this.amount = 25;
	}

	
	
	
	
	public void performAdjustment(Student s1)
	{
		s1.setAttack(s1.getAttack()+this.amount);
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
