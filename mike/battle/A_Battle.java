package battle;

import java.util.Scanner;

import character.*;

public abstract class A_Battle
{
	protected Student champion;
	protected A_Character opponent;
	protected Party party;
	protected boolean isLive = true;
	protected boolean championCanAttack = true;
	protected boolean opponentCanAttack = true;
	protected int damage = 15;
	protected Scanner scanner;
	protected int championStunCounter = 4;
	protected int opponentStunCounter = 4;
	protected double championAttackBonus = 1.0;
	protected double championDefenseBonus = 1.0;
	protected boolean firstBattle = false;
	protected boolean visibleDamage = true;
	protected boolean championIsDefeated = false;
	
	public A_Battle(Student championIn, A_Character opponentIn, Party partyIn)
	{
		this.champion = championIn;
		this.opponent = opponentIn;
		this.party = partyIn;
	}
	
	public abstract void beginBattle(); // returns true if victory
	
	protected void printOpponentDamage()
	{
		if(this.visibleDamage)
		{
			System.out.println(this.champion.getName() + " has done " + damage + " damage to " + this.opponent.getName());					
		}
		
		else
		{
			System.out.println(this.champion.getName() + " has done an unknown amount of damage to " + this.opponent.getName());					
		}
	}
	
	protected void printOpponentHP()
	{
		if(visibleDamage && isLive)
		{
			System.out.println(this.opponent.getName() + " currently has " + this.opponent.getCurrentHP() + " HP");
		}
		
		else if(isLive)
		{
			System.out.println(this.opponent.getName() + " currently has an unknown amount of HP");
		}
	}	
	
	protected void calcBonuses()
	{
		if(this.champion.getCostume().getSpecialty() == this.opponent.getCostume().getSpecialty())		
		{
			this.championAttackBonus = 1.5;
			this.championDefenseBonus = 1.5;
		}
		
		if(this.champion.getCostume().getSpecialty() == this.opponent.getCostume().getPair())
		{
			this.championDefenseBonus = 1.5;
		}
	}
	
	
	protected void checkAlive()
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
	

	protected void onDefeat()
	{
		if(this.champion.isLeader() && party.getSize() > 1)
		{
			System.out.println(this.champion.getName() + " is almost defeated! Swap somebody in to continue playing!");
			this.champion.setCurrentHP(1);
			this.champion = party.swap();
		}
		
		else if(this.champion.isLeader() && party.getSize() == 1)
		{
			System.out.println(this.champion.getName() + " has  been defeated, along with the rest of " + this.champion.getName() + "'s Party!\nGame over!");
			isLive = false;	
			this.championIsDefeated = true;
		}
		
		else
		{
			System.out.println(this.champion.getName() + " has been defeated! Swap somebody in to continue playing!");
			party.removeMember(this.champion);
			this.champion = party.swap();
		}
	}
	
	protected void useItem()
	{
		System.out.println("Press 'W' to equip a weapon. Press 'I' to use an item. Press 'C' to cancel request.");
		Scanner kin = new Scanner(System.in);
		String input = kin.nextLine();
		if(input.equalsIgnoreCase("W"))
		{
			String name = this.champion.getName();
			this.party = this.party.getBackpack().equipWeapon(this.party);
			this.champion = this.party.getStudent(name);
		}
		
		else if(input.equalsIgnoreCase("I"))
		{
			String name = this.champion.getName();
			this.party = this.party.getBackpack().usePotion(this.party);
			this.champion = this.party.getStudent(name);
		}
		
		else
		{
			// do nothing
		}
		
	}
	
	protected abstract void onVictory();
	
	protected abstract void championAttack();
	
	protected abstract void opponentAttack();
}
