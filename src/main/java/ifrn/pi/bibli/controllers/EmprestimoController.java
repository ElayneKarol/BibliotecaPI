package ifrn.pi.bibli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.bibli.models.Emprestimo;
import ifrn.pi.bibli.repositories.EmprestimoRepository;

@Controller
public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepository er;
	
	@RequestMapping("/bibli/empres")
	public String emprestimo() {
		return "bibli/empresLivro";
	}
	
	@PostMapping("/empres")
	public String fazerEmpre(Emprestimo emprestimo) {
		System.out.println(emprestimo);
		er.save(emprestimo);
		return "emprestimo-adicionado";
	}
	
}
