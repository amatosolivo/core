package entidades;

import java.util.List;

public class Region extends MacroRegion {
	private List<Provincia> provincias;
	
	public Region() {
		// TODO Auto-generated constructor stub
	}
	
	public Region(String macroRegion) {
		super.setNombre(macroRegion);
	}
	
	public List<Provincia> getProvincias() {
		return provincias;
	}
}