package AVLA.prueba.recursos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AVLA.prueba.recursos.modelos.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{

}
