package Final;

public class CostumeFreshman extends A_Costume
{
	public CostumeFreshman()
	{
		super(Specialty.NONE, Pair.NONE);
	}
	@Override
	public String toString()
	{
		
		return "Freshman";
	}

	/*
	 * Currently these values increase the Freshman's
	 * stats by 50%. If that is too much of an increase,
	 * these stats can be changed.
	 * 
	@Override 
	public A_Costume equipCostume(A_Character character)
	{
		character.setDefense(character.getDefense() * 1.5));
		character.setTotalHP(character.getTotalHP() * 1.5));
		character.setAccuraccy(character.getAccuracy() * 1.5));
		character.setSpeed(character.getSpeed() * 1.5));
		return this;
	}
	*/
}
