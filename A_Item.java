package Final;

import java.util.Random;

public abstract class A_Item 
{

			private String name;
			private String affects;
			
			
			
			public abstract String getName();
			public abstract String getAffects();
			
			public static A_Item getRandomItem()
			{
			Random rand = new Random();
			int num = rand.nextInt(5);
			if(num ==0)
			{
				return new PermanentBuffArmor();
			}
			else if(num ==1)
			{
				return new PermanentBuffProteinShake();
			}
			
			else if(num ==2)
			{
				return new PermanentBuffWaterBottle();
			}
			
			else if(num ==3)
			{
				return new PotionBeer();
			}
			
			else if(num ==4)
			{
				return new PotionMountainDew();
			}
			
			else if(num ==5)
			{
				return new PotionTopRamen();
			}
			else
				return new PotionTopRamen();
			}
			
}
