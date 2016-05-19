package costume;

public class CostumeCop extends A_Costume
{
	public CostumeCop()
	{
		super(Specialty.SECURITY, Specialty.ASSEMBLY);
	}
	
	@Override
	public String toString()
	{
		return "cop";
	}
}
