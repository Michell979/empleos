package org.michell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.michell.model.Categoria;

//public interface CategoriasRepository extends CrudRepository <Categoria, Integer> {
public interface CategoriasRepository extends JpaRepository <org.michell.model.Categoria, Integer>{
	
}
