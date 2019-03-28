package Visual;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logic.*;

import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;


import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	// Declaraciones de variables
	private JPanel PanelPrincipal;
	private JPanel PanelBotones;
	private JButton BTNiniciarSesion;
	private JButton BTNUser;
	private Dimension Tam;
	private JPanel PanelLogin;
	private JPanel PanelUser;
	private JPanel PanelEmpresa;
	private JTextField textUsuario;
	private JPasswordField passwordContra;
	private JPanel panel_1;
	private JLabel labelNombre;
	private JTextField textNombre;
	private JLabel labelApellido;
	private JLabel labelCorreo;
	private JTextField txtCorreo;
	private JLabel labelContra;
	private JPasswordField passwordContraseña;
	private JLabel labelConfContra;
	private JPasswordField txtpassconfirm;
	private JPanel panel_2;
	private JRadioButton RBUniversitario;
	private JRadioButton RBTec;
	private JRadioButton RBObrero;
	private JTextField textCorreoE;
	private JPasswordField passwordE;
	private JTextField TXTNombre;
	private JTextField textTelefono;
	private JTextField textEncargado;
	private JTextField txtApellido;
	private ButtonGroup grupoEstado;
	private ButtonGroup grupoTipo;
	private JButton btnMasHabilidades;
	private JPanel panelUniversitario;
	private JLabel labelCarrera;
	private JPanel panelTecnico;
	private JLabel labelEspecialidad;
	private JPanel panelObrero;
	private JLabel labelHabilidad; 
	private  JComboBox<?>  CBXHabilidad;
	private JLabel LBver;
	private JLabel LBOcultar;
	private JLabel LBempresaNover;
	private JLabel LBempresaver;
	private JLabel LBNoconfirm;
	private JLabel LBConfirmver;
	private JLabel LBconfirmCorreo;
	private JLabel LBClaveCorta;
	private JLabel LBIgualdad;
	
	

 public Inicio() {
 	setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imgenes/FondoPortada.jpg")));
 	addWindowListener(new WindowAdapter() {
 		@Override
 		public void windowOpened(WindowEvent e) {
 			PanelEmpresa.setVisible(false);
 			PanelLogin.setVisible(false);
 			PanelUser.setVisible(false);
 		}
 	});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setTitle("Bolsa De Empleos");
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.WHITE);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		BTNiniciarSesion = new JButton("");
		BTNiniciarSesion.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Boton Iniciar Sesion.jpg")));
		BTNiniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelLogin.isVisible()) {
					PanelLogin.setVisible(false);
				}
				else {
					PanelEmpresa.setVisible(false);
		 			PanelLogin.setVisible(true);
		 			PanelUser.setVisible(false);
				}
			}
		});
		BTNiniciarSesion.setBounds(0, 47, 174, 58);
		BTNiniciarSesion.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton BTNEmpresa = new JButton("");
		BTNEmpresa.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Empresa.jpg")));
		BTNEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelEmpresa.isVisible()) {
					PanelEmpresa.setVisible(false);
				}
				else {
					PanelEmpresa.setVisible(true);
		 			PanelLogin.setVisible(false);
		 			PanelUser.setVisible(false);
				}
			}
		});
		BTNEmpresa.setBounds(0, 283, 174, 58);
		BTNEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNuevo = new JLabel("Nuevo");
		lblNuevo.setFont(new Font("AntsyPants", Font.ITALIC, 23));
		lblNuevo.setBounds(0, 128, 150, 49);
		lblNuevo.setBackground(Color.BLUE);
		lblNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Tam = this.getToolkit().getScreenSize();
		
		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon("src\\Imgenes\\FondoPortada.jpg"));
		lblfondo.setBounds(0, 0, (int)Tam.getWidth(), (int)Tam.getHeight());
		
		PanelBotones = new JPanel();
		PanelBotones.setBounds(0, 0, 160, (int)Tam.height);
		PanelBotones.setBackground(new Color(228, 241, 254));
		
		this.setBounds(100, 100, (int)Tam.getWidth(),(int)Tam.height);
		this.setLocationRelativeTo(null);
		
		PanelPrincipal.add(PanelBotones);
		PanelBotones.setLayout(null);
		PanelBotones.add(lblNuevo);
		
		BTNUser = new JButton("");
		BTNUser.setBounds(0, 174, 174, 58);
		PanelBotones.add(BTNUser);
		BTNUser.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Boton Usuario.jpg")));
		BTNUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelUser.isVisible()) {
					PanelUser.setVisible(false);
				}
				else {
					PanelEmpresa.setVisible(false);
		 			PanelLogin.setVisible(false);
		 			PanelUser.setVisible(true);
				}
			}
		});
		BTNUser.setHorizontalAlignment(SwingConstants.RIGHT);
		PanelBotones.add(BTNiniciarSesion);
		PanelBotones.add(BTNEmpresa);
		
	    PanelLogin = new JPanel();
		PanelLogin.setBounds(170, 28, 648, 78);
		PanelLogin.setBackground(new Color(103, 128, 159, 160));
		PanelPrincipal.add(PanelLogin);
		PanelLogin.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 648, 517);
		panel.setLayout(null);
		panel.setBackground(new Color(34, 49, 63));
		PanelLogin.add(panel);
		
		JLabel labelUsuario = new JLabel("Usuario/Correo:");
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setBounds(20, 21, 147, 14);
		panel.add(labelUsuario);
		
		JLabel labelContraseña = new JLabel("Contrase\u00F1a:");
		labelContraseña.setForeground(Color.WHITE);
		labelContraseña.setBounds(274, 21, 105, 14);
		panel.add(labelContraseña);
		
		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
			}
		});
		textUsuario.setColumns(10);
		textUsuario.setBounds(68, 40, 191, 20);
		panel.add(textUsuario);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.setBounds(549, 39, 89, 23);
		panel.add(buttonLogin);
		
		passwordContra = new JPasswordField();
		passwordContra.setBounds(348, 40, 191, 20);
		panel.add(passwordContra);
		
		
		
	    PanelUser = new JPanel();
		PanelUser.setBounds(170, 107, 648, 405);
		PanelUser.setLayout(null);
		PanelUser.setBackground(new Color(108, 122, 137, 160));
		PanelPrincipal.add(PanelUser);
		
		
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255,255,255)));
		panel_1.setBounds(82, 11, 466, 193);
		panel_1.setBackground(new Color(34, 49, 63));
		panel_1.setLayout(null);
		PanelUser.add(panel_1);
		
		labelNombre = new JLabel("Nombre:");
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setBounds(10, 11, 97, 14);
		panel_1.add(labelNombre);
		
		
		LBNoconfirm = new JLabel("Ocultar");
		LBNoconfirm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		LBNoconfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBNoconfirm.setVisible(false);
				LBConfirmver.setVisible(true);
				txtpassconfirm.setEchoChar('●');
			}
		});
		LBNoconfirm.setForeground(Color.CYAN);
		LBNoconfirm.setVisible(false);
		LBNoconfirm.setBounds(422, 151, 34, 14);
		panel_1.add(LBNoconfirm);
		

		LBConfirmver = new JLabel("Ver");
		LBConfirmver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		LBConfirmver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBNoconfirm.setVisible(true);
				LBConfirmver.setVisible(false);
				txtpassconfirm.setEchoChar((char)0);
			}
		});
		LBConfirmver.setForeground(Color.CYAN);
		LBConfirmver.setBounds(422, 151, 33, 14);
		panel_1.add(LBConfirmver);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				
				if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
				
				
			}
		});
		
		LBOcultar = new JLabel("Ocultar");
		LBOcultar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		LBOcultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBOcultar.setVisible(false);
				LBver.setVisible(true);
				passwordContraseña.setEchoChar('●');
			}
		});
		LBOcultar.setForeground(Color.CYAN);
		LBOcultar.setBounds(195, 151, 50, 14);
		LBOcultar.setBackground(Color.blue);
		LBOcultar.setVisible(false);
		panel_1.add(LBOcultar);
		
		LBver = new JLabel("Ver");
		LBver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		LBver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBver.setVisible(false);
				LBOcultar.setVisible(true);
				passwordContraseña.setEchoChar((char)0);
			}
		});
		LBver.setForeground(Color.CYAN);
		LBver.setVerticalAlignment(SwingConstants.BOTTOM);
		LBver.setBounds(195, 151, 33, 14);
		panel_1.add(LBver);
		
		
		textNombre.setColumns(10);
		textNombre.setBounds(10, 36, 209, 20);
		panel_1.add(textNombre);
		
		labelApellido = new JLabel("Apellido:");
		labelApellido.setForeground(Color.WHITE);
		labelApellido.setBounds(256, 11, 83, 14);
		panel_1.add(labelApellido);
		
		labelCorreo = new JLabel("Correo:");
		labelCorreo.setForeground(Color.WHITE);
		labelCorreo.setBounds(10, 67, 83, 14);
		panel_1.add(labelCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtCorreo.getText().length() > 4 ) {
					if(Principal.getInstance().existeUser(txtCorreo.getText())) {
						LBconfirmCorreo.setText("Correo no disponible");
						LBconfirmCorreo.setForeground(Color.red);
						LBconfirmCorreo.setVisible(true);
					}
					else {
						LBconfirmCorreo.setText("Correo disponible");
						LBconfirmCorreo.setForeground(Color.GREEN);
						LBconfirmCorreo.setVisible(true);
					}
				}
				else {
					LBconfirmCorreo.setVisible(false);
				}
			}
		});
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(10, 92, 311, 20);
		panel_1.add(txtCorreo);
		
		labelContra = new JLabel("Contrase\u00F1a:");
		labelContra.setForeground(Color.WHITE);
		labelContra.setBounds(10, 123, 125, 14);
		panel_1.add(labelContra);
		
		passwordContraseña = new JPasswordField();
		passwordContraseña.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(passwordContraseña.getPassword().length < 4) {
					LBClaveCorta.setVisible(true);
					LBClaveCorta.setText("Esta contraseña es muy corta");
					LBClaveCorta.setForeground(Color.ORANGE);
				}
				else {
					LBClaveCorta.setVisible(false);
				}
				
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		passwordContraseña.setBounds(10, 148, 175, 20);
		panel_1.add(passwordContraseña);
		
		labelConfContra = new JLabel("Confirmar Contrase\u00F1a:");
		labelConfContra.setForeground(Color.WHITE);
		labelConfContra.setBounds(256, 123, 186, 14);
		panel_1.add(labelConfContra);
		
		txtpassconfirm = new JPasswordField();
		txtpassconfirm.setBounds(255, 148, 167, 20);
		panel_1.add(txtpassconfirm);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(256, 36, 200, 20);
		panel_1.add(txtApellido);
		
		LBconfirmCorreo = new JLabel("");
		LBconfirmCorreo.setVisible(false);
		LBconfirmCorreo.setBounds(323, 95, 133, 20);
		panel_1.add(LBconfirmCorreo);
		
		LBClaveCorta = new JLabel("");
		LBClaveCorta.setVisible(true);
		LBClaveCorta.setBounds(10, 168, 200, 14);
		panel_1.add(LBClaveCorta);
		
		LBIgualdad = new JLabel("");
		LBIgualdad.setBounds(241, 168, 215, 14);
		LBIgualdad.setVisible(false);
		panel_1.add(LBIgualdad);
		
		panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panel_2.setBounds(82, 204, 466, 47);
		panel_2.setBackground(new Color(1, 50, 67));
		PanelUser.add(panel_2);
		
	
		RBUniversitario = new JRadioButton("Universitario");
		RBUniversitario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RBTec.setSelected(false);
				RBObrero.setSelected(false);
				panelTecnico.setVisible(false);
				panelObrero.setVisible(false);
				panelUniversitario.setVisible(true);
		}});
		
		RBUniversitario.setBounds(6, 17, 109, 23);
		RBUniversitario.setSelected(true);
		panel_2.add(RBUniversitario);
		
		RBTec = new JRadioButton("Tecnico");
		RBTec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RBUniversitario.setSelected(false);
				RBObrero.setSelected(false);
				panelUniversitario.setVisible(false);
				panelObrero.setVisible(false);
				panelTecnico.setVisible(true);
		}});
		
		RBTec.setSelected(false);
		RBTec.setBounds(171, 17, 109, 23);
		panel_2.add(RBTec);
		
		RBObrero = new JRadioButton("Obrero");
		RBObrero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RBUniversitario.setSelected(false);
				RBTec.setSelected(false);
				panelUniversitario.setVisible(false);
				panelTecnico.setVisible(false);
				panelObrero.setVisible(true);
		}});

		RBObrero.setSelected(false);
		RBObrero.setBounds(333, 17, 109, 23);
		panel_2.add(RBObrero);
		PanelEmpresa = new JPanel();
		PanelEmpresa.setBounds(170, 168, 648, 419);
		PanelEmpresa.setBackground(new Color(108, 122, 137, 160));
		PanelPrincipal.add(PanelEmpresa);
		PanelEmpresa.setLayout(null);
		
		panelUniversitario = new JPanel();
		panelUniversitario.setForeground(Color.WHITE);
		panelUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Universitario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panelUniversitario.setBackground(new Color(34, 49, 63));
		panelUniversitario.setBounds(82, 248, 466, 81);
		PanelUser.add(panelUniversitario);
		
		labelCarrera = new JLabel("Carrera:");
		labelCarrera.setForeground(Color.WHITE);
		labelCarrera.setBounds(10, 21, 91, 14);
		panelUniversitario.add(labelCarrera);
		panelUniversitario.setLayout(null);
		
		JComboBox CBXCarreras = new JComboBox();
		CBXCarreras.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administración", "Derecho", "Economía", "Ingeniería", "Medicina", "Mercadeo"}));
		CBXCarreras.setBounds(78, 34, 251, 25);
		panelUniversitario.add(CBXCarreras);
		
		panelTecnico = new JPanel();
		panelTecnico.setVisible(false);
		panelTecnico.setLayout(null);
		panelTecnico.setForeground(Color.WHITE);
		panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tecnico", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panelTecnico.setBackground(new Color(34, 49, 63));
		panelTecnico.setBounds(82, 248, 466, 81);
		PanelUser.add(panelTecnico);
		
		labelEspecialidad = new JLabel("Especialidad:");
		labelEspecialidad.setForeground(Color.WHITE);
		labelEspecialidad.setBounds(10, 21, 91, 14);
		panelTecnico.add(labelEspecialidad);
		
		JComboBox CBXEspecialidad = new JComboBox();
		CBXEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Informatica", "Mercadeo", "Arte", "Turismo", "Contabilidad", "Enfermeria"}));
		CBXEspecialidad.setBounds(78, 34, 251, 25);
		panelTecnico.add(CBXEspecialidad);
		
		panelObrero = new JPanel();
		panelObrero.setVisible(false);
		panelObrero.setLayout(null);
		panelObrero.setForeground(Color.WHITE);
		panelObrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Obrero", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panelObrero.setBackground(new Color(34, 49, 63));
		panelObrero.setBounds(82, 248, 466, 81);
		PanelUser.add(panelObrero);
		
		labelHabilidad = new JLabel("Habilidades:");
		labelHabilidad.setForeground(Color.WHITE);
		labelHabilidad.setBounds(10, 21, 91, 14);
		panelObrero.add(labelHabilidad);
		
		
		CBXHabilidad = new JComboBox();
		CBXHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Creativo", "Comunicativo", "Adaptable", "Trabajo en Equipo" }));
		CBXHabilidad.setBounds(78, 34, 251, 25);
		panelObrero.add(CBXHabilidad);
		
		btnMasHabilidades = new JButton("Agregar");
		btnMasHabilidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					Boolean esta = false;
					String pass = new String(txtpassconfirm.getPassword()),
							passC = new String(passwordContraseña.getPassword());
					if(textNombre.getText().length() > 2 && txtCorreo.getText().length() > 4 
							&& txtApellido.getText().length() > 2  && pass.equals(passC) && txtpassconfirm.getPassword().length > 4) {
						if(CBXHabilidad.getSelectedIndex() > 0) {
							if(Principal.getInstance().getPerson() > 0) {
								esta = Principal.getInstance().existeUser(txtCorreo.getText());
							}
							if(esta == true) {
								Persona aux = Principal.getInstance().buscarPersonas(txtCorreo.getText());
								if( !(((Obrero) aux).HabilidadExiste(CBXHabilidad.getSelectedItem().toString()))) {
									((Obrero) aux).setHabilidades(CBXHabilidad.getSelectedItem().toString());
									JOptionPane.showMessageDialog(null,"Habilidad Agregada Con Exito y el \n usuario se creó con exito, pero puedes seguir agregando habilidades","Agregado", 1);
									
								}
								else {
									JOptionPane.showMessageDialog(null,"Esta habilidad ya la seleccionaste ","Advertencia", 0);
								}
							}
							else {
								Obrero nuevo = new Obrero(textNombre.getText(),txtApellido.getText(), 
										txtCorreo.getText(), pass,true,CBXHabilidad.getSelectedItem().toString());
								Principal.getInstance().setTpersonas(nuevo);
								JOptionPane.showMessageDialog(null,"Habilidad Agregada Con Exito ","Agregado", 1);
							}
						}
						else {
							JOptionPane.showMessageDialog(null,"Selecciona una Habilidad","Advertencia", 0);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"Debes llenar todos los campos","Advertencia", 0);
					}
			}
		});
		btnMasHabilidades.setBounds(350,34,100,25);
		panelObrero.add(btnMasHabilidades);
	
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Empresa", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255,255,255)));
		panel_4.setBounds(83, 11, 475, 343);
		panel_4.setBackground(new Color(34, 49, 63));
		PanelEmpresa.add(panel_4);
		
		JLabel labelCodigoE = new JLabel("Nombre:");
		labelCodigoE.setForeground(Color.WHITE);
		labelCodigoE.setBounds(10, 11, 83, 14);
		panel_4.add(labelCodigoE);
		
		JLabel labelCorreoE = new JLabel("Correo:");
		labelCorreoE.setForeground(Color.WHITE);
		labelCorreoE.setBounds(10, 138, 83, 14);
		panel_4.add(labelCorreoE);
		
		LBempresaNover = new JLabel("Ocultar");
		LBempresaNover.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		LBempresaNover.setVisible(false);
		LBempresaNover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBempresaNover.setVisible(false);
				LBempresaver.setVisible(true);
				passwordE.setEchoChar('●');
			}
		});
		LBempresaNover.setForeground(Color.CYAN);
		LBempresaNover.setBounds(425, 206, 46, 14);
		panel_4.add(LBempresaNover);
		
		LBempresaver = new JLabel("Ver");
		LBempresaver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		LBempresaver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LBempresaNover.setVisible(true);
				LBempresaver.setVisible(false);
				passwordE.setEchoChar((char)0);
			}
		});
		LBempresaver.setForeground(Color.CYAN);
		LBempresaver.setBounds(425, 206, 46, 14);
		panel_4.add(LBempresaver);
		
		textCorreoE = new JTextField();
		textCorreoE.setColumns(10);
		textCorreoE.setBounds(70, 150, 353, 20);
		panel_4.add(textCorreoE);
		
		JLabel labelConE = new JLabel("Contrase\u00F1a:");
		labelConE.setForeground(Color.WHITE);
		labelConE.setBounds(10, 181, 125, 14);
		panel_4.add(labelConE);
		
		passwordE = new JPasswordField();
		passwordE.setBounds(70, 206, 353, 20);
		panel_4.add(passwordE);
		
		JLabel labelEncargado = new JLabel("Encargado:");
		labelEncargado.setForeground(Color.WHITE);
		labelEncargado.setBounds(10, 237, 186, 14);
		panel_4.add(labelEncargado);
		
		TXTNombre = new JTextField();
		TXTNombre.setColumns(10);
		TXTNombre.setBounds(70, 35, 353, 20);
		panel_4.add(TXTNombre);
		
		JLabel labelTelefono = new JLabel("Telefono:");
		labelTelefono.setForeground(Color.WHITE);
		labelTelefono.setBounds(10, 77, 83, 14);
		panel_4.add(labelTelefono);
		MaskFormatter Numero = null;
		
		try {
			Numero = new MaskFormatter("###-###-####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textTelefono = new JFormattedTextField(Numero);
		textTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				if(Character.isLetter(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
			}
		});
		textTelefono.setColumns(10);
		textTelefono.setBounds(70, 91, 353, 20);
		panel_4.add(textTelefono);
		
		textEncargado = new JTextField();
		textEncargado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
			}
		});
		textEncargado.setColumns(10);
		textEncargado.setBounds(70, 254, 353, 20);
		panel_4.add(textEncargado);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBounds(10, 291, 186, 14);
		panel_4.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Comercio", "Software", "Turismo", "Industrial"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(70, 291, 353, 20);
		panel_4.add(comboBox);
		
		JButton btnCrearEmpresa = new JButton("Crear");
		btnCrearEmpresa.setBounds(143, 365, 89, 23);
		PanelEmpresa.add(btnCrearEmpresa);
		
		JButton btnCancelarEmpresa = new JButton("Cancelar");
		btnCancelarEmpresa.setBounds(372, 365, 89, 23);
		PanelEmpresa.add(btnCancelarEmpresa);
		
		grupoEstado = new ButtonGroup();
		grupoTipo = new ButtonGroup();
		grupoTipo.add(RBObrero);
		grupoTipo.add(RBTec);
		grupoTipo.add(RBUniversitario);
		
		JButton btnCrearUser = new JButton("Crear");
		btnCrearUser.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String passC = new String(txtpassconfirm.getPassword()),
						pass = new String(passwordContraseña.getPassword());
				Boolean esta = false;
				if(textNombre.getText().length() > 2 && txtCorreo.getText().length() > 4 
						&& txtApellido.getText().length() > 2 && pass.equals(passC) && txtpassconfirm.getPassword().length  > 4) {
						if(Principal.getInstance().getPerson() > 0) {
							esta = Principal.getInstance().existeUser(txtCorreo.getText());
						}
						if(esta == true) {
							JOptionPane.showMessageDialog(null,"Este correo ya está en uso","Correo Repetido", 0);
						}
						else if(esta == false) {
							String nom = textNombre.getText();
							if(RBObrero.isSelected() && CBXHabilidad.getSelectedIndex() > 0) {
								Obrero nuevo = new Obrero(nom,txtApellido.getText(), 
										txtCorreo.getText(), pass,true,CBXHabilidad.getSelectedItem().toString());
								Principal.getInstance().setTpersonas(nuevo);
								JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Usuario Creado Con Exito", 1);
							}
							else if(RBObrero.isSelected() && CBXHabilidad.getSelectedIndex() <= 0){
								JOptionPane.showMessageDialog(null,"Selecciona al menos una habilidad","Advertencia", 0);
							}
							if(RBTec.isSelected() && CBXEspecialidad.getSelectedIndex() > 0) {
								Tecnico nuevo = new Tecnico(nom,txtApellido.getText(), 
										txtCorreo.getText(), pass,true,CBXEspecialidad.getSelectedItem().toString());
								Principal.getInstance().setTpersonas(nuevo);
								JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Usuario Creado Con Exito", 1);
							}
							else if(RBTec.isSelected() && CBXEspecialidad.getSelectedIndex() <= 0) {
								JOptionPane.showMessageDialog(null,"Selecciona una especialidad","Advertencia", 0);
							}
							if(RBTec.isSelected() && CBXCarreras.getSelectedIndex() > 0) {
								Universitario nuevo = new Universitario(nom,txtApellido.getText(), 
										txtCorreo.getText(), pass,true,CBXEspecialidad.getSelectedItem().toString());
								Principal.getInstance().setTpersonas(nuevo);
								JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Usuario Creado Con Exito", 1);
							}
							else if(RBTec.isSelected() && CBXCarreras.getSelectedIndex() <= 0){
								JOptionPane.showMessageDialog(null,"Selecciona una carrera","Advertencia", 0);
							}
						}
					
				}
				else {
							JOptionPane.showMessageDialog(null,"Debes llenar todos los campos ","Advertencia", 0);
				}
				
			}
		});
		btnCrearUser.setBounds(165, 357, 89, 23);
		PanelUser.add(btnCrearUser);
		
		JButton btnCancelarUsuario = new JButton("Cancelar");
		btnCancelarUsuario.setBounds(345, 357, 89, 23);
		PanelUser.add(btnCancelarUsuario);
		

		// El panel principal debe añadir el label de fondo de ultimo siempre
		PanelPrincipal.add(lblfondo);
	}
}


