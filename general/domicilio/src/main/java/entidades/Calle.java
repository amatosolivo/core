package entidades;

public final class Calle extends SubBarrioParajeSector {
	private TipoCalle tipoCalle;
	
	public Calle() {
		// TODO Auto-generated constructor stub
	}

	public TipoCalle getTipoCalle() {
		return tipoCalle;
	}

	public void setTipoCalle(TipoCalle tipoCalle) {
		this.tipoCalle = tipoCalle;
	}
	
	public void setSubBarrioParajeSector (String subBarrio) {
		super.setNombre(subBarrio);
	}
}
