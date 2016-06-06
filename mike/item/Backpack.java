package item;

import java.util.ArrayList;
import java.util.Scanner;

import character.*;

public class Backpack
{
	protected ArrayList<Potion> potions = new ArrayList<Potion>();
	protected ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	protected int topRamenCount = 0;
	protected int beerCount = 0;
	protected int mountainDewCount = 0;
	public Backpack()
	{
		
	}
	
	public void addPotion(Potion potionIn)
	{
		potions.add(potionIn);
		if(potionIn.getName().equals("Top Ramen"))
		{
			topRamenCount++;
		}
		
		if(potionIn.getName().equals("Beer"))
		{
			beerCount++;
		}
		
		if(potionIn.getName().equals("Mountain Dew"))
		{
			mountainDewCount++;
		}
	}
	
	public void addWeapon(Weapon weaponIn)
	{
		weapons.add(weaponIn);
	}
	
	public Party usePotion(Party party)
	{
		displayPotions();
		if(potions.size() < 0)
		{
			System.out.println("You do not have any potions to use");
		}
		
		else
		{
			System.out.println("Which character would you like to use your potion on?");
			Scanner kin = new Scanner(System.in);
			int input = kin.nextInt();
			if(input > 4 || input < 1)
			{
				System.out.println("Please enter a valid potion index.");
			}
			
			else
			{
				String str = "";
				
				switch(input)
				{
					case(1):
						str = "Mountain Dew";
						break;
					case(2):
						str = "Top Ramen";
						break;
					case(3):
						str = "Beer";
						break;
				}
				
				boolean contains = false;
				Potion potion = new PotionBeer();
				for(int i = 0; i < potions.size(); i++)
				{
					if(potions.get(i).getName().equals(str))
					{
						potion = potions.get(i);
						potions.remove(potion);
					}
				}
				
				if(contains)
				{
					System.out.println("Who would you like to use the potion on?");
					Student target = party.swap();
					party.removeMember(target);
					// use potion on party member;
					potion.usePotion(target);
					party.addMember(target);
				}
				
				else
				{
					System.out.println("You do not have any of those potions!");
				}
			}
		}
		return party;
	}
	
	public Party equipWeapon(Party party)
	{
		if(weapons.size() < 1)
		{
			System.out.println("You do not have any weapons to equip");
		}
		
		else
		{
			displayWeapons();
			Scanner kin = new Scanner(System.in);
			int input = kin.nextInt();
			if(input > weapons.size() + 1 || input < 1)
			{
				System.out.println("Please enter a valid weapon index.");
			}
			
			else if(input != weapons.size() + 1) // equip
			{
				Weapon weapon = weapons.get(input - 1);
				System.out.println("Who would you like to equip the weapon to?");
				Student target = party.swap();
				party.removeMember(target);
				target.equipWeapon(weapon);
				party.addMember(target);
				return party;
			}
		}
		return party;
	}
	
	protected void displayPotions()
	{
		System.out.println("Which potion would you like to use?");
		System.out.println("1) Mountain Dew: " + mountainDewCount + " remaining.");
		System.out.println("2) Top Ramen: " + topRamenCount + " remaining.");
		System.out.println("3) Beer: " + beerCount + " remaining.");
		System.out.println("4) Cancel request");
	}
	
	protected void displayWeapons()
	{
		System.out.println("Which weapon would you like to equip?");
		int i = 0;
		for(Weapon weapon: weapons)
		{
			i++;
			System.out.println(i + ") " + weapon.getName());
		}
		i++;
		System.out.println(i + ") Cancel request");
	}
}