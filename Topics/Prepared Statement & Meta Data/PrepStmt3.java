import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepStmt3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "";

        int rollno = Integer.parseInt(args[0]);

        try {
            sql = "INSERT INTO stdnt_log SELECT * FROM stdnt WHERE rollno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            int logged = pstmt.executeUpdate();

            sql = "DELETE FROM stdnt WHERE rollno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);

            if (pstmt.executeUpdate() == 1 && logged == 1)
                System.out.println("Student having rollno = " + rollno + " deleted successfully");
            else
                System.out.println("Error");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }

}
