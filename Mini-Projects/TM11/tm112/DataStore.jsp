<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Data JSP</title>
</head>
<body>
<%
	String name=request.getParameter("uname");
	String pass1=request.getParameter("pass1");
	String pass2=request.getParameter("pass2");

	if(pass1.equals(pass2)){
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

			PreparedStatement ps = conn.prepareStatement("insert into usertable values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass1);

			int x = ps.executeUpdate();
			if(x!=0){
				out.print("User Added Successfully!!!");

			}
			else{
				out.print("Something Went Wrong!!");
			}
		}catch(SQLException e){
			out.print(e);
		}
	}
	else{
			out.print("Passwords did not match...");
	}

%>
<a href = "changepswd.html">Change Password</a>
</body>
</html>
