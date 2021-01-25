package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Registro {
	
	@EmbeddedId
	public PKRegistro registroPK;
	
	private Integer cantidad;
	private String cualidadDeRegistro;
	private String detallesAdicionales;
	private LocalDateTime timeStamp;
	
	@ManyToOne
	@JoinColumn(name = "USUARIOID")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCTOID")
	private Producto producto;

	public PKRegistro getRegistroPK() {
		return registroPK;
	}

	public void setRegistroPK(PKRegistro registroPK) {
		this.registroPK = registroPK;
	}

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Registro(PKRegistro registroPK, Integer cantidad, String cualidadDeRegistro, String detallesAdicionales,
			LocalDateTime timeStamp, Usuario usuario, Producto producto) {
		super();
		this.registroPK = registroPK;
		this.cantidad = cantidad;
		this.cualidadDeRegistro = cualidadDeRegistro;
		this.detallesAdicionales = detallesAdicionales;
		this.timeStamp = timeStamp;
		this.usuario = usuario;
		this.producto = producto;
	}

	public Registro() {
		super();
	}
	
	

	
}
