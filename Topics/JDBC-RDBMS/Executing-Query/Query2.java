import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query2 {

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

        String sql = "SELECT * FROM emp WHERE sal > 1000 AND sal < 2000";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        System.out.printf("%-10S%-10S%10S%10S\n", "ename", "job", "sal", "comm");
        for (int i = 0; i < 50; i++) System.out.print("-");
        System.out.println();

        while (rs.next()) {
            System.out.printf("%-10s%-10s%10s%10s\n",
                rs.getString("ename"), rs.getString("job"), rs.getDouble("sal"), rs.getDouble("comm"));
        }

        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
}

