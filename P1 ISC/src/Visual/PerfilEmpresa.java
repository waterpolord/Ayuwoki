package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;

import Logic.*;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PerfilEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panelTecnico;
	private JLabel labelEspecialidad;
	private JPanel panelObrero;
	private JLabel labelHabilidad;
	private JComboBox<?> CBXHabilidad;
	private JComboBox<?> CBXCarrera;
	private JComboBox<?> CBXEspecialidad;
	private JPanel panelUniE;
	private JPanel panelTecE;
	private JPanel panelObreE;
	private JPanel panelUniversitario;
	private SpinnerNumberModel Cantidad;
	private ButtonGroup GrupoRespuestas1;
	private ButtonGroup GrupoRespuestas2;
	private ButtonGroup GrupoRespuestas3;
	private ButtonGroup GrupoRespuestas4;
	private ButtonGroup GrupoRespuestas5;
	private ButtonGroup GrupoRespuestas6;
	private ButtonGroup GrupoRespuestas7;
	private ButtonGroup GrupoRespuestas8;
	private ButtonGroup GrupoRespuestas9;
	private ButtonGroup GrupoRespuestas10;
	private JRadioButton rbn1;
	private JRadioButton rbn2;
	private JRadioButton rbn3;
	private JRadioButton rbn4;
	private JRadioButton rbn5;
	private JRadioButton rbn6;
	private JRadioButton rbn7;
	private JRadioButton rbn8;
	private JRadioButton rbn9;
	private JRadioButton rbn10;
	private JRadioButton rbn11;
	private JRadioButton rbn12;
	private JRadioButton rbn13;
	private JRadioButton rbn14;
	private JRadioButton rbn15;
	private JRadioButton rbn16;
	private JRadioButton rbn17;
	private JRadioButton rbn18;
	private JRadioButton rbn19;
	private JRadioButton rbn20;
	private JRadioButton rbn21;
	private JRadioButton rbn22;
	private JRadioButton rbn23;
	private JRadioButton rbn24;
	private JRadioButton rbn25;
	private JRadioButton rbn26;
	private JRadioButton rbn27;
	private JRadioButton rbn28;
	private JRadioButton rbn29;
	private JRadioButton rbn30;
	private JRadioButton rbn31;
	private JRadioButton rbn32;
	private JRadioButton rbn33;
	private JRadioButton rbn34;
	private JRadioButton rbn35;
	private JRadioButton rbn36;
	private JRadioButton rbn37;
	private JRadioButton rbn38;
	private JRadioButton rbn39;
	private JRadioButton rbn40;
	private JRadioButton rbn41;
	private JRadioButton rbn42;
	private JRadioButton rbn43;
	private JRadioButton rbn44;
	private JRadioButton rbn45;
	private JRadioButton rbn46;
	private JRadioButton rbn47;
	private JRadioButton rbn48;
	private JRadioButton rbn49;
	private JRadioButton rbn50;
	private JRadioButton rbn51;
	private JRadioButton rbn52;
	private JRadioButton rbn53;
	private JRadioButton rbn54;
	private JRadioButton rbn55;
	private JRadioButton rbn56;
	private JRadioButton rbn57;
	private JRadioButton rbn58;
	private JRadioButton rbn59;
	private JRadioButton rbn60;
	private JRadioButton RBN10;
	private JRadioButton RBN30;
	private JRadioButton RBN50;
	private JRadioButton RBNUniversitario;
	private JRadioButton RBNTecnico;
	private JRadioButton RBNObrero;
	private JSpinner SPNCant;
	private DefaultListModel<String> lista;
	private JButton btnNewButton;
	private JList list;
	private Dimension Tam;
	
	

	public PerfilEmpresa(Empresa empresa) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				int i = 0;
				for(Vacante vac:empresa.getMisVacantes()) {
					lista.add(i,"Codigo: "+vac.getCodigo()+" Puesto: "+vac.getPuesto()+" Tipo: "+vac.getTipoPersonal()+" ("+vac.getCant()+")"+"\n\n");
					i++;
				}
				setEnter(btnNewButton);
				panelObreE.setVisible(false);
				panelTecE.setVisible(false);
				panelUniE.setVisible(true);
				
				setgrupo(rbn1,rbn3,rbn5,rbn6,rbn7,rbn8,rbn9,rbn10,rbn18,rbn19,rbn2,rbn4,rbn11,rbn12,rbn13,rbn14,rbn15,rbn16,rbn17,rbn20);
			}
		});
		
		setTitle("Perfil Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tam = getToolkit().getScreenSize();
		Tam = this.getToolkit().getScreenSize();
		this.setBounds(100, 100, (int)Tam.getWidth(),(int)Tam.height);
		this.setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lista = new DefaultListModel();
		
		GrupoRespuestas1 = new ButtonGroup();
		GrupoRespuestas2 = new ButtonGroup();
		GrupoRespuestas3 = new ButtonGroup();
		GrupoRespuestas4 = new ButtonGroup();
		GrupoRespuestas5 = new ButtonGroup();
		GrupoRespuestas6 = new ButtonGroup();
		GrupoRespuestas7 = new ButtonGroup();
		GrupoRespuestas8 = new ButtonGroup();
		GrupoRespuestas9 = new ButtonGroup();
		GrupoRespuestas10 = new ButtonGroup();


		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == 2) {
					try {
						Principal.getInstance().buscarEmpresas(empresa.getCorreo()).setSesion(false);;
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Principal.getInstance().dataSalida();
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
					new Inicio().setVisible(true);
				}
			}
		});
		comboBox.setBackground(new Color(95, 158, 160));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuraci\u00F3n", "Descripcion","Cerrar Sesion"}));
		comboBox.setBounds(1178, 11, 162, 20);
		contentPane.add(comboBox);

		btnNewButton = new JButton("Subir");
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean valores[] = new Boolean[10];
				int num = 0,monto = 10;
				if(RBN10.isSelected()) {
					monto = 10;
				}
				if(RBN30.isSelected()) {
					monto = 30;
				}
				if(RBN50.isSelected()) {
					monto = 50;
				}
				if(RBNUniversitario.isSelected()) {
					// Primera pregunta
					if(GrupoRespuestas1.getSelection() == rbn1.getModel()) {
						valores[0] = true;
						
					}
					else if(GrupoRespuestas1.getSelection() == rbn2.getModel()) {
						valores[0] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 1 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Segunda pregunta
					if(GrupoRespuestas2.getSelection() == rbn3.getModel()) {
						valores[1] = true;
					}
					else if(GrupoRespuestas2.getSelection() == rbn4.getModel()) {
						valores[1] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 2 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Tercera pregunta
					if(GrupoRespuestas3.getSelection() == rbn5.getModel()) {
						valores[2] = true;
					}
					else if(GrupoRespuestas3.getSelection() == rbn11.getModel()) {
						valores[2] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 3 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Cuarta pregunta
					if(GrupoRespuestas4.getSelection() == rbn6.getModel()) {
						valores[3] = true;
					}
					else if(GrupoRespuestas4.getSelection() == rbn12.getModel()) {
						valores[3] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 4 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Quinta pregunta
					if(GrupoRespuestas5.getSelection() == rbn7.getModel()) {
						valores[4] = true;
					}
					else if(GrupoRespuestas5.getSelection() == rbn13.getModel()) {
						valores[4] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 5 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Sexta pregunta
					if(GrupoRespuestas6.getSelection() == rbn8.getModel()) {
						valores[5] = true;
					}
					else if(GrupoRespuestas6.getSelection() == rbn14.getModel()) {
						valores[5] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 6 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Septima pregunta
					if(GrupoRespuestas7.getSelection() == rbn9.getModel()) {
						valores[6] = true;
					}
					else if(GrupoRespuestas7.getSelection() == rbn15.getModel()) {
						valores[6] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 7 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Octava pregunta
					if(GrupoRespuestas8.getSelection() == rbn10.getModel()) {
						valores[7] = true;
					}
					else if(GrupoRespuestas8.getSelection() == rbn16.getModel()) {
						valores[7] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 8 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Novena pregunta
					if(GrupoRespuestas9.getSelection() == rbn18.getModel()) {
						valores[8] = true;
					}
					else if(GrupoRespuestas9.getSelection() == rbn17.getModel()) {
						valores[8] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 9 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Decima pregunta
					if(GrupoRespuestas10.getSelection() == rbn19.getModel()) {
						valores[9] = true;
					}
					else if(GrupoRespuestas10.getSelection() == rbn20.getModel()) {
						valores[9] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 10 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					if(num == 0 && CBXCarrera.getSelectedIndex() > 0) {
						Vacante nueva = new Vacante(empresa,"Universitario",CBXCarrera.getSelectedItem().toString(),valores,(int)Cantidad.getValue(),monto,empresa.getCode());
						
						for(Persona aux:Principal.getInstance().getTpersonas()) {
							if(aux.getSoli() == 1)
								if(aux instanceof Universitario  && ((Universitario) aux).getCarrera().equalsIgnoreCase(nueva.getTipoPersonal())) {
									if(nueva.aplicaHabilidades(aux.getSolicitud())) {
										nueva.solicitar(aux);
									}
								}
						}
						try {
							empresa.setVacante(nueva);
							Principal.getInstance().buscarEmpresas(empresa.getCorreo()).setVacante(nueva);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
						    
							Principal.getInstance().dataSalida();
							lista.clear();
							int i = 0;
							for(Vacante vac:empresa.getMisVacantes()) {
								lista.add(i,"Codigo: "+vac.getCodigo()+" Puesto: "+vac.getPuesto()+" Tipo: "+vac.getTipoPersonal()+" ("+vac.getCant()+")"+"\n\n");
								
								i++;
							}
						} catch (ClassNotFoundException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(CBXCarrera.getSelectedIndex() <= 0) {
						JOptionPane.showMessageDialog(null,"Selecciona una carrera","Llena Todos Los Campos",0);
					}
					
				}
				if(RBNTecnico.isSelected()) {
					// Primera pregunta
					if(GrupoRespuestas1.getSelection() == rbn21.getModel()) {
						valores[0] = true;
					}
					else if(GrupoRespuestas1.getSelection() == rbn22.getModel()) {
						valores[0] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 1 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Segunda pregunta
					if(GrupoRespuestas2.getSelection() == rbn23.getModel()) {
						valores[1] = true;
					}
					else if(GrupoRespuestas2.getSelection() == rbn24.getModel()) {
						valores[1] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 2 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Tercera pregunta
					if(GrupoRespuestas3.getSelection() == rbn25.getModel()) {
						valores[2] = true;
					}
					else if(GrupoRespuestas3.getSelection() == rbn31.getModel()) {
						valores[2] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 3 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Cuarta pregunta
					if(GrupoRespuestas4.getSelection() == rbn26.getModel()) {
						valores[3] = true;
					}
					else if(GrupoRespuestas4.getSelection() == rbn32.getModel()) {
						valores[3] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 4 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Quinta pregunta
					if(GrupoRespuestas5.getSelection() == rbn27.getModel()) {
						valores[4] = true;
					}
					else if(GrupoRespuestas5.getSelection() == rbn33.getModel()) {
						valores[4] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 5 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Sexta pregunta
					if(GrupoRespuestas6.getSelection() == rbn28.getModel()) {
						valores[5] = true;
					}
					else if(GrupoRespuestas6.getSelection() == rbn34.getModel()) {
						valores[5] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 6 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Septima pregunta
					if(GrupoRespuestas7.getSelection() == rbn29.getModel()) {
						valores[6] = true;
					}
					else if(GrupoRespuestas7.getSelection() == rbn35.getModel()) {
						valores[6] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 7 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Octava pregunta
					if(GrupoRespuestas8.getSelection() == rbn30.getModel()) {
						valores[7] = true;
					}
					else if(GrupoRespuestas8.getSelection() == rbn36.getModel()) {
						valores[7] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 8 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Novena pregunta
					if(GrupoRespuestas9.getSelection() == rbn38.getModel()) {
						valores[8] = true;
					}
					else if(GrupoRespuestas9.getSelection() == rbn37.getModel()) {
						valores[8] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 9 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Decima pregunta
					if(GrupoRespuestas10.getSelection() == rbn59.getModel()) {
						valores[9] = true;
					}
					else if(GrupoRespuestas10.getSelection() == rbn60.getModel()) {
						valores[9] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 10 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					if(num == 0 && CBXEspecialidad.getSelectedIndex() > 0) {
						Vacante nueva = new Vacante(empresa,"Tecnico",CBXEspecialidad.getSelectedItem().toString(),valores,(int)Cantidad.getValue(),monto,empresa.getCode());
						try {
							Principal.getInstance().setTVacantes(nueva);
						} catch (FileNotFoundException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} catch (ClassNotFoundException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						try {
							empresa.setVacante(nueva);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						for(Persona aux:Principal.getInstance().getTpersonas()) {
							if(aux.getSoli() == 1)
								if(aux instanceof Tecnico && ((Tecnico) aux).getEspecialidad().equalsIgnoreCase(nueva.getTipoPersonal())) {
									if(nueva.aplicaHabilidades(aux.getSolicitud())) {
										nueva.solicitar(aux);
									}
								}
						}
						try {
							Principal.getInstance().buscarEmpresas(empresa.getCorreo()).setVacante(nueva);
							Principal.getInstance().dataSalida();
							lista.clear();
							int i = 0;
							for(Vacante vac:empresa.getMisVacantes()) {
								lista.add(i,"Codigo: "+vac.getCodigo()+" Puesto: "+vac.getPuesto()+" Tipo: "+vac.getTipoPersonal()+" ("+vac.getCant()+")"+"\n\n");
								i++;
							}
						} catch (ClassNotFoundException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(CBXEspecialidad.getSelectedIndex() <= 0) {
						JOptionPane.showMessageDialog(null,"Selecciona una Especialidad","Llena Todos Los Campos",0);
					}
					
				}
				if(RBNObrero.isSelected()) {
					// Primera pregunta
					if(GrupoRespuestas1.getSelection() == rbn39.getModel()) {
						valores[0] = true;
					}
					else if(GrupoRespuestas1.getSelection() == rbn40.getModel()) {
						valores[0] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 1 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Segunda pregunta
					if(GrupoRespuestas2.getSelection() == rbn41.getModel()) {
						valores[1] = true;
					}
					else if(GrupoRespuestas2.getSelection() == rbn42.getModel()) {
						valores[1] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 2 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Tercera pregunta
					if(GrupoRespuestas3.getSelection() == rbn43.getModel()) {
						valores[2] = true;
					}
					else if(GrupoRespuestas3.getSelection() == rbn49.getModel()) {
						valores[2] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 3 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Cuarta pregunta
					if(GrupoRespuestas4.getSelection() == rbn44.getModel()) {
						valores[3] = true;
					}
					else if(GrupoRespuestas4.getSelection() == rbn50.getModel()) {
						valores[3] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 4 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Quinta pregunta
					if(GrupoRespuestas5.getSelection() == rbn45.getModel()) {
						valores[4] = true;
					}
					else if(GrupoRespuestas5.getSelection() == rbn51.getModel()) {
						valores[4] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 5 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Sexta pregunta
					if(GrupoRespuestas6.getSelection() == rbn46.getModel()) {
						valores[5] = true;
					}
					else if(GrupoRespuestas6.getSelection() == rbn52.getModel()) {
						valores[5] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 6 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Septima pregunta
					if(GrupoRespuestas7.getSelection() == rbn47.getModel()) {
						valores[6] = true;
					}
					else if(GrupoRespuestas7.getSelection() == rbn53.getModel()) {
						valores[6] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 7 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Octava pregunta
					if(GrupoRespuestas8.getSelection() == rbn48.getModel()) {
						valores[7] = true;
					}
					else if(GrupoRespuestas8.getSelection() == rbn54.getModel()) {
						valores[7] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 8 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Novena pregunta
					if(GrupoRespuestas9.getSelection() == rbn56.getModel()) {
						valores[8] = true;
					}
					else if(GrupoRespuestas9.getSelection() == rbn55.getModel()) {
						valores[8] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 9 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					// Decima pregunta
					if(GrupoRespuestas10.getSelection() == rbn57.getModel()) {
						valores[9] = true;
					}
					else if(GrupoRespuestas10.getSelection() == rbn58.getModel()) {
						valores[9] = false;
					}
					else {
						JOptionPane.showMessageDialog(null,"La pregunta 10 esta vacia","Llena Todos Los Campos",0);
						num = 1;
					}
					if(num == 0 && CBXHabilidad.getSelectedIndex() > 0) {
						Vacante nueva = new Vacante(empresa,"Obrero",CBXHabilidad.getSelectedItem().toString(),valores,(int)Cantidad.getValue(),monto,empresa.getCode());
						try {
							Principal.getInstance().setTVacantes(nueva);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							empresa.setVacante(nueva);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						for(Persona aux:Principal.getInstance().getTpersonas()) {
							if(aux.getSoli() == 1)
								if(aux instanceof Obrero && ((Obrero) aux).getHabilidades().get(0).equalsIgnoreCase(nueva.getTipoPersonal()) ) {
									if(nueva.aplicaHabilidades(aux.getSolicitud())) {
										nueva.solicitar(aux);
									}
								}
						}
						try {
							Principal.getInstance().buscarEmpresas(empresa.getCorreo()).setVacante(nueva);
							Principal.getInstance().dataSalida();
							lista.clear();
							int i = 0;
							for(Vacante vac:empresa.getMisVacantes()) {
								lista.add(i,"Codigo: "+vac.getCodigo()+" Puesto: "+vac.getPuesto()+" Tipo: "+vac.getTipoPersonal()+" ("+vac.getCant()+")"+"\n\n");
								i++;
							}
						} catch (ClassNotFoundException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(CBXHabilidad.getSelectedIndex() <= 0) {
						JOptionPane.showMessageDialog(null,"Selecciona una habilidad","Llena Todos Los Campos",0);
					}
					
				}
			}
		});
		btnNewButton.setBounds(75, 561, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1.setBounds(228, 561, 89, 23);
		contentPane.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Empresa",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(5, 35, 333, 83);
		contentPane.add(panel);

		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(10, 44, 46, 14);
		panel.add(label);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyReleased(KeyEvent e) {
				
			}
		});
		textField.setColumns(10);
		textField.setBackground(new Color(248, 248, 255));
		textField.setBounds(68, 40, 253, 25);
		panel.add(textField);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(95, 158, 160));
		panel_2.setBounds(20, 205, 366, 336);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JPanel PanelTipoPersonal = new JPanel();
		PanelTipoPersonal.setLayout(null);
		PanelTipoPersonal.setForeground(Color.WHITE);
		PanelTipoPersonal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo De Personal",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		PanelTipoPersonal.setBackground(new Color(102, 205, 170));
		PanelTipoPersonal.setBounds(10, 22, 346, 51);
		panel_2.add(PanelTipoPersonal);

		 RBNUniversitario = new JRadioButton("Universitario");
		RBNUniversitario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(false);
				panelTecE.setVisible(false);
				panelUniE.setVisible(true);
				panelUniversitario.setVisible(true);
				panelTecnico.setVisible(true);
				panelObrero.setVisible(false);
				CBXCarrera.setSelectedIndex(0);
				setgrupo(rbn1,rbn3,rbn5,rbn6,rbn7,rbn8,rbn9,rbn10,rbn18,rbn19,rbn2,rbn4,rbn11,rbn12,rbn13,rbn14,rbn15,rbn16,rbn17,rbn20);
				
			}
		});
		RBNUniversitario.setSelected(true);
		RBNUniversitario.setBounds(19, 17, 104, 23);
		PanelTipoPersonal.add(RBNUniversitario);

		RBNTecnico = new JRadioButton("Tecnico");
		RBNTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(false);
				panelTecE.setVisible(true);
				panelUniE.setVisible(false);
				panelTecnico.setVisible(true);
				panelUniversitario.setVisible(false);
				panelObrero.setVisible(false);
				CBXEspecialidad.setSelectedIndex(0);
				setgrupo(rbn21,rbn23,rbn25,rbn26,rbn27,rbn28,rbn29,rbn30,rbn38,rbn59,rbn22,rbn24,rbn31,rbn32,rbn33,rbn34,rbn35,rbn36,rbn37,rbn60);
			}
		});
		RBNTecnico.setSelected(false);
		RBNTecnico.setBounds(139, 17, 85, 23);
		PanelTipoPersonal.add(RBNTecnico);

	    RBNObrero = new JRadioButton("Obrero");
		RBNObrero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(true);
				panelTecE.setVisible(false);
				panelUniE.setVisible(false);
				panelTecnico.setVisible(false);
				panelUniversitario.setVisible(false);
				panelObrero.setVisible(true);
				CBXHabilidad.setSelectedIndex(0);
				setgrupo(rbn39,rbn41,rbn43,rbn44,rbn45,rbn46,rbn47,rbn48,rbn56,rbn57,rbn40,rbn42,rbn49,rbn50,rbn51,rbn52,rbn53,rbn54,rbn55,rbn58
);
			}
		});
		RBNObrero.setSelected(false);
		RBNObrero.setBounds(255, 17, 85, 23);
		PanelTipoPersonal.add(RBNObrero);

		panelUniversitario = new JPanel();
		panelUniversitario.setLayout(null);
		panelUniversitario.setForeground(Color.WHITE);
		panelUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Universitario",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelUniversitario.setBackground(new Color(102, 205, 170));
		panelUniversitario.setBounds(10, 98, 346, 81);
		panel_2.add(panelUniversitario);

		JLabel label_1 = new JLabel("Carrera:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 21, 91, 14);
		panelUniversitario.add(label_1);

		CBXCarrera = new JComboBox();
		CBXCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administracion", "Derecho", "Economia", "Ingenieria", "Medicina", "Mercadeo"}));
		CBXCarrera.setBounds(78, 34, 168, 25);
		panelUniversitario.add(CBXCarrera);

		panelTecnico = new JPanel();
		panelTecnico.setVisible(false);
		panelTecnico.setLayout(null);
		panelTecnico.setForeground(Color.WHITE);
		panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tecnico",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelTecnico.setBackground(new Color(102, 205, 170));
		panelTecnico.setBounds(10, 98, 346, 81);
		panel_2.add(panelTecnico);

		labelEspecialidad = new JLabel("Especialidad:");
		labelEspecialidad.setForeground(Color.WHITE);
		labelEspecialidad.setBounds(10, 21, 91, 14);
		panelTecnico.add(labelEspecialidad);

		CBXEspecialidad = new JComboBox();
		CBXEspecialidad.setModel(new DefaultComboBoxModel(new String[] { "<Seleccionar>", "Informatica", "Mercadeo",
				"Arte", "Turismo", "Contabilidad", "Enfermeria" }));
		CBXEspecialidad.setBounds(78, 34, 168, 25);
		panelTecnico.add(CBXEspecialidad);

		panelObrero = new JPanel();
		panelObrero.setVisible(false);
		panelObrero.setLayout(null);
		panelObrero.setForeground(Color.WHITE);
		panelObrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Obrero",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelObrero.setBackground(new Color(102, 205, 170));
		panelObrero.setBounds(10, 98, 346, 81);
		panel_2.add(panelObrero);

		labelHabilidad = new JLabel("Habilidades:");
		labelHabilidad.setForeground(Color.WHITE);
		labelHabilidad.setBounds(10, 21, 91, 14);
		panelObrero.add(labelHabilidad);

		CBXHabilidad = new JComboBox();
		CBXHabilidad.setModel(new DefaultComboBoxModel(
				new String[] { "<Seleccionar>", "Creativo", "Comunicativo", "Adaptable", "Trabajo en Equipo" }));
		CBXHabilidad.setBounds(78, 34, 168, 25);
		panelObrero.add(CBXHabilidad);

		JPanel PanelMonto = new JPanel();
		PanelMonto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Monto a Ganar",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelMonto.setBackground(new Color(102, 205, 170));
		PanelMonto.setBounds(10, 201, 346, 106);
		panel_2.add(PanelMonto);
		PanelMonto.setLayout(null);

		RBN10 = new JRadioButton("Entre 10,000 a 30,000");
		RBN10.setBounds(6, 31, 154, 23);
		RBN10.setSelected(true);
		PanelMonto.add(RBN10);

		RBN30 = new JRadioButton("Entre 30,000 o 50,000");
		RBN30.setBounds(178, 31, 162, 23);
		PanelMonto.add(RBN30);

		RBN50 = new JRadioButton("Entre 50,000 o M\u00E1s");
		RBN50.setBounds(105, 76, 154, 23);
		PanelMonto.add(RBN50);

		JLabel lblNewLabel = new JLabel("Cantidad de Personal");
		lblNewLabel.setBounds(20, 140, 143, 14);
		contentPane.add(lblNewLabel);
		
		Cantidad = new SpinnerNumberModel();
		Cantidad.setMinimum(1);
		Cantidad.setMaximum(99);
		SPNCant = new JSpinner();
		SPNCant.setBounds(154, 159, 55, 20);
		SPNCant.setModel(Cantidad);
		SPNCant.setValue(1);
		
		contentPane.add(SPNCant);

		JLabel lblSolicitudes = new JLabel("Solicitudes");
		lblSolicitudes.setBounds(1005, 127, 67, 14);
		contentPane.add(lblSolicitudes);

		JButton btnVer = new JButton("Ver");
		btnVer.setBackground(new Color(95, 158, 160));
		btnVer.setEnabled(false);
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selec = list.getSelectedIndex();
				if(selec > -1) {
					String var = list.getSelectedValue().toString().substring(8,12);
					int code = Integer.parseInt(var);
					Vacante aux = empresa.BuscarVacantes(code);
					VistaSolicitud view = new VistaSolicitud(aux,empresa.getNombre());
					view.setModal(true);
					view.setVisible(true);
				}

			}
		});
		btnVer.setBounds(997, 561, 89, 23);
		contentPane.add(btnVer);
	    				
	    						panelTecE = new JPanel();
	    						panelTecE.setLayout(null);
	    						panelTecE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos",
	    								TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    						panelTecE.setBackground(new Color(102, 205, 170));
	    						panelTecE.setBounds(402, 159, 460, 434);
	    						contentPane.add(panelTecE);
	    						
	    								rbn21 = new JRadioButton("Si");
	    								rbn21.setBounds(313, 52, 50, 23);
	    								panelTecE.add(rbn21);
	    								
	    										rbn22 = new JRadioButton("No");
	    										rbn22.setBounds(385, 52, 50, 23);
	    										panelTecE.add(rbn22);
	    										
	    												rbn23 = new JRadioButton("Si");
	    												rbn23.setBounds(313, 89, 50, 23);
	    												panelTecE.add(rbn23);
	    												
	    														rbn24 = new JRadioButton("No");
	    														rbn24.setBounds(385, 89, 50, 23);
	    														panelTecE.add(rbn24);
	    														
	    																rbn25 = new JRadioButton("Si");
	    																rbn25.setBounds(313, 127, 50, 23);
	    																panelTecE.add(rbn25);
	    																
	    																		rbn26 = new JRadioButton("Si");
	    																		rbn26.setBounds(313, 165, 50, 23);
	    																		panelTecE.add(rbn26);
	    																		
	    																				rbn27 = new JRadioButton("Si");
	    																				rbn27.setBounds(313, 203, 50, 23);
	    																				panelTecE.add(rbn27);
	    																				
	    																						rbn28 = new JRadioButton("Si");
	    																						rbn28.setBounds(313, 239, 50, 23);
	    																						panelTecE.add(rbn28);
	    																						
	    																								JLabel label_12 = new JLabel("1. \u00BFHabla otro Idioma?");
	    																								label_12.setBounds(22, 56, 207, 14);
	    																								panelTecE.add(label_12);
	    																								
	    																										JLabel label_13 = new JLabel("2. \u00BFVehiculo Propio?");
	    																										label_13.setBounds(22, 93, 193, 14);
	    																										panelTecE.add(label_13);
	    																										
	    																												JLabel label_14 = new JLabel("3. \u00BFDisponibilidad de Horario?");
	    																												label_14.setBounds(22, 131, 253, 14);
	    																												panelTecE.add(label_14);
	    																												
	    																														JLabel label_15 = new JLabel("4. \u00BFDisposicion de Viaje?");
	    																														label_15.setBounds(22, 169, 156, 14);
	    																														panelTecE.add(label_15);
	    																														
	    																																JLabel label_16 = new JLabel("5. \u00BFDispuesto a Mudarse?");
	    																																label_16.setBounds(22, 207, 207, 14);
	    																																panelTecE.add(label_16);
	    																																
	    																																		JLabel lblpiensaAmpliar = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
	    																																		lblpiensaAmpliar.setBounds(22, 243, 242, 14);
	    																																		panelTecE.add(lblpiensaAmpliar);
	    																																		
	    																																				rbn29 = new JRadioButton("Si");
	    																																				rbn29.setBounds(313, 275, 50, 23);
	    																																				panelTecE.add(rbn29);
	    																																				
	    																																						rbn30 = new JRadioButton("Si");
	    																																						rbn30.setBounds(313, 312, 50, 23);
	    																																						panelTecE.add(rbn30);
	    																																						
	    																																								JLabel lbltrabajaruedaLos = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
	    																																								lbltrabajaruedaLos.setBounds(22, 279, 230, 14);
	    																																								panelTecE.add(lbltrabajaruedaLos);
	    																																								
	    																																										JLabel lblposeeExperiencia = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
	    																																										lblposeeExperiencia.setBounds(22, 316, 269, 14);
	    																																										panelTecE.add(lblposeeExperiencia);
	    																																										
	    																																												JLabel lblpuedeRealizar = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
	    																																												lblpuedeRealizar.setBounds(22, 349, 277, 14);
	    																																												panelTecE.add(lblpuedeRealizar);
	    																																												
	    																																														JLabel lbltrabajasBien = new JLabel("10. \u00BFTrabajas bien en equipo?");
	    																																														lbltrabajasBien.setBounds(22, 390, 242, 14);
	    																																														panelTecE.add(lbltrabajasBien);
	    																																														
	    																																																rbn31 = new JRadioButton("No");
	    																																																rbn31.setBounds(385, 127, 50, 23);
	    																																																panelTecE.add(rbn31);
	    																																																
	    																																																		rbn32 = new JRadioButton("No");
	    																																																		rbn32.setBounds(385, 165, 50, 23);
	    																																																		panelTecE.add(rbn32);
	    																																																		
	    																																																				rbn33 = new JRadioButton("No");
	    																																																				rbn33.setBounds(385, 203, 50, 23);
	    																																																				panelTecE.add(rbn33);
	    																																																				
	    																																																						rbn34 = new JRadioButton("No");
	    																																																						rbn34.setBounds(385, 239, 50, 23);
	    																																																						panelTecE.add(rbn34);
	    																																																						
	    																																																								rbn35 = new JRadioButton("No");
	    																																																								rbn35.setBounds(385, 275, 50, 23);
	    																																																								panelTecE.add(rbn35);
	    																																																								
	    																																																										rbn36 = new JRadioButton("No");
	    																																																										rbn36.setBounds(385, 312, 50, 23);
	    																																																										panelTecE.add(rbn36);
	    																																																										
	    																																																												rbn37 = new JRadioButton("No");
	    																																																												rbn37.setBounds(385, 345, 50, 23);
	    																																																												panelTecE.add(rbn37);
	    																																																												
	    																																																														rbn38 = new JRadioButton("Si");
	    																																																														rbn38.setBounds(313, 345, 50, 23);
	    																																																														panelTecE.add(rbn38);
	    																																																														
	    																																																														rbn59 = new JRadioButton("Si");
	    																																																														rbn59.setBounds(315, 386, 50, 23);
	    																																																														panelTecE.add(rbn59);
	    																																																														
	    																																																																rbn60 = new JRadioButton("No");
	    																																																																rbn60.setBounds(385, 386, 50, 23);
	    																																																																panelTecE.add(rbn60);
	    		
	    				panelObreE = new JPanel();
	    				panelObreE.setLayout(null);
	    				panelObreE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
	    						"Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    				panelObreE.setBackground(new Color(102, 205, 170));
	    				panelObreE.setBounds(402, 159, 460, 434);
	    				contentPane.add(panelObreE);
	    				
	    						rbn39 = new JRadioButton("Si");
	    						rbn39.setBounds(313, 52, 50, 23);
	    						panelObreE.add(rbn39);
	    						
	    								rbn40 = new JRadioButton("No");
	    								rbn40.setBounds(385, 52, 50, 23);
	    								panelObreE.add(rbn40);
	    								
	    										rbn41 = new JRadioButton("Si");
	    										rbn41.setBounds(313, 89, 50, 23);
	    										panelObreE.add(rbn41);
	    										
	    												rbn42 = new JRadioButton("No");
	    												rbn42.setBounds(385, 89, 50, 23);
	    												panelObreE.add(rbn42);
	    												
	    														rbn43 = new JRadioButton("Si");
	    														rbn43.setBounds(313, 127, 50, 23);
	    														panelObreE.add(rbn43);
	    														
	    																rbn44 = new JRadioButton("Si");
	    																rbn44.setBounds(313, 165, 50, 23);
	    																panelObreE.add(rbn44);
	    																
	    																		rbn45 = new JRadioButton("Si");
	    																		rbn45.setBounds(313, 203, 50, 23);
	    																		panelObreE.add(rbn45);
	    																		
	    																				rbn46 = new JRadioButton("Si");
	    																				rbn46.setBounds(313, 239, 50, 23);
	    																				panelObreE.add(rbn46);
	    																				
	    																						rbn47 = new JRadioButton("Si");
	    																						rbn47.setBounds(313, 275, 50, 23);
	    																						panelObreE.add(rbn47);
	    																						
	    																								rbn48 = new JRadioButton("Si");
	    																								rbn48.setBounds(313, 312, 50, 23);
	    																								panelObreE.add(rbn48);
	    																								
	    																										rbn49 = new JRadioButton("No");
	    																										rbn49.setBounds(385, 127, 50, 23);
	    																										panelObreE.add(rbn49);
	    																										
	    																												rbn50 = new JRadioButton("No");
	    																												rbn50.setBounds(385, 165, 50, 23);
	    																												panelObreE.add(rbn50);
	    																												
	    																														rbn51 = new JRadioButton("No");
	    																														rbn51.setBounds(385, 203, 50, 23);
	    																														panelObreE.add(rbn51);
	    																														
	    																																rbn52 = new JRadioButton("No");
	    																																rbn52.setBounds(385, 239, 50, 23);
	    																																panelObreE.add(rbn52);
	    																																
	    																																		rbn53 = new JRadioButton("No");
	    																																		rbn53.setBounds(385, 275, 50, 23);
	    																																		panelObreE.add(rbn53);
	    																																		
	    																																				rbn54 = new JRadioButton("No");
	    																																				rbn54.setBounds(385, 312, 50, 23);
	    																																				panelObreE.add(rbn54);
	    																																				
	    																																						JLabel label_2 = new JLabel("1. \u00BFHabla otro idioma?");
	    																																						label_2.setBounds(22, 56, 207, 14);
	    																																						panelObreE.add(label_2);
	    																																						
	    																																								JLabel label_3 = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
	    																																								label_3.setBounds(22, 93, 193, 14);
	    																																								panelObreE.add(label_3);
	    																																								
	    																																										JLabel label_4 = new JLabel("3. \u00BFDisponibilidad de Horario?");
	    																																										label_4.setBounds(22, 131, 253, 14);
	    																																										panelObreE.add(label_4);
	    																																										
	    																																												JLabel label_5 = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
	    																																												label_5.setBounds(22, 169, 156, 14);
	    																																												panelObreE.add(label_5);
	    																																												
	    																																														JLabel label_6 = new JLabel("5. \u00BFDispuesto a Mudarse?");
	    																																														label_6.setBounds(22, 207, 207, 14);
	    																																														panelObreE.add(label_6);
	    																																														
	    																																																JLabel label_7 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
	    																																																label_7.setBounds(22, 243, 242, 14);
	    																																																panelObreE.add(label_7);
	    																																																
	    																																																		JLabel label_8 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
	    																																																		label_8.setBounds(22, 279, 230, 14);
	    																																																		panelObreE.add(label_8);
	    																																																		
	    																																																				JLabel label_9 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
	    																																																				label_9.setBounds(22, 316, 269, 14);
	    																																																				panelObreE.add(label_9);
	    																																																				
	    																																																						JLabel label_10 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
	    																																																						label_10.setBounds(22, 349, 277, 14);
	    																																																						panelObreE.add(label_10);
	    																																																						
	    																																																								rbn55 = new JRadioButton("No");
	    																																																								rbn55.setBounds(385, 345, 50, 23);
	    																																																								panelObreE.add(rbn55);
	    																																																								
	    																																																										rbn56 = new JRadioButton("Si");
	    																																																										rbn56.setBounds(313, 345, 50, 23);
	    																																																										panelObreE.add(rbn56);
	    																																																										
	    																																																												JLabel label_11 = new JLabel("10. \u00BFTrabajas bien en equipo?");
	    																																																												label_11.setBounds(22, 390, 242, 14);
	    																																																												panelObreE.add(label_11);
	    																																																												
	    																																																														rbn57 = new JRadioButton("Si");
	    																																																														rbn57.setBounds(315, 386, 50, 23);
	    																																																														panelObreE.add(rbn57);
	    																																																														
	    																																																																rbn58 = new JRadioButton("No");
	    																																																																rbn58.setBounds(385, 386, 50, 23);
	    																																																																panelObreE.add(rbn58);
	    		panelUniE = new JPanel();
	    		panelUniE.setLayout(null);
	    		panelUniE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario",
	    				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    		panelUniE.setBackground(new Color(102, 205, 170));
	    		panelUniE.setBounds(402, 159, 460, 434);
	    		contentPane.add(panelUniE);
	    		
	    				rbn1 = new JRadioButton("Si");
	    				rbn1.setBounds(313, 52, 50, 23);
	    				panelUniE.add(rbn1);
	    				
	    						rbn2 = new JRadioButton("No");
	    						rbn2.setBounds(385, 52, 50, 23);
	    						panelUniE.add(rbn2);
	    						
	    								rbn3 = new JRadioButton("Si");
	    								rbn3.setBounds(313, 89, 50, 23);
	    								panelUniE.add(rbn3);
	    								
	    										rbn4 = new JRadioButton("No");
	    										rbn4.setBounds(385, 89, 50, 23);
	    										panelUniE.add(rbn4);
	    										
	    												rbn5 = new JRadioButton("Si");
	    												rbn5.setBounds(313, 127, 50, 23);
	    												panelUniE.add(rbn5);
	    												
	    														rbn6 = new JRadioButton("Si");
	    														rbn6.setBounds(313, 165, 50, 23);
	    														panelUniE.add(rbn6);
	    														
	    																rbn7 = new JRadioButton("Si");
	    																rbn7.setBounds(313, 203, 50, 23);
	    																panelUniE.add(rbn7);
	    																
	    																		rbn8 = new JRadioButton("Si");
	    																		rbn8.setBounds(313, 239, 50, 23);
	    																		panelUniE.add(rbn8);
	    																		
	    																				rbn9 = new JRadioButton("Si");
	    																				rbn9.setBounds(313, 275, 50, 23);
	    																				panelUniE.add(rbn9);
	    																				
	    																						rbn10 = new JRadioButton("Si");
	    																						rbn10.setBounds(313, 312, 50, 23);
	    																						panelUniE.add(rbn10);
	    																						
	    																								rbn11 = new JRadioButton("No");
	    																								rbn11.setBounds(385, 127, 50, 23);
	    																								panelUniE.add(rbn11);
	    																								
	    																										rbn12 = new JRadioButton("No");
	    																										rbn12.setBounds(385, 165, 50, 23);
	    																										panelUniE.add(rbn12);
	    																										
	    																												rbn13 = new JRadioButton("No");
	    																												rbn13.setBounds(385, 203, 50, 23);
	    																												panelUniE.add(rbn13);
	    																												
	    																														rbn14 = new JRadioButton("No");
	    																														rbn14.setBounds(385, 239, 50, 23);
	    																														panelUniE.add(rbn14);
	    																														
	    																																rbn15 = new JRadioButton("No");
	    																																rbn15.setBounds(385, 275, 50, 23);
	    																																panelUniE.add(rbn15);
	    																																
	    																																		rbn16 = new JRadioButton("No");
	    																																		rbn16.setBounds(385, 312, 50, 23);
	    																																		panelUniE.add(rbn16);
	    																																		
	    																																				JLabel label_22 = new JLabel("1. \u00BFHabla otro idioma?");
	    																																				label_22.setBounds(22, 56, 207, 14);
	    																																				panelUniE.add(label_22);
	    																																				
	    																																						JLabel label_23 = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
	    																																						label_23.setBounds(22, 93, 193, 14);
	    																																						panelUniE.add(label_23);
	    																																						
	    																																								JLabel label_24 = new JLabel("3. \u00BFDisponibilidad de Horario?");
	    																																								label_24.setBounds(22, 131, 253, 14);
	    																																								panelUniE.add(label_24);
	    																																								
	    																																										JLabel label_25 = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
	    																																										label_25.setBounds(22, 169, 156, 14);
	    																																										panelUniE.add(label_25);
	    																																										
	    																																												JLabel label_26 = new JLabel("5. \u00BFDispuesto a Mudarse?");
	    																																												label_26.setBounds(22, 207, 207, 14);
	    																																												panelUniE.add(label_26);
	    																																												
	    																																														JLabel label_27 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
	    																																														label_27.setBounds(22, 243, 242, 14);
	    																																														panelUniE.add(label_27);
	    																																														
	    																																																JLabel label_28 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
	    																																																label_28.setBounds(22, 279, 230, 14);
	    																																																panelUniE.add(label_28);
	    																																																
	    																																																		JLabel label_29 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
	    																																																		label_29.setBounds(22, 316, 269, 14);
	    																																																		panelUniE.add(label_29);
	    																																																		
	    																																																				JLabel label_30 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
	    																																																				label_30.setBounds(22, 349, 277, 14);
	    																																																				panelUniE.add(label_30);
	    																																																				
	    																																																						rbn17 = new JRadioButton("No");
	    																																																						rbn17.setBounds(385, 345, 50, 23);
	    																																																						panelUniE.add(rbn17);
	    																																																						
	    																																																								rbn18 = new JRadioButton("Si");
	    																																																								rbn18.setBounds(313, 345, 50, 23);
	    																																																								panelUniE.add(rbn18);
	    																																																								
	    																																																										JLabel label_31 = new JLabel("10. \u00BFTrabajas bien en equipo?");
	    																																																										label_31.setBounds(22, 390, 242, 14);
	    																																																										panelUniE.add(label_31);
	    																																																										
	    																																																												rbn19 = new JRadioButton("Si");
	    																																																												rbn19.setBounds(315, 386, 50, 23);
	    																																																												panelUniE.add(rbn19);
	    																																																												
	    																																																														rbn20 = new JRadioButton("No");
	    																																																														rbn20.setBounds(385, 386, 50, 23);
	    																																																														panelUniE.add(rbn20);
		
		ButtonGroup Grupo1 = new ButtonGroup();
		Grupo1.add(RBNObrero);
		Grupo1.add(RBNTecnico);
		Grupo1.add(RBNUniversitario);
		ButtonGroup Grupo2 = new ButtonGroup();
		Grupo2.add(RBN10);
		Grupo2.add(RBN30);
		Grupo2.add(RBN50);
		
	    list = new JList();
	    list.setBackground(new Color(95, 158, 160));
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int selec = list.getSelectedIndex();
				if(selec > -1) {
					btnVer.setEnabled(true);
				}
			}
		});
		list.setBounds(872, 180, 341, 336);
		contentPane.add(list);
		list.setModel(lista);
		
		
		
	}
	
	public void setgrupo( 
			JRadioButton RBN1S,
			JRadioButton RBN2S,
			JRadioButton RBN3S,
			JRadioButton RBN4S,
			JRadioButton RBN5S,
			JRadioButton RBN6S,
			JRadioButton RBN7S,
			JRadioButton RBN8S,
			JRadioButton RBN9S,
			JRadioButton RBN10S,
			JRadioButton RBN1N,
			JRadioButton RBN2N,
			JRadioButton RBN3N,
			JRadioButton RBN4N,
			JRadioButton RBN5N,
			JRadioButton RBN6N,
			JRadioButton RBN7N,
			JRadioButton RBN8N,
			JRadioButton RBN9N,
			JRadioButton RBN10N
			  ) {
		GrupoRespuestas1.add(RBN1S);
		GrupoRespuestas2.add(RBN2S);
		GrupoRespuestas3.add(RBN3S);
		GrupoRespuestas4.add(RBN4S);
		GrupoRespuestas5.add(RBN5S);
		GrupoRespuestas6.add(RBN6S);
		GrupoRespuestas7.add(RBN7S);
		GrupoRespuestas8.add(RBN8S);
		GrupoRespuestas9.add(RBN9S);
		GrupoRespuestas10.add(RBN10S);
		
		GrupoRespuestas1.add(RBN1N);
		GrupoRespuestas2.add(RBN2N);
		GrupoRespuestas3.add(RBN3N);
		GrupoRespuestas4.add(RBN4N);
		GrupoRespuestas5.add(RBN5N);
		GrupoRespuestas6.add(RBN6N);
		GrupoRespuestas7.add(RBN7N);
		GrupoRespuestas8.add(RBN8N);
		GrupoRespuestas9.add(RBN9N);
		GrupoRespuestas10.add(RBN10N);

	}
	
	public void setEnter(JButton BTN) {
 		getRootPane().setDefaultButton(BTN);
 	}
}
