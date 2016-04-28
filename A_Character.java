package Character;

public abstract class A_Character 
{
	private String name;
	private int totalHP;
	private int currentHP;
	private double defence;
	private double accuracy;
	private double speed;
	private Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	
	
		
	
	

		
	
	public abstract Weapon getWeapon();
	
	public abstract void setWeapon(Weapon weapon);
	
	public abstract SpecialAttack getSA();
	
	public abstract void setSA(SpecialAttack sa);
	
	public abstract Costume getCostume();
	public abstract void setCostume(Costume costume);
	
	public abstract double getSpeed(); 
	public abstract void setSpeed(double speed) ;
	
	public abstract double getAccuracy();
	
	public abstract void setAccuracy(double accuracy);
	
	public abstract double getDefence() ;
	
	public abstract void setDefence(double defence) ;
	
	public abstract int getCurrentHP() ;
	public abstract void setCurrentHP(int currentHP) ;
	
	public abstract int getTotalHP() ;
	
	public abstract void setTotalHP(int totalHP);
	
	public abstract String getName() ;
	public abstract void setName(String name) ;
	
}
