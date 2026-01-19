package JDBC;
import java.sql.*;
public class StatementExampls {
    public static void main(String [] args) throws SQLException {
        String url= "jdbc:mysql://localhost:3306/cts_db";
        String user = "root";
        String pass = "Root@1323";

        try(Connection  con = DriverManager.getConnection(url,user, pass);
        Statement stmt = con.createStatement()){
            String sql = "select id , name, salary from employee";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary")
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
