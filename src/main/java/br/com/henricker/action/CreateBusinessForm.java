package br.com.henricker.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.action.interfaceAction.Action;

public class CreateBusinessForm implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "forward:CadastroEmpresa.jsp";
	}
	
}
