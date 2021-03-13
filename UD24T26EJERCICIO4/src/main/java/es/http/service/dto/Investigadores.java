package es.http.service.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import es.http.service.dto.Reserva;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="investigador")//en caso que la tabala sea diferente
public class Investigadores {

	//Atributos de entidad investigadores
	@Id
	@Column (name="id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nombre;
	
	@ManyToOne(targetEntity = es.http.service.dto.Facultad.class)
	@JoinColumn(name = "facultad")//no hace falta si se llama igual
	public Facultad facultad;
	
	@OneToMany
    @JoinColumn(name="id")
    public List<Reserva> reserva;
	
	//Constructores
	
	public Investigadores() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param facultad
	 */
	public Investigadores(String id, String nombre, Facultad facultad, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the facultad
	 */
	public Facultad  getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the registroInvestigadores
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param registroInvestigadores the registroInvestigadores to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Investigadores [id=" + id + ", nombre=" + nombre + ", facultad=" + facultad  
				+ "]";
	}

	

	
	
	
}
