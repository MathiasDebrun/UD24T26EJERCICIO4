package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IInvestigadoresDAO;
import es.http.service.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService {
	
	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadoress() {
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public Investigadores investigadoresXID(String id) {
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores investigadores) {
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigadores(String id) {
		iInvestigadoresDAO.deleteById(id);
	}

}
