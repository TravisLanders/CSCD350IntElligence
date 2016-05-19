package costume;

public abstract class A_Costume
{
	public enum Specialty
	{
		C, CSHARP, ASSEMBLY, JAVA, SECURITY, PYTHON, OS, MATH, ANDROID, DATAMINING, FRESHMAN, HEALER, NONE;
	}
	
	protected Specialty specialty;
	protected Specialty pair;
	
	public A_Costume(Specialty specialtyIn, Specialty pairIn)
	{
		this.specialty = specialtyIn;
		this.pair = pairIn;
	}
	
	public Specialty getSpecialty()
	{
		return this.specialty;
	}
	
	public Specialty getPair()
	{
		return this.pair;
	}
	
	public abstract String toString();
	
	/*
	public A_Costume equipCostume(A_Character character)
	{
		return this;
	}
	
	// this method will go more-in depth as time goes on
	public void specialAttack(A_Character player, A_Character npc)
	{
		player.attack(npc);
	}
	*/
}
