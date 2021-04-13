package org.michell.service;

import java.util.List;

import org.michell.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IntVacantesService {
	
	//metodos abstractos
	public List<Vacante> obtenerTodas();
	public Vacante buscarPorId(Integer id);
	public void guardar(Vacante vacante);
	public void eliminar(Integer id);
	public Page<Vacante> buscarTodas(Pageable page);
	

}
