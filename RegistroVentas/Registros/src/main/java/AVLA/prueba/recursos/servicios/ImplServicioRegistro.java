package AVLA.prueba.recursos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AVLA.prueba.recursos.modelos.Registro;
import AVLA.prueba.recursos.repositorios.RepositorioRegistro;

@Service
public class ImplServicioRegistro implements ServicioRegistro{
	
	@Autowired
	RepositorioRegistro rr;

	@Override
	public List<Registro> traerRegistros(Long userId) {
		return rr.findByUsuarioId();
	}

}
