package br.com.henricker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.action.CreateBusiness;
import br.com.henricker.action.CreateBusinessForm;
import br.com.henricker.action.ListBusiness;
import br.com.henricker.action.RemoveBusiness;
import br.com.henricker.action.ShowBusiness;
import br.com.henricker.action.UpdateBusiness;
import br.com.henricker.action.interfaceAction.Action;

/**
 * Servlet implementation class BusinessController
 */
@WebServlet("/Business")
public class BusinessController extends HttpServlet {

	private static final long serialVersionUID = 5074741177540215116L;

	@SuppressWarnings("deprecation")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionParameter = request.getParameter("action");
		String redirectType = null;
		
		try {
			Class<?> actionObject = Class.forName("br.com.henricker.action." + actionParameter);
			Action action = (Action) actionObject.newInstance();
			redirectType = action.execute(request, response);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e.getMessage());
		}

		if(redirectType.split(":")[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + redirectType.split(":")[1]);
			rd.forward(request, response);
		}
		else {
			response.sendRedirect(redirectType.split(":")[1]);
		}

		
	}
}
