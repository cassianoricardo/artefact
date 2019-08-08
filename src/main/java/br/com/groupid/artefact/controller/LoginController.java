package br.com.groupid.artefact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/login")
	public String home(){
		return "view/login";
		
	}
}
