package Logic;

import java.util.ArrayList;

import Visual.Inicio;

public class Principal {
	private ArrayList<Persona> Tpersonas;
	private ArrayList<Empresa> TEmpresas;
	private ArrayList<Empleo> TEmpleos;
	private ArrayList<Vacante> TVacantes;
	private static Principal principal;

	public static void main(String args[]) {
		new Inicio().setVisible(true); 
	}
	public Principal getInstance() {
		if(principal == null) {
			principal = new Principal();
		}
		return principal;
	}
	
	public ArrayList<Persona> getTpersonas() {
		return Tpersonas;
	}
	public void setTpersonas(Persona nueva) {
		Tpersonas.add(nueva);
	}
	public ArrayList<Empresa> getTEmpresas() {
		return TEmpresas;
	}
	public void setTEmpresas(Empresa empresa) {
		TEmpresas.add(empresa);
	}
	public ArrayList<Empleo> getTEmpleos() {
		return TEmpleos;
	}
	public void setTEmpleos(Empleo nuevo) {
		TEmpleos.add(nuevo);
	}
	public ArrayList<Vacante> getTVacantes() {
		return TVacantes;
	}
	public void setTVacantes(Vacante vacante) {
		TVacantes.add(vacante);
	}
	
	public Boolean existeEmpresa(String txt) {
		for(Empresa empre:TEmpresas) {
			if(empre.getCorreo().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean existeUser(String txt) {
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Persona buscarPersonas(String txt) {
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt)) {
				return aux;
			}
		}
		return null;
	}
	public ArrayList RetornarObrerosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Obrero && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList RetornarUniversitariosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Universitario && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList RetornarTecnicosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Tecnico && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	

	

}
