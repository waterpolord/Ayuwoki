package Logic;

public class Universitario extends Persona {
	private String carrera;

	public Universitario(String nombre, String apellido, String correo, String clave, Boolean estado, String carrera) {
		super(nombre, apellido, correo, clave, estado);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	


}
