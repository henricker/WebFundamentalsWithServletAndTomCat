package br.com.henricker.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Banco {
	
	private static Map<Integer, Empresa> empresasId = new TreeMap<>();
	
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
}
