package AVLA.prueba.recursos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import AVLA.prueba.recursos.repositorios.RepositorioUsuario;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = RepositorioUsuario.class)
public class LoginJpaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
