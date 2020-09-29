import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AuctionServlet")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("itm_id");
		String name = request.getParameter("itm_name");
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String amountbid = request.getParameter("ubid");
		String[] checkbid = request.getParameterValues("checkbid");
		String temp = "";
		if (checkbid == null)
			temp += "false";
		else
			temp += "true";

		request.setAttribute("itm_id", id);
		request.setAttribute("itm_name", name);
		request.setAttribute("uname", username);
		request.setAttribute("email", email);
		request.setAttribute("ubid", amountbid);
		request.setAttribute("checkbid", checkbid);
		request.setAttribute("checkbid", temp);

		request.getRequestDispatcher("OnlineAuction.jsp").forward(request, response);
		out.close();
	}

}
