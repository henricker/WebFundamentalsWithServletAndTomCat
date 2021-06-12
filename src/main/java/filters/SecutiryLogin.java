package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SecutiryLogin
 */


//Frontline of web system, check if user has logged and continue the process, otherwise return login form 
@WebFilter("/Business")
public class SecutiryLogin implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String actionParameter = request.getParameter("action");
		HttpSession session = request.getSession();
		boolean userNotLogged = (session.getAttribute("user") == null);
		boolean isActionProtected = !(actionParameter.equals("Login") || actionParameter.equals("LoginForm"));
		
		if(userNotLogged && isActionProtected) {
			response.sendRedirect("Business?action=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}
}
