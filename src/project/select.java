package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class select {
    public static ResultSet getData(String query)
    {
        Connection con = null;
        Statement st =null;
        ResultSet r =null;
        try
        {
            con = connection.getCon();
            st = con.createStatement();
            r = st.executeQuery(query);
            return r;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }        
    }
}
