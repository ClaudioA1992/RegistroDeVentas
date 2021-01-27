package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registro {

	@Id
	@Column(name = "REGISTROID")
	private Long registroId;
	
	@Column(name = "USUARIOID")
	private Long usuarioId;
	@Column(name = "PRODUCTOID")
	private Long productoId;
	
	private Integer cantidad;
	private String cualidadDeRegistro;
	private String detallesAdicionales;
	private LocalDateTime timeStamp;
	

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCualidadDeRegistro() {
		return cualidadDeRegistro;
	}

	public void setCualidadDeRegistro(String cualidadDeRegistro) {
		this.cualidadDeRegistro = cualidadDeRegistro;
	}

	public String getDetallesAdicionales() {
		return detallesAdicionales;
	}

	public void setDetallesAdicionales(String detallesAdicionales) {
		this.detallesAdicionales = detallesAdicionales;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Registro(Integer cantidad, String cualidadDeRegistro, String detallesAdicionales,
			LocalDateTime timeStamp) {
		super();

		this.cantidad = cantidad;
		this.cualidadDeRegistro = cualidadDeRegistro;
		this.detallesAdicionales = detallesAdicionales;
		this.timeStamp = timeStamp;

	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	public Registro() {
		super();
	}
	
	

	
}
