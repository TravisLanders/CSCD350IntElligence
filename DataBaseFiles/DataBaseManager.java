package DataBaseFiles;

import java.sql.*;


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
    		
    		
    		dataBase.close();
    	} 
    	catch ( Exception e ) 
    	{
    		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    		System.exit(0);
    	}
    	
    }
    
    
} 


	
	
	
	
	

