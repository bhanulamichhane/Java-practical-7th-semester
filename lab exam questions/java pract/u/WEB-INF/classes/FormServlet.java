import java.io.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;

public class FormServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String user = req.getParameter("us");
		out.println("<html>");
		out.println("<head>Test</head>");
		out.println("<title>AServerletDep</title>");
		out.println("<body>");
		out.println("User:" + user);
		out.println("<body>");
		out.println("</html>");
		out.close();
		
	}
}