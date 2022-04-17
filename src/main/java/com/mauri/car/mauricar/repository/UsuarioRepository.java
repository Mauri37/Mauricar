package com.mauri.car.mauricar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mauri.car.mauricar.produto.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {



}
	