package Logic;

public class Tecnico extends Persona {
	
	private String especialidad;

	public Tecnico(String nombre, String apellido, String correo, String clave, Boolean estado, String especialidad) {
		super(nombre, apellido, correo, clave, estado);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	


}
