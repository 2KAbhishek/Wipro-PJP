<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Change JSP</title>
</head>
<body>
<%
    String username = request.getParameter("uname2");
	String crntpswd = request.getParameter("passwd1");
	String newpswd = request.getParameter("passwd2");
	String confpswd = request.getParameter("passwd3");

	if(newpswd.equals(confpswd)){
	try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from usertable where NAME = '"+username+"' and PASSWORD= '"+crntpswd+"'");

			if(rs.next()){
				String str2 = "update usertable set PASSWORD = '"+newpswd+"' where NAME = '"+username+"' and PASSWORD = '"+crntpswd+"'";
					PreparedStatement ps = conn.prepareStatement(str2);
					int i = ps.executeUpdate();
					if(i>0)
						out.print("Password Changed Successfully...");
					else
						out.print("Error Occured!!");
					ps.close();
					conn.close();

			}

		}catch(Exception err){
			out.print(err);
		}
	}else{
		out.print("Entered Passwords does not match");
	}
%>
</body>
</html>
