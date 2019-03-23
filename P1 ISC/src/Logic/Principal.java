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
	public void setTpersonas(ArrayList<Persona> tpersonas) {
		Tpersonas = tpersonas;
	}
	public ArrayList<Empresa> getTEmpresas() {
		return TEmpresas;
	}
	public void setTEmpresas(ArrayList<Empresa> tEmpresas) {
		TEmpresas = tEmpresas;
	}
	public ArrayList<Empleo> getTEmpleos() {
		return TEmpleos;
	}
	public void setTEmpleos(ArrayList<Empleo> tEmpleos) {
		TEmpleos = tEmpleos;
	}
	public ArrayList<Vacante> getTVacantes() {
		return TVacantes;
	}
	public void setTVacantes(ArrayList<Vacante> tVacantes) {
		TVacantes = tVacantes;
	}
	public static Principal getPrincipal() {
		return principal;
	}
	public static void setPrincipal(Principal principal) {
		Principal.principal = principal;
	}

	

}
