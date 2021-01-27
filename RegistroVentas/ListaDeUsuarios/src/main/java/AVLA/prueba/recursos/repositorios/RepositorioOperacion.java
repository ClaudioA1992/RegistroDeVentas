package AVLA.prueba.recursos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AVLA.prueba.recursos.modelos.Operacion;

@Repository
public interface RepositorioOperacion extends JpaRepository<Operacion, Long>{

}
