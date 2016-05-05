package Final;

public abstract class A_Costume
{
	public enum Specialty
	{
		C, CSHARP, ASSEMBLY, JAVA, SECURITY, PYTHON, OS, MATH, ANDROID, DATAMINING, FRESHMAN, HEALER;
	}
	
	public enum Pair
	{
		C, CSHARP, ASSEMBLY, JAVA, SECURITY, PYTHON, OS, MATH, ANDROID, DATAMINING, NONE;
	}
	
	protected Specialty specialty;
	protected Pair pair;
	
	public A_Costume(Specialty specialtyIn, Pair pairIn)
	{
		this.specialty = specialtyIn;
		this.pair = pairIn;
	}
	
	public Specialty getSpecialty()
	{
		return this.specialty;
	}
	
	public Pair getPair()
	{
		return this.pair;
	}
	
	/*
	public A_Costume equipCostume(A_Character character)
	{
		return this;
	}
	
	// this method will go more-in depth as time goes on
	public void specialAttack(A_Character player, A_Character NPC)
	{
		player.attack(NPC);
	}
	*/
}
