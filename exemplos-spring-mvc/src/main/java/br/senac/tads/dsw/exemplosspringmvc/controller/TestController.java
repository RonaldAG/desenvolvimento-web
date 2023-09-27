package br.senac.tads.dsw.exemplosspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.senac.tads.dsw.exemplosspringmvc.model.Dados;

@Controller
@RequestMapping("/formulario")
public class TestController {

	@GetMapping("/index")
	public ModelAndView testestestes() {
		Dados dados = new Dados();
		ModelAndView model = new ModelAndView("mensagem-view");
		model.addObject(dados);
		return model;
	}

	@PostMapping("/enviarDados")
	public ModelAndView testsestse(@ModelAttribute Dados dadosRecebidos) {
		ModelAndView mv = new ModelAndView("redirect:resultado");
		mv.addObject("Dados", dadosRecebidos);
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView salvar(@ModelAttribute("dados") Dados dadosRecebidos, RedirectAttributes redirAttr) {
		// Gera resposta indicando redirecionamento para /resultado
		ModelAndView mv = new ModelAndView("redirect:/resultado.html");
		// Configura os dadosRecebidos como um atributo flash
		// (mantido em sessão entre duas requisições consecutivas)
		redirAttr.addFlashAttribute("dados", dadosRecebidos);
		return mv;
	}

}
