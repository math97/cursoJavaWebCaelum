package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;

public class TestaInsercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		contato.setNome("caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("rua vergueiro");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado");
		

	}

}
