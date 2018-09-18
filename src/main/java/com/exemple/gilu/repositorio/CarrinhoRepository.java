package com.exemple.gilu.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.gilu.modelo.Carrinho;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer>{

}
