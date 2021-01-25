package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Operacion {
	
	
	private String accion;
	@Column(name = "DATESTAMP")
	private LocalDateTime dateStamp;
	
	@ManyToOne
	@JoinColumn(name = "USUARIOID")
	private Usuario usuario;
	

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public LocalDateTime getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(LocalDateTime dateStamp) {
		this.dateStamp = dateStamp;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	public Operacion() {
		super();
	}

	public Operacion(String accion, LocalDateTime dateStamp, Usuario usuario) {
		super();
		this.accion = accion;
		this.dateStamp = dateStamp;
		this.usuario = usuario;
	}
	
	
}
