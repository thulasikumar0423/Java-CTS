package JDBC;
import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) throws SQLException {
        String url= "jdbc:mysql://localhost:3306/cts_db";
        String user = "root";
        String pass = "Root@1323";
        String sql = "select id, name, salary from employee where salary >?";
        try(Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement ps =con.prepareStatement(sql)) {
            ps.setDouble(1, 30000);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary")
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        String ins = "insert into employee(name,salary) values(?,?)";
        try(Connection con =DriverManager.getConnection(url,user,pass);
        PreparedStatement ps = con.prepareStatement(ins)){
            ps.setString(1,"Rahul");
            ps.setDouble(2,400000);
        }

    }

}
