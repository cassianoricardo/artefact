package br.com.groupid.artefact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@PostMapping(path = "/home")
	public String home(){
		return "home";
		
	}

}
