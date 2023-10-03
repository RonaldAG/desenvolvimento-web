package br.senac.tads.dsw.springmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.senac.tads.dsw.springmvcthymeleaf.pojo.Curriculo;
import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Cabecalhos;

@Controller
@RequestMapping("/resume-ronald")
public class ResumeController {

	
	@GetMapping
	public ModelAndView getResume() {
		ModelAndView model = new ModelAndView("curriculo-view");
		
		Curriculo curriculo = new Curriculo();
		curriculo.setCurriculoPronto();
		
		Cabecalhos cabecalhos = new Cabecalhos();
		cabecalhos.setCabecalhoPronto();
		
		model.addObject("curriculo", curriculo);
		model.addObject("cabecalhos", cabecalhos);
		return model;
	}
	
	
}
