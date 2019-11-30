package Logic;

import Interfaces.EmpresaDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable, EmpresaDAO{

	private String Nombre;
	
	private String telefono;
	private String correo;
	private String clave;
	private String encargado;
	private String tipo;
	private ArrayList<Vacante> MisVacantes;

    public void setMisVacantes(ArrayList<Vacante> MisVacantes) {
        this.MisVacantes = MisVacantes;
    }
	private Boolean Sesion;
	private int codigoMisVacantes = 1029;
	
	public Empresa(String nombre, String telefono, String correo, String clave, String encargado,
			String tipos) {
		Nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.clave = clave;
		this.encargado = encargado;
		tipo = tipos;
		Sesion = true;
		MisVacantes = new ArrayList<Vacante>();
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public String getTipo() {
		return tipo; 
	}
	
	public int getCode() {
		return codigoMisVacantes; 
	}
	
	public void setVacante(Vacante nueva) throws FileNotFoundException, ClassNotFoundException, IOException {
		codigoMisVacantes++;
		MisVacantes.add(nueva);
		Principal.getInstance().setTVacantes(nueva);
	}
	
	public ArrayList<Vacante> getMisVacantes() {
		return MisVacantes;	}
	
	public void setSesion(Boolean sesion) {
		this.Sesion = sesion;
	}
	public Boolean getSesion() {
		return this.Sesion;
	}
	
	public Vacante BuscarVacantes(int code) {
		for(Vacante aux:MisVacantes) {
			if(aux.getCodigo() == code) {
				return aux;
			}
		}
		return null;
	}
	
	public int getVacantesActivas() {
		int ind = 0;
		for(Vacante aux:MisVacantes) {
			if(aux.getEstado()) {
				ind++;
			}
		}
		return ind;
	}

    @Override
    public void Registrar(Empresa Nuevo) throws Exception {
    
    
    }

    @Override
    public void Modificar(Empresa Nuevo) throws Exception {
    }

    @Override
    public void Eliminar(Empresa Nuevo) throws Exception {
    }

    @Override
    public void RetornarEmpresa() throws Exception {
   
    }

}
