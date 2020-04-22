import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrepStmt2 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;

        int rollno = 0;
        do {
            System.out.print("Enter rollno: ");
            String rollstr = sc.nextLine();

            try {
                rollno = Integer.parseInt(rollstr);
                if (String.valueOf(rollno).length() != 4) rollno = 0;
            } catch (Exception e) {}
        } while (rollno == 0);

        String studentName = "";
        boolean lowercasefound;
        do {
            System.out.print("Enter name: ");
            studentName = sc.nextLine();

            lowercasefound = false;
            for (int i = 0; i < studentName.length(); i++) {
                if (Character.isLowerCase(studentName.charAt(i))) {
                    lowercasefound = true;
                    break;
                }
            }

        } while (studentName.length() > 20 || lowercasefound);

        String standard = "";
        String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
        List<String> list = new ArrayList<>(Arrays.asList(standards));
        do {
            System.out.print("Enter standard: ");
            standard = sc.nextLine();
        } while (!list.contains(standard));

        System.out.print("Enter D.O.B.: ");
        String dob = sc.nextLine();

        Double fees = 0.0;
        do {
            System.out.print("Enter fees: ");
            if (sc.hasNextDouble())
                fees = sc.nextDouble();
        } while (fees == 0.0);


        String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            pstmt.setString(2, studentName);
            pstmt.setString(3, standard);
            pstmt.setString(4, dob);
            pstmt.setDouble(5, fees);
            pstmt.executeQuery();
            System.out.println("Student added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
            pstmt.close();
            conn.close();
        }

        sc.close();
    }

}
