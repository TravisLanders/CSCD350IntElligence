package Final;

import java.util.Random;

public class Floor 
{

		private A_Tile[][] floor;
		private Random rand;
		
		public A_Tile[][] getFloor(){return this.floor;}
		
		
		public Floor(Teacher t1,Teacher t2,Student s1,Student s2,Student s3)
		{
			this.floor = new A_Tile[4][4];
			this.rand = new Random(4);
			int teachers = 2;
			int students = 3;
			int loot = 4;
			boolean placed = false;
			for(int x = 0;x<4;x++)
			{
				for(int y = 0;y<4;y++)
				{
					while(!placed)
					{
						int num = rand.nextInt(4);
						if(num == 0 && teachers>0)
						{
							if(teachers ==2)
								floor[x][y] = new BossTile("teacher",t1);
							else 
								floor[x][y] = new BossTile("teacher",t2);
							teachers--;
							placed = true;
						}
						
						else if(num == 1 && students>0)
						{
							if(students ==3)
								floor [x][y] = new EnemyTile("student",s1);
							else if(students == 2)
								floor [x][y] = new EnemyTile("student",s2);
							else
								floor [x][y] = new EnemyTile("student",s3);
							students--;
							placed = true;
						}
						else if(num ==2 && loot>0)
						{
							floor[x][y]= new LootTile("loot");
							loot--;
							placed = true;
						}
						else
						{
							floor[x][y] = new BlankTile("blank");
							placed = true;
						}
						
					
					}
					placed = false;
				}
			}
			
		}
}
