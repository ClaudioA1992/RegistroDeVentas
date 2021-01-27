package AVLA.prueba.recursos.controladores;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import AVLA.prueba.recursos.modelos.Operacion;
import AVLA.prueba.recursos.modelos.Producto;
import AVLA.prueba.recursos.modelos.Registro;
import AVLA.prueba.recursos.servicios.ServicioOperacion;
import AVLA.prueba.recursos.servicios.ServicioProducto;

@RestController
@RequestMapping("/usuario")
public class ControladorRest {
	
	/*
	@Autowired 
	private WebClient.Builder wCBuilder;
	*/
	
	@Autowired
	private RestTemplate rt;
	
	@Autowired
	ServicioProducto sp;
	
	@Autowired
	ServicioOperacion op;
	
	@RequestMapping("/{userId}")
	public List<Registro> getVentas(@PathVariable("userId") Long userId) {
		
				
		List<Registro> ventas = Arrays.asList();
		
		final String uri = "http://localhost:8091/registros/" + userId; 
		
	    ResponseEntity<List<Registro>> llamada =
	            rt.exchange(uri,
	                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Registro>>() {
	                });
	    List<Registro> registros = llamada.getBody();
		
		/*
		List<Registro> registros = Arrays.asList(
				rt.getForObject("http://localhost:8091/registros/" + userId, new ParameterizedTypeReference<ArrayList<Registro>>() {})
				);*/

		registros.stream().forEach(registro -> { 
			
			/*
			Registro registro = wCBuilder.build()
				.get()
				.uri("http://localhost:8091/movies/" + ventas.getMovieId())
				.retrieve()
				.bodyToMono(Movie.class)
				.block();
			*/
			
			if (registro.getUsuarioId() == userId){
				
				ventas.add(registro);
				
			}
			
				/*
			Registro local = rt.getForObject("http://localhost:8091/registro/" + registro.getUsuarioId(), Registro.class);
			return new Registro(local.getCantidad(), local.getCualidadDeRegistro(), local.getDetallesAdicionales(), local.getTimeStamp());
			*/
			
			
		});
		/*.collect(Collectors.toList());*/
	
		return ventas;
		
	}
	
	@RequestMapping("/editar/{productoId}")
	public String editarProducto(@PathVariable("productoId") Long productoId, Model m, Producto producto) {
		
		Optional<Producto> registrado = sp.encontrarProductoPorId(productoId);
		
		String mensaje;
		
		if (registrado.isPresent()) {
			
			Producto guardar = registrado.get();
			
			sp.guardarProducto(guardar);
			
			mensaje = "Producto editado con éxito";
			
		}
		
		else {
			
			mensaje = "Error en la edición";
			
		}
		
		return mensaje;
		
	}
	
	@RequestMapping("/ingresar")
	public String ingresarProducto(Model m, Producto producto) {
		
		Optional<Producto> registrado = sp.encontrarProductoPorId(producto.getProductoId());

		String mensaje;
		
		if (registrado.isPresent()) {
			
			Producto guardar = registrado.get();
			
			sp.guardarProducto(guardar);
			
			mensaje = "Producto editado con éxito";
			
		}
		
		else {
			
			mensaje = "Error en la edición";
			
		}
		
		return mensaje;
		
	}
	
	@RequestMapping("/eliminar")
	public String eliminarProducto(Producto producto) {
		
		Optional<Producto> registrado = sp.encontrarProductoPorId(producto.getProductoId());
		
		String mensaje;
		
		if (registrado.isPresent()) {
			
			Producto eliminar = registrado.get();
			
			try {
				
				sp.eliminarProducto(eliminar.getProductoId());
				
				mensaje = "Producto eliminado con éxito";
				
				return mensaje;
				
			}
			
			catch(Exception e) {
				
				mensaje = "Error en la eliminación";
				
				return mensaje;
				
			}
			
			
			
		}
		
		else {
			
			mensaje = "Error en la edición";
			
		}
		
		return mensaje;
		
	}
	
	@RequestMapping("/ingresarOperacion")
	public String ingresarOperacion(Operacion operacion) {
			
		String mensaje;
		
		try {
			
			op.ingresarOperacion(operacion);
			
			mensaje = "Producto editado con éxito";
			
		}
		
		catch(Exception e) {
			
			mensaje = "Error en la edición";
			
		}
		
		return mensaje;
		
	}

}
