package AVLA.prueba.recursos.modelos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PKRegistro {
	
	@Column(name = "USUARIOID")
	private Long usuarioId;
	@Column(name = "PRODUCTOID")
	private Long productoId;

}
