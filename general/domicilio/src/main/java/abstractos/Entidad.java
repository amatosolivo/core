package abstractos;

import java.time.LocalDateTime;

public abstract class Entidad {
	private int entidadId;
	private String codigo;
	private LocalDateTime fechaCreacion;
	private Boolean requerida;

	public Entidad() {
		this.fechaCreacion = LocalDateTime.now();
		this.entidadId = 0; //Generar un secuenciador para la entidad
		
	}

	public int getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(int entidadId) {
		this.entidadId = entidadId;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public Boolean getRequerida() {
		return requerida;
	}

	public void setRequerida(Boolean requerida) {
		this.requerida = requerida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
