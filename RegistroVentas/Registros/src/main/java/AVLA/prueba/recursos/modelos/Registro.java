package AVLA.prueba.recursos.modelos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registro {
	

	@Id
	@Column(name="idregistro")
	private Long idRegistro;
	
	@EmbeddedId
	private PKRegistro pk;
	
	private Integer cantidad;
	private String cualidadDeRegistro;
	private String detallesAdicionales;
	private LocalDateTime timeStamp;
	

	public Integer getCantidad() {
		return cantidad;
	}

	public Long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public PKRegistro getPk() {
		return pk;
	}

	public void setPk(PKRegistro pk) {
		this.pk = pk;
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



	public Registro() {
		super();
	}

}
