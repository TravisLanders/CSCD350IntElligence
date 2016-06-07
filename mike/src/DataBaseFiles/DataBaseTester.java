package DataBaseFiles;

public class DataBaseTester
{

	public static void main(String[] args)
	{
		DataBaseManager mng = new DataBaseManager();
		String temp = mng.getAdj(397);

		System.out.println(temp);
		mng.closeDataBase();

	}

}