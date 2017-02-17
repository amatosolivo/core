package entidades;

import java.util.List;

public class BarrioParajeSector extends Seccion {
	private List<SubBarrioParajeSector> subBarriosParajeSector;
	
	public BarrioParajeSector() {
		// TODO Auto-generated constructor stub
	}
	
	public List<SubBarrioParajeSector> getSubBarrios() {
		return subBarriosParajeSector;
	}
	
	public void setSeccion(String seccion) {
		super.setNombre(seccion);
	}
}