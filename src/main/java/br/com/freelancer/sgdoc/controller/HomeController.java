package br.com.freelancer.sgdoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.freelancer.sgdoc.constantes.ViewConstantes;

@Controller
public class HomeController {
	
	@RequestMapping(path="/", method = { RequestMethod.GET })	
	public ModelAndView home() {
		ModelAndView view = new ModelAndView(ViewConstantes.HOME);
		return view;
	}

}
