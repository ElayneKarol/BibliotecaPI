package ifrn.pi.bibli.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.bibli.models.Bibli;
import ifrn.pi.bibli.models.Cadastro;

@Controller
public class BiblisController {

	@RequestMapping("/bibli/form")
	public String form() {
		return "formBibli";
	}

	@RequestMapping("/bibli/cadastro")
	public String cadastro() {
		return "cadastroAluno";
	}
	
	@PostMapping("/bibli")
	public String adicionar(Bibli bibli) {			
		System.out.println(bibli);			
		return "evento-adicionado";
	}
	
	@PostMapping("/cadastro")
	public String cadastrar(Cadastro cadastro) {			
		System.out.println(cadastro);			
		return "cadastro-adicionado";
	}

}
