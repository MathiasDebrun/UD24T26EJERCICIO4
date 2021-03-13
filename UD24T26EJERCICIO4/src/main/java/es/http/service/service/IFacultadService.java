package es.http.service.service;

import java.util.List;

import es.http.service.dto.Facultad;

public interface IFacultadService {

	//Metodos del CRUD
		public List<Facultad> listarFacultads(); //Listar All 
		
		public Facultad guardarFacultad(Facultad facultad);	//Guarda un Facultad CREATE
		
		public Facultad facultadXID(int id); //Leer datos de un Facultad READ
		
		public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos del facultad UPDATE
		
		public void eliminarFacultad(int id);// Elimina el facultad DELETE
	
}


