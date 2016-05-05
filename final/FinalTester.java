package Final;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FinalTester {

	public static void main(String[] args)throws Exception
	{
		Student travis = new Student("Travis",new CostumeWizard(),null,null,true);
		Student michael = new Student("Michael",new CostumePie(),null,null,true);
		boolean over = false;
		
	   Floor f1 = new Floor(new Teacher(null,null,null,null),new Teacher(null,null,null,null),new Student(null,null,null,null,false),new Student(null,null,null,null,false),new Student(null,null,null,null,false));
	   for(int x =0;x<4;x++)
	   {
		   for(int y = 0;y<4;y++)
		   {
			   if(f1.getFloor()[x][y].getType().equals("teacher"))
			   {
				   System.out.print("T");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("student"))
			   {
				   System.out.print("S");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("loot"))
			   {
				   System.out.print("L");
			   }
			   else if(f1.getFloor()[x][y].getType().equals("blank"))
			   {
				   System.out.print("B");
			   }
			   else
				   System.out.print("Error");
		   }
		   System.out.println();
	   }
	    
		
		
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
