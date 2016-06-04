package Final;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FloorAndMovementTester {

	public static void main(String[] args)throws Exception
	{
		
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Halloween Adventure in the CEB, where you will navigate through the different floors of the building in your halloween costume and battle ");
		System.out.println("fellow students and vaculty.  First, enter the name of your character:");
		String name = kb.nextLine();
		System.out.println();
		A_Costume costume = A_Costume.selectCostume();
		Student player = new Student(name,costume,true);
		Party party = new Party(player);
		
		
		
		
		Student travis = new Student("Travis",new CostumeWizard(),true);
		Student michael = new Student("Michael",new CostumePie(),true);
		boolean over = false;
	    
		
	   Floor f1 = new Floor(new TeacherStu(),new TeacherPaul(),new Student(" ",new CostumeRobot(),false),new Student(" ",new CostumeCop(),false),new Student(" ",new CostumeSnake(),false));
	   System.out.println(" ____");
	   for(int x =0;x<4;x++)
	   {
		   System.out.print("|");
		   for(int y = 0;y<4;y++)
		   {
			   
			   if(f1.getFloor()[x][y].getType().equals("teacher"))
			   {
				   System.out.print(" ");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("student"))
			   {
				   System.out.print(" ");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("loot"))
			   {
				   System.out.print(" ");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("blank"))
			   {
				   System.out.print(" ");
			   }
			   else
				   System.out.print("Error");
		   }
		   System.out.print("|");
		   
			  System.out.println();
		   
	   }
	   System.out.println(" ____");
	   
	   
	   Student trav = new Student("Travis",new CostumePie(),true);
	   System.out.println(trav.getWeapon().getName());
	   Teacher stu = new TeacherStu();
	   Teacher brian = new TeacherBrian();
	   Teacher xu = new TeacherXu();
	   int bosses =2;
	   int row = 0;
	   int col = 0;
	   String input ="";
	   Scanner kb2 = new Scanner(System.in);
	   while(bosses!=0)
	   {
		   
		   
		   //System.out.println(" ____");
		   System.out.println("w for up, a for left, s for down, d for right");
		   input = kb2.nextLine();
		   if(input.equals("w"))
		   {
			   if(row-1>=0)
			   {
				   row--;
				   
			   }
		   }
		   
		   if(input.equals("a"))
		   {
			   if(col-1>=0)
			   {
				   col--;
				   
			   }
		   }
		   if(input.equals("s"))
		   {
			   if(row+1<4)
			   {
				   row++;
				   
			   }
		   }
		   
		   if(input.equals("d"))
		   {
			   if(col+1<4)
			   {
				   col++;
				   
			   }
		   }
		  // System.out.println("Row: " + row + " Col: " +col);
		   System.out.println("This is a " + f1.getFloor()[row][col].getType() + " tile");
		   
		   System.out.println(" ____");
		   for(int x =0;x<4;x++)
		   {
			   System.out.print("|");
			   for(int y = 0;y<4;y++)
			   {
				   
				   if(f1.getFloor()[x][y].getType().equals("teacher"))
				   {
					   
					   if(row == x && col ==y)
					   {
						   f1.getFloor()[x][y].setVisibility(true);
						   System.out.print("X");
						   //bosses--;
					   }
					   else if(f1.getFloor()[x][y].getVisibility())
						   System.out.print("T");
					   else
						   System.out.print(" ");
					   
				   }
				   else if(f1.getFloor()[x][y].getType().equals("student"))
				   {
					   
					  
					   if(row == x && col ==y)
					   {
						   if(f1.getFloor()[x][y].getVisibility()==false)
						   {
							   Battle battle = new Battle(party.getLeader(),f1.getEnemyTile(row, col).getStudent(), party);
							   battle.beginBattle();
						   }
						   f1.getFloor()[x][y].setVisibility(true);
						   System.out.print("X");
					   }
					   
					   else if(f1.getFloor()[x][y].getVisibility())
						   System.out.print("S");
					   else
						   System.out.print(" ");
					   
				   }
				   else if(f1.getFloor()[x][y].getType().equals("loot"))
				   {
					   if(row == x && col ==y)
					   {
						   if(f1.getFloor()[x][y].getVisibility()==false)
							   
						   f1.getFloor()[x][y].setVisibility(true);
						   System.out.print("X");
						   
					   }
					   else if(f1.getFloor()[x][y].getVisibility())
						   System.out.print("L");
					   else
						   System.out.print(" ");
					   
				   }
				   else if(f1.getFloor()[x][y].getType().equals("blank"))
				   {
					   if(row == x && col ==y)
					   {
						   f1.getFloor()[x][y].setVisibility(true);
						   System.out.print("X");
					   }
					   else if(f1.getFloor()[x][y].getVisibility())
						   System.out.print("B");
					   else
						   System.out.print(" ");
					   
				   }
				   else
					   System.out.print("Error");
			   }
			   System.out.print("|");
			   
				  System.out.println();
			   
		   }
		   
	   }//
	    
		
		


		
		
		
		
		
	

	
}

}
