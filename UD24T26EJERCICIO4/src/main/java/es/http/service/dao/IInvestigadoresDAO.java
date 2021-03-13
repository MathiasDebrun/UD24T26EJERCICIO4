package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Investigadores;

/**
 * @author Jose
 *
 */
public interface IInvestigadoresDAO extends JpaRepository<Investigadores, String>{
	
}
