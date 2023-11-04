package ifrn.pi.bibli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.bibli.models.Cadastro;
import ifrn.pi.bibli.repositories.CadastroRepository;

@Controller
public class AlunoCadastroController {
	
	@Autowired
	private CadastroRepository cr;

	@RequestMapping("/bibli/cadastro")
	public String cadastro() {
		return "bibli/cadastroAluno";
	}
	
	@PostMapping
	public String cadastrar(Cadastro cadastro) {
		System.out.println(cadastro);
		cr.save(cadastro);
		return "bibli/cadastro-adicionado";
	}
	
	@GetMapping("/bibli/listcad")
	public ModelAndView listarCadastro () {
		List<Cadastro> cadastro = cr.findAll();
		ModelAndView mv = new ModelAndView("bibli/listaCad");
		mv.addObject("cadastro", cadastro);
		return mv;	
	}
}
