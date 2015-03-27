package annotationviewerpg3;

import java.sql.*;

/**
 * This class will be used to create a connection with the database, as soon as we figure out how to make one without the user having to activate
 * external programs. 
 */

public class Java2MySql {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "annotation_viewer_db";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "blaat1234";

        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM organism");
            
            while (res.next()) {
                //int id = res.getInt("id");
                //String msg = res.getString("msg");
                //System.out.println(id + "\t" + msg);
            }
            //int val = st.executeUpdate("INSERT into event VALUES(" + 1 + "," + "'Easy'" + ")");
            //if (val == 1) {
            //    System.out.print("Successfully inserted value");
            //}
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




        
        
    