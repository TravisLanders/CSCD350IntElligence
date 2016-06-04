package DataBaseFiles;

public class DataBaseTester {

	public static void main(String[] args) 
	{
		DataBaseManager mng = new DataBaseManager();
	   String temp = mng.getName(15);
      String temp1 = mng.getAdj(398);
      String temp2 = mng.getAdj(394);
      String temp3 = mng.getNoun(88);
      String temp4 = mng.getNoun(-1);
      
      
      System.out.println(temp  + " the " + temp2 + " " + temp3);
      mng.closeDataBase();

	}

}
