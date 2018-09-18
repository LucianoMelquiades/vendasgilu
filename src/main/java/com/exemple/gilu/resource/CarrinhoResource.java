package com.exemple.gilu.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.gilu.modelo.Carrinho;
import com.exemple.gilu.repositorio.CarrinhoRepository;

@RestController
@RequestMapping("carrinho")
public class CarrinhoResource {
	
	@Autowired
	CarrinhoRepository carrinhoRepository; 
	
	@GetMapping
	public List<Carrinho> get(){
		return carrinhoRepository.findAll();
	}
	@GetMapping("{id}")
	public Carrinho get(@PathVariable ("id") Integer id) {
		return carrinhoRepository.getOne(id);	
	}
	
	@PostMapping
	public Carrinho save(@RequestBody Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);
	}
	
	@PutMapping
	public Carrinho update(@RequestBody Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		carrinhoRepository.deleteById(id);
	}

}
