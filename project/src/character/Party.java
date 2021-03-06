package character;

import java.util.ArrayList;
import java.util.Scanner;
import item.*;

public class Party
{
	private ArrayList<Student> party = new ArrayList<Student>();
	private Student leader;
	private Backpack backpack;

	public Party(Student player)
	{
		this.leader = player;
		backpack = new Backpack();
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
		if(party.size()==1 && party.get(0).getCurrentHP()<=0)
		{
			System.out.println("You have been defeated, GAME OVER!");
			System.exit(-1);
		}
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println(party.get(i).getName() + " has a current HP of " + party.get(i).getCurrentHP() +" and is dressed as a " + party.get(i).getCostume().toString() + " and Weapon:" + party.get(i).getWeapon().toString());
		}
		
		for(int i = 0; i < party.size(); i++)
		{
			System.out.println("Press " + (i + 1) + " to enter " + party.get(i).getName() + " into battle");
		}
		
		try
		{
			int num = scanner.nextInt();
			System.out.println(num);
			
			//scanner.close();
			return party.get(num - 1);
		}
		
		catch(Exception e)
		{
			//System.out.println(e);
			Student stu = null;
			for(int x = 0;x<party.size();x++)
			{
				stu = party.get(x);
				if(stu.getCurrentHP()>=1)
				{
					System.out.println("You suck, so " + stu.getName() + " has been entered to the battle");
					return stu;
				}
			}
			
			scanner.close();
			//return swap();
			System.out.println("You have been defeated, GAME OVER!");
			System.exit(-1);
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
	public Student getStudent(int index)
	{
		if(index >0 && index<=party.size())
			return party.get(index-1);
		return party.get(0);
	}
	public boolean removeMember(Student characterIn)
	{
		if(characterIn.isLeader())
		{
			System.out.println("You are almost defeated! Swap somebody in to continue playing!");
			//characterIn.setCurrentHP(1);
			return false;
		}
		return this.party.remove(characterIn);
	}
	
	public Backpack getBackpack()
	{
		return this.backpack;
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
	
	public void blankRegen(){
		for(int x =0;x<this.getSize();x++)
		{
			party.get(x).setCurrentHP(party.get(x).getCurrentHP()+15);
		}
	}
}
