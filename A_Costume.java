package Final;

import java.util.Scanner;

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
	
	public abstract String toString();
	
	public static A_Costume selectCostume()
	{
		try
		{
		int choice = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("In the game there are 11 costumes.  Each costume has a specialty language that is assigned to it. The specialty will provide you a attack bonus if you");
		Thread.sleep(200);
		System.out.println("have the same specialty language as your opponent.  Each language also has a Pair, where one of them is your specialty, and another is a different specialty that ties in with your specialty");
		Thread.sleep(200);
		
		System.out.println("If one of your costume's Pairs is your opponents specialty, you get a defensive bonus.");
		Thread.sleep(200);
		System.out.println("You will now choose a costume to wear for the length of the game. The Costume attributes will be displayed in the following manner:");
		Thread.sleep(200);
		System.out.println("CostumeName, Specialty, CostumePairing");
		do
		{
			System.out.println("Select a costume from the following.");
			Thread.sleep(200);
			System.out.println("1. CostumeType: Coffee Cup, Specialty: Java, Pairing: Android");
			Thread.sleep(200);
			System.out.println("2. CostumeType: ConStruction Worker, Specialty: Assembly, Pairing: Security");
			Thread.sleep(200);
			
			System.out.println("3. CostumeType: Cop, Specialty: Security, Pairing: Assembly");
			Thread.sleep(200);
			System.out.println("4. CostumeType: Freshman, Specialty: NONE, Pairing: NONE");
			Thread.sleep(200);
			System.out.println("5. CostumeType: Miner, Specialty: Data Mining, Pairing: Math");
			Thread.sleep(200);
			System.out.println("6. CostumeType: Optometrist, Specialty: C#, Pairing: Python");
			Thread.sleep(200);
			System.out.println("7. CostumeType: Penguin, Specialty: OS, Pairing: C");
			Thread.sleep(200);
			System.out.println("8. CostumeType: Pie, Specialty: Math, Pairing: Data Mining");
			Thread.sleep(200);
			System.out.println("9. CostumeType: Robot, Specialty: Android, Pairing: Java");
			Thread.sleep(200);
			System.out.println("10. CostumeType: Snake, Specialty: Python, Pairing: C#");
			Thread.sleep(200);
			System.out.println("11. CostumeType: Wizard, Specialty: C, Pairing: OS");
			Thread.sleep(200);
			choice = kb.nextInt();
			if(choice<1 || choice >11)
				System.out.println("Invalid selection, please try again");
		}while(choice >11 || choice <1);
		switch(choice)
		{
			case 1: return new CostumeCoffeeCup();
			case 2: return new CostumeConstructionWorker();
			case 3: return new CostumeCop();
			case 4: return new CostumeFreshman();
			case 5: return new CostumeMiner();
			case 6: return new CostumeOptometrist();
			case 7: return new CostumePenguin();
			case 8: return new CostumePie();
			case 9: return new CostumeRobot();
			case 10: return new CostumeSnake();
			default: return new CostumeWizard();
		
		}
		}
		catch(Exception e)
		{
			System.out.println("You cannnot even enter simple input, so you are being defaulted to a Freshman Costume");
			return new CostumeFreshman();
		
		}
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
