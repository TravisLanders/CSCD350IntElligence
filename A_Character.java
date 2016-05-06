package Final;

public abstract class A_Character 
{
	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
	
	
		
	
	

		
	public abstract double getAttack();
	public abstract void setAttack(double attack);
	
	public abstract Weapon getWeapon();
	
	public abstract void setWeapon(Weapon weapon);
	
	public abstract SpecialAttack getSA();
	
	public abstract void setSA(SpecialAttack sa);
	
	public abstract A_Costume getCostume();
	public abstract void setCostume(A_Costume costume);
	
	
	
	public abstract double getDefence() ;
	
	public abstract void setDefence(double defence) ;
	
	public abstract double getCurrentHP() ;
	public abstract void setCurrentHP(double currentHP) ;
	
	public abstract double getTotalHP() ;
	
	public abstract void setTotalHP(double totalHP);
	
	public abstract String getName() ;
	public abstract void setName(String name) ;
	
}
