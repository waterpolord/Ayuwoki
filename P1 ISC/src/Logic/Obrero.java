package Logic;

import java.util.ArrayList;

public class Obrero extends Persona {
	private ArrayList<String> habilidades;
	
	public Obrero(String nombre, String apellido, String correo, String clave, Boolean estado,
			ArrayList<String> habilidades) {
		super(nombre, apellido, correo, clave, estado);
		this.habilidades = habilidades;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}



	
	
	
}
