package ifrn.pi.bibli.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BiblisController {
	
	@RequestMapping("/bibli/form")
	public String form() {
		return "formBibli";
	}

}
