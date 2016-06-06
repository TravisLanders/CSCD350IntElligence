package Final;


public class PotionMountainDew extends Potion
{
	private String name;
	private String effects;
	private double amount;
	
	public PotionMountainDew()
	{
		super("Moutnain Dew", "Attack");
		this.amount=50;
	}
	
	public void usePotion(Student s1)
	{
		s1.setAttack(s1.getAttack()+this.amount);
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
