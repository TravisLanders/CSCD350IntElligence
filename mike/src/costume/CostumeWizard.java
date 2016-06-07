package costume;

public class CostumeWizard extends A_Costume
{
	public CostumeWizard()
	{
		super(Specialty.C, Specialty.OS);
	}
	
	@Override
	public String toString()
	{
		return "wizard";
	}
}
