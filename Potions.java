package Final;

public class Potions  extends A_Item
{

	
		private String name;
		private String affects;
		private int duration;
	
	
	@Override
	public String getName() 
	{
		return this.name;
	}

	@Override
	public String getAffects() 
	{

		return this.affects;
	}
	
	public int getDuration(){return this.duration;}
	public void setDuration()
	{
		this.duration--;
	}
	
	public void performAdjustment()
	{
		
	}

}
