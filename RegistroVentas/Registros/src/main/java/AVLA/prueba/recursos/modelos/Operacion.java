package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operacion {
	
	@Id
	@Column(name = "operacionid")
	private Long operacionId;
	
	private String accion;
	@Column(name = "DATESTAMP")
	private LocalDateTime dateStamp;
	@Column(name ="usuarioid")
	private Long usuarioId;
	/*
	@ManyToOne
	@JoinColumn(name = "USUARIOID")
	private Usuario usuario;
	*/
	

	public String getAccion() {
		return accion;
	}

	public Long getOperacionId() {
		return operacionId;
	}

	public void setOperacionId(Long operacionId) {
		this.operacionId = operacionId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
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

	/*
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	*/

	public Operacion() {
		super();
	}

	public Operacion(String accion, LocalDateTime dateStamp/*, Usuario usuario*/) {
		super();
		this.accion = accion;
		this.dateStamp = dateStamp;
		/*
		this.usuario = usuario;
		*/
	}
	

}
