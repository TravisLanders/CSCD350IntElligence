package character;

import java.util.ArrayList;
import java.util.Scanner;
import item.*;

public class Party
{
	private ArrayList<Student> party = new ArrayList<Student>();
	private Student leader;
	Backpack backpack = new Backpack();
	
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
			return swap();
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
	
	public Backpack getBackpack()
	{
		return this.backpack;
	}
	
	public void setBackpack(Backpack backpackIn)
	{
		this.backpack = backpackIn;
	}
	
	public Student getStudent(String name)
	{
		for(Student student : party)
		{
			if(student.getName().equals(name))
			{
				return student;
			}
		}
		return party.get(0);
	}
	
	public Student getLeader()
	{
		for(Student student: party)
		{
			if(student.isLeader())
			{
				return student;
			}
		}
		return party.get(0);
	}
}
