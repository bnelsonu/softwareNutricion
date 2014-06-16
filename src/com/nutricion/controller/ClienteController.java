package com.nutricion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nutricion.service.ClienteService;

@Controller
public class ClienteController {

  /* @Autowired
	private ClienteService clienteService;*/

	 @RequestMapping(value = "/showCliente")
	    public String showCliente(Model model) {
	      
	        return "showCliente";
	    }

}
