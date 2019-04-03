package Logic;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleo implements Serializable{
	
	private Persona user;
	private File curriculum;
	private Boolean[] habilidades = new Boolean[9];
	public Empleo(Persona user, Boolean[] habilidades) {
		this.user = user;
		this.habilidades = habilidades;
	}
	public Persona getUser() {
		return user;
	}
	public void setUser(Persona user) {
		this.user = user;
	}
	public Boolean[] getHab() {
		return habilidades;
	}

	
}
