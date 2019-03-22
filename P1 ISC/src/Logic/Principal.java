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

	

}
