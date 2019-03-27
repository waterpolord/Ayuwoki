package Logic;

import java.util.ArrayList;

public class Universitario extends Persona {
	private String carrera;

	public Universitario(String nombre, String apellido, String correo, String clave, Boolean estado, String car) {
		super(nombre, apellido, correo, clave, estado);
		carrera = car;
	}

	public String getCarrera(int ind) {
		return carrera;
	}

	

	


}
