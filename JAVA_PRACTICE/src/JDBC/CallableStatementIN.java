package JDBC;
import java.sql.*;
public class CallableStatementIN {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/cts_db";
        String user = "root";
        String pass = "Root@1323";
        String sql = "{CALL getEmployeeBySalary(?)}";
        try(Connection con = DriverManager.getConnection(url,user, pass);
        CallableStatement cs = con.prepareCall(sql)){
            cs.setDouble(1,40000);
            ResultSet rs = cs.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary")
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }

