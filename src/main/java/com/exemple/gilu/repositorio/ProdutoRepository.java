package com.exemple.gilu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.gilu.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
