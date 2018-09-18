package com.exemple.gilu.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.gilu.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	public List<Produto> findByNomeContainingIgnoreCase(String nome);
	public List<Produto> findByCategoriaContainingIgnoreCase(String categoria);
}
