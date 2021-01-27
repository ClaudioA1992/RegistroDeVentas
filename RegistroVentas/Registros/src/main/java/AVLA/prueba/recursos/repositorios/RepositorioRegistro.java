package AVLA.prueba.recursos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AVLA.prueba.recursos.modelos.Registro;

@Repository
public interface RepositorioRegistro extends JpaRepository<Registro, Long>{

}
