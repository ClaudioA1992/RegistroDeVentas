package AVLA.prueba.recursos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import AVLA.prueba.recursos.modelos.Usuario;
import AVLA.prueba.recursos.repositorios.RepositorioUsuario;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	RepositorioUsuario ru;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario= Optional.of(ru.findByUsuario(username));
		
		usuario.orElseThrow(() -> new UsernameNotFoundException("Not found" + username));
		
		return usuario.map(MyUserDetails::new).get();
		
	}

}
