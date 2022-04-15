package project;
import java.sql.*;
import javax.swing.JOptionPane;
public class table1 {
    public static void main(String[] args){
        Connection con =null;
        Statement st=null  ;
        try{
            con = connection.getCon();
            st = con.createStatement();                      
            //FOR MANAGE ROOM TABLE
            st.executeUpdate("create table manageroom(room_no varchar2(1000),room_type varchar(255),No_of_beds varchar(10),price number,status varchar2(20))");
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
