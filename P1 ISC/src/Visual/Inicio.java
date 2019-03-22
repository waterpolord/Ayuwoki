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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel PanelPrincipal;
	private JPanel PanelBotones;
	private JButton BTNiniciarSesion;
	private JButton BTNUser;
	private Dimension Tam;
	private JPanel PanelLogin;
	private JPanel PanelUser;
	private JPanel PanelEmpresa;

 public Inicio() {
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
		
		BTNiniciarSesion = new JButton("Iniciar Sesi\u00F3n \u25BA");
		BTNiniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEmpresa.setVisible(false);
	 			PanelLogin.setVisible(true);
	 			PanelUser.setVisible(false);
			}
		});
		BTNiniciarSesion.setBounds(-6, 46, 156, 58);
		BTNiniciarSesion.setHorizontalAlignment(SwingConstants.RIGHT);
		
		BTNUser = new JButton("Usuario \u25BA");
		BTNUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEmpresa.setVisible(false);
	 			PanelLogin.setVisible(false);
	 			PanelUser.setVisible(true);
			}
		});
		BTNUser.setBounds(0, 199, 156, 58);
		BTNUser.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton BTNEmpresa = new JButton("Empresa \u25BA");
		BTNEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEmpresa.setVisible(true);
	 			PanelLogin.setVisible(false);
	 			PanelUser.setVisible(false);
			}
		});
		BTNEmpresa.setBounds(0, 287, 156, 58);
		BTNEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNuevo = new JLabel("Nuevo");
		lblNuevo.setBounds(0, 128, 150, 49);
		lblNuevo.setBackground(Color.BLUE);
		lblNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		Tam = this.getToolkit().getScreenSize();
		PanelBotones = new JPanel();
		PanelBotones.setBounds(0, 0, 160, (int)Tam.height);
		PanelBotones.setBackground(Color.LIGHT_GRAY);
		
		this.setBounds(100, 100, (int)Tam.getWidth(),(int)Tam.height);
		this.setLocationRelativeTo(null);
		PanelPrincipal.add(PanelBotones);
		PanelBotones.setLayout(null);
		PanelBotones.add(lblNuevo);
		PanelBotones.add(BTNiniciarSesion);
		PanelBotones.add(BTNUser);
		PanelBotones.add(BTNEmpresa);
		
	    PanelLogin = new JPanel();
		PanelLogin.setBounds(170, 28, 648, 379);
		PanelPrincipal.add(PanelLogin);
		
	    PanelUser = new JPanel();
		PanelUser.setBounds(170, 100, 648, 379);
		PanelPrincipal.add(PanelUser);
		
		PanelEmpresa = new JPanel();
		PanelEmpresa.setBounds(170, 190, 648, 379);
		PanelPrincipal.add(PanelEmpresa);
		
		
	}
}
