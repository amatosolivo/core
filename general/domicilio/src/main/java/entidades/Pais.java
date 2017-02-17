package entidades;

import java.util.List;

import abstractos.ElementoDireccion;

public class Pais extends ElementoDireccion {
	private List<MacroRegion> macroRegiones;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}
	
	public List<MacroRegion> getMacroRegiones() {
		return macroRegiones;
	}
}
