package DataBaseFiles;

import java.sql.*;
import java.io.*;
import java.util.*;


public class DataBaseManager
{
	
	 Connection dataBase;
    Statement stmt;
    public  DataBaseManager()
    {
    	try 
    	{
    		Class.forName("org.sqlite.JDBC");
    		this.dataBase = DriverManager.getConnection("jdbc:sqlite:DataBase.db");
    		System.out.println("Opened database successfully");
    		
    		
    		
    	} 
    	catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
    	
    }
    
    private void LoadNouns()
    {
      try
      {
         Scanner fin = new Scanner(new File("nouns.txt"));
         String temp = "";
         int index = 0;
         stmt = dataBase.createStatement();
         while(fin.hasNextLine())
         {
            temp = fin.nextLine();
            stmt.executeUpdate("insert into Nouns  values ('" + temp +"', " + index+ ");");
            index++;
         }
            
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
    }
      
       private void LoadAdj()
    {
      try
      {
         Scanner fin = new Scanner(new File("adj.txt"));
         String temp = "";
         int index = 0;
         stmt = dataBase.createStatement();
         while(fin.hasNextLine())
         {
            temp = fin.nextLine();
            stmt.executeUpdate("insert into Adjective  values ('" + temp +"', " + index+ ");");
            index++;
         }
           
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
   
    }
    
    public void closeDataBase()
    {
      try
      {
          this.dataBase.close();
      }
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
    
    }
    
    public String getNoun(int index)
    {
       String noun = "";
       if(index <0 || index > 4306)
       {
         System.out.println(" Index Not within Bounds ");
         return noun;
       }
      try
      {
        
         stmt = dataBase.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM Nouns WHERE Number = " + index + ";");
         noun = rs.getString("Noun");
         
         
           
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
      
      return noun;

    }
    
     public String getAdj(int index)
    {
       String adj = "";
       if(index <0 || index > 397)
       {
         System.out.println(" Index Not within Bounds ");
         return adj;
       }
      try
      {
        
         stmt = dataBase.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM Adjective WHERE Number = " + index + ";");
         adj = rs.getString("Adjective");
         
         
           
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
      
      return adj;

    }

    public String getName(int index)
    {
       String name = "";
       if(index <0 || index > 25)
       {
         System.out.println(" Index Not within Bounds ");
         return name;
       }
      try
      {
        
         stmt = dataBase.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM NameList WHERE Number = " + index + ";");
         name = rs.getString("Name");
         
         
           
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
      
      return name;

    }

    public ArrayList<String> addStudent(ArrayList<String> namesList)
    {
		Random random = new Random();
		int index = random.nextInt(25);
		String name = getName(index);
		
		while(namesList.contains(name))
		{
			index = random.nextInt(25);
			name = getName(index);
		}
		namesList.add(name);
		return namesList;
    }
} 


	
	
	
	
	

