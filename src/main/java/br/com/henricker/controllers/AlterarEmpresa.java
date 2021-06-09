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

/**
 * Servlet implementation class AlterarEmpresa
 */
@WebServlet("/AlterarEmpresa")
public class AlterarEmpresa extends HttpServlet {
	private static final long serialVersionUID = -2176372815926966245L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco.update(nome, dataAbertura, id);
		response.sendRedirect("ListarEmpresas");
	}

}
