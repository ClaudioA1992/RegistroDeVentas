package AVLA.prueba.recursos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1><br>"
				+ "<p>This is Spring Security</p>");
	}
}
