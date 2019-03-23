package Logic;

import java.util.ArrayList;

public class Empresa {
	private String Nombre;
	private String descripcion;
	private String telefono;
	private String correo;
	private String clave;
	private String encargado;
	private ArrayList<String> tipo;
	
	public Empresa(String nombre, String descripcion, String telefono, String correo, String clave, String encargado,
			ArrayList<String> tipo) {
		super();
		Nombre = nombre;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.correo = correo;
		this.clave = clave;
		this.encargado = encargado;
		this.tipo = tipo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public ArrayList<String> getTipo() {
		return tipo;
	}
	public void setTipo(ArrayList<String> tipo) {
		this.tipo = tipo;
	}
	
	

}
