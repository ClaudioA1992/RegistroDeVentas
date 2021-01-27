package AVLA.prueba.recursos.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AVLA.prueba.recursos.modelos.Registro;
import AVLA.prueba.recursos.servicios.ServicioRegistro;

@RestController
public class ControladorRestPrincipal {
	
	@Autowired
	ServicioRegistro sr;
	
	@RequestMapping("/registros")
	public List<Registro> getRegistros() {
		
		return sr.traerRegistros();
		
	}
	
	

}
