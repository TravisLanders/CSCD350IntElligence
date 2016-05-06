package Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weapon 
{
		private double attack;
		private String name;
		
		public Weapon() throws FileNotFoundException
		{
			 	ArrayList<String> nouns = new ArrayList<String>();
			    ArrayList<String> adjs = new ArrayList<String>();
			    Scanner nfin = new Scanner(new File("nouns.txt"));
			    Scanner afin = new Scanner(new File("adj.txt"));
			    Random nRand = new Random(4308);
			    Random aRand = new Random(398);
			    Random rRand = new Random(100);
			    String name;
			    while(nfin.hasNext())
			    {
			         nouns.add(nfin.nextLine());
			    }
			    while(afin.hasNext())
			    {
			         adjs.add(afin.nextLine());
			    }
			    
			    int noun = nRand.nextInt(4308);
		         if(noun<0)
		            noun = noun*-1;
		            
		         int adj = aRand.nextInt(397);
		         if(adj<0)
		            adj = adj*-1;;
		         int rarity = rRand.nextInt(100)+1;
		         
		         if(rarity>75 && rarity<90)
		            name =("The Epic "+adjs.get(adj)+ "-" + nouns.get(noun));
		         else if(rarity>90)
		            name =("The Legendary "+adjs.get(adj)+ "-" + nouns.get(noun));
		         else   
		            name =("The "+adjs.get(adj)+ "-" + nouns.get(noun));
		         this.name = name;
		         this.attack =10;

		}
		
		
		

}
