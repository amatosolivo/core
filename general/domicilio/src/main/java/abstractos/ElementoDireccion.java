package abstractos;

public abstract class ElementoDireccion extends Entidad {
	private String nombre;
	private String descripcion;
	private String expresionRegular;

	public ElementoDireccion() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExpresionRegular() {
		return expresionRegular;
	}
	public void setExpresionRegular(String expresionRegular) {
		this.expresionRegular = expresionRegular;
	}
}
