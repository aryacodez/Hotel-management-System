
package project;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class IUD {
    public static void setData(String Query,String Message){
        Connection con = null;
        Statement st = null;
        try{
            con = connection.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            if(!Message.equals(""))
                JOptionPane.showMessageDialog(null, Message);
        }        
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
        }
        catch(Exception e){
            
        }
    }
}
}
