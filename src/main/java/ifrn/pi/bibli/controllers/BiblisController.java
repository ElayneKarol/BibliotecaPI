package ifrn.pi.bibli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.bibli.models.Bibli;
import ifrn.pi.bibli.models.Cadastro;
import ifrn.pi.bibli.repositories.BibliRepository;
import ifrn.pi.bibli.repositories.CadastroRepository;

@Controller
public class BiblisController {
	
	@Autowired
	private BibliRepository br;
	@Autowired
	private CadastroRepository cr;

	@RequestMapping("/bibli/form")
	public String form() {
		return "Bibli/formBibli";
	}

	@RequestMapping("/bibli/cadastro")
	public String cadastro() {
		return "Bibli/cadastroAluno";
	}
	
	@PostMapping("/bibli")
	public String adicionar(Bibli bibli) {			
		System.out.println(bibli);
		br.save(bibli);
		return "Bibli/livro-adicionado";
	}
	
	@PostMapping("/cadastro")
	public String cadastrar(Cadastro cadastro) {			
		System.out.println(cadastro);
		cr.save(cadastro);
		return "Bibli/cadastro-adicionado";
	}

}
