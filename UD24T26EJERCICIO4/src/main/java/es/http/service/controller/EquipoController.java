package es.http.service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Equipo;
import es.http.service.service.IEquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	IEquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/Equipos")
	public List<Equipo> listarEquipos(){
		return equipoServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/Equipos")
	public Equipo salvarEquipo(@RequestBody Equipo equipo) {
		
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	
	@GetMapping("/Equipos/{id}")
	public Equipo EquipoXID(@PathVariable(name="id") String id) {
		
		Equipo Equipo_xid= new Equipo();
		
		Equipo_xid=equipoServiceImpl.equipoXID(id);
		
//		System.out.println("Equipo XID: "+Equipo_xid);
		
		return Equipo_xid;
	}
	
	@PutMapping("/Equipo/{id}")
	public Equipo actualizarEquipo(@PathVariable(name="id")String id,@RequestBody Equipo equipo) {
		
		Equipo Equipo_seleccionado= new Equipo();
		Equipo Equipo_actualizado= new Equipo();
		
		Equipo_seleccionado= equipoServiceImpl.equipoXID(id);
		
		Equipo_seleccionado.setNomApels(equipo.getNomApels());
		Equipo_actualizado = equipoServiceImpl.actualizarEquipo(Equipo_seleccionado);
		
//		System.out.println("El Equipo actualizado es: "+ Equipo_actualizado);
		
		return Equipo_actualizado;
	}
	
	@DeleteMapping("/equipo/{id}")
	public void eleiminarEquipo(@PathVariable(name="id")String id) {
		equipoServiceImpl.eliminarEquipo(id);
	}
	
	
}

