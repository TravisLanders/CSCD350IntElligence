package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Party
{
	private ArrayList<Student> party = new ArrayList<Student>();
	private Student leader;
	private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	private ArrayList<A_Item> items = new ArrayList<A_Item>();
	public Party(Student player)
	{
		this.leader = player;
		party.add(this.leader);
	}
	
	public void addMember(Student newStudent)
	{
		if(party.size() < 6)
		{
			newStudent.setGoodStudent(true);
			newStudent.setCurrentHP(50.0);
			party.add(newStudent);
			System.out.println(newStudent.getName() + " has been added to the party!");
			System.out.println("Party size is now " + party.size());
		}
		
		else
		{
			System.out.println("There are too many people in your party!");
		}
	}
	
	public Student swap()
	{
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println(party.get(i).getName() + " has a current HP of " + party.get(i).getCurrentHP() +" and is dressed as a " + party.get(i).getCostume().toString());
		}
		
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println("Press " + (i + 1) + " to enter " + party.get(i).getName() + " into battle");
		}
		boolean swapped = false;
		
		
		try
		{
			int num = scanner.nextInt();
			scanner.nextLine();
			System.out.println(num);
			while(num > party.size() || num < 1)
			{
				System.out.println("Invalid input. Try again");
				num = scanner.nextInt();
				scanner.nextLine();
				//scanner.close();
				//return swap();
			}
			//scanner.close();
			return party.get(num - 1);
		}
		
		catch(Exception e)
		{
//			System.out.println(e);
			//System.out.println("Invalid input. Try again");
//			scanner.close();
//			//return swap();
//			return swap();
			
			Student stu = null;
			int stucount=0;
			do
			{
				stu = party.get(stucount);
			}while(stu.getCurrentHP()<=0);
			System.out.println("You suck, so " + party.get(stucount).getName() +" has been selected");
			return stu;
			
		}	
		
		
	}
	
	protected Student swapStudent(String str)
	{
		try
		{
			int num = Integer.parseInt(str);
			if(num > party.size() || num < 1)
			{
				System.out.println("Invalid input. Try again");
				return swap();
			}
			return party.get(num);
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid input. Try again");
			return swap();
		}
	}
	
	public int getSize()
	{
		return this.party.size();
	}
	public Student getLeader()
	{
		return this.leader;
	}
	
	
	
	public boolean removeMember(Student characterIn)
	{
		if(characterIn.isLeader())
		{
			System.out.println("You are almost defeated! Swap somebody in to continue playing!");
			characterIn.setCurrentHP(1);
			return false;
		}
		return this.party.remove(characterIn);
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}

	public ArrayList<A_Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<A_Item> items) {
		this.items = items;
	}
}
