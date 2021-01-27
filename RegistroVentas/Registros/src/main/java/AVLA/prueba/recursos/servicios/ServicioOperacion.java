package AVLA.prueba.recursos.servicios;

import java.util.List;

import AVLA.prueba.recursos.modelos.Operacion;

public interface ServicioOperacion {
	
	List<Operacion> encontrarOperacionesPorUsuario(Long userId);

}
