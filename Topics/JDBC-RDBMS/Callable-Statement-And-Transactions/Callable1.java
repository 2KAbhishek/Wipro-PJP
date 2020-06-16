import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Callable1 {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        CallableStatement cstmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "abhishek", "wipro-pjp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "SELECT * FROM emp";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                double netSalary = 0;

                String sql2 = "{ call calculate_salary(?, ?) }";

                cstmt = conn.prepareCall(sql2);
                cstmt.setInt(1, empno);
                cstmt.registerOutParameter(2, Types.DOUBLE);
                cstmt.executeQuery();

                netSalary = cstmt.getDouble(2);

                System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
            stmt.close();
            cstmt.close();
            conn.close();
        }
    }

}
