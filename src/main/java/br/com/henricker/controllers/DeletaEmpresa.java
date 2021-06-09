package br.com.henricker.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.models.Banco;

/**
 * Servlet implementation class DeletaEmpresa
 */
@WebServlet("/DeletaEmpresa")
public class DeletaEmpresa extends HttpServlet {

	private static final long serialVersionUID = 3610752103433404572L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		
		Banco.remove(id);
		response.sendRedirect("ListarEmpresas");
	}

}
