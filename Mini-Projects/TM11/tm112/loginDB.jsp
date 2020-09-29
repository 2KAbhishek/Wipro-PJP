<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> <%@page
import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Login Database JSP</title>
    </head>
    <body>
        <%! Connection con=null; PreparedStatement ps; public void jspInit(){ try{
        Class.forName("oracle.jdbc.driver.OracleDriver"); con =
        DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr"); ps = con.prepareStatement("select
        * from usertable where NAME = ? and PASSWORD=?"); } catch(Exception err) { err.printStackTrace(); } } %> <%
        String user = request.getParameter("uname1"); String pswd = request.getParameter("passwd");
        ps.setString(1,user); ps.setString(2,pswd); ResultSet rs = ps.executeQuery(); if(rs.next()){ } else{
        out.print("Please enter valid credentials"); } %>
        <a href="changepswd.html">Change Password</a>
    </body>
</html>
