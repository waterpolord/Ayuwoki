package Logic;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleo implements Serializable{
	
	private int monto;
	private Boolean[] habilidades = new Boolean[10];
	public Empleo( Boolean[] habilidades, int monto) {
		this.habilidades = habilidades;
		this.monto = monto;
	}
	

	public Boolean[] getHab() {
		return habilidades;
	}
	public int getMonto() {
		return monto;
	}

	
}
