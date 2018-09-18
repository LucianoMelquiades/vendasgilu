package com.exemple.gilu.repositorio;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.exemple.gilu.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);

}
