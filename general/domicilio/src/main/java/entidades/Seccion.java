package entidades;

import java.util.List;

public class Seccion extends DistritoMunicipal {
	private List<BarrioParajeSector> barriosParajesSectores; 
	public Seccion() {
		// TODO Auto-generated constructor stub
	}
	
	public Seccion(String distritoMunicipal) {
		super.setNombre(distritoMunicipal);
	}
	
	public List<BarrioParajeSector> getBarriosParajesSectores () {
		return barriosParajesSectores;
	}
}
