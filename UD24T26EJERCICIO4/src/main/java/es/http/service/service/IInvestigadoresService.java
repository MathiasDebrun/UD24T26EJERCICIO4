package es.http.service.service;

import java.util.List;

import es.http.service.dto.Investigadores;



public interface IInvestigadoresService {

	//Metodos del CRUD
		public List<Investigadores> listarInvestigadoress(); //Listar All 
		
		public Investigadores guardarInvestigadores(Investigadores investigadores);	//Guarda un Investigadores CREATE
		
		public Investigadores investigadoresXID(String id); //Leer datos de un Investigadores READ
		
		public Investigadores actualizarInvestigadores(Investigadores investigadores); //Actualiza datos del Investigadores UPDATE
		
		public void eliminarInvestigadores(String id);// Elimina el Investigadores DELETE
	

}


