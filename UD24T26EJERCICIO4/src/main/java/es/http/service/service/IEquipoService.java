package es.http.service.service;

import java.util.List;

import es.http.service.dto.Equipo;

public interface IEquipoService {
	public List<Equipo> listarEquipos(); //Listar All 
	
	public Equipo guardarEquipo(Equipo equipo);	//Guarda un Equipo CREATE
	
	public Equipo equipoXID(String id); //Leer datos de un Equipo READ
	
	public Equipo actualizarEquipo(Equipo equipo); //Actualiza datos del Equipo UPDATE
	
	public void eliminarEquipo(String id);// Elimina el Equipo DELETE

}
