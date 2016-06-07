package DataBaseFiles;
import java.util.*;

public class DataBaseTesterForNames
{
	public static void main(String[] args)
	{
		DataBaseManager mng = new DataBaseManager();
		String temp = mng.getAdj(397);
		ArrayList<String> namesList = new ArrayList<String>();
		System.out.println(temp);
		System.out.println("How many unique names do you want (less than 25, please)?");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String name = "";
		
		
		for(int i = 0; i < count; i++)
		{
			Random random = new Random();
			int index = random.nextInt(25);
			name = mng.getName(index);
			
			while(namesList.contains(name))
			{
				index = random.nextInt(25);
				name = mng.getName(index);
			}
			namesList.add(name);
		}
		
		for(int i = 0; i < namesList.size(); i++)
		{
			System.out.println(namesList.get(i));
		}
		
		mng.closeDataBase();
		scanner.close();
	}

}