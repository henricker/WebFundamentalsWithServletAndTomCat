package br.com.henricker.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.henricker.action.interfaceAction.Action;

public class Logout implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		//session.removeAttribute("user");
		session.invalidate(); //Destroy all coockie
		return "forward:FormLogin.jsp";
	}	
}
