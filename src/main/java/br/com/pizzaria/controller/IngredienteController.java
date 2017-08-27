package br.com.pizzaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.pizzaria.modelo.entidades.Ingrediente;
import br.com.pizzaria.modelo.repositorios.IngredienteRepositorio;

@Controller
@RequestMapping("/ingredientes")
public class IngredienteController {
	
	@Autowired
	private IngredienteRepositorio ingredienteRepositorio;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarIngredientes(Model model) {
		Iterable<Ingrediente> ingredientes = ingredienteRepositorio.findAll();
		
		model.addAttribute("titulo", "Listagem de Ingredientes");
		model.addAttribute("ingredientes", ingredientes);
		
		
		return "ingredientes/listagem";
	}

}
