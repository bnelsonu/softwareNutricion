package com.nutricion.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ClienteServiceImpl {

	
	 @RequestMapping(value = "/showCliente")
	    public String inputBook(Model model) {
	      
	        return "showCliente";
	    }

}
