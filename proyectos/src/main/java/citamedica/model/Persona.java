package citamedica.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "persona")
public class Persona implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpersona")
	private int idPersona;

	@Column(name = "nombre", length = 45)
	private String nombre;

	@Column(name = "apellido", length = 45)
	private String apellido;

	private byte[] foto;

	private boolean activo;

	@Basic(optional = false)
	@Column(name = "registrado", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date registrado;

	public Persona() {
	}

	public Persona(String nombre, String apellido, byte[] foto, boolean activo, Date registrado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.foto = foto;
		this.activo = activo;
		this.registrado = registrado;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getRegistrado() {
		return registrado;
	}

	public void setRegistrado(Date registrado) {
		this.registrado = registrado;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", foto=" + Arrays.toString(foto) + ", activo=" + activo + ", registrado=" + registrado + "]";
	}

}
