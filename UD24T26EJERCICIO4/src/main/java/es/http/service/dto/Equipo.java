package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import es.http.service.dto.Reserva;

@Entity
@Table(name="equipo")
public class Equipo {
	

	@Id
	private String id;
	@Column (name= "nomapels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn (name= "facultad")
	private int facultad;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> Reserva;
	
	
	
	public Equipo(String id, String nomApels, int facultad, List<es.http.service.dto.Reserva> asignadoA) {
		super();
		this.id = id;
		this.nomApels = nomApels;
		this.facultad = facultad;
		Reserva = asignadoA;
	}
	public Equipo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	public int getFacultad() {
		return facultad;
	}
	public void setFacultad(int facultad) {
		this.facultad = facultad;
	}
	@Override
	public String toString() {
		return "Equipos [id=" + id + ", nomApels=" + nomApels + ", facultad=" + facultad + ", Reserva=" + Reserva
				+ "]";
	}
	
	
	
}
