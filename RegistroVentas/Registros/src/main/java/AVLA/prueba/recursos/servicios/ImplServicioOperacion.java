package AVLA.prueba.recursos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AVLA.prueba.recursos.modelos.Operacion;
import AVLA.prueba.recursos.repositorios.RepositorioOperacion;

@Service
public class ImplServicioOperacion implements ServicioOperacion {
	
	@Autowired
	RepositorioOperacion ro;

	@Override
	public List<Operacion> encontrarOperacionesPorUsuario(Long userId) {
		return ro.findByUsuarioId(userId);
	}

}
