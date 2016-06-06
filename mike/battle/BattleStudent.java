package battle;

import character.*;
import java.util.Scanner;
import java.util.Random;

public class BattleStudent extends A_Battle
{
	boolean firstBattle = false;

	public BattleStudent(Student championIn, Student opponentIn, Party partyIn)
	{
		super(championIn, opponentIn, partyIn);
	}

	public void setFirstBattle()
	{
		this.firstBattle = true;
	}

	public void beginBattle()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are about to enter battle with " + this.opponent.getName() + ", who is dressed as a "
				+ this.opponent.getCostume().toString());
		if (this.party.getSize() > 1)
		{
			System.out.println("Who would you like to enter as your champion?");
			this.champion = party.swap();
		}
		System.out.println("Begin battle");

		while (isLive)
		{
			System.out.println("You currently have " + champion.getCurrentHP() + "HP");
			printOpponentHP();

			if (championCanAttack && isLive)
			{
				championAttack();
			}
			championCanAttack = true;
			if (opponentCanAttack && isLive)
			{
				opponentAttack();
			}
			opponentCanAttack = true;
		}
		// scanner.close();
	}

	protected void championAttack()
	{
		scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Press 'a' to attack. Press 's' to swap. Press 'i' to use an item");
		String str = scanner.nextLine();
		str = str.toLowerCase();
		switch (str)
		{
		case "s":
			this.champion = party.swap();
			// scanner.nextLine();
			str = "";
			break;

		case "i":
			useItem();
			break;

		case "a":
			damage = (int) (random.nextInt(100) * this.championAttackBonus);
			this.opponent.setCurrentHP(this.opponent.getCurrentHP() - damage);
			printOpponentDamage();
			break;
		/*
		 * case "h": int health = (int) (random.nextInt(10) /
		 * this.championDefenseBonus);
		 * this.champion.setCurrentHP(this.champion.getCurrentHP() + health);
		 * System.out.println("You have healed yourself " + health + " HP.");
		 * break;
		 */

		default:
			System.out.println("Invalid input. You lose your turn");
			break;
		}
		checkAlive();
	}

	protected void opponentAttack()
	{
		Random random = new Random();
		int damageDone = random.nextInt(15);
		this.champion.setCurrentHP(this.champion.getCurrentHP() - damageDone);
		System.out.println("You have been dealt " + damageDone + " damage by " + this.opponent.getName());
		checkAlive();
	}

	protected void stunOpponent()
	{
		if (championStunCounter >= 4)
		{
			System.out.println("You have stunned " + this.opponent.getName() + " for one turn! Go again!");
			opponentCanAttack = false;
			championStunCounter = 0;
			championAttack();
		}

		else
		{
			System.out.println("You have stunned too recently to stun again!");
			championAttack();
		}
	}

	protected void onVictory()
	{
		System.out.println("You have defeated " + this.opponent.getName() + "!");
		isLive = false;
		if (this.party.getSize() < 6)
		{
			System.out.println("Would you like to add " + this.opponent.getName() + " to your party? Y/N");
			String response = scanner.next();
			if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
			{
				party.addMember((Student) this.opponent);
			}
		}
	}
}