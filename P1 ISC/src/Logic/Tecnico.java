package Logic;

import java.util.ArrayList;

public class Tecnico extends Persona {
	
	private ArrayList<String> especialidad;

	public Tecnico(String nombre, String apellido, String correo, String clave, Boolean estado, String especial) {
		super(nombre, apellido, correo, clave, estado);
		especialidad = new ArrayList();
		especialidad.add(especial);
	}

	public String getEspecialidad(int ind) {
		return especialidad.get(ind);
	}

	public void setEspecialidad(String esp) {
		especialidad.add(esp);
	}
	


}
