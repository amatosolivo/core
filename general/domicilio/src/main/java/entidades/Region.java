package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class Region extends ElementoDireccion {
	private List<Provincia> provincias;

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
}