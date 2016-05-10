package battle;

import character.*;
import java.util.Scanner;
import java.util.Random;

public class Battle
{
	protected A_Character champion;
	protected Student opponent;
	protected boolean isLive = true;
	protected boolean championCanAttack = true;
	protected boolean opponentCanAttack = true;
	protected boolean visibleDamage = true;
	private int damage = 15;
	private Scanner scanner;
	private Party party;
	
	public Battle(Student championIn, Student opponentIn, Party partyIn)
	{
		this.champion = championIn;
		this.opponent = opponentIn;
		this.party = partyIn;
	}
	
	public void beginBattle()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Begin battle");
		
		while(isLive)
		{
			System.out.println("You currently have " + champion.getCurrentHP() + "HP");
			if(visibleDamage && isLive)
			{
				System.out.println(this.opponent.getName() + " currently has " + this.opponent.getCurrentHP() + " HP");
			}
			
			else if(isLive)
			{
				System.out.println(this.opponent.getName() + " currently has an unknown amount of HP");
			}
			
			if(championCanAttack && isLive)
			{
				championAttack();
			}
			championCanAttack = true;
			if(opponentCanAttack && isLive)
			{
				opponentAttack();
			}
			opponentCanAttack = true;
		}
		scanner.close();
	}
	
	private void championAttack()
	{
		scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Press 'a' to attack. Press 's' to swap. Press 'p' to stun player. Press 'h' to heal.");
		String str = scanner.nextLine();
		str = str.toLowerCase();
		switch(str)
		{
			case "s":
				this.champion = party.swap();
				//scanner.nextLine();
				str = "";
				break;
				
			case "p":
				System.out.println("You have stunned " + this.opponent.getName() + " for one turn! Go again!");
				opponentCanAttack = false;
				championAttack();
				break;
				
			case "a":
				damage = random.nextInt(100);
				this.opponent.setCurrentHP(this.opponent.getCurrentHP() - damage);
				if(visibleDamage)
				{
					System.out.println("You have done " + damage + " damage to " + this.opponent.getName());					
				}
				
				else
				{
					System.out.println("You have done an unknown amount of damage to " + this.opponent.getName());					
				}
				break;
				
			case "h":
				int health = random.nextInt(10);
				this.champion.setCurrentHP(this.champion.getCurrentHP() + health);
				System.out.println("You have healed yourself " + health + " HP.");
				break;
				
			default:
				System.out.println("Invalid input. You lose your turn");
				break;
		}
		checkAlive();
		
		/*
		try
		{
			Thread.sleep(damage);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Thread interupted. This should never happen");
		}
		*/
	}
	
	private void opponentAttack()
	{
		Random random = new Random();
		random.setSeed(4);
		int seed = random.nextInt(4);
		if(seed == 1)
		{
			this.championCanAttack = false;
			System.out.println("You have been stunned! You will lose a turn!");
			opponentAttack();
		}
		
		else
		{
			int damageDone = random.nextInt(15);
			this.champion.setCurrentHP(this.champion.getCurrentHP() - damageDone);
			System.out.println("You have been dealt " + damageDone + " damage by " + this.opponent.getName());
		}
		checkAlive();
	}
	
	private void checkAlive()
	{
		if(this.champion.getCurrentHP() <= 0)
		{
			onDefeat();
		}
		
		if(this.opponent.getCurrentHP() <= 0)
		{
			onVictory();
		}
	}
	
	private void onDefeat()
	{
		System.out.println("You have been defeated!");
		isLive = false;
	}
	
	private void onVictory()
	{			
		System.out.println("You have defeated your opponent!");
		isLive = false;
		if(this.party.getSize() < 6)
		{
			System.out.println("Would you like to add " + this.opponent.getName() + " to your party? Y/N");
			String response = scanner.next();
			if(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
			{
				party.addMember(this.opponent);
			}
		}
	}
}