package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import es.http.service.dto.Equipo;

public interface IEquipoDAO	 extends JpaRepository<Equipo, String>{

}
