package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class BarrioParajeSector extends ElementoDireccion {
	private List<SubBarrioParajeSector> subBarriosParajesSectores;

	public List<SubBarrioParajeSector> getSubBarriosParajesSectores() {
		return subBarriosParajesSectores;
	}

	public void setSubBarriosParajesSectores(List<SubBarrioParajeSector> subBarriosParajesSectores) {
		this.subBarriosParajesSectores = subBarriosParajesSectores;
	}	
}