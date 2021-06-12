package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Monitoring
 */
@WebFilter("/Business")
public class Monitoring implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Long before = System.currentTimeMillis();
		
		String action = request.getParameter("action");
		
		//execute action
		chain.doFilter(request, response);
		
		Long after = System.currentTimeMillis();
		System.out.println("Time of execution of the process " + action + " -> " + (after - before) + "ms");
	}

}
