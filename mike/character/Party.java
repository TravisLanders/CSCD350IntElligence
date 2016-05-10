package character;

import java.util.ArrayList;
import java.util.Scanner;

public class Party
{
	private ArrayList<A_Character> party = new ArrayList<A_Character>();
	private Student leader;
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
			party.add(newStudent);
			System.out.println(newStudent.getName() + " has been added to the party!");
			System.out.println("Party size is now" + party.size());
		}
		
		else
		{
			System.out.println("There are too many people in your party!");
		}
	}
	
	public A_Character swap()
	{
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println(party.get(i).getName() + " has a current HP of " + party.get(i).getCurrentHP());
		}
		
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println("Press " + (i + 1) + " to enter " + party.get(i).getName() + " into battle");
		}
		
		try
		{
			int num = scanner.nextInt();
			System.out.println(num);
			if(num > party.size() || num < 1)
			{
				System.out.println("Invalid input. Try again");
				num = -1;
				//scanner.close();
				return swap();
			}
			//scanner.close();
			return party.get(num - 1);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid input. Try again");
			scanner.close();
			//return swap();
			return null;
		}		
	}
	
	protected A_Character swapStudent(String str)
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
}
