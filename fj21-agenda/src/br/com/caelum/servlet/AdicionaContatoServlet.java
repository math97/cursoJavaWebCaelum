package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/AdicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome =request.getParameter("nome");
		String email =request.getParameter("email");
		String endereco =request.getParameter("endereco");
		String dataEmTexto =request.getParameter("dataNascimento");
		
		Calendar dataNascimento = null;
		
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/YYYY").parse(dataEmTexto);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		dataNascimento=Calendar.getInstance();
		dataNascimento.setTime(date);
		
		
		//Contato contato  =  new Contato(nome, email, endereco, dataNascimento);
		Contato contato = new Contato();
		contato.setDataNascimento(dataNascimento);
		contato.setEmail(email);
		contato.setNome(nome);
		contato.setEndereco(endereco);
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Contato "+contato.getNome() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
		
	}

}
