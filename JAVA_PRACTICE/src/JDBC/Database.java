package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cts_db";
        String username  ="root";
        String password = "Root@1323";
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to MySQl Database succesfully");

        }catch(ClassNotFoundException ce){
            System.out.println("MYSQL JDBC driver not found");
            ce.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(con!= null){
                    con.close();
                    System.out.println("Connection closed");
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
