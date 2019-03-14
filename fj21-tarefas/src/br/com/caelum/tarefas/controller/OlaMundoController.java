package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OlaMundoController {
	
	
	@RequestMapping(value="/olaMundoSpring",method = RequestMethod.GET)
	public String execute() {
	    System.out.println("Executando a lógica com Spring MVC");
	    return "ok";
	}
}
