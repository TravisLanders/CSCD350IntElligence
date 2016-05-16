package DataBaseFiles;

import java.sql.*;
import java.io.*;
import java.util.Scanner;


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
            this.dataBase.close();
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
            this.dataBase.close();
      }
      
      catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
   
    }
} 


	
	
	
	
	

