package AVLA.prueba.recursos.modelos;

import javax.persistence.Column;

public class PKRegistro {
	
	
	@Column(name = "USUARIOID")
	private Long usuarioId;
	@Column(name = "PRODUCTOID")
	private Long productoId;
	
	
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
	
	public PKRegistro(Long usuarioId, Long productoId) {
		super();
		this.usuarioId = usuarioId;
		this.productoId = productoId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productoId == null) ? 0 : productoId.hashCode());
		result = prime * result + ((usuarioId == null) ? 0 : usuarioId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PKRegistro other = (PKRegistro) obj;
		if (productoId == null) {
			if (other.productoId != null)
				return false;
		} else if (!productoId.equals(other.productoId))
			return false;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}
	
	
	
	
}
