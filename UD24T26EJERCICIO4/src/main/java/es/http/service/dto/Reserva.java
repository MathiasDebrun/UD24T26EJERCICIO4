package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="reserva")//en caso que la tabala sea diferente
public class Reserva {

	//Atributos de entidad registro_proyecto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column (name="comienzo")
	private String comienzo;
	@Column (name="fin")
	private String fin;
	
	@ManyToOne
    @JoinColumn(name = "numserie")
    public Equipo Equipo;
 
    @ManyToOne
    @JoinColumn(name = "dni")
    public Investigadores Investigadores;
    
    
	

	//Constructores
	
	
	public Reserva() {
		super();
	}
	
public Reserva(int id, String comienzo, String fin,  Equipo  Equipo, Investigadores Investigadores) {
		super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.Investigadores = Investigadores;
		this. Equipo =  Equipo;
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
	 * @return the cientifico
	 */
	@JsonIgnore
	public Equipo getEquipo() {
		return  Equipo;
	}


	/**
	 * @param cientifico the cientifico to set
	 */
	public void setEquipo( Equipo  Equipo) {
		this. Equipo=  Equipo;
	}


	/**
	 * @return the proyecto
	 */
	@JsonIgnore
	public Investigadores getInvestigadores() {
		return Investigadores;
	}


	/**
	 * @param proyecto the proyecto to set
	 */
	public void setInvestigadores(Investigadores Investigadores) {
		this.Investigadores = Investigadores;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", Equipo=" + Equipo
				+ ", Investigadores=" + Investigadores + "]";
	}






	
	
	
	
	




		
	
	
	
}
