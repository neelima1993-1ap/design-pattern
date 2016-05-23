
import java.util.*;
import java.io.*;
import java.sql.*;

public class DatabaseCon
  {
        private static String url= "jdbc:mysql://localhost:3306/Neelima";
        private static String driver = "com.mysql.jdbc.Driver";
        private static String userName = "root";
        private static String password = "incedo@456";
        public static Connection conn;
        public static DatabaseCon db;
   
        private DatabaseCon()

           {
              
           }

       public Connection getConnection()
	{
		try{		
			Class.forName(driver);
		        this.conn = DriverManager.getConnection(url,userName,password);
		}catch(Exception e){
		e.printStackTrace();
		}
		return conn ;
	}

            
          
        public static synchronized DatabaseCon getInstance() 
         {
           if ( db == null )
               {
                 db = new DatabaseCon();
               }
           return db;
 
        }
         

}

