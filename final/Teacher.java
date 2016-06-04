package Final;



public class Teacher extends A_Character 
{

	private String name;
	private double totalHP;
	private double currentHP;
	private double defence;
	
	private A_Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private double attack;
	
	
	public Teacher(String name, A_Costume costume, SpecialAttack sa,Weapon weapon)
	{
		this.name = name;
		this.totalHP = 100;
		this.currentHP = 100;
		this.attack = 15;
		this.defence = .05;
		this.costume=costume;
		this.sa = sa;
		this.weapon = weapon;
		
	}
	
	public double getAttack(){return this.attack;}
	public void setAttack(double attack)
	{
		this.attack = attack;
	}
	
	
	public Weapon getWeapon() {return this.getWeapon();}
	public void setWeapon(Weapon weapon) 
	{
		this.weapon = weapon;
		
	}

	
	public SpecialAttack getSA(){return this.sa;}
	public void setSA(SpecialAttack sa) 
	{
		this.sa = sa;
		
	}

	
	public A_Costume getCostume() {return this.costume;}
	public void setCostume(A_Costume costume) 
	{
		this.costume = costume;
	}

	
	

	

	

	@Override
	public double getDefence() {
		return this.defence;
	}

	@Override
	public void setDefence(double defence) {
		this.defence=defence;
		
	}

	
	

	@Override
	public String getName() {
	
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public double getCurrentHP() {
		
		return this.currentHP;
	}

	@Override
	public void setCurrentHP(double currentHP) {
		this.currentHP = currentHP;
	}

	@Override
	public double getTotalHP() {
		
		return this.totalHP;
	}

	@Override
	public void setTotalHP(double totalHP) {
		this.totalHP = totalHP;
		
	}
	

}
