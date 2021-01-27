package AVLA.prueba.recursos.servicios;

import java.util.Optional;

import AVLA.prueba.recursos.modelos.Usuario;

public interface ServicioUsuario {
	
	Optional<Usuario> encontrarUsuarioPorId(Long userId);

}
