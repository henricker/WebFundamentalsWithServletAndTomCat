package br.com.henricker.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;

/**
 * Servlet implementation class ListarEmpresas
 */
@WebServlet("/ListarEmpresas")
public class ListarEmpresas extends HttpServlet {

	private static final long serialVersionUID = -3508819554126354375L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> empresas = Banco.getEmpresas();
		
		RequestDispatcher rd = request.getRequestDispatcher("ListaEmpresass.jsp");
		request.setAttribute("empresas", empresas);
		rd.forward(request, response);
	}

}
