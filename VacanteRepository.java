package org.michell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.michell.model.Vacante;

public interface VacanteRepository extends JpaRepository<Vacante, Integer> {

	public List<Vacante> findByEstatus(String estatus);
	public List<Vacante> findByEstatusAndDestacado(String estatus, Integer destacado);
}
