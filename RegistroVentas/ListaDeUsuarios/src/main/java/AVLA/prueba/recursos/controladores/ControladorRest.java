package AVLA.prueba.recursos.controladores;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import AVLA.prueba.recursos.modelos.Registro;

@RestController
@RequestMapping("/usuario")
public class ControladorRest {
	
	@Autowired 
	private WebClient.Builder wCBuilder;
	
	@RequestMapping("/{userId}")
	public List<Registro> getVentas(@PathVariable("userId") String userId) {
		
				
		//get all rated movies IDs
		/*List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678", 3)
				);*/
		
		
		
		ratings.stream().map(rating -> { 
			
			Movie movie = wCBuilder.build()
				.get()
				.uri("http://localhost:8091/movies/" + rating.getMovieId())
				.retrieve()
				.bodyToMono(Movie.class)
				.block();
			
			/*Movie movie = restTemplate.getForObject("http://localhost:8091/movies/" + rating.getMovieId(), Movie.class);*/
			return new CatalogItem(movie.getName(), "Test", rating.getRating());	
			
		})
		.collect(Collectors.toList());
		
		//For each movie ID, call movie info service and get details
		
		//Put them all together
		
		return Collections.singletonList(
				new CatalogItem("Trasformers", "Test", 4)
				);
		
	}

}
