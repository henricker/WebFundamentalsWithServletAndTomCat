package br.com.henricker.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/NovaEmpresa")
public class NovaEmpresa extends HttpServlet {

	private static final long serialVersionUID = 6665158899820057912L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco.add(new Empresa(name, dataAbertura));
		response.sendRedirect("ListarEmpresas");
	}

}
