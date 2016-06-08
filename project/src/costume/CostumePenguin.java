package costume;

public class CostumePenguin extends A_Costume
{
	public CostumePenguin()
	{
		super(Specialty.OS, Specialty.C);
	}

	@Override
	public String toString()
	{
		return "penguin";
	}
}
