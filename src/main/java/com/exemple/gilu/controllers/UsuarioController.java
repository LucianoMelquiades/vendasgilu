package com.exemple.gilu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemple.gilu.modelo.Usuario;
import com.exemple.gilu.repositorio.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(value= "/list")
	public String list(ModelMap model) {
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		model.addAttribute("usuariosList", usuarios);
		
		return "aluno/list";
	}

}
