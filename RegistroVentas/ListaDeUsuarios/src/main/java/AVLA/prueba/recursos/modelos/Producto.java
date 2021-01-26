package AVLA.prueba.recursos.modelos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto {
	
	
	@Column(name = "NOMBREPRODUCTO")
	private String nombreProducto;
	@Id
	@Column(name ="PRODUCTOID")
	private Long productoId;
	private String descripcion;
	
	/*
	@OneToMany(mappedBy = "producto", cascade = {CascadeType.DETACH, CascadeType.MERGE, 
			CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Registro> registros;
	*/

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
	
	/*
	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	*/
	

	public Producto(String nombreProducto, Long productoId, String descripcion/*, List<Registro> registros*/) {
		super();
		this.nombreProducto = nombreProducto;
		this.productoId = productoId;
		this.descripcion = descripcion;/*
		this.registros = registros;*/
	}
	
	public Producto() {
		super();
	}
	

}
