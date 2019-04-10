package Logic;

import java.io.Serializable;
import java.util.ArrayList;

public class Vacante implements Serializable{
	private Empresa empresa;
	private String puesto;
	private String TipoPersonal;
	private Boolean[] requisitos = new Boolean[10];
	private Boolean estado;
	private int CantPuestos;
	private int monto;
	private ArrayList<Persona> Solicitantes;
	private int codigoVacante;
	
	public Vacante(Empresa empresa, String puesto, String tipoPersonal, Boolean[] requisitos,int CP, int Monto,int codigo) {
		
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
		CantPuestos = CP;
		Solicitantes = new ArrayList();
		this.monto = Monto;
		codigoVacante = codigo;
		this.estado = true;
	}
	
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}


	public void solicitar(Persona nueva) {
		Solicitantes.add( nueva);
		Organizar();
		CantPuestos--;
		if(CantPuestos == 0) {
			estado = false;
		}
	}
	
	
	// Despues de determinar si el reemplazo aplica se 
	//usa esta funcion para reemplazar una persona con menos habilidades
	public void Reemplazo(Persona user,int ind) {
		Solicitantes.add(ind,user);
		Organizar();
	}
	
	public void Organizar() {
		int Positivas = 0,Comp1,Comp2;
		Persona user1,user2,aux;
		if(CantPuestos > 1 || Solicitantes.size() > 1) {
			for(int i = 0;i<Solicitantes.size();i++) {
				user1 = Solicitantes.get(i);
				user2 = Solicitantes.get(i+1);
				Comp1 = getCantPositivas(user1.getSolicitud());
				Comp2 = getCantPositivas(user2.getSolicitud());
				if(Comp1 < Comp2) {
					 aux = user1;
					 Solicitantes.add(i,user2);
					 Solicitantes.add(i+1,user2);
				}
			}
		}
	}
	
	public int getCantPositivas(Empleo user) {
		int Positivas = 0,i = 0;
		for(Boolean var:user.getHab()) {
			if(var && requisitos[i]) {
				Positivas++;
			}
			if( !(var && requisitos[i])) {
				Positivas++;
			}
			i++;
		}
			return Positivas;
	}
	
	public void cancelar(int ind) {
		Solicitantes.remove(ind);
		CantPuestos++;
		if(CantPuestos > 0) {
			estado = true;
		}
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	public ArrayList<Persona> getPersonas(){
		return Solicitantes;
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
	
	public int getCodigo() {
		return codigoVacante;
	}
	
	public int getCant() {
		return CantPuestos;
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
	
	public Boolean aplicaHabilidades(Empleo user) {
		int Positivas = 0,i = 0;
		for(Boolean var:user.getHab()) {
			if((var && requisitos[i]) ) {
				Positivas++;
			}
			if(!(var && requisitos[i])) {
				Positivas++;
			}
			i++;
		}
		if(Positivas >= 8) {
			return true;
		}
		return false;
	}
	/*
	 * El metodo reemplazoAplica sirve para analizar si existen nuevos 
	 * y mejores usuarios, con mejores habilidades que los que estan en la aolicitud (Vacante)
	 */
	public int reemplazoAplica(Empleo user) {
		int PositivasUser = 0,PositivaMenor = 0,i = 0,ind = 0;
		Boolean valor = false;
		for(Boolean var:user.getHab()) {
			if(var && requisitos[i]) {
				PositivasUser++;
			}
			if( !(var && requisitos[i])) {
				PositivasUser++;
			}
			i++;
		}
		i = 0;
		
		for(Persona Todos:Solicitantes) {
			for(Boolean var:Todos.getSolicitud().getHab()) {
				if(var && requisitos[i]) {
					PositivaMenor++;
				}
				if(PositivasUser > PositivaMenor ) {
					valor = true;
				}
				i++;
			}
			ind++;
		}
		// ind es el indice de la persona en el Arreglo para reemplazar si se aplica
		if(valor) {
			return ind;
		}
		return -1;
	}
	
	public Boolean VacanteRepite(String txt) {
		for(Persona aux:Solicitantes ) {
			if(aux.correo.equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}

	
	 
	 public int getCantSolicitantes() {
		return Solicitantes.size();
	}
	 
	

}


