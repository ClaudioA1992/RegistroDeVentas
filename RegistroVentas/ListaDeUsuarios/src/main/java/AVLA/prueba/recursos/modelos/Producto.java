package AVLA.prueba.recursos.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
	
	
	@Column(name = "NOMBREPRODUCTO")
	private String nombreProducto;
	@Id
	@Column(name ="PRODUCTOID")
	private Long productoId;
	private String descripcion;
	

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public Producto(String nombreProducto, Long productoId, String descripcion) {
		super();
		this.nombreProducto = nombreProducto;
		this.productoId = productoId;
		this.descripcion = descripcion;
	}
	
	public Producto() {
		super();
	}
	

}
