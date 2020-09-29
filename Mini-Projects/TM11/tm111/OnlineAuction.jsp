<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Online Auction Status</title>
    </head>
    <body>
        <div style="background-color: yellow; width: 800px; margin: 0 auto; padding-bottom: 20px;">
            <table align="center" bordercolor="white">
                <tr>
                    <th><h1>Bid Submitted</h1></th>
                </tr>
                <th>
                    <h4>
                        Your bid is now active. If your bid is successful, you will be notified within 24 hours of the
                        close of the bidding.
                    </h4>
                </th>
            </table>

            <table border="3" align="center">
                <th style="color: white; background-color: black;">
                    <b><%=request.getAttribute("itm_name")%></b>
                </th>

                <tr>
                    <td style="text-align: center;">
                        <b>Item ID:<%=request.getAttribute("itm_id") %></b>
                    </td>
                </tr>

                <tr>
                    <td style="text-align: center;">
                        <b>Name:<%=request.getAttribute("uname") %></b>
                    </td>
                </tr>

                <tr>
                    <td style="text-align: center;">
                        <b>Email address:<%=request.getAttribute("email") %></b>
                    </td>
                </tr>
                <tr>
                    <td style="text-align: center;">
                        <b>Bid price:Rs <%=request.getAttribute("ubid") %></b>
                    </td>
                </tr>

                <tr>
                    <td style="text-align: center;">
                        <b>Auto-increment price:<%=request.getAttribute("checkbid") %></b>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
