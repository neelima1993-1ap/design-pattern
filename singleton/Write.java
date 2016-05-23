import java.util.*;
import java.io.*;
//import com.mysql.jdbc.Connection;
import java.sql.*;

public class Write extends Thread
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
                 String sql="INSERT INTO mydata VALUES('DENNIS')";
                 stmt.execute(sql);
                 Thread.sleep(60000);
		
               }
            catch (Exception e) 
               {
                    System.out.println("something wrng happened");
                    e.printStackTrace();
               }
             
          } 
  
               
     }

 }

