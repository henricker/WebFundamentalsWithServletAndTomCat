package br.com.henricker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;


@WebServlet("/MostrarEmpresa")
public class MostrarEmpresa extends HttpServlet {

	private static final long serialVersionUID = 5544703108033446269L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Integer id = Integer.valueOf(request.getParameter("id"));
		Empresa empresa = Banco.getById(id);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("MostrarEmpresa.jsp");
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
	}

}
