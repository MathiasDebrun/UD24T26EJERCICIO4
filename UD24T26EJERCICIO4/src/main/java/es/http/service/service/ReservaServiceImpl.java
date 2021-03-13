package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.http.service.dao.*;

import es.http.service.dto.Reserva;
import es.http.service.dao.IReservaDAO;

@Service
public class ReservaServiceImpl implements IReservaService {
	
	@Autowired
	IReservaDAO IReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		return IReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva investigadores) {
		return IReservaDAO.save(investigadores);
	}

	
	@Override
	public Reserva ReservaXID(int id) {
		return IReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva investigadores) {
		return IReservaDAO.save(investigadores);
	}

	@Override
	public void eliminarReserva(int id) {
		IReservaDAO.deleteById(id);
	}

}
