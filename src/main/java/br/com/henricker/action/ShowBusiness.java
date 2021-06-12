package br.com.henricker.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.action.interfaceAction.Action;
import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;

public class ShowBusiness implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Empresa empresa = Banco.getById(id);
		
		request.setAttribute("empresa", empresa);	
		return "forward:MostrarEmpresa.jsp";
	}
	
}
