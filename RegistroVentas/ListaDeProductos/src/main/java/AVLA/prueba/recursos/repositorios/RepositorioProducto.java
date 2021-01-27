package AVLA.prueba.recursos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AVLA.prueba.recursos.modelos.Producto;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Long>{

}
