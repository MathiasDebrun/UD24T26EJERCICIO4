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

import es.http.service.dto.Investigadores;
import es.http.service.service.InvestigadoresServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadoresController {
	
	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigadores> listarCinvestigadoress(){
		return investigadoresServiceImpl.listarInvestigadoress();
	}
	
	
	@PostMapping("/investigadores")
	public Investigadores salvarInvestigadores(@RequestBody Investigadores investigadores) {
		
		return investigadoresServiceImpl.guardarInvestigadores(investigadores);
	}
	
	
	@GetMapping("/investigadores/{id}")
	public Investigadores investigadoresXID(@PathVariable(name="id") String id) {
		
		Investigadores Investigadores_xid= new Investigadores();
		
		Investigadores_xid=investigadoresServiceImpl.investigadoresXID(id);
		
//		System.out.println("Investigadores XID: "+Investigadores_xid);
		
		return Investigadores_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigadores actualizarInvestigadores(@PathVariable(name="id")String id,@RequestBody Investigadores investigadores) {
		
		Investigadores Investigadores_seleccionado= new Investigadores();
		Investigadores Investigadores_actualizado= new Investigadores();
		
		Investigadores_seleccionado= investigadoresServiceImpl.investigadoresXID(id);
		
		Investigadores_seleccionado.setNombre(investigadores.getNombre());
		Investigadores_seleccionado.setFacultad(investigadores.getFacultad());
		
		Investigadores_actualizado = investigadoresServiceImpl.actualizarInvestigadores(Investigadores_seleccionado);
		
//		System.out.println("El Investigadores actualizado es: "+ Investigadores_actualizado);
		
		return Investigadores_actualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eleiminarInvestigadores(@PathVariable(name="id")String id) {
		investigadoresServiceImpl.eliminarInvestigadores(id);
	}
	
	
}
