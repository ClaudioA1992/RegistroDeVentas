package AVLA.prueba.recursos.servicios;

import java.util.List;
import java.util.Optional;

import AVLA.prueba.recursos.modelos.Producto;

public interface ServicioProducto {
	
	List<Producto> encontrarTodosLosProductos();
	
	Optional<Producto> encontrarUnProductoPorId(Long productoId);

}
