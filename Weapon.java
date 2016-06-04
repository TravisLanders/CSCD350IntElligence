package Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weapon extends A_Item
{
		private double attack;
		private String name;
		private String affects;
		
		
		public Weapon() throws FileNotFoundException
		{
			 	this.affects = "health";
				ArrayList<String> nouns = new ArrayList<String>();
			    ArrayList<String> adjs = new ArrayList<String>();
			    Scanner nfin = new Scanner(new File("nouns.txt"));
			    Scanner afin = new Scanner(new File("adj.txt"));
			    Random nRand = new Random();
			    Random aRand = new Random();
			    Random rRand = new Random();
			    String name;
			    while(nfin.hasNext())
			    {
			         nouns.add(nfin.nextLine());
			    }
			    while(afin.hasNext())
			    {
			         adjs.add(afin.nextLine());
			    }
			    double rare;
			    
			    int noun = nRand.nextInt(4308);
		         if(noun<0)
		            noun = noun*-1;
		            
		         int adj = aRand.nextInt(397);
		         if(adj<0)
		            adj = adj*-1;;
		         int rarity = rRand.nextInt(100)+1;
		         
		         if(rarity>75 && rarity<90)
		         {
		        	 rare = 1.25;
		            name =("The Epic "+adjs.get(adj)+ "-" + nouns.get(noun));
		         }
		         else if(rarity>90)
		         {
		            name =("The Legendary "+adjs.get(adj)+ "-" + nouns.get(noun));
		            rare = 1.5;
		         }
		         
		         else   
		         {
		            name =("The "+adjs.get(adj)+ "-" + nouns.get(noun));
		            rare = 1.0;
		         }
		         this.name = name;
		         this.attack =20*rare;
		         

		}
		
		public String getName(){return this.name;}
		public double getAttack(){return this.attack;}

		@Override
		public String getAffects() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setAffects(String affects) {
			this.affects = affects;
		}
		
		public String toString()
		{
			
			return this.getName() + " with " + this.getAttack()+ " attack";
		}
		
		
		

}
