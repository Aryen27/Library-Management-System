package dao;
import java.sql.*;
import java.io.*;
import java.util.Properties;

public class DatabaseDAO {
    private static Connection conn;

    public static Connection getConnecion() throws SQLException, IOException, ClassNotFoundException{
        if (conn == null || conn.isClosed()){
            Properties props= new Properties();
            String driver= props.getProperty("db.driver");
            String url= props.getProperty("db.url");
            String username= props.getProperty("username");
            String password= props.getProperty("password");

            Class.forName(driver);
            conn= DriverManager.getConnection(url,username,password);
        }

        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
