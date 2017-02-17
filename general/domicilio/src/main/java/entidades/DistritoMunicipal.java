package entidades;

import java.util.List;

public class DistritoMunicipal extends Municipio {
	private List<Seccion> secciones;
	
	public DistritoMunicipal() {
		// TODO Auto-generated constructor stub
	}
	
	public DistritoMunicipal(String municipio) {
		super.setNombre(municipio);
	}
	
	public List<Seccion> getSecciones() {
		return secciones;
	}
}
