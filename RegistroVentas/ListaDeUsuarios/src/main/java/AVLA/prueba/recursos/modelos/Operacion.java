package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operacion {
	
	@Id
	@Column(name = "OPERACIONID")
	private Long operacionId;
	
	
	private String accion;
	@Column(name = "DATESTAMP")
	private LocalDateTime dateStamp;
	@Column(name ="USUARIOID")
	private Long usuarioId;
	private String pagina;



	public Long getOperacionId() {
		return operacionId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public void setOperacionId(Long operacionId) {
		this.operacionId = operacionId;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
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


	public Operacion() {
		super();
	}

	public Operacion(String accion, LocalDateTime dateStamp) {
		super();
		this.accion = accion;
		this.dateStamp = dateStamp;

	}
	
	
}
