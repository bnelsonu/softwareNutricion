package com.nutricion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nutricion.domain.Cliente;
import com.nutricion.service.ClienteService;
import com.nutricion.utils.Utils;


@Controller
public class ClienteController {

    @Autowired
	private ClienteService clienteService;

	
	@RequestMapping(value = "/saveCliente")
    public String saveCliente(@ModelAttribute Cliente cliente) {
		
		clienteService.saveCliente(cliente);
        return "showCliente";
    }
	
	 @RequestMapping(value = "/showCliente")
	    public String showCliente(Model model, Cliente cliente) {
		 	
		 	model.addAttribute("nacionalidades",Utils.nacionalidades.values());
		 	model.addAttribute("ejercicios",Utils.ejercicios.values());
		    model.addAttribute("cliente",new Cliente());
		   
		    return "showCliente";
	    }

}
