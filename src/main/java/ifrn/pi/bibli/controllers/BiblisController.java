package ifrn.pi.bibli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.bibli.models.Bibli;
import ifrn.pi.bibli.models.Cadastro;
import ifrn.pi.bibli.repositories.BibliRepository;
import ifrn.pi.bibli.repositories.CadastroRepository;

@Controller
@RequestMapping("/bibli")
public class BiblisController {
	@Autowired
	private BibliRepository br;
	@Autowired
	private CadastroRepository cr;


	@GetMapping("/form")
	public String form() {
		return "bibli/formBibli";
	}

	@PostMapping
	public String adicionar(Bibli bibli) {
		System.out.println(bibli);
		br.save(bibli);
		return "bibli/livro-adicionado";
	}

	@GetMapping
	public ModelAndView listarLiv() {
		List<Bibli> biblis = br.findAll(); 
		ModelAndView mv = new ModelAndView("bibli/listaLivro");
		mv.addObject("biblis", biblis);
		return mv;
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "bibli/cadastroAluno";
	}

	@PostMapping("/cadastro")
	public String cadastrar(Cadastro cadastro) {
		System.out.println(cadastro);
		cr.save(cadastro);
		return "bibli/cadastro-adicionado";
	}

}
