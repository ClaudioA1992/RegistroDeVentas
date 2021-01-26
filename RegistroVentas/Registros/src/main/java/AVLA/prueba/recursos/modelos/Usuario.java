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
	
	/*
	@OneToMany(mappedBy = "usuario", cascade = {CascadeType.DETACH, CascadeType.MERGE, 
			CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Registro> registros;
	
	@OneToMany(mappedBy = "usuario", cascade = {CascadeType.DETACH, CascadeType.MERGE, 
			CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Operacion> operaciones;
	*/
	

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

	/*
	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	*/
	

	public Usuario(String usuario, String password, Long usuarioId/*, List<Registro> registros,
			List<Operacion> operaciones*/) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.usuarioId = usuarioId;
		/*
		this.registros = registros;
		this.operaciones = operaciones;
		*/
	}

	public Usuario() {
		super();
	}	
}
