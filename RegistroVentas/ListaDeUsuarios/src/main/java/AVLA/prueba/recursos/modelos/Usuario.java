package AVLA.prueba.recursos.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Column(name = "USER")
	private String usuario;
	private String password;
	@Id
	@Column(name ="USUARIOID")
	private Long usuarioId;
	
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	

	public Usuario(String usuario, String password, Long usuarioId) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.usuarioId = usuarioId;
	}

	public Usuario() {
		super();
	}	
	
	
}
