import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepStmt4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "";

        int rollno = Integer.parseInt(args[0]);
        double fees = Double.parseDouble(args[1]);

        try {
            sql = "UPDATE stdnt SET fees = ? WHERE rollno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, fees);
            pstmt.setInt(2, rollno);

            if (pstmt.executeUpdate() == 1)
                System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
            else
                System.out.println("Error");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }

}
