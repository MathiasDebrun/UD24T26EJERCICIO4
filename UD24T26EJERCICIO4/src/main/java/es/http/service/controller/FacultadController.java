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

import es.http.service.dto.Facultad;
import es.http.service.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultads")
	public List<Facultad> listarFacultads(){
		return facultadServiceImpl.listarFacultads();
	}
	
	
	@PostMapping("/facultads")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	
	@GetMapping("/facultads/{id}")
	public Facultad FacultadXID(@PathVariable(name="id") int id) {
		
		Facultad Facultad_xid= new Facultad();
		
		Facultad_xid=facultadServiceImpl.facultadXID(id);
		
//		System.out.println("Facultad XID: "+Facultad_xid);
		
		return Facultad_xid;
	}
	
	@PutMapping("/facultad/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id")int id,@RequestBody Facultad facultad) {
		
		Facultad Facultad_seleccionado= new Facultad();
		Facultad Facultad_actualizado= new Facultad();
		
		Facultad_seleccionado= facultadServiceImpl.facultadXID(id);
		
		Facultad_seleccionado.setNombre(facultad.getNombre());
		Facultad_actualizado = facultadServiceImpl.actualizarFacultad(Facultad_seleccionado);
		
//		System.out.println("El Facultad actualizado es: "+ Facultad_actualizado);
		
		return Facultad_actualizado;
	}
	
	@DeleteMapping("/facultad/{id}")
	public void eleiminarFacultad(@PathVariable(name="id")int id) {
		facultadServiceImpl.eliminarFacultad(id);
	}
	
	
}
