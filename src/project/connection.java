package project;
import java.sql.*;
public class connection {
   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
   static final String USER = "ORACLE";
   static final String PASS = "12345";
   public static Connection getCon(){          
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Connecting to database...");
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            return con;                    
        }
        catch(Exception e){
            return null;
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

