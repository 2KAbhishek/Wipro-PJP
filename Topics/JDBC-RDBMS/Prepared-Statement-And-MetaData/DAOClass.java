import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DAOClass {
    private Connection conn = null;
    PreparedStatement pstmt = null;

    public DAOClass() {
        conn = DBUtil.getConnection();
    }

    public boolean insert(int rollno, String name, String grade, String dob, int fee) {
        String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            pstmt.setString(2, name);
            pstmt.setString(3, grade);
            pstmt.setString(4, dob);
            pstmt.setInt(5, fee);
            pstmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(int rollno) {
        String sql = "DELETE stdnt WHERE rollno = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            pstmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean modify(int rollno, int fee) {
        String sql = "UPDATE stdnt SET fee = ? WHERE rollno = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, fee);
            pstmt.setInt(2, rollno);
            pstmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean display(int rollno) {
        String sql = "SELECT * FROM stdnt WHERE rollno = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();

                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    String colName = rsmd.getColumnName(i);

                    sb.append(rs.getObject(colName));
                    if (i != rsmd.getColumnCount()) sb.append(", ");
                }
                System.out.println(sb);
            }

            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean display() {
        String sql = "SELECT * FROM stdnt";

        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();

                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    String colName = rsmd.getColumnName(i);

                    sb.append(rs.getObject(colName));
                    if (i != rsmd.getColumnCount()) sb.append(", ");
                }

                System.out.println(sb);
            }

            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
