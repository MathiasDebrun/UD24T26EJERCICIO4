package es.http.service.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Facultad;

/**
 * @author Jose
 *
 */
public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{


}
