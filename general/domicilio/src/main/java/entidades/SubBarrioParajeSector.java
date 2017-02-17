package entidades;

import java.util.List;

public class SubBarrioParajeSector extends BarrioParajeSector {
	private List<Calle> calles;

	public SubBarrioParajeSector() {
		// TODO Auto-generated constructor stub
	}

	public SubBarrioParajeSector(String barrioParajeSector) {
		super.setNombre(barrioParajeSector);
	}
	
	public List<Calle> getCalles() {
		return calles;
	}
	
	public void setBarrioParajeSector(String barrioParajeSector) {
		super.setNombre(barrioParajeSector);
	}
}
