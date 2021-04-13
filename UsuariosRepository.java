package org.michell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.michell.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario,Integer> {

}
