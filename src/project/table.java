package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class table {
    public static void main(String[] args){
        Connection con =null;
        Statement st=null  ;
        try{
            con = connection.getCon();
            st = con.createStatement();
            st.executeUpdate("create table register(name varchar2(500),email varchar2(500),dob varchar2(500),password varchar2(600),security varchar2(600),answer varchar2(600),final varchar2(400))");        
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
            st.close();
            con.close();
        }
        catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(st!=null)
            st.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(con!=null)
            con.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
    }
    
}
