package Logic;

import java.util.ArrayList;

public class Obrero extends Persona {
	
	private ArrayList<String> habilidades;
	
	public Obrero(String nombre, String apellido, String correo, String clave, Boolean estado, String hab) {
		super(nombre, apellido, correo, clave, estado);
		habilidades.add(hab);
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String hab) {
		habilidades.add(hab);
	}
	



	
	
	
}
