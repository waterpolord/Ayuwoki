package Logic;

import java.io.*;
import java.util.ArrayList;

import Visual.Inicio;

public class Principal implements Serializable{
	private ArrayList<Persona> Tpersonas;
	private ArrayList<Empresa> TEmpresas;
	private ArrayList<Empleo> TEmpleos;
	private ArrayList<Vacante> TVacantes;
	private int cantPersonas,cantEmpresas;
	private static Principal principal;
	

	public static void main(String args[]) {
		new Inicio().setVisible(true); 
	}
	
	public Principal() {
		Tpersonas = new ArrayList();
		TEmpresas = new ArrayList();
		TEmpleos = new ArrayList();
		TVacantes = new ArrayList();
		cantEmpresas = 0;
		cantPersonas = 0;
	}
	
	public static Principal getInstance() {
		if(principal == null) {
			principal = new Principal();
		}
		return principal;
	}
	
	public static void setInstance(Principal carga) {
			principal = carga;
		
	}
	public void dataSalida() throws IOException, ClassNotFoundException{
    	File salida = new File("Bolsa.dat");
		FileOutputStream guardar;
		guardar = new FileOutputStream(salida);
		ObjectOutputStream archivoSalida = new ObjectOutputStream(guardar);
		archivoSalida.writeObject(Principal.getInstance());
		archivoSalida.close();
    }
	
	public void dataEntrada() throws IOException, FileNotFoundException, ClassNotFoundException{
    	File archivoEntrada = new File("Bolsa.dat");
		if(archivoEntrada.exists()) {
			FileInputStream file = new FileInputStream(archivoEntrada);
			ObjectInputStream entrada = new ObjectInputStream(file);
			Principal.setInstance((Principal) entrada.readObject());
			Tpersonas = principal.getInstance().Tpersonas;
			TEmpresas = principal.getInstance().TEmpresas;
			TEmpleos = principal.getInstance().TEmpleos;
			TVacantes = principal.getInstance().TVacantes;
			cantEmpresas = TEmpresas.size();
			cantPersonas = Tpersonas.size();
			entrada.close();
		}
			
		
    	
    }
	
	public int getPerson() {
		return cantPersonas;
	}
	
	public int getEmpresas() {
		return cantEmpresas;
	}
	
	public ArrayList<Persona> getTpersonas() {
		return Tpersonas;
	}
	public void setTpersonas(Persona nueva) throws ClassNotFoundException, IOException {
		dataEntrada();
		Tpersonas.add(nueva);
		cantPersonas++;
		dataSalida();
	}
	public ArrayList<Empresa> getTEmpresas() {
		return TEmpresas;
	}
	public void setTEmpresas(Empresa empresa) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		TEmpresas.add(empresa);
		cantEmpresas++;
		dataSalida();
	}
	public ArrayList<Empleo> getTEmpleos() {
		return TEmpleos;
	}
	public void setTEmpleos(Empleo nuevo) {
		TEmpleos.add(nuevo);
	}
	public ArrayList<Vacante> getTVacantes() {
		return TVacantes;
	}
	public void setTVacantes(Vacante vacante) {
		TVacantes.add(vacante);
	}
	
	public Boolean existeEmpresa(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Empresa empre:TEmpresas) {
			if(empre.getCorreo().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean existeUser(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt) || aux.getNombre().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Persona buscarPersonas(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt) || aux.getNombre().equalsIgnoreCase(txt)) {
				return aux;
			}
		}
		return null;
	}
	public Empresa buscarEmpresas(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Empresa aux:TEmpresas) {
			if(aux.getCorreo().equalsIgnoreCase(txt) || aux.getNombre().equalsIgnoreCase(txt)) {
				return aux;
			}
		}
		return null;
	}
	//  ind = 0 Persona ind = 1 Empresa
	public Boolean ContraUser(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
			for(Persona aux:Tpersonas) {
				if(aux.getClave().equalsIgnoreCase(txt))
					return true;
			}
			return false;
	}
	public Boolean ContraEmpresa(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Empresa empre:TEmpresas) {
			if(empre.getClave().equalsIgnoreCase(txt))
				return true;
			}
		return false;
	}
	
	public ArrayList RetornarObrerosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Obrero && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList RetornarUniversitariosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Universitario && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList RetornarTecnicosDisponibles() {
		ArrayList<String> lista = new ArrayList();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Tecnico && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	
	
	
	

	

}
