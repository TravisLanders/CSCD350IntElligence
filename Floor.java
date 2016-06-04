package Final;

import java.io.FileNotFoundException;
import java.util.Random;

public class Floor 
{

		private A_Tile[][] floor;
		private Random rand;
		private int level =0;
		
		public A_Tile[][] getFloor(){return this.floor;}
		
		
		public Floor(Teacher t1,Teacher t2,Student s1,Student s2,Student s3) throws FileNotFoundException
		{
			this.level= this.getLevel() +1;
			this.floor = new A_Tile[4][4];
			this.rand = new Random();
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
						if(x==0 && y==0)
						{
							floor[x][y] = new BlankTile();
						}
						
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
								floor [x][y] = new EnemyTile(s1);
							else if(students == 2)
								floor [x][y] = new EnemyTile(s2);
							else
								floor [x][y] = new EnemyTile(s3);
							students--;
							placed = true;
						}
						else if(num ==2 && loot>0)
						{
							floor[x][y]= new LootTile();
							loot--;
							placed = true;
						}
						else
						{
							floor[x][y] = new BlankTile();
							placed = true;
						}
						
					
					}
					placed = false;
				}
			}
			
		}


		public int getLevel() {
			return level;
		}
		public EnemyTile getEnemyTile(int row, int col)
		{
			return (EnemyTile) floor[row][col];
		
		}
		
		public BossTile getTeacherTile(int row, int col)
		{
			return (BossTile) floor[row][col];
		}
		
		public LootTile getLootTile(int row, int col)
		{
			return (LootTile) floor[row][col];
		}


		
}
