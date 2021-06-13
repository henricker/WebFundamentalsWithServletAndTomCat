package br.com.henricker.webService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.henricker.models.Banco;
import br.com.henricker.models.Empresa;

/**
 * Servlet implementation class BusinessService
 */
@WebServlet("/BusinessService")
public class BusinessService extends HttpServlet {
	

	private static final long serialVersionUID = -3220112836049868699L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Empresa> businesss = new ArrayList<>(Banco.getEmpresas());
		
		String type = request.getHeader("Accept");
		
		System.out.println(type);
		if(type.endsWith("json")) {
			Gson gson = new Gson();
			String json = gson.toJson(businesss);
			
			response.setContentType("application/json");
			response.getWriter().println(json);	
		}
		else if(type.contains("xml")) {
			System.out.println(businesss);
			XStream xtream = new XStream();
			xtream.alias("Business", Empresa.class);
			String xml = xtream.toXML(businesss);
			response.setContentType("application/xml");
			response.getWriter().println(xml);
		}
		
	}

}
