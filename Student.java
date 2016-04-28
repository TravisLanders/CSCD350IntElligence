package Character;

public class Student extends A_Character {

	private String name;
	private int totalHP;
	private int currentHP;
	private double defence;
	private double accuracy;
	private double speed;
	private Costume costume;
	private SpecialAttack sa;
	private Weapon weapon;
	private boolean goodStudent;
	
	public Student(String name, int totalHP,int currentHP, double defence, double accuracy, double speed, Costume costume, SpecialAttack sa,Weapon weapon, boolean goodStudent)
	{
		this.name = name;
		this.totalHP = totalHP;
		this.currentHP = currentHP;
		this.defence = defence;
		this.accuracy = accuracy;
		this.speed = speed;
		this.costume=costume;
		this.sa = sa;
		this.weapon = weapon;
		this.goodStudent = goodStudent;
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

	
	public Costume getCostume() {return this.costume;}
	public void setCostume(Costume costume) 
	{
		this.costume = costume;
	}

	
	public double getSpeed(){return this.speed;}

	@Override
	public void setSpeed(double speed) 
	{
		this.speed = speed;
		
	}

	@Override
	public double getAccuracy() {
		return this.accuracy;
	}

	@Override
	public void setAccuracy(double accuracy) {
		this.accuracy=acuracy;
		
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
	public int getCurrentHP() {
		return this.currentHP;
	}

	@Override
	public void setCurrentHP(int currentHP) {
		this.currentHP= currentHP;
		
	}

	@Override
	public int getTotalHP() {
		return this.totalHP;
	}

	@Override
	public void setTotalHP(int totalHP) {
		this.totalHP= totalHP;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	public boolean isGoodStudent() {
		return goodStudent;
	}
	public void setGoodStudent(boolean goodStudent) {
		this.goodStudent = goodStudent;
	}

}
