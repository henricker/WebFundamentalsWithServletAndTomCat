package br.com.henricker.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.action.interfaceAction.Action;
import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;

public class ListBusiness implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> empresas = Banco.getEmpresas();
		request.setAttribute("empresas", empresas);
		return "forward:ListaEmpresass.jsp";
	}
	
}
