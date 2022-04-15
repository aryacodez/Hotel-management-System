package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class table3 {
    public static void main(String[] args){
        Connection con =null;
        Statement st=null  ;
        try{
            con = connection.getCon();
            st = con.createStatement();
            //Manage Inventory Details
            st.executeUpdate("CREATE TABLE inventory(item_code number(5)primary key,item_name varchar2(300),quantity number,availability varchar2(200))");

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
