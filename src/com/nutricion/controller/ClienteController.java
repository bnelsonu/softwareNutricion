package com.nutricion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nutricion.domain.Cliente;
import com.nutricion.service.ClienteEjercicioService;
import com.nutricion.service.ClienteService;
import com.nutricion.service.EjercicioService;
import com.nutricion.utils.Utils;


@Controller
public class ClienteController {

    @Autowired
	private ClienteService clienteService;
    
    @Autowired
	private ClienteEjercicioService clienteEjercicioService;
    
    @Autowired
    private EjercicioService ejercicioService;

	
	@RequestMapping(value = "/saveCliente")
    public String saveCliente(@ModelAttribute Cliente cliente, Model model) {
		
		model.addAttribute("nacionalidades",Utils.nacionalidades.values());
	 	model.addAttribute("ejerciciosList",ejercicioService.getAllEjercicios());
	 	model.addAttribute("estilosDeVida",Utils.estilosDeVida.values());
		
		clienteService.saveCliente(cliente);
		
        return "redirect:showCliente";
    }
	
	 @RequestMapping(value = "/showCliente")
	    public String showCliente(Model model, Cliente cliente) {
		 	
		    model.addAttribute("clienteEjercicioId", clienteEjercicioService.getNextClienteEjercicioId());
		    model.addAttribute("clienteId",clienteService.getLastClientId());
		 	model.addAttribute("nacionalidades",Utils.nacionalidades.values());
		 	model.addAttribute("ejerciciosList",ejercicioService.getAllEjercicios());
		 	model.addAttribute("estilosDeVida",Utils.estilosDeVida.values());
		    model.addAttribute("cliente",new Cliente());
		   
		   
		    return "showCliente";
	    }

}
