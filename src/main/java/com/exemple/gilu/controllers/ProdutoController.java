package com.exemple.gilu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemple.gilu.modelo.Produto;
import com.exemple.gilu.repositorio.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping(value= "/list")
	public String list(ModelMap model) {
		
		List<Produto> prdutos = produtoRepository.findAll();
		model.addAttribute("produtosList", prdutos);
		
		return "produto/list";
	}
	
	
	

}
