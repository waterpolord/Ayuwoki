package Logic;

import java.io.File;
import java.util.ArrayList;

public class Empleo {
	
	private Persona user;
	private File curriculum;
	private ArrayList<String> habilidades;
	public Empleo(Persona user, ArrayList<String> habilidades) {
		this.user = user;
		this.habilidades = habilidades;
	}
	public Persona getUser() {
		return user;
	}
	public void setUser(Persona user) {
		this.user = user;
	}
	public ArrayList<String> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}

	
}
