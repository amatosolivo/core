package entidades;

public final class Calle {
	private TipoCalle tipoCalle;
	
	public Calle() {
	}

	private Class<?> padre;

	public TipoCalle getTipoCalle() {
		return tipoCalle;
	}

	public void setTipoCalle(TipoCalle tipoCalle) {
		this.tipoCalle = tipoCalle;
	}

	public Class<?> getPadre() {
		return padre;
	}

	public void setPadre(Class<?> padre) {
		this.padre = padre;
	}
}
