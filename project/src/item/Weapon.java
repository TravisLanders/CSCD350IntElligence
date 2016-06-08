package item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import DataBaseFiles.*;
import DataBaseFiles.*
;public class Weapon // extends A_Item
{
	private double attack;
	private String name;
	private String effects;

	public Weapon() throws FileNotFoundException
	{
		
		
		
		
		
		this.effects = "health";
		
		/*ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> adjs = new ArrayList<String>();
		Scanner nfin = new Scanner(new File("nouns.txt"));
		Scanner afin = new Scanner(new File("adj.txt"));
		Random nRand = new Random();
		Random aRand = new Random();
		Random rRand = new Random();
		String name;
		while (nfin.hasNext())
		{
			nouns.add(nfin.nextLine());
		}
		while (afin.hasNext())
		{
			adjs.add(afin.nextLine());
		}

		int noun = nRand.nextInt(4307);
		if (noun < 0)
		{
			noun = noun * -1;			
		}

		int adj = aRand.nextInt(397);
		if (adj < 0)
		{
			adj = adj * -1;
		}*/
		DataBaseManager dbm = new DataBaseManager();
		Random nRand = new Random();
		Random aRand = new Random();
		Random rRand = new Random();
		int noun = nRand.nextInt(4307);
		int adj = aRand.nextInt(397);
		
		int rarity = rRand.nextInt(100) + 1;
		double rare = 1.0;
		double ad = rRand.nextInt(40)+10;
		if (rarity > 75 && rarity < 90)
		{
			name = ("The Epic " + dbm.getAdj(adj) + "-" + dbm.getNoun(noun));
			rare = 1.25;
		} 
		
		else if (rarity > 90)
		{
			name = ("The Legendary " + dbm.getAdj(adj) + "-" + dbm.getNoun(noun));
			rare = 1.5;
		} 
		
		else
		{
			name = ("The " + dbm.getAdj(adj) + "-" + dbm.getNoun(noun));
		}
		this.name = name;
		this.attack = ad * rare;
		dbm.closeDataBase();
	}

	public String getName()
	{
		return this.name;
	}

	public double getAttack()
	{
		return this.attack;
	}
	public void setAttack(double attack)
	{
		this.attack = attack;
	}

	public String getEffects()
	{
		return name + " with " + this.attack;
	}

	public void setEffects(String effects)
	{
		this.effects = effects;
	}
	
	public String toString()
	{
		return this.getName() + " with "+ this.getAttack() + " attack";
	}

}
