package br.com.caelum.tarefas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {

	@RequestMapping(value="/incluirTarefa",method=RequestMethod.GET)
	public String formularioTarefa(HttpServletRequest req, HttpServletResponse res) {
		return "form-tarefa";
	}
	
	@PostMapping(value="salvarNova")
	public String salvarNova(@Valid Tarefa tarefa,Model model,BindingResult result) {
		//public String salvarNova(HttpServletRequest req, HttpServletResponse res,Model model) Se utilizar o nome do objeto com o name do form nao precisa requisitar o parametro
		//String descricao=req.getParameter("descricao");

		/*Tarefa tarefa=  new Tarefa();
		tarefa.setDescricao(descricao);*/
		
		if(result.hasFieldErrors("descricao")) {
			return "form-tarefa";
		}
		
		
		JdbcTarefaDao dao =  new JdbcTarefaDao();
		dao.adiciona(tarefa);
		model.addAttribute("", tarefa);
		
		return "tarefa-adicionada";
		
	}
	
	@GetMapping("listaTarefas")
	public String lista(Model model) {
		JdbcTarefaDao dao =  new JdbcTarefaDao();
		List<Tarefa> tarefas = dao.lista();
		
		model.addAttribute("tarefas", tarefas);
		
		return "lista-tarefas";
	}
	
	@GetMapping("removeTarefa")
	public String remove(Tarefa tarefa) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.remove(tarefa);
		return "redirect:listaTarefas";
	}

	@GetMapping("mostraTarefa")
	public String mostra(Long id,Model model) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		model.addAttribute("tarefa", dao.buscaPorId(id));
		return "mostra";
	}
	
	@PostMapping("alteraTarefa")
	public String mostra(Tarefa tarefa) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.altera(tarefa);
		return "redirect:listaTarefas";
	}
	
}
