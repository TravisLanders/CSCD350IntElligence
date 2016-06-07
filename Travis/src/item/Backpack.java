package item;

import java.util.ArrayList;
import java.util.Scanner;

import character.*;

public class Backpack
{
	protected ArrayList<Potion> potions;
	protected ArrayList<Weapon> weapons;
	protected int topRamenCount;
	protected int beerCount;
	protected int mountainDewCount;
	public Backpack()
	{
		this.potions = new ArrayList<Potion>();
		this.topRamenCount = 0;
		this.beerCount = 0;
		this.mountainDewCount = 0;
//		addPotion(new PotionTopRamen());
//		addPotion(new PotionBeer());
//		addPotion(new PotionMountainDew());
		
		this.weapons = new ArrayList<Weapon>();
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
		
		
		
		try
		{
		displayPotions();
		if(potions.size() == 0)
		{
			System.out.println("You do not have any potions to use");
		}
		
		else
		{
			//System.out.println("Which character would you like to use your potion on?");
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
						contains = true;
						
						switch(potion.getName())
						{
							case("Mountain Dew"):
								mountainDewCount--;
								break;
							case("Top Ramen"):
								topRamenCount--;
								break;
							case("Beer"):
								beerCount--;
								break;
						}
						
						break;
					}
				}
				
				if(contains)
				{
					
					
					/*System.out.println("Who would you like to use the potion on?");
					Student target = party.swap();
					party.removeMember(target);
					// use potion on party member;
					potion.usePotion(target);
					party.addMember(target);
					*/
					System.out.println("Who would you like to use the potion on? ");
					Student target = null;
					for(int i = 0; i < party.getSize(); i++)
					{
						System.out.println("Press " + (i + 1) + " to use the potion on " + party.getStudent(i).getName());
					}
					int index = kin.nextInt();
					target = party.getStudent(index);
					//party.removeMember(target);
					
					//Weapon temp = target.disarm();
					//if(temp != null)
					//{
					//	weapons.add(temp);
					//}
					potion.usePotion(target);
					//target.setWeapon(weapon);
					//party.addMember(target);
					return party;
					
					
				}
				
				else
				{
					System.out.println("You do not have any of those potions!");
				}
			}
		
		}
			
			
			
		
	}
	catch(Exception e)
	{
		System.out.println("Bad input yet again, no potion for you");
	}
		return party;
	}
	
	public Party equipWeapon(Party party)
	{
		try
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
			kin.nextLine();
			if(input > weapons.size() + 1 || input < 1)
			{
				System.out.println("Please enter a valid weapon index.");
			}
			
			else if(input != weapons.size() + 1) // equip
			{
				Weapon weapon = weapons.get(input - 1);
				weapons.remove(weapon);			
				System.out.println("Who would you like to equip the weapon to?");
				Student target = null;
				for(int i = 0; i < party.getSize(); i++)
				{
					System.out.println("Press " + (i + 1) + " to equip the weapon to " + party.getStudent(i).getName());
				}
				int index = kin.nextInt();
				target = party.getStudent(index);
				//party.removeMember(target);
				
				Weapon temp = target.disarm();
				if(temp != null)
				{
					weapons.add(temp);
				}
				
				target.setWeapon(weapon);
				//party.addMember(target);
				return party;
			}
		}
		return party;
		}
		catch(Exception e)
		{
			System.out.println("No weapon has been swapped");
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
			System.out.println(i + ") " + weapon.getName() + " with " + weapon.getAttack() + " attack.");
		}
		i++;
		System.out.println(i + ") Cancel request");
	}
}

