import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
		urlPatterns = { "/ConfigServlet" }, 
		initParams = { 
				@WebInitParam(name = "value", value = "0")
		})
public class ConfigServlet extends GenericServlet 
{
	private static final long serialVersionUID = 1L;
	int count;
	PrintWriter p;

	public void init(ServletConfig config) throws ServletException 
	{
	      count=Integer.parseInt(config.getInitParameter("value"));
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	        p=response.getWriter();
	        p.println("<html>");
	        p.println("<body>");
	        count++;
	        p.println("Request Number:"+count);
	        p.println("</body>");
	        p.println("</html>");
	}
	
    public void destroy()
    {
    	p=null;
    }
}
