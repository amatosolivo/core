package entidades;

import java.util.List;

public class Municipio extends Provincia {
	private List<DistritoMunicipal> distritosMunicipales;
	
	public Municipio() {
		// TODO Auto-generated constructor stub
	}
	
	public Municipio(String provincia) {
		super.setNombre(provincia);
	}
	
	public List<DistritoMunicipal> getDistritosMunicipales() {
		return distritosMunicipales;
	}
}
