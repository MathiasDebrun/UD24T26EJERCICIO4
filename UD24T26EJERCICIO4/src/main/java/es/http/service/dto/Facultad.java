package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import es.http.service.dto.Reserva;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="facultad")//en caso que la tabala sea diferente
public class Facultad {

	//Atributos de entidad facultad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> Reserva;
	
	//Constructores
	
	public Facultad() {
	
	}

	public Facultad(int id, String nombre, List<Reserva> Reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.Reserva = Reserva;
	}

	//Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the Reserva
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return Reserva;
	}

	/**
	 * @param registroInvestigadores the registroInvestigadores to set
	 */
	public void setRegistroInvestigadores(List<Reserva> Reserva) {
		this.Reserva = Reserva;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + " Asignado a: "+Reserva
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
