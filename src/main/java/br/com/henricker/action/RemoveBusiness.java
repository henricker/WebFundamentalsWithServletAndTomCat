package br.com.henricker.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.action.interfaceAction.Action;
import br.com.henricker.models.Banco;

public class RemoveBusiness implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Banco.remove(id);
		
		return "redirect:Business?action=ListBusiness";
	}
	
}
