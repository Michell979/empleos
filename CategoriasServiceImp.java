package org.michell.service;


import java.util.LinkedList;
import java.util.List;
import java.time.format.DateTimeParseException;
import org.michell.model.Categoria;
import org.michell.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service

public class CategoriasServiceImp implements IntCategoriasService{
	private List<Categoria> lista=null;
	
	public CategoriasServiceImp(){
		lista = new LinkedList<Categoria>();
	
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNombre("Educación");
		c1.setDescripcion("Eduación Primaria");
	
		lista.add(c1);
		
		//////////////////////////////////
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNombre("Moda");
		c2.setDescripcion("Diseñador de moda");
		lista.add(c2);
		
		////////////////////////////////////
		
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNombre("Ventas");
		c3.setDescripcion("Venta de piso");
		lista.add(c3);
	  
		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setNombre("Contabilidad");
		c4.setDescripcion("Relacionada con contabilidad");
		lista.add(c4);
		
		Categoria c5 = new Categoria();
		c5.setId(5);
		c5.setNombre("Programación");
		c5.setDescripcion("Relacionada con programación");
		lista.add(c5);
	
	}
	
	
	
	
	@Override
	public List<Categoria> obtenerTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		for(Categoria categoria : obtenerTodas()) {
			if (categoria.getId()== idCategoria) {
				return categoria;
			}
		}
		return null;
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
	}




	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
