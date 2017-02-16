package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class Municipio extends ElementoDireccion {
	private List<DistritoMunicipal> distritosMunicipales;

	public List<DistritoMunicipal> getDistritosMunicipales() {
		return distritosMunicipales;
	}

	public void setDistritosMunicipales(List<DistritoMunicipal> distritosMunicipales) {
		this.distritosMunicipales = distritosMunicipales;
	}
}
