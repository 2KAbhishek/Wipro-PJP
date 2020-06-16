import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query1 {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "abhishek", "wipro-pjp");
        } catch (Exception e) {
            System.out.println("Connection could  not be established");
            if (conn != null) conn.close();
        }

        String sql = "SELECT empno, ename FROM emp";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("empno: " + rs.getInt(1) + ", ename: " + rs.getString("ename"));
        }

        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
}

