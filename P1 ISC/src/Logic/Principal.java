package Logic;
import Interfaces.*;
import Interfaces.DAOExeption;
import java.io.*;
import java.util.ArrayList;

import Visual.Inicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Principal implements Serializable{

	private ArrayList<Persona> Tpersonas;
	private ArrayList<Empresa> TEmpresas;
	private ArrayList<Empleo> TEmpleos;
	private ArrayList<Vacante> TVacantes;
	private int cantPersonas,cantEmpresas;
	private static Principal principal;
	

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
           // DividirSTR("Robert Felix",1);
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
	public void dataSalida(Boolean Sesion, String Correo) throws IOException, ClassNotFoundException{
                /*File salida = new File("Sesion.txt");
		FileOutputStream guardar;
		guardar = new FileOutputStream(salida);
		ObjectOutputStream archivoSalida = new ObjectOutputStream(guardar);
		archivoSalida.writeObject(Sesion);
                
                salida = new File("Correo.txt");
		guardar = new FileOutputStream(salida);
		archivoSalida = new ObjectOutputStream(guardar);
		archivoSalida.writeObject(Correo);
		archivoSalida.close();*/
    }
	
	public Vector dataEntrada() throws IOException, FileNotFoundException, ClassNotFoundException{
                Vector Sesion = new Vector();
                File archivoSesion = new File("Sesion.txt");
                File archivoNombre = new File("Correo.txt");
		if(archivoSesion.exists() && archivoNombre.exists()) {
			/*FileInputStream file = new FileInputStream(archivoSesion);
			ObjectInputStream entrada = new ObjectInputStream(file);
			Sesion.add(entrada.readBoolean());
                        file = new FileInputStream(archivoNombre);
			entrada = new ObjectInputStream(file);
			Sesion.add(entrada.readObject().toString());
			entrada.close();*/
		}
                else{
                    Sesion.add(false);
                    Sesion.add("biribiribambam");
                }
                return Sesion;
    	
    }
        public void Obtener() throws ClassNotFoundException, IOException, FileNotFoundException, DAOExeption{
            ResultSet cn,cn2,cn3;
            int cod_persona = 1,ind = 1;
            String Nombre = null,TipoEmpresa = null,Pais;
            ArrayList <String> arr = new ArrayList();
           // Vector vec = new Vector();
            // Agregando personas a singleton
            try {
                cn = Conexion.Connect.Consulta("SELECT * FROM VistaObreros");
                while(cn.next()){
                   cn2 = Conexion.Connect.Consulta("SELECT Nombre_pais FROM Persona INNER JOIN Pais ON Pais.cod_pais = Persona.cod_pais WHERE Persona.cod_persona = "+cn.getInt(10));
                   cn3 = Conexion.Connect.Consulta("SELECT Habilidades.nombre FROM Persona INNER JOIN Obrero ON Persona.cod_persona = Obrero.cod_persona INNER JOIN\n" +
"Habilidad_De_Obrero ON Obrero.cod_persona = Habilidad_De_Obrero.cod_persona INNER JOIN Habilidades ON Habilidad_De_Obrero.cod_habilidad = Habilidades.cod_habilidad "
                           + "WHERE Persona.cod_persona = '"+cn.getInt(1)+"'");
                    while(cn3.next()){
                        
                      /* vec.add(cn3.getString(1));
                        arr.add(vec.get(ind-1).toString());*/
                        arr.add(cn3.getString(1));
                        ind++;
                    }
                    ind = 1;
                    
                   while(cn2.next()){    
                        Obrero aux = new Obrero(cn.getString(2), cn.getString(3), cn.getString(4), cn.getString(5), cn.getDate(6),cn.getString(7),cn.getString(8), 
                                 cn.getBoolean(9),cn2.getString(1),arr) {
                             @Override
                             public void RetornarPersonas() throws DAOExeption {
                                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             }
                         };
                        
                        if(TieneVacantesEmpleo(aux)){
                            aux.setSolicitud(getVacantesEmpleo(aux));
                        }
                            Tpersonas.add(aux);
                        
                   }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"No se Pudieron obtener las personas desde la base de datos","Advertencia", 0);
            }
            
            try {
                cn = Conexion.Connect.Consulta("SELECT * FROM VistaTecnicos");
                while(cn.next()){
                   cn2 = Conexion.Connect.Consulta("SELECT Nombre_pais FROM Persona INNER JOIN Pais ON Pais.cod_pais = Persona.cod_pais WHERE Persona.cod_persona = "+cn.getInt(10));
                   cn3 = Conexion.Connect.Consulta("SELECT Especialidades.nombre,Persona.cod_persona FROM Persona INNER JOIN Tecnico ON Persona.cod_persona = Tecnico.cod_persona INNER JOIN\n" +
"Especialidad_De_Tecnico ON Tecnico.cod_persona = Especialidad_De_Tecnico.cod_persona INNER JOIN\n" +
"Especialidades ON Especialidad_De_Tecnico.cod_especialidad = Especialidades.cod_especialidad WHERE Persona.cod_persona ='"+cn.getInt(1)+"'");
                   int num;
                   //vec.clear();
                   arr.clear();
                   while(cn3.next()){
                        num = cn.getInt(1);
                      /*  vec.add(cn3.getString(1));
                        arr.add(vec.get(ind-1).toString());*/
                        arr.add(cn3.getString(1));
                       // ind++;                    
                    }
                    ind = 1;
                   while(cn2.next()){    
                        Tecnico aux = new Tecnico(cn.getString(2), cn.getString(3), cn.getString(4), cn.getString(5), cn.getDate(6),cn.getString(7),cn.getString(8), 
                                 cn.getBoolean(9),cn2.getString(1),arr) {
                             @Override
                             public void RetornarPersonas() throws DAOExeption {
                                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             }
                         };
                        
                        if(TieneVacantesEmpleo(aux)){
                            aux.setSolicitud(getVacantesEmpleo(aux));
                        }
                            Tpersonas.add(aux);
                        
                   }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"No se Pudieron obtener las personas desde la base de datos","Advertencia", 0);
            }
            
            try {
                cn = Conexion.Connect.Consulta("SELECT * FROM VistaUniversitarios");
                while(cn.next()){
                   cn2 = Conexion.Connect.Consulta("SELECT Nombre_pais FROM Persona INNER JOIN Pais ON Pais.cod_pais = Persona.cod_pais WHERE Persona.cod_persona = "+cn.getInt(10));
                   cn3 = Conexion.Connect.Consulta("SELECT Carreras.nombre FROM Persona INNER JOIN Estudiante_Universitario ON Persona.cod_persona = Estudiante_Universitario.cod_persona INNER JOIN\n" +
"Carreras_De_Universitario ON Estudiante_Universitario.cod_persona = Carreras_De_Universitario.cod_persona INNER JOIN\n" +
"Carreras ON Carreras_De_Universitario.cod_carrera = Carreras.cod_carrera WHERE Persona.cod_persona = '"+cn.getInt(1)+"'");
                  // vec.clear();
                   arr.clear(); 
                   while(cn3.next()){
                       /* vec.add(cn3.getString(1));
                        arr.add(vec.get(ind-1).toString());*/
                        arr.add(cn3.getString(1));
                       // ind++;
                    }
                    ind = 1;
                   while(cn2.next()){    
                        Universitario aux = new Universitario(cn.getString(2), cn.getString(3), cn.getString(4), cn.getString(5), cn.getDate(6),cn.getString(7),cn.getString(8), 
                                 cn.getBoolean(9),cn2.getString(1),arr) {
                             @Override
                             public void RetornarPersonas() throws DAOExeption {
                                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             }
                         };
                        
                        
                        if(TieneVacantesEmpleo(aux)){
                            aux.setSolicitudSola(getVacantesEmpleo(aux));
                        }
                            Tpersonas.add(aux);
                        
                   }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"No se Pudieron obtener las personas desde la base de datos","Advertencia", 0);
            }
            /*try {
                cn = Conexion.Connect.Consulta("SELECT * FROM Persona");
                while(cn.next()){
                    String nom = cn.getString(1);
                    Persona aux = new Persona(cn.getString(1), cn.getString(3), cn.getString(4), cn.getString(5), cn.getDate(6),cn.getString(7),cn.getString(8), 
                            cn.getBoolean(9),cn.getString(10)) {
                        @Override
                        public void RetornarPersonas() throws DAOExeption {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                    Tpersonas.add(aux);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"No se Pudieron obtener las personas desde la base de datos","Advertencia", 0);
            }*/
            // Agregando empresas a singleton
            try {
                cn = Conexion.Connect.Consulta("SELECT * FROM Empresa");
                while(cn.next()){
                    
                    cn2 = Conexion.Connect.Consulta("SELECT primer_nombre FROM Persona INNER JOIN Empresa ON Empresa.cod_persona = '"
                            +cn.getInt(5)+"'");
                    while(cn2.next()){
                         Nombre = cn2.getString(1);
                    }
                    
                    cn2 = Conexion.Connect.Consulta("SELECT Nombre FROM Tipo_empresa INNER JOIN Empresa ON Empresa.cod_tipo_empresa = '"
                            +cn.getInt(6)+"'");
                    while(cn2.next()){
                         TipoEmpresa = cn2.getString(1);
                    }
                    
                    
                        Empresa aux = new Empresa(cn.getString(2), cn.getString(3), cn.getString(4), cn.getString(5),Nombre,TipoEmpresa) {
                        @Override
                        public void RetornarEmpresa() throws DAOExeption {
                            
                        }
                    };
                     
                    if(TieneVacantesEmpresa(aux)){
                        aux.setMisVacantes(getVacantesEmpresa(aux));
                        for(Vacante vaca:aux.getMisVacantes()){
                            TVacantes.add(vaca);
                        }
                    }
                    TEmpresas.add(aux);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"No se Pudieron obtener las empresas desde la base de datos","Advertencia", 0);
            }
            
            
           
            
            
        }
        
        public ArrayList<Vacante> getVacantesEmpresa(Empresa empresa) throws ClassNotFoundException, SQLException, IOException{
            ArrayList<Vacante> aux = new ArrayList();
            ArrayList<Persona> perso = new ArrayList();
            Vacante vaca;
            ResultSet cn,cn2;
            Boolean[] bol = new Boolean[10];
            
            int i = 0;
            
            cn = Conexion.Connect.Consulta("SELECT cod_vacante_empresa,puesto_vacante,tipo_personal_vacante,[Habla otro Idioma?],[Vehiculo Propio?]"
                    + ",[Disponibilidad de Horario?],[Disposicion de Viaje?],[Dispuesto a Mudarse?],[Piensa ampliar sus conocimientos?]"
                    + ",[Trabajaria los fines de semana?],[Posee Experiencia de trabajos anteriores?],[Puede realizar mas de una tarea a la vez?]"
                    + ",[Trabajas bien en equipo?],estado_vacante,cantidad_actual_puesto_vacante,monto,cantidad_inicial_puesto_vacante,codigo_vacante_reconocimiento"
                    + " FROM Vacante_Empresa INNER JOIN Empresa ON Empresa.cod_empresa = Vacante_Empresa.cod_empresa WHERE Empresa.nombre_empresa = '"+
                    empresa.getNombre()+"'");
            
            while(cn.next()){
                for (int j = 0; j < 10; j++) {
                    bol[j] = cn.getBoolean(j+4);
                    
                }
                
                vaca = new Vacante(cn.getInt(1),empresa,cn.getString(2),cn.getString(3), bol,cn.getBoolean(14)
                        ,cn.getInt(15),cn.getInt(16),
                        cn.getInt(17),  cn.getInt(18));
                cn2 = Conexion.Connect.Consulta("SELECT primer_nombre FROM Persona INNER JOIN Persona_Vacante ON Persona.cod_Persona = Persona_Vacante.cod_Persona\n" +
"WHERE Persona_Vacante.cod_vacante_empresa = '"+cn.getInt(1)+"'");
                while(cn2.next()){
                    perso.add(Principal.getInstance().buscarPersonas(cn2.getString(1)));
                }
                vaca.setSolicitantes(perso);
                aux.add(vaca);
            }
            
            
            return aux;
        }
        
        public Empleo getVacantesEmpleo(Persona correo) throws ClassNotFoundException, SQLException, IOException{
            
            Empleo empleo = null;
            ResultSet cn;
            Boolean[] bol = new Boolean[10];
            
            cn = Conexion.Connect.Consulta("SELECT Persona.cod_persona,[Habla otro Idioma?],[Vehiculo Propio?],[Disponibilidad de Horario?],[Disposicion de Viaje?],[Dispuesto a Mudarse?],[Piensa ampliar sus estudios?],\n" +
"[Trabajaria los fines de semana?],[Posee Experiencia de trabajos anteriores?],[Puede realizar mas de una tarea a la vez?]\n" +
"                    ,[Trabajas bien en equipo?],area_empleo,monto_empleo\n" +
"                     FROM Solicitud_Persona INNER JOIN Persona ON Persona.cod_persona = Solicitud_Persona.cod_persona WHERE Persona.correo_persona = '"
                    +correo.getCorreo()+"'");
            
            while(cn.next()){
                for (int j = 0; j < 10; j++) {
                    bol[j] = cn.getBoolean(j+2);
                    
                }
                empleo = new Empleo(cn.getInt(1),bol, cn.getInt(13), cn.getString(12));
                
                TEmpleos.add(empleo);
            }
            
            return empleo;
        }

	public int getCantPerson() {
		return cantPersonas;
	}
	
	public int getEmpresas() {
		return cantEmpresas;
	}
	
	public ArrayList<Persona> getTpersonas() {
		return Tpersonas;
	}
	public void setTpersonas(Persona nueva) throws ClassNotFoundException, IOException, DAOExeption {
		Tpersonas.add(nueva);
		cantPersonas++;
		nueva.Registrar(nueva);
	}
	public ArrayList<Empresa> getTEmpresas() {
		return TEmpresas;
	}
	public void setTEmpresas(Empresa empresa) throws FileNotFoundException, ClassNotFoundException, IOException, DAOExeption {
		
		TEmpresas.add(empresa);
		cantEmpresas++;
		empresa.Registrar(empresa);
	}
	public ArrayList<Empleo> getTEmpleos() {
		return TEmpleos;
	}
	public void setTEmpleos(Empleo nuevo) throws FileNotFoundException, ClassNotFoundException, IOException, DAOExeption {
		TEmpleos.add(nuevo);
		nuevo.Registrar(nuevo);
		
	}
        public void addTEmpleos(Empleo nuevo) throws FileNotFoundException, ClassNotFoundException, IOException, DAOExeption {
		TEmpleos.add(nuevo);
		
		
	}
	public ArrayList<Vacante> getTVacantes() {
		return TVacantes;
	}
	public void setTVacantes(Vacante vacante) throws FileNotFoundException, ClassNotFoundException, IOException, DAOExeption {
		TVacantes.add(vacante);
		vacante.Registrar(vacante);
		
	}
        public void addTVacantes(Vacante vacante) throws FileNotFoundException, ClassNotFoundException, IOException, DAOExeption {
		TVacantes.add(vacante);
		
		
	}
	
	public Boolean existeEmpresa(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		for(Empresa empre:TEmpresas) {
			if(empre.getCorreo().equalsIgnoreCase(txt) || empre.getNombre().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean existeUser(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt) || aux.getNombre().equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}
	
	public Persona buscarPersonas(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		//dataEntrada();
		for(Persona aux:Tpersonas) {
			if(aux.getCorreo().equalsIgnoreCase(txt) || aux.getNombre().equalsIgnoreCase(txt)) {
				return aux;
			}
		}
		return null;
	}
	public Empresa buscarEmpresas(String txt) throws FileNotFoundException, ClassNotFoundException, IOException {
		//dataEntrada();
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
	
	public ArrayList<String> RetornarObrerosDisponibles() {
		ArrayList<String> lista = new ArrayList<String>();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Obrero && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList<String> RetornarUniversitariosDisponibles() {
		ArrayList<String> lista = new ArrayList<String>();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Universitario && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	public ArrayList<String> RetornarTecnicosDisponibles() {
		ArrayList<String> lista = new ArrayList<String>();
		for(Persona aux:Tpersonas) {
			if(aux instanceof Tecnico && aux.getEstado() == true) {
				lista.add(aux.getNombre());
			}
		}
		return lista;
	}
	
	
	
	public Empresa SesionEmpresa() throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Empresa aux:TEmpresas) {
			if(aux.getSesion()) {
				return aux;
			}
		}
		return null;
	}
	
	public Persona SesionUser() throws FileNotFoundException, ClassNotFoundException, IOException {
		dataEntrada();
		for(Persona aux:Tpersonas) {
			if(aux.getSesion()) {
				return aux;
			}
		}
		return null;
	}
	
	public ArrayList<String> RetornarNombres(String txt, int ind) {
		ArrayList<String> lista = new ArrayList<String>();
		Character l1 = null,l2 = null;
		int i = 0,num = 0;
		if(ind == 0) {
			for(Persona aux:Tpersonas) {
				for(int j=0;j<txt.length();j++) {
					
					if(l1.toUpperCase(aux.getNombre().charAt(i)) == l2.toUpperCase(txt.charAt(j)))  {
						num++;
						if(num == txt.length()) {
							lista.add(aux.getNombre());
							num = 0;
						}
					}
					i++;
					
					if(j == txt.length()-1) {
						i = 0;
						num = 0;
					}
				}
			}
		}
		if(ind == 1) {
			for(Persona aux:Tpersonas) {
				if(aux instanceof Universitario) {
					for(int j=0;j<txt.length();j++) {
						
						if(l1.toUpperCase(aux.getNombre().charAt(i)) == l2.toUpperCase(txt.charAt(j)))  {
							num++;
							if(num == txt.length()) {
								lista.add(aux.getNombre());
								num = 0;
							}
						}
						i++;
						
						if(j == txt.length()-1) {
							i = 0;
							num = 0;
						}
					}
				}
			}
		}
		if(ind == 2) {
			for(Persona aux:Tpersonas) {
				if(aux instanceof Tecnico) {
					for(int j=0;j<txt.length();j++) {
						
						if(l1.toUpperCase(aux.getNombre().charAt(i)) == l2.toUpperCase(txt.charAt(j)))  {
							num++;
							if(num == txt.length()) {
								lista.add(aux.getNombre());
								num = 0;
							}
						}
						i++;
						
						if(j == txt.length()-1) {
							i = 0;
							num = 0;
						}
					}
				}
			}
		}
		if(ind == 3) {
			for(Persona aux:Tpersonas) {
				if(aux instanceof Obrero) {
					for(int j=0;j<txt.length();j++) {
						
						if(l1.toUpperCase(aux.getNombre().charAt(i)) == l2.toUpperCase(txt.charAt(j)))  {
							num++;
							if(num == txt.length()) {
								lista.add(aux.getNombre());
								num = 0;
							}
						}
						i++;
						
						if(j == txt.length()-1) {
							i = 0;
							num = 0;
						}
					}
				}
			}
		}
		
		return lista;
	}
	
	public int getPersonasDisponibles() {
		int cant = 0;
		for(Persona aux:Tpersonas) {
			if(aux.getEstado()) {
				cant++;
			}
		}
		return cant;
	}
        
        public static String DividirSTR(String cadena, int tipo){
            String aux = "Texto_de_ejemplo";
            char letra;
            if(tipo == 1){
            	System.out.println(cadena);
            	
                for (int i = 0; i < cadena.length(); i++) {
                    if( cadena.charAt(i) == ' ' ){
                        aux = cadena.substring(i+1,cadena.length());
                        break;
                    }

                }
            } else{
                
            }
            
            return aux;
        }

    private Boolean TieneVacantesEmpleo(Persona correo) throws ClassNotFoundException, SQLException {
        
            ResultSet cn;
          
            
            cn = Conexion.Connect.Consulta("SELECT Persona.cod_persona,[Habla otro Idioma?],[Vehiculo Propio?],[Disponibilidad de Horario?],[Disposicion de Viaje?],[Dispuesto a Mudarse?],[Piensa ampliar sus estudios?],\n" +
"[Trabajaria los fines de semana?],[Posee Experiencia de trabajos anteriores?],[Puede realizar mas de una tarea a la vez?]\n" +
"                    ,[Trabajas bien en equipo?],area_empleo,monto_empleo\n" +
"                     FROM Solicitud_Persona INNER JOIN Persona ON Persona.cod_persona = Solicitud_Persona.cod_persona WHERE Persona.correo_persona = '"
                    +correo.getCorreo()+"'");
            
            while(cn.next()){
                return true;
            }
                return false;
    }

    public Boolean TieneVacantesEmpresa(Empresa empresa) throws ClassNotFoundException, SQLException, IOException{
            ArrayList<Vacante> aux = new ArrayList();
            ArrayList<Persona> perso = new ArrayList();
            Vacante vaca;
            ResultSet cn,cn2;
            Boolean[] bol = new Boolean[10];
            
            int i = 0;
            
            cn = Conexion.Connect.Consulta("SELECT cod_vacante_empresa,puesto_vacante,tipo_personal_vacante,[Habla otro Idioma?],[Vehiculo Propio?]"
                    + ",[Disponibilidad de Horario?],[Disposicion de Viaje?],[Dispuesto a Mudarse?],[Piensa ampliar sus conocimientos?]"
                    + ",[Trabajaria los fines de semana?],[Posee Experiencia de trabajos anteriores?],[Puede realizar mas de una tarea a la vez?]"
                    + ",[Trabajas bien en equipo?],estado_vacante,cantidad_actual_puesto_vacante,monto,cantidad_inicial_puesto_vacante,codigo_vacante_reconocimiento"
                    + " FROM Vacante_Empresa INNER JOIN Empresa ON Empresa.cod_empresa = Vacante_Empresa.cod_empresa WHERE Empresa.nombre_empresa = '"+
                    empresa.getNombre()+"'");
            
            while(cn.next()){
                
                    return true;
                    
                
            }
            return false;
    }
   

}


