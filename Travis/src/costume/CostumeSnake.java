package costume;

public class CostumeSnake extends A_Costume
{
	public CostumeSnake()
	{
		super(Specialty.PYTHON, Specialty.CSHARP);
	}

	@Override
	public String toString()
	{
		return "snake";
	}
}
