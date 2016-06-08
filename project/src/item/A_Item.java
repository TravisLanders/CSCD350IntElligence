package item;

public abstract class A_Item
{
	private String name;
	private String effects;

	public A_Item(String nameIn, String effectsIn)
	{
		this.name = nameIn;
		this.effects = effectsIn;
	}

	public String getName()
	{
		return this.name;
	}

	public String getEffects()
	{
		return this.effects;
	}
}
