package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class Provincia extends ElementoDireccion {
	private Capital capital;
	private List<Municipio> municipios;

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
	
	
}
