package project;
import java.sql.*;
import javax.swing.JOptionPane;
public class table2 {
    public static void main(String[] args){
        Connection con =null;
        Statement st=null  ;
        try{
            con = connection.getCon();
            st = con.createStatement();
            //Manage Customer Details
            st.executeUpdate("CREATE TABLE CUSTDETAIL(GET_ID NUMBER(5) ,name VARCHAR2(255),mobile NUMBER(20),country VARCHAR2(255),email VARCHAR2(255),gender VARCHAR2(255),proof VARCHAR2(255),id_no VARCHAR2(300),address VARCHAR2(255),Total_Member NUMBER(10),DOD VARCHAR2(200),bed NUMBER(10),room_type VARCHAR2(255),room_no NUMBER(5),payment VARCHAR2(15),tariff NUMBER(10,2),Total_Days NUMBER(10),Total_Amt NUMBER(12,2),checkout VARCHAR2(255))");      

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
