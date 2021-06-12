package br.com.henricker.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.henricker.action.interfaceAction.Action;
import br.com.henricker.models.Banco;
import br.com.henricker.models.User;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		User user = Banco.existsUser(login, password);
		if(user == null)
			return "forward:FormLogin.jsp";
					
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return "redirect:Business?action=ListBusiness";
	}

}
