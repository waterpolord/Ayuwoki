package Logic;

import java.util.ArrayList;

public class Vacante {
	private Empresa empresa;
	private String puesto;
	private String TipoPersonal;
	private Boolean[] requisitos = new Boolean[9];
	private int CantPuestos;
	private int CantSolicitudes;
	private ArrayList<Persona> Solicitantes;
	
	public Vacante(Empresa empresa, String puesto, String tipoPersonal, Boolean[] requisitos,int CP) {
		
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
		CantPuestos = CP;
		Solicitantes = new ArrayList();
		CantSolicitudes = 0;
	}

	public void solicitar(Persona nueva) {
		Solicitantes.add(nueva);
		CantSolicitudes++;
	}
	
	public void cancelar(int ind) {
		Solicitantes.remove(ind);
		CantSolicitudes--;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTipoPersonal() {
		return TipoPersonal;
	}

	public void setTipoPersonal(String tipoPersonal) {
		TipoPersonal = tipoPersonal;
	}


	/* El metodo getSolicitudes permite ver 
	 * cuales son las personas que solicitaron el empleo*/
	 
	 public ArrayList getSolicitantes() {
		ArrayList<String> lista = new ArrayList();
		for(int i = 0;i<CantSolicitudes;i++) {
			lista.add(Solicitantes.get(i).getNombre());
		}
		return lista;
	}
	

}
