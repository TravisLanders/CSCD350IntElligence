package costume;

public class CostumeCoffeeCup extends A_Costume
{
	public CostumeCoffeeCup()
	{
		super(Specialty.JAVA, Specialty.ANDROID);
	}
	
	@Override
	public String toString()
	{
		return "coffee cup";
	}
}
