package entidades;

import java.util.List;

public class Provincia extends Region {
	private List<Municipio> municipios;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	
	public Provincia(String region) {
		super.setNombre(region);
	}
	
	public List<Municipio> getMunicipios() {
		return municipios;
	}
}
