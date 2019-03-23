package Visual;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

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

public class Inicio extends JFrame {

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
	private JPasswordField passwordContrase�a;
	private JLabel labelConfContra;
	private JPasswordField passwordConfContra;
	private JPanel panel_2;
	private JRadioButton RBUniversitario;
	private JRadioButton RBTec;
	private JRadioButton RBObrero;
	private JPanel panel_3;
	private JRadioButton RBEmpleado;
	private JRadioButton RBDesempleado;
	private JTextField textDescripcionE;
	private JTextField textCorreoE;
	private JPasswordField passwordE;
	private JTextField TXTNombre;
	private JTextField textTelefono;
	private JTextField textEncargado;
	private JTextField textApellido;
	private ButtonGroup grupoEstado;
	private ButtonGroup grupoTipo;

 public Inicio() {
 	setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imgenes/Logo.ico")));
 	addWindowListener(new WindowAdapter() {
 		@Override
 		public void windowOpened(WindowEvent e) {
 			PanelEmpresa.setVisible(false);
 			PanelLogin.setVisible(false);
 			PanelUser.setVisible(false);
 		}
 	});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
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
		PanelBotones.setBackground(new Color(150, 40, 27, 160));
		
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
		panel.setBackground(new Color(242, 38, 19, 160));
		PanelLogin.add(panel);
		
		JLabel labelUsuario = new JLabel("Usuario:");
		labelUsuario.setBounds(20, 21, 147, 14);
		panel.add(labelUsuario);
		
		JLabel labelContrase�a = new JLabel("Contrase\u00F1a:");
		labelContrase�a.setBounds(274, 21, 105, 14);
		panel.add(labelContrase�a);
		
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
		PanelUser.setBounds(170, 107, 648, 480);
		PanelUser.setLayout(null);
		PanelUser.setBackground(new Color(108, 122, 137, 160));
		PanelPrincipal.add(PanelUser);
		
		
		
		panel_1 = new JPanel();
		
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(82, 11, 466, 193);
		panel_1.setBackground(new Color(242, 38, 19, 160));
		panel_1.setLayout(null);
		PanelUser.add(panel_1);
		
		labelNombre = new JLabel("Nombre:");
		labelNombre.setBounds(10, 11, 97, 14);
		panel_1.add(labelNombre);
		
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
		textNombre.setColumns(10);
		textNombre.setBounds(10, 36, 209, 20);
		panel_1.add(textNombre);
		
		labelApellido = new JLabel("Apellido:");
		labelApellido.setBounds(256, 11, 83, 14);
		panel_1.add(labelApellido);
		
		labelCorreo = new JLabel("Correo:");
		labelCorreo.setBounds(10, 67, 83, 14);
		panel_1.add(labelCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(10, 92, 347, 20);
		panel_1.add(txtCorreo);
		
		labelContra = new JLabel("Contrase\u00F1a:");
		labelContra.setBounds(10, 123, 125, 14);
		panel_1.add(labelContra);
		
		passwordContrase�a = new JPasswordField();
		passwordContrase�a.setBounds(10, 148, 209, 20);
		panel_1.add(passwordContrase�a);
		
		labelConfContra = new JLabel("Confirmar Contrase\u00F1a:");
		labelConfContra.setBounds(256, 123, 186, 14);
		panel_1.add(labelConfContra);
		
		passwordConfContra = new JPasswordField();
		passwordConfContra.setBounds(255, 148, 198, 20);
		panel_1.add(passwordConfContra);
		
		textApellido = new JTextField();
		textApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Letra = evt.getKeyChar();
				if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
		            evt.consume();
		        }
			}
		});
		textApellido.setColumns(10);
		textApellido.setBounds(256, 36, 200, 20);
		panel_1.add(textApellido);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(82, 261, 466, 47);
		panel_2.setBackground(new Color(242, 38, 19, 160));
		PanelUser.add(panel_2);
		
		RBUniversitario = new JRadioButton("Universitario");
		RBUniversitario.setSelected(false);
		RBUniversitario.setBounds(6, 17, 109, 23);
		panel_2.add(RBUniversitario);
		
		RBTec = new JRadioButton("Tecnico");
		RBTec.setSelected(false);
		RBTec.setBounds(171, 17, 109, 23);
		panel_2.add(RBTec);
		
		RBObrero = new JRadioButton("Obrero");
		RBObrero.setSelected(false);
		RBObrero.setBounds(333, 17, 109, 23);
		panel_2.add(RBObrero);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(82, 203, 466, 47);
		panel_3.setBackground(new Color(242, 38, 19, 160));
		PanelUser.add(panel_3);
		
		RBEmpleado = new JRadioButton("Empleado");
		RBEmpleado.setSelected(false);
		RBEmpleado.setBounds(34, 17, 109, 23);
		
		panel_3.add(RBEmpleado);
		
		RBDesempleado = new JRadioButton("Desempleado");
		RBDesempleado.setSelected(false);
		RBDesempleado.setBounds(333, 17, 109, 23);
		panel_3.add(RBDesempleado);
		PanelEmpresa = new JPanel();
		PanelEmpresa.setBounds(170, 168, 648, 419);
		PanelEmpresa.setBackground(new Color(108, 122, 137, 160));
		PanelPrincipal.add(PanelEmpresa);
		PanelEmpresa.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Empresa", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(83, 11, 466, 397);
		panel_4.setBackground(new Color(242, 38, 19, 160));
		PanelEmpresa.add(panel_4);
		
		JLabel labelDescripcion = new JLabel("Descripcion:");
		labelDescripcion.setBounds(10, 67, 97, 14);
		panel_4.add(labelDescripcion);
		
		textDescripcionE = new JTextField();
		textDescripcionE.setColumns(10);
		textDescripcionE.setBounds(70, 92, 353, 20);
		panel_4.add(textDescripcionE);
		
		JLabel labelCodigoE = new JLabel("Nombre:");
		labelCodigoE.setBounds(10, 11, 46, 14);
		panel_4.add(labelCodigoE);
		
		JLabel labelCorreoE = new JLabel("Correo:");
		labelCorreoE.setBounds(10, 175, 83, 14);
		panel_4.add(labelCorreoE);
		
		textCorreoE = new JTextField();
		textCorreoE.setColumns(10);
		textCorreoE.setBounds(70, 200, 353, 20);
		panel_4.add(textCorreoE);
		
		JLabel labelConE = new JLabel("Contrase\u00F1a:");
		labelConE.setBounds(10, 230, 125, 14);
		panel_4.add(labelConE);
		
		passwordE = new JPasswordField();
		passwordE.setBounds(70, 255, 353, 20);
		panel_4.add(passwordE);
		
		JLabel labelEncargado = new JLabel("Encargado:");
		labelEncargado.setBounds(10, 286, 186, 14);
		panel_4.add(labelEncargado);
		
		TXTNombre = new JTextField();
		TXTNombre.setColumns(10);
		TXTNombre.setBounds(70, 35, 353, 20);
		panel_4.add(TXTNombre);
		
		JLabel labelTelefono = new JLabel("Telefono:");
		labelTelefono.setBounds(10, 123, 83, 14);
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
		textTelefono.setBounds(70, 144, 353, 20);
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
		textEncargado.setBounds(70, 311, 353, 20);
		panel_4.add(textEncargado);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(10, 342, 186, 14);
		panel_4.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Comercio", "Software", "Turismo", "Industrial"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(70, 353, 353, 20);
		panel_4.add(comboBox);
		
		grupoEstado = new ButtonGroup();
		grupoTipo = new ButtonGroup();
		
		grupoEstado.add(RBDesempleado);
		grupoEstado.add(RBEmpleado);
		grupoTipo.add(RBObrero);
		grupoTipo.add(RBTec);
		grupoTipo.add(RBUniversitario);
		
		// El panel principal debe a�adir el label de fondo de ultimo siempre
		PanelPrincipal.add(lblfondo);
	}
}
