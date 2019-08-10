package br.com.freelancer.sgdoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.freelancer.sgdoc.constantes.ViewConstantes;
import br.com.freelancer.sgdoc.model.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login", method = RequestMethod.GET )	
	public ModelAndView login(){	
		ModelAndView  view = new ModelAndView(ViewConstantes.LOGIN);
		view.addObject("nomeSistema", "SGDOC");
		view.addObject("usuario", new Usuario());
		
	    return view;
	}
}
