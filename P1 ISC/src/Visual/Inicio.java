package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.Principal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;



import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

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
	private JLabel labelCodigo;
	private JTextField textCodigo;
	private JLabel label_4;
	private JTextField txtUsuario;
	private JLabel labelContra;
	private JPasswordField passwordContraseña;
	private JLabel labelConfContra;
	private JPasswordField passwordConfContra;
	private JPanel panel_2;
	private JRadioButton radioButtonUni;
	private JRadioButton radioTec;
	private JRadioButton radioObrero;
	private JPanel panel_3;
	private JRadioButton rdbtnEmpleado;
	private JRadioButton rdbtnDesempleado;
	private JTextField textNombreE;
	private JTextField textField_1;
	private JTextField textUsuarioE;
	private JPasswordField passwordE;
	private JPasswordField passwordConfE;

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
				PanelEmpresa.setVisible(false);
	 			PanelLogin.setVisible(true);
	 			PanelUser.setVisible(false);
			}
		});
		BTNiniciarSesion.setBounds(0, 47, 174, 58);
		BTNiniciarSesion.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton BTNEmpresa = new JButton("");
		BTNEmpresa.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Empresa.jpg")));
		BTNEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEmpresa.setVisible(true);
	 			PanelLogin.setVisible(false);
	 			PanelUser.setVisible(false);
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
				PanelEmpresa.setVisible(false);
	 			PanelLogin.setVisible(false);
	 			PanelUser.setVisible(true);
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
		
		JLabel labelContraseña = new JLabel("Contrase\u00F1a:");
		labelContraseña.setBounds(274, 21, 105, 14);
		panel.add(labelContraseña);
		
		textUsuario = new JTextField();
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
		PanelUser.setBounds(170, 107, 648, 421);
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
		labelNombre.setBounds(10, 67, 97, 14);
		panel_1.add(labelNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(10, 92, 209, 20);
		panel_1.add(textNombre);
		
		labelCodigo = new JLabel("Codigo:");
		labelCodigo.setBounds(10, 11, 46, 14);
		panel_1.add(labelCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setText("1");
		textCodigo.setEditable(false);
		textCodigo.setColumns(10);
		textCodigo.setBounds(10, 36, 209, 20);
		panel_1.add(textCodigo);
		
		label_4 = new JLabel("Usuario:");
		label_4.setBounds(10, 123, 83, 14);
		panel_1.add(label_4);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(10, 148, 209, 20);
		panel_1.add(txtUsuario);
		
		labelContra = new JLabel("Contrase\u00F1a:");
		labelContra.setBounds(256, 67, 125, 14);
		panel_1.add(labelContra);
		
		passwordContraseña = new JPasswordField();
		passwordContraseña.setBounds(255, 92, 198, 20);
		panel_1.add(passwordContraseña);
		
		labelConfContra = new JLabel("Confirmar Contrase\u00F1a:");
		labelConfContra.setBounds(256, 123, 186, 14);
		panel_1.add(labelConfContra);
		
		passwordConfContra = new JPasswordField();
		passwordConfContra.setBounds(255, 148, 198, 20);
		panel_1.add(passwordConfContra);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(82, 261, 466, 47);
		panel_2.setBackground(new Color(242, 38, 19, 160));
		PanelUser.add(panel_2);
		
		radioButtonUni = new JRadioButton("Universitario");
		radioButtonUni.setSelected(true);
		radioButtonUni.setBounds(6, 17, 109, 23);
		panel_2.add(radioButtonUni);
		
		radioTec = new JRadioButton("Tecnico");
		radioTec.setSelected(false);
		radioTec.setBounds(171, 17, 109, 23);
		panel_2.add(radioTec);
		
		radioObrero = new JRadioButton("Obrero");
		radioObrero.setSelected(false);
		radioObrero.setBounds(333, 17, 109, 23);
		panel_2.add(radioObrero);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(82, 203, 466, 47);
		panel_3.setBackground(new Color(242, 38, 19, 160));
		PanelUser.add(panel_3);
		
		rdbtnEmpleado = new JRadioButton("Empleado");
		rdbtnEmpleado.setSelected(true);
		rdbtnEmpleado.setBounds(34, 17, 109, 23);
		
		panel_3.add(rdbtnEmpleado);
		
		rdbtnDesempleado = new JRadioButton("Desempleado");
		rdbtnDesempleado.setSelected(false);
		rdbtnDesempleado.setBounds(333, 17, 109, 23);
		panel_3.add(rdbtnDesempleado);
		PanelEmpresa = new JPanel();
		PanelEmpresa.setBounds(170, 168, 648, 401);
		PanelEmpresa.setBackground(new Color(108, 122, 137, 160));
		PanelPrincipal.add(PanelEmpresa);
		PanelEmpresa.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Empresa", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(83, 24, 466, 331);
		panel_4.setBackground(new Color(242, 38, 19, 160));
		PanelEmpresa.add(panel_4);
		
		JLabel labelNombreE = new JLabel("Nombre:");
		labelNombreE.setBounds(10, 67, 97, 14);
		panel_4.add(labelNombreE);
		
		textNombreE = new JTextField();
		textNombreE.setColumns(10);
		textNombreE.setBounds(70, 92, 353, 20);
		panel_4.add(textNombreE);
		
		JLabel labelCodigoE = new JLabel("Codigo:");
		labelCodigoE.setBounds(10, 11, 46, 14);
		panel_4.add(labelCodigoE);
		
		textField_1 = new JTextField();
		textField_1.setText("         1");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(70, 36, 65, 20);
		panel_4.add(textField_1);
		
		JLabel labelUsuarioE = new JLabel("Usuario:");
		labelUsuarioE.setBounds(10, 123, 83, 14);
		panel_4.add(labelUsuarioE);
		
		textUsuarioE = new JTextField();
		textUsuarioE.setColumns(10);
		textUsuarioE.setBounds(70, 148, 353, 20);
		panel_4.add(textUsuarioE);
		
		JLabel labelConE = new JLabel("Contrase\u00F1a:");
		labelConE.setBounds(10, 179, 125, 14);
		panel_4.add(labelConE);
		
		passwordE = new JPasswordField();
		passwordE.setBounds(70, 205, 353, 20);
		panel_4.add(passwordE);
		
		JLabel labelConfConE = new JLabel("Confirmar Contrase\u00F1a:");
		labelConfConE.setBounds(10, 247, 186, 14);
		panel_4.add(labelConfConE);
		
		passwordConfE = new JPasswordField();
		passwordConfE.setBounds(70, 272, 353, 20);
		panel_4.add(passwordConfE);
		
		// El panel principal debe añadir el label de fondo de ultimo siempre
		PanelPrincipal.add(lblfondo);
	}
}
