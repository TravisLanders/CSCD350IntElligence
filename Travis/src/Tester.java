

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
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
		Party party = new Party(player);
		//ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		//ArrayList<A_Item> items = new ArrayList<A_Item>();
		System.out.println("You are " + name + " wearing a " + costume.toString() + " costume.");
		System.out.println("Your starting weapon is: " + player.getWeapon().toString());
		System.out.println("The game will now begin");
		boolean gameOver = false;
		int level = 1;
		boolean nextFloor = false;
		//Backpack bp = new Backpack();

		boolean over = false;

		Floor f1 = new Floor(new TeacherBrian(), new TeacherChris(),
				new Student(" Elizabeth", new CostumeRobot(), false), new Student("Michael ", new CostumeCop(), false),
				new Student("Homero", new CostumeSnake(), false));
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
				System.out.print("w for up, a for left, s for down, d for right");
				if (bosses == 0)
					System.out.print(" or press u to advance to the next level");
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
				if (input.equals("u") && bosses < 1)
				{
					nextFloor = true;
				}
				// System.out.println("Row: " + row + " Col: " +col);
				System.out.println("You have stepped on a " + f1.getFloor()[row][col].getType() + " tile");
				if (f1.getFloor()[row][col].getVisibility() == false)
				{
					if (f1.getFloor()[row][col].getType().equals("teacher"))
					{
						
						BattleBoss battle = new BattleBoss(party.getLeader(), f1.getTeacherTile(row, col).getTeacher(), party);
						battle.beginBattle();
						Weapon w = new Weapon();
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
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
						Potion item = Potion.getRandomPotion();
						System.out.println("You have recieved a(n) " + item.getName() + " which will boost your "
								+ item.getEffects() + " and it has been put in your bag of items");
						party.getBackpack().addPotion(item);
						if (bosses == 1)
						{
							System.out.println(
									"You have beaten all bosses on this floor, you now have to option to move up to the next level by pressing 'u' instead of a direction");
						}
						bosses--;

					} else if (f1.getFloor()[row][col].getType().equals("student"))
					{
						BattleStudent battle = new BattleStudent(party.getLeader(), f1.getEnemyTile(row, col).getStudent(), party);
						battle.beginBattle();
						Weapon w = new Weapon();
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
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
						Potion item = Potion.getRandomPotion();
						System.out.println("You have recieved a(n) " + item.getName() + " which will boost your "
								+ item.getEffects() + " and it has been put in your bag of items");
						party.getBackpack().addPotion(item);
					}

					else if ((f1.getFloor()[row][col].getType().equals("loot")))
					{
						Weapon w = new Weapon();
						System.out.println("You have found a new weapon would you like to keep this weapon? Y/N");
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
						Potion item = Potion.getRandomPotion();
						System.out.println("You have recieved a(n) " + item.getName() + " which will boost your "
								+ item.getEffects() + " and it has been put in your bag of items");
						party.getBackpack().addPotion(item);
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
			if (level == 1)
			{
				System.out.println("You have completed floor 1, and will now move on to level 2");
				f1 = new Floor(new TeacherTony(), new TeacherKosuke(),
						new Student("Alistar", new CostumeRobot(), false),
						new Student("Bryce", new CostumePie(), false), new Student("Tim", new CostumeRobot(), false));
			} else if (level == 2)
			{
				System.out.println("You have completed floor 1, and will now move on to level 3");
				f1 = new Floor(new TeacherBojian(), new TeacherPaul(), new Student("Sarah", new CostumeRobot(), false),
						new Student("Kyle", new CostumePie(), false), new Student("Alex", new CostumeRobot(), false));
			} else if (level == 3)
			{
				System.out.println("You have completed floor 1, and will now move on to level 4");
				f1 = new Floor(new TeacherTom(), new TeacherStu(), new Student("Alistar", new CostumeRobot(), false),
						new Student("Bryce", new CostumePie(), false), new Student("Tim", new CostumeRobot(), false));
			} else
			{
				// call final battle with the ladies
			}

			row = 0;
			col = 0;
			bosses = 2;
			level++;
			nextFloor = false;

		} // end game

	}

}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
