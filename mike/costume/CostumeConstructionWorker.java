package costume;

public class CostumeConstructionWorker extends A_Costume
{
	public CostumeConstructionWorker()
	{
		super(Specialty.ASSEMBLY, Specialty.SECURITY);
	}
	
	@Override
	public String toString()
	{
		return "construction worker";
	}
}
