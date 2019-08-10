package br.com.freelancer.sgdoc.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuarioController {
	
	@RequestMapping(path="/autenticarUsuario", method = { RequestMethod.POST, RequestMethod.GET })	
	public void autenticarUsuario(ServletRequest request){	
		request.getParameter("username");
		request.getParameter("password");
	   
	}

}
