package AVLA.prueba.recursos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AVLA.prueba.recursos.modelos.Operacion;

public interface RepositorioOperacion extends JpaRepository<Operacion, Long>{

	List<Operacion> findByUsuarioId(Long userId);

}
