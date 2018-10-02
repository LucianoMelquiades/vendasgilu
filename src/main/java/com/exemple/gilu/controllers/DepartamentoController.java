package com.exemple.gilu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemple.gilu.modelo.Departamento;
import com.exemple.gilu.repositorio.DepartamentoRepository;


@Controller
@RequestMapping("/departamento")
public class DepartamentoController {
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	@GetMapping(value= "/list")
	public String list(ModelMap model) {
		List<Departamento>departamentos = departamentoRepository.findAll();
		model.addAttribute("departamentosList", departamentos);
		
		return "departamento/list";
	}

}
