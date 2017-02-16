package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class MacroRegion extends ElementoDireccion {
	private List<Region> regiones;

	public List<Region> getRegiones() {
		return regiones;
	}

	public void setRegiones(List<Region> region) {
		this.regiones = region;
	}
}
