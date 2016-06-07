

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import DataBaseFiles.DataBaseManager;
import item.*;
import tile.Floor;
import character.*;
import costume.*;
import battle.*;

public class Tester
{

	public static void main(String[] args) throws Exception
	{

		Scanner kb = new Scanner(System.in);
		System.out.println(
				"Welcome to Halloween Adventure in the CEB, where you will navigate through the different floors of the building in your halloween costume and battle ");
		System.out.println("fellow students and vaculty.  First, enter the name of your character:");
		String name = kb.nextLine();
		System.out.println();

		A_Costume costume = A_Costume.selectCostume();
		Student player = new Student(name, costume, true);
		//player.setLeader();
		player.getWeapon().setAttack(40.0);
		Party party = new Party(player);
		
		//ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		//ArrayList<A_Item> items = new ArrayList<A_Item>();
		boolean demo = false;
		if(name.equalsIgnoreCase("Demo"))
		{
			player.getWeapon().setAttack(60);
			player.setCurrentHP(200);
			player.setTotalHP(200);
			demo = true;
		}
		System.out.println("You are " + name + " wearing a " + costume.toString() + " costume.");
		System.out.println("Your starting weapon is: " + player.getWeapon().toString());
		System.out.println("The game will now begin");
		boolean gameOver = false;
		int level = 1;
		boolean nextFloor = false;
		//Backpack bp = new Backpack();
		

		boolean over = false;
		DataBaseManager dbm;
		dbm = new DataBaseManager();
		Random nameGen = new Random();
		
		Floor f1 = new Floor(new TeacherBrian(), new TeacherChris(),
				new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeCop(), false),
				new Student(dbm.getName(nameGen.nextInt(25)), new CostumeSnake(), false));
		dbm.closeDataBase();
		System.out.println(" ____");
		for (int x = 0; x < 4; x++)
		{
			System.out.print("|");
			for (int y = 0; y < 4; y++)
			{

				if (f1.getFloor()[x][y].getType().equals("teacher"))
				{
					System.out.print(" ");
				} else if (f1.getFloor()[x][y].getType().equals("student"))
				{
					System.out.print(" ");
				} else if (f1.getFloor()[x][y].getType().equals("loot"))
				{
					System.out.print(" ");
				} else if (f1.getFloor()[x][y].getType().equals("blank"))
				{
					System.out.print(" ");
				} else
					System.out.print("Error");
			}
			System.out.print("|");

			System.out.println();

		}
		System.out.println(" ____");

		int bosses = 2;
		int row = 0;
		int col = 0;
		String input = "";
		Scanner kb2 = new Scanner(System.in);

		while (!gameOver)
		{

			while (!nextFloor)
			{

				// System.out.println(" ____");
				System.out.print("w for up, a for left, s for down, d for right, or press i to use an item or swap weapons");
				if (bosses == 0)
				{	
					if(level ==4)
						System.out.println("or press f to finish the game as a legend");
					else
						System.out.print(" or press u to advance to the next level");
				}
				System.out.println();
				input = kb2.nextLine();
				if (input.equals("w"))
				{
					if (row - 1 >= 0)
					{
						row--;

					}
				}

				if (input.equals("a"))
				{
					if (col - 1 >= 0)
					{
						col--;

					}
				}
				if (input.equals("s"))
				{
					if (row + 1 < 4)
					{
						row++;

					}
				}

				if (input.equals("d"))
				{
					if (col + 1 < 4)
					{
						col++;

					}
				}
				if(input.equals("i"))
				{
					BattleStudent item = new BattleStudent(party.getLeader(),party.getLeader(),party);
					item.useItem();
				}
				if (input.equals("u") && bosses < 1)
				{
					nextFloor = true;
				}
				if(input.equals("f") && bosses ==0 && level ==4)
					nextFloor = true;
					
				// System.out.println("Row: " + row + " Col: " +col);
				System.out.println("You have stepped on a " + f1.getFloor()[row][col].getType() + " tile");
				if (f1.getFloor()[row][col].getVisibility() == false)
				{
					if (f1.getFloor()[row][col].getType().equals("teacher"))
					{
						
						BattleBoss battle = new BattleBoss(party.getLeader(), f1.getTeacherTile(row, col).getTeacher(), party);
						battle.beginBattle();
						/*Weapon w = new Weapon();
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
						//System.out.println(w.toString());
						System.out.println(w.toString());
						String choice = kb.nextLine();
						if (choice.equalsIgnoreCase("y"))
						{
							System.out.println("Where would you like to put the weapon?");
							System.out.println("1. Equip it to my character");
							System.out.println("2. Put it in my bag of weapons");
							String str = kb.nextLine();
							if (str.equalsIgnoreCase("1"))
							{
								party.getLeader().setWeapon(w);
							} else if (str.equalsIgnoreCase("2"))
								party.getBackpack().addWeapon(w);
							else
								party.getBackpack().addWeapon(w);
						}
						;
						System.out.println("You have recieved a(n) " + item.getName() + " which will boost your "
								+ item.getEffects() + " and it has been put in your bag of items");
						party.getBackpack().addPotion(item);
						*/
						if (bosses == 1)
						{
							if(level ==4)
							{
								//System.out.println("You have traversed all floors and have won the game!");
								//System.exit(-1);
							}
							if(level !=4)
								System.out.println("You have beaten all bosses on this floor, you now have to option to move up to the next level by pressing 'u' instead of a direction");
							else
								System.out.println("You have beaten all bosses on this floor, you now have to option to end the game by pressing 'f instead of a direction");
						}
						bosses--;

					} else if (f1.getFloor()[row][col].getType().equals("student"))
					{
						BattleStudent battle = new BattleStudent(party.getLeader(), f1.getEnemyTile(row, col).getStudent(), party);
						battle.beginBattle();
						//Weapon w = new Weapon();
						/*System.out.println(f1.getLootTile(row, col).getWeapon().toString());
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
						//System.out.println(w.toString());
						String choice = kb.nextLine();
						if (choice.equalsIgnoreCase("y"))
						{
							System.out.println("Where would you like to put the weapon?");
							System.out.println("1. Equip it to my character");
							System.out.println("2. Put it in my bag of weapons");
							String str = kb.nextLine();
							if (str.equalsIgnoreCase("1"))
							{
								party.getLeader().setWeapon(f1.getLootTile(row, col).getWeapon());
							} else if (str.equalsIgnoreCase("2"))
								party.getBackpack().addWeapon(f1.getLootTile(row, col).getWeapon());
							else
								party.getBackpack().addWeapon(f1.getLootTile(row, col).getWeapon());
						}
						Potion item = f1.getLootTile(row, col).getItem();
						System.out.println("You have recieved a(n) " + item.getName() + " which will boost your "
								+ item.getEffects() + " and it has been put in your bag of items");
						*///party.getBackpack().addPotion(item);
					}
					

					else if ((f1.getFloor()[row][col].getType().equals("loot")))
					{
						//Weapon w = new Weapon();
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
						System.out.println(f1.getLootTile(row, col).getWeapon().toString());
						String choice = kb.nextLine();
						if (choice.equalsIgnoreCase("y"))
						{
							System.out.println("Where would you like to put the weapon?");
							System.out.println("1. Equip it to my character");
							System.out.println("2. Put it in my bag of weapons");
							String str = kb.nextLine();
							if (str.equalsIgnoreCase("1"))
							{
								party.getLeader().setWeapon(f1.getLootTile(row, col).getWeapon());
							} else if (str.equalsIgnoreCase("2"))
								party.getBackpack().addWeapon(f1.getLootTile(row, col).getWeapon());
							else
								party.getBackpack().addWeapon(f1.getLootTile(row, col).getWeapon());
						}
						//Potion item = f1.getLootTile(row, col).getItem();
						System.out.println("You have recieved a(n) " + f1.getLootTile(row, col).getItem().getName() + " which will boost your "
								+ f1.getLootTile(row, col).getItem().getEffects() + " and it has been put in your bag of items");
						party.getBackpack().addPotion(f1.getLootTile(row, col).getItem());
					}
					else
					{
						System.out.println("Stepping on a blank tile has healed everyone in your party bt 15 HP");
						party.blankRegen();
					}
					f1.getFloor()[row][col].setVisibility(true);
				}

				System.out.println(" ____");
				for (int x = 0; x < 4; x++)
				{
					System.out.print("|");
					for (int y = 0; y < 4; y++)
					{

						if (f1.getFloor()[x][y].getType().equals("teacher"))
						{

							if (row == x && col == y)
							{
								f1.getFloor()[x][y].setVisibility(true);
								System.out.print("X");
								// bosses--;
							} else if (f1.getFloor()[x][y].getVisibility())
								System.out.print("T");
							else
								System.out.print(" ");

						} else if (f1.getFloor()[x][y].getType().equals("student"))
						{

							if (row == x && col == y)
							{

								System.out.print("X");
							}

							else if (f1.getFloor()[x][y].getVisibility())
								System.out.print("S");
							else
								System.out.print(" ");

						} else if (f1.getFloor()[x][y].getType().equals("loot"))
						{
							if (row == x && col == y)
							{

								f1.getFloor()[x][y].setVisibility(true);
								System.out.print("X");

							} else if (f1.getFloor()[x][y].getVisibility())
								System.out.print("L");
							else
								System.out.print(" ");

						} else if (f1.getFloor()[x][y].getType().equals("blank"))
						{
							if (row == x && col == y)
							{
								f1.getFloor()[x][y].setVisibility(true);
								System.out.print("X");
							} else if (f1.getFloor()[x][y].getVisibility())
								System.out.print("B");
							else
								System.out.print(" ");

						} else
							System.out.print("Error");
					}
					System.out.print("|");

					System.out.println();

				}

			} // end one floor
			
			if(demo && level ==1)
			{
				System.out.println("Congrats on finishing the first floor, here is a surpise APE battle to see if you're competent.");
				//int tries = 3;
				BattleBoss ape = new BattleBoss(party.getLeader(),new TeacherApe(), party);
				ape.beginBattle();
				System.out.println("You have completed floor 1 and the APE, since this is a demo we will move to floor 4");
				level =3;
				
			}
			if (level == 1 &&!demo)
			{
				dbm = new DataBaseManager();
				System.out.println("Congrats on finishing the first floor, here is a surpise APE battle to see if you're competent.");
				int tries = 3;
				BattleBoss ape = new BattleBoss(party.getLeader(),new TeacherApe(), party);
				ape.beginBattle();
				System.out.println("You have completed floor 1 and the ape, and will now move on to level 2");
				f1 = new Floor(new TeacherTony(), new TeacherKosuke(),
						new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false),
						new Student(dbm.getName(nameGen.nextInt(25)), new CostumePie(), false), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false));
				dbm.closeDataBase();
				
			} else if (level == 2)
			{
				dbm = new DataBaseManager();
				System.out.println("You have completed floor 2, and will now move on to level 3");
				f1 = new Floor(new TeacherBojian(), new TeacherPaul(), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false),
						new Student(dbm.getName(nameGen.nextInt(25)), new CostumePie(), false), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false));
				dbm.closeDataBase();
				
			} else if (level == 3)
			{
				dbm = new DataBaseManager();
				if(!demo)
					System.out.println("You have completed floor 3, and will now move on to level 4");
				f1 = new Floor(new TeacherTom(), new TeacherStu(), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false),
						new Student(dbm.getName(nameGen.nextInt(25)), new CostumePie(), false), new Student(dbm.getName(nameGen.nextInt(25)), new CostumeRobot(), false));
				dbm.closeDataBase();
			} 
			else
			{
				// call final battle with the ladies
				System.out.println("You have traversed all 4 floors of the building and have come out triumphant, slayer of teachers and King of Nerds, you start to make your way towards the");
				System.out.println("exit, when you get hit in the back with a chair, by the Chair, Carol Taylor");
				System.out.println("Carol: You dare try to leave this building without testing your might against a real challenge?");
				
				BattleBoss battle = new BattleBoss(party.getLeader(),new TeacherCarol(),party);
				battle.beginBattle();
				System.out.println("You have beaten the game, congrats!");
				gameOver = true;
			}

			row = 0;
			col = 0;
			bosses = 2;
			level++;
			nextFloor = false;

		} // end game
		
		

	}
	
	public void finalFight()
	{
		
	}

}

