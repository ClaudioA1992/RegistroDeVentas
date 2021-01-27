package AVLA.prueba.recursos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AVLA.prueba.recursos.modelos.Usuario;
import AVLA.prueba.recursos.repositorios.RepositorioUsuario;

@Service
public class ImplServicioUsuario implements ServicioUsuario {
	
	@Autowired
	RepositorioUsuario ru;

	@Override
	public Usuario encontrarUsuarioPorUsuario(String usuario) {
		return ru.findByUsuario(usuario);
	}
	
	

}
