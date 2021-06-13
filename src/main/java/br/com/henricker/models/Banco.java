package br.com.henricker.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Banco {
	
	private static Map<Integer, Empresa> empresasId = new TreeMap<>();
	private static Map<String, User> usersLogin = new TreeMap<>();
	
	static {
		//Mock data
		User user = new User();
		user.setLogin("henricker");
		user.setPassword("12345");
		
		usersLogin.put(user.getLogin(), user);
		
		
		Empresa emp1 = new Empresa("MacDonalds", new Date("06/05/2005"));
		Empresa emp2 = new Empresa("Naruto", new Date("16/08/2006"));
		
		empresasId.put(emp1.getId(), emp1);
		empresasId.put(emp2.getId(), emp2);
	}
	
	public static void add(Empresa empresa) {
		Banco.empresasId.put(empresa.getId(), empresa);
	}
	
	public static List<Empresa> getEmpresas() {	
		List<Empresa> listaEmpresas = Collections.unmodifiableList(new ArrayList<Empresa>(Banco.empresasId.values()));
		return listaEmpresas;
	}
	
	public static void remove(int id) {
		Banco.empresasId.remove(id);
	}
	
	public static Empresa getById(int id) {
		return Banco.empresasId.get(id);
	}
	
	public static void update(String nome, Date dataAbertura, int id) {
		Banco.empresasId.get(id).setName(nome);
		Banco.empresasId.get(id).setDataAbertura(dataAbertura);
	}
	
	public static User existsUser(String login, String password) {
		User user = Banco.usersLogin.get(login);
		
		if(user == null)
			return null;
		
		if(!user.isValid(login, password))
			return null;
		
		return user;
	}
	
}
