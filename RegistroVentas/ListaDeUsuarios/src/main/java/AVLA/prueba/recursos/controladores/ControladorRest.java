package AVLA.prueba.recursos.controladores;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import AVLA.prueba.recursos.modelos.Registro;

@RestController
@RequestMapping("/usuario")
public class ControladorRest {
	
	/*
	@Autowired 
	private WebClient.Builder wCBuilder;
	*/
	
	@Autowired
	private RestTemplate rt;
	
	@RequestMapping("/{userId}")
	public List<Registro> getVentas(@PathVariable("userId") String userId) {
		
				
		//obtener todas las ventas de usuario
		List<Registro> ventas = Arrays.asList();
		
		List<Registro> registros = Arrays.asList();
			
		registros = rt.getForObject("http://localhost:8091/registros/" + userId, new ParameterizedTypeReference<List<Registro>>() {});

			
		registros.stream().map(registro -> { 
			
			/*
			Registro registro = wCBuilder.build()
				.get()
				.uri("http://localhost:8091/movies/" + ventas.getMovieId())
				.retrieve()
				.bodyToMono(Movie.class)
				.block();
			*/
			
			Registro local = rt.getForObject("http://localhost:8091/movies/" + registro.getUsuarioId(), Registro.class);
			return new Registro(local.getCantidad(), local.getCualidadDeRegistro(), local.getDetallesAdicionales(), local.getTimeStamp());	
			
		})
		.collect(Collectors.toList());
		
		//For each movie ID, call movie info service and get details
		
		//Put them all together
		
//		return Collections.singletonList(
//				new CatalogItem("Trasformers", "Test", 4)
//				);
		
	}

}
