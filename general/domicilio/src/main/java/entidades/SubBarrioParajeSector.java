package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class SubBarrioParajeSector extends ElementoDireccion {
	private List<Calle> calles;

	public List<Calle> getCalles() {
		return calles;
	}

	public void setCalles(List<Calle> calles) {
		this.calles = calles;
	}
}
