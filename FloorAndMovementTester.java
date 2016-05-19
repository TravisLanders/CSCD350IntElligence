package Final;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FloorAndMovementTester {

	public static void main(String[] args)throws Exception
	{
		Student travis = new Student("Travis",new CostumeWizard(),null,null,true);
		Student michael = new Student("Michael",new CostumePie(),null,null,true);
		boolean over = false;
	    
		
	   Floor f1 = new Floor(new TeacherStu(),new TeacherPaul(),new Student(null,null,null,null,false),new Student(null,null,null,null,false),new Student(null,null,null,null,false));
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
	   
	   
	   Student trav = new Student("Travis",new CostumePie(),null,null,true);
	   System.out.println(trav.getWeapon().getName());
	   Teacher stu = new TeacherStu();
	   Teacher brian = new TeacherBrian();
	   Teacher xu = new TeacherXu();
	   int bosses =2;
	   int row = 0;
	   int col = 0;
	   String input ="";
	   Scanner kb = new Scanner(System.in);
	   while(bosses!=0)
	   {
		   
		   
		   //System.out.println(" ____");
		   System.out.println("w for up, a for left, s for down, d for right");
		   input = kb.nextLine();
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
	    
		
		
//		while(!over)
//		{
//			System.out.println(travis.getName() + " is attacking "+michael.getName());
//			double damage = travis.getAttack() -(travis.getAttack()*michael.getDefence());
//			michael.setCurrentHP(michael.getCurrentHP()-damage);
//				if(michael.getCurrentHP()<=0)
//				{
//					System.out.println(travis.getName( )+ " has defeated "+ michael.getName());
//					return;
//				}
//				else
//				{
//					System.out.println(travis.getName() + " did " + damage + " damage to " + michael.getName() + " his health is now at" + michael.getCurrentHP());
//				}
//			
//				System.out.println(michael.getName() + " is attacking "+travis.getName());
//				double damage2 = michael.getAttack() -(michael.getAttack()*travis.getDefence());
//				travis.setCurrentHP(travis.getCurrentHP()-damage2);
//					if(travis.getCurrentHP()<=0)
//					{
//						System.out.println(michael.getName( )+ " has defeated "+ travis.getName());
//						return;
//					}
//					else
//					{
//						System.out.println(michael.getName() + " did" + damage + " damage to " + travis.getName() + "his health is now at" + travis.getCurrentHP());
//					}
//			
//			
//			
//		}
		
		
		
		
		

	}

}
