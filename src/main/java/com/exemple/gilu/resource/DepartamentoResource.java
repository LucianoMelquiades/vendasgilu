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

import com.exemple.gilu.modelo.Departamento;
import com.exemple.gilu.repositorio.DepartamentoRepository;

@RestController
@RequestMapping("departamento")
public class DepartamentoResource {
	
	@Autowired
	DepartamentoRepository departamentoRepository; 
	
	@GetMapping
	public List<Departamento> get(){
		return departamentoRepository.findAll();
	}
	@GetMapping("{id}")
	public Departamento get(@PathVariable ("id") Integer id) {
		return departamentoRepository.getOne(id);	
	}
	
	@PostMapping
	public Departamento save(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	
	@PutMapping
	public Departamento update(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		departamentoRepository.deleteById(id);
	}

}
