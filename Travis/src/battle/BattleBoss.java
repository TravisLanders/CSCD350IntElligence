package battle;

import java.util.Random;
import java.util.Scanner;

import character.*;

public class BattleBoss extends A_Battle
{
	private boolean championHasUsedSpecial = false;
	private boolean opponentHasUsedSpecial = false;
	
	public BattleBoss(Student championIn, Teacher opponentIn, Party partyIn)
	{
		super(championIn,  opponentIn, partyIn);
		if(this.opponent.getName().equals("Carol"))
		{
			this.visibleDamage = false;
		}
		
	}
	
	@Override
	public void beginBattle()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are about to enter battle with " + this.opponent.getName() + ", who is dressed as a " + this.opponent.getCostume().toString());
		if(this.party.getSize() > 1)
		{
			System.out.println("Who would you like to enter as your champion?");
			this.champion = party.swap();
		}
		System.out.println("Begin battle");
		
		while(isLive)
		{
			System.out.println("You currently have " + champion.getCurrentHP() + "HP");
			printOpponentHP();
			
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
		//scanner.close();
	}
	
	protected void championAttack()
	{
		scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Press 'a' to attack. Press 's' to swap. Press 'i' to use an item.");
		if(!championHasUsedSpecial)
		{
			System.out.print(" Press 'p' to use your special attack.");
		}
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
				if(!championHasUsedSpecial)
				{
					championHasUsedSpecial = true;
					if(((Teacher) this.opponent).specialAgainst())
					{
						this.championHasUsedSpecial = true;
						championAttack();
						championAttack();
					}
				}
				//					((Teacher) this.opponent).performSpecial(this.champion);

				
				else
				{
					System.out.println("You can't use your special attack twice. Nice try!");
				}
				break;
				
			case "a":
				damage = (int) (random.nextInt(100) * this.championAttackBonus);
				this.opponent.setCurrentHP(this.opponent.getCurrentHP() - damage);
				printOpponentDamage();
				break;
				
			case "i":
				useItem();
				break;
				
			default:
				System.out.println("Invalid input. You lose your turn");
				break;
		}
		checkAlive();	
	}
	
	protected void opponentAttack()
	{
		Random random = new Random();
		random.setSeed(4);
		int seed = random.nextInt(4);
		if(seed == 1 && !opponentHasUsedSpecial)
		{
			if(((Teacher) this.opponent).performSpecial(this.champion))
			{
				opponentAttack();
				opponentAttack();
			}
//			this.championCanAttack = false;
//			System.out.println("You have been stunned! You will lose a turn!");
//			opponentStunCounter = 0;
//			opponentAttack();
		}
		
		else
		{
			//if(seed == 3)
			
				String theTaunt = ((Teacher) this.opponent).taunt();
				System.out.println(this.opponent.getName() + ": " + theTaunt);
			
			int damageDone = random.nextInt((int) this.opponent.getAttack());
			this.champion.setCurrentHP(this.champion.getCurrentHP() - damageDone);
			System.out.println("You have been dealt " + damageDone + " damage by " + this.opponent.getName());
		}
		checkAlive();
	}
	
	protected void onVictory()
	{			
		System.out.println("You have defeated " + this.opponent.getName() + "!");
		isLive = false;
	}
}
