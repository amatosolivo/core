package entidades;

import java.util.List;

public class MacroRegion extends Pais {
	private List<Region> regiones;
	
	public MacroRegion() {
		// TODO Auto-generated constructor stub
	}
	
	public MacroRegion(String pais) {
		super.setNombre(pais);
	}
	
	public List<Region> getRegiones() {
		return regiones;
	}
}
