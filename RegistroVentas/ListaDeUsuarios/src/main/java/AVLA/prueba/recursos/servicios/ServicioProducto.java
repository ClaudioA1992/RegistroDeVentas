package AVLA.prueba.recursos.servicios;

import java.util.Optional;

import AVLA.prueba.recursos.modelos.Producto;

public interface ServicioProducto {
	
	Optional<Producto> encontrarProductoPorId(Long productoId);
	
	void guardarProducto(Producto producto);
	
	void eliminarProducto(Long productoId);

}
