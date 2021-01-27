package AVLA.prueba.recursos.servicios;

import java.util.List;
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
	public List<Producto> encontrarTodosLosProductos() {
		return rp.findAll();
	}

	@Override
	public Optional<Producto> encontrarUnProductoPorId(Long productoId) {
		return rp.findById(productoId);
	}

}
