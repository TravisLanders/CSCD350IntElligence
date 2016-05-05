package Final;

public class PermanentBuffs  extends A_Item
{

	
		private String name;
		private String affects;
		
	
	
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
	
	public void performAdjustment()
	{
		//permanently increases certain attribute.
	}

}
