package Logic;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public abstract class Persona implements Serializable{
	
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected String clave;
	protected Boolean estado;
	protected Empleo Solicitud;
	protected Boolean Sesion;
	protected int tieneSolicitud = 0;
	
	
	public Persona(String nombre, String apellido, String correo, String clave, Boolean estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.clave = clave;
		this.estado = estado;
		Sesion = true;
	}
	
	public Empleo getSolicitud() {
		return Solicitud;
	}
	
	public void setSolicitud(Empleo guardar) throws FileNotFoundException, ClassNotFoundException, IOException {
		Solicitud = guardar;
		tieneSolicitud = 1;
		Principal.getInstance().setTEmpleos(guardar);
	}
	
	public int getSoli() {
		return tieneSolicitud;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setSesion(Boolean sesion) {
		this.Sesion = sesion;
	}
	
	public Boolean getSesion() {
		return this.Sesion;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

}

