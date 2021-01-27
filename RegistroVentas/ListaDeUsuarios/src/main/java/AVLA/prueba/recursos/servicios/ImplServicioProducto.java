package AVLA.prueba.recursos.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AVLA.prueba.recursos.modelos.Producto;
import AVLA.prueba.recursos.repositorios.RepositorioProducto;

@Service
public class ImplServicioProducto implements ServicioProducto {
	
	@Autowired
	RepositorioProducto rp;

	@Override
	public Optional<Producto> encontrarProductoPorId(Long productoId) {
		return rp.findById(productoId);
	}

	@Override
	public void guardarProducto(Producto producto) {
		rp.save(producto);
	}

	@Override
	public void eliminarProducto(Long productoId) {
		rp.deleteById(productoId);
	}

}
