package costume;

public class CostumeOptometrist extends A_Costume
{
	public CostumeOptometrist()
	{
		super(Specialty.CSHARP, Specialty.PYTHON);
	}
	
	@Override
	public String toString()
	{
		return "optometrist";
	}
}
