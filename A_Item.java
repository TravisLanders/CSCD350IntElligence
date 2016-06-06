package Final;

import java.util.Random;

public abstract class A_Item 
{

			private String name;
			private String effects;
			
			
			
			public String getName(){return this.name;}
			public String getEffects(){return this.effects;}
			
			public A_Item(String nameIn, String effectsIn)
			{
				this.name = nameIn;
				this.effects = effectsIn;
			}
			
			public static A_Item getRandomItem()
			{
			Random rand = new Random();
			int num = rand.nextInt(2);
			
			
		    if(num ==0)
			{
				return new PotionBeer();
			}
			
			else if(num ==1)
			{
				return new PotionMountainDew();
			}
			
			else if(num ==3)
			{
				return new PotionTopRamen();
			}
			return null;
			}
			
			
}
