package Logic;

import java.util.ArrayList;

public class Tecnico extends Persona {
	
	private String especialidad;

	public Tecnico(String nombre, String apellido, String correo, String clave, Boolean estado, String especial) {
		super(nombre, apellido, correo, clave, estado);

		especialidad = especial;
	}

	public String getEspecialidad(int ind) {
		return especialidad;
	}

	


}
