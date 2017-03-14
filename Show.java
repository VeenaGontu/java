import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Show")
public class Show extends GenericServlet 
{
	PrintWriter p;
	
	private static final long serialVersionUID = 1L;

	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		p=response.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("Message from Servlet");
		p.println("</body>");
		p.println("</html>");
		
	}

}
