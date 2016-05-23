import java.util.*;
import java.io.*;
//import com.mysql.jdbc.Connection;
import java.sql.*;

public class Read extends Thread
 {

     public void run()
      {  
         DatabaseCon dbc= DatabaseCon.getInstance();
	     Connection cn1=dbc.getConnection();
	     
         while(true)
          { 
            Statement stmt = null;
            
            try 
              {

                stmt = cn1.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM mydata");
                if(rs.next())
                   System.out.println(rs.getInt(1));
                Thread.sleep(30000); //every 30 seconds
               }
            catch (Exception e)  
               {
		    e.printStackTrace();
                    System.out.println("something wrng happened");
               }
           
          } 
  
               
     }

 }

