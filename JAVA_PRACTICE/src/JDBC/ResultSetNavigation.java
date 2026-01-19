package JDBC;

import java.sql.*;

public class ResultSetNavigation {
    public static void main(String[] args) throws Exception {
        String url= "jdbc:mysql://localhost:3306/cts_db";
        String user = "root";
        String pass = "Root@1323";

        Connection con =DriverManager.getConnection(url,user,pass);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("select *from employee");
        rs.first();
        System.out.println("First: " + rs.getString("name"));

        rs.last();
        System.out.println("Last: " + rs.getString("name"));

        rs.absolute(2);
        System.out.println("Second Row: " + rs.getString("name"));

        rs.beforeFirst();
        System.out.println("BeforeFirst: " + rs.getString("name"));

        rs.afterLast();
        System.out.println("After Last: " + rs.getString("name"));



    }
}
