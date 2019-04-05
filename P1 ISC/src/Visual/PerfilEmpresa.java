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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

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
	
	

	public PerfilEmpresa(Empresa empresa) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				panelObreE.setVisible(false);
				panelTecE.setVisible(false);
				panelUniE.setVisible(true);
			}
		});
		
		setTitle("Perfil Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tam = getToolkit().getScreenSize();
		setBounds(0, 0, 1185, 659);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Configuracion", "Editar Cuenta", "Cerrar Sesion" }));
		comboBox.setBounds(997, 11, 162, 20);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Subir");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(74, 561, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(228, 561, 89, 23);
		contentPane.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Empresa",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 35, 491, 83);
		contentPane.add(panel);

		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(10, 44, 46, 14);
		panel.add(label);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(68, 40, 253, 25);
		panel.add(textField);

		JButton button = new JButton("Buscar");
		button.setBackground(Color.WHITE);
		button.setBounds(367, 40, 89, 25);
		panel.add(button);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(5, 212, 366, 336);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JPanel PanelTipoPersonal = new JPanel();
		PanelTipoPersonal.setLayout(null);
		PanelTipoPersonal.setForeground(Color.WHITE);
		PanelTipoPersonal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo De Personal",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		PanelTipoPersonal.setBackground(SystemColor.activeCaption);
		PanelTipoPersonal.setBounds(10, 22, 346, 51);
		panel_2.add(PanelTipoPersonal);

		JRadioButton RBNUniversitario = new JRadioButton("Universitario");
		RBNUniversitario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(false);
				panelTecE.setVisible(false);
				panelUniE.setVisible(true);
				panelUniversitario.setVisible(true);
				CBXCarrera.setSelectedIndex(0);
				
			}
		});
		RBNUniversitario.setSelected(true);
		RBNUniversitario.setBounds(19, 17, 85, 23);
		PanelTipoPersonal.add(RBNUniversitario);

		JRadioButton RBNTecnico = new JRadioButton("Tecnico");
		RBNTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(false);
				panelTecE.setVisible(true);
				panelUniE.setVisible(false);
				panelTecnico.setVisible(true);
				CBXEspecialidad.setSelectedIndex(0);
			}
		});
		RBNTecnico.setSelected(false);
		RBNTecnico.setBounds(139, 17, 85, 23);
		PanelTipoPersonal.add(RBNTecnico);

		JRadioButton RBNObrero = new JRadioButton("Obrero");
		RBNObrero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelObreE.setVisible(true);
				panelTecE.setVisible(false);
				panelUniE.setVisible(false);
				panelObrero.setVisible(true);
				CBXHabilidad.setSelectedIndex(0);
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
		panelUniversitario.setBackground(SystemColor.activeCaption);
		panelUniversitario.setBounds(10, 98, 346, 81);
		panel_2.add(panelUniversitario);

		JLabel label_1 = new JLabel("Carrera:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 21, 91, 14);
		panelUniversitario.add(label_1);

		CBXCarrera = new JComboBox();
		CBXCarrera.setModel(new DefaultComboBoxModel(new String[] { "<Seleccionar>", "Administración", "Derecho",
				"Economía", "Ingeniería", "Medicina", "Mercadeo" }));
		CBXCarrera.setBounds(78, 34, 168, 25);
		panelUniversitario.add(CBXCarrera);

		panelTecnico = new JPanel();
		panelTecnico.setVisible(false);
		panelTecnico.setLayout(null);
		panelTecnico.setForeground(Color.WHITE);
		panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tecnico",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelTecnico.setBackground(SystemColor.inactiveCaption);
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
		panelObrero.setBackground(SystemColor.inactiveCaption);
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
		PanelMonto.setBackground(SystemColor.activeCaption);
		PanelMonto.setBounds(10, 201, 346, 106);
		panel_2.add(PanelMonto);
		PanelMonto.setLayout(null);

		JRadioButton RBN10 = new JRadioButton("Entre 10,000 a 30,000");
		RBN10.setBounds(6, 31, 142, 23);
		PanelMonto.add(RBN10);

		JRadioButton RBN30 = new JRadioButton("Entre 30,000 o 50,000");
		RBN30.setBounds(196, 31, 142, 23);
		PanelMonto.add(RBN30);

		JRadioButton RBN50 = new JRadioButton("Entre 50,000 o M\u00E1s");
		RBN50.setBounds(105, 76, 142, 23);
		PanelMonto.add(RBN50);

		JLabel lblNewLabel = new JLabel("Cantidad de Personal");
		lblNewLabel.setBounds(20, 140, 114, 14);
		contentPane.add(lblNewLabel);
		
		Cantidad = new SpinnerNumberModel();
		Cantidad.setMinimum(1);
		Cantidad.setMaximum(99);
		JSpinner SPNCant = new JSpinner();
		SPNCant.setBounds(154, 159, 55, 20);
		SPNCant.setModel(Cantidad);
		SPNCant.setValue(1);
		
		contentPane.add(SPNCant);

		JList ListarSolicitudes = new JList();
		ListarSolicitudes.setBounds(823, 487, 237, -309);
		contentPane.add(ListarSolicitudes);

		JLabel lblSolicitudes = new JLabel("Solicitudes");
		lblSolicitudes.setBounds(932, 140, 67, 14);
		contentPane.add(lblSolicitudes);

		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaSolicitud view = new VistaSolicitud();
				view.setModal(true);
				view.setVisible(true);

			}
		});
		btnVer.setBounds(910, 525, 89, 23);
		contentPane.add(btnVer);
	    panelUniE = new JPanel();
		panelUniE.setLayout(null);
		panelUniE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelUniE.setBackground(new Color(255, 255, 255));
		panelUniE.setBounds(402, 159, 460, 434);
		contentPane.add(panelUniE);

		JRadioButton rbn1SU = new JRadioButton("Si");
		rbn1SU.setBounds(313, 52, 50, 23);
		panelUniE.add(rbn1SU);

		JRadioButton RBN1NUni = new JRadioButton("No");
		RBN1NUni.setBounds(385, 52, 50, 23);
		panelUniE.add(RBN1NUni);

		JRadioButton rbn2SU = new JRadioButton("Si");
		rbn2SU.setBounds(313, 89, 50, 23);
		panelUniE.add(rbn2SU);

		JRadioButton radioButton_44 = new JRadioButton("No");
		radioButton_44.setBounds(385, 89, 50, 23);
		panelUniE.add(radioButton_44);

		JRadioButton rbn3SU = new JRadioButton("Si");
		rbn3SU.setBounds(313, 127, 50, 23);
		panelUniE.add(rbn3SU);

		JRadioButton RBN4SUni = new JRadioButton("Si");
		RBN4SUni.setBounds(313, 165, 50, 23);
		panelUniE.add(RBN4SUni);

		JRadioButton RBN5SUni = new JRadioButton("Si");
		RBN5SUni.setBounds(313, 203, 50, 23);
		panelUniE.add(RBN5SUni);

		JRadioButton RBN6SUni = new JRadioButton("Si");
		RBN6SUni.setBounds(313, 239, 50, 23);
		panelUniE.add(RBN6SUni);

		JRadioButton RBN7SUni = new JRadioButton("Si");
		RBN7SUni.setBounds(313, 275, 50, 23);
		panelUniE.add(RBN7SUni);

		JRadioButton RBN8SUni = new JRadioButton("Si");
		RBN8SUni.setBounds(313, 312, 50, 23);
		panelUniE.add(RBN8SUni);

		JRadioButton radioButton_51 = new JRadioButton("No");
		radioButton_51.setBounds(385, 127, 50, 23);
		panelUniE.add(radioButton_51);

		JRadioButton radioButton_52 = new JRadioButton("No");
		radioButton_52.setBounds(385, 165, 50, 23);
		panelUniE.add(radioButton_52);

		JRadioButton radioButton_53 = new JRadioButton("No");
		radioButton_53.setBounds(385, 203, 50, 23);
		panelUniE.add(radioButton_53);

		JRadioButton radioButton_54 = new JRadioButton("No");
		radioButton_54.setBounds(385, 239, 50, 23);
		panelUniE.add(radioButton_54);

		JRadioButton radioButton_55 = new JRadioButton("No");
		radioButton_55.setBounds(385, 275, 50, 23);
		panelUniE.add(radioButton_55);

		JRadioButton radioButton_56 = new JRadioButton("No");
		radioButton_56.setBounds(385, 312, 50, 23);
		panelUniE.add(radioButton_56);

		JLabel label_22 = new JLabel("1. \u00BFHabla otro idioma?");
		label_22.setBounds(22, 56, 122, 14);
		panelUniE.add(label_22);

		JLabel label_23 = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
		label_23.setBounds(22, 93, 100, 14);
		panelUniE.add(label_23);

		JLabel label_24 = new JLabel("3. \u00BFDisponibilidad de Horario?");
		label_24.setBounds(22, 131, 156, 14);
		panelUniE.add(label_24);

		JLabel label_25 = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
		label_25.setBounds(22, 169, 156, 14);
		panelUniE.add(label_25);

		JLabel label_26 = new JLabel("5. \u00BFDispuesto a Mudarse?");
		label_26.setBounds(22, 207, 143, 14);
		panelUniE.add(label_26);

		JLabel label_27 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		label_27.setBounds(22, 243, 193, 14);
		panelUniE.add(label_27);

		JLabel label_28 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		label_28.setBounds(22, 279, 178, 14);
		panelUniE.add(label_28);

		JLabel label_29 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		label_29.setBounds(22, 316, 242, 14);
		panelUniE.add(label_29);

		JLabel label_30 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		label_30.setBounds(22, 349, 218, 14);
		panelUniE.add(label_30);

		JRadioButton radioButton_57 = new JRadioButton("No");
		radioButton_57.setBounds(385, 345, 50, 23);
		panelUniE.add(radioButton_57);

		JRadioButton RBN9SUni = new JRadioButton("Si");
		RBN9SUni.setBounds(313, 345, 50, 23);
		panelUniE.add(RBN9SUni);

		JLabel label_31 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_31.setBounds(22, 390, 156, 14);
		panelUniE.add(label_31);

		JRadioButton RBN10SUni = new JRadioButton("Si");
		RBN10SUni.setBounds(315, 386, 50, 23);
		panelUniE.add(RBN10SUni);

		JRadioButton radioButton_60 = new JRadioButton("No");
		radioButton_60.setBounds(385, 386, 50, 23);
		panelUniE.add(radioButton_60);

		panelTecE = new JPanel();
		panelTecE.setLayout(null);
		panelTecE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTecE.setBackground(Color.WHITE);
		panelTecE.setBounds(402, 159, 460, 434);
		contentPane.add(panelTecE);

		JRadioButton radioButton_23 = new JRadioButton("Si");
		radioButton_23.setBounds(283, 89, 50, 23);
		panelTecE.add(radioButton_23);

		JRadioButton radioButton_24 = new JRadioButton("No");
		radioButton_24.setBounds(357, 89, 50, 23);
		panelTecE.add(radioButton_24);

		JRadioButton radioButton_25 = new JRadioButton("Si");
		radioButton_25.setBounds(283, 127, 50, 23);
		panelTecE.add(radioButton_25);

		JRadioButton radioButton_26 = new JRadioButton("No");
		radioButton_26.setBounds(357, 127, 50, 23);
		panelTecE.add(radioButton_26);

		JRadioButton radioButton_27 = new JRadioButton("Si");
		radioButton_27.setBounds(283, 165, 50, 23);
		panelTecE.add(radioButton_27);

		JRadioButton radioButton_28 = new JRadioButton("Si");
		radioButton_28.setBounds(283, 203, 50, 23);
		panelTecE.add(radioButton_28);

		JRadioButton radioButton_29 = new JRadioButton("No");
		radioButton_29.setBounds(357, 165, 50, 23);
		panelTecE.add(radioButton_29);

		JRadioButton radioButton_30 = new JRadioButton("No");
		radioButton_30.setBounds(357, 203, 50, 23);
		panelTecE.add(radioButton_30);

		JLabel label_12 = new JLabel("1. \u00BFHabla otro Idioma?");
		label_12.setBounds(22, 56, 143, 14);
		panelTecE.add(label_12);

		JLabel label_13 = new JLabel("2. \u00BFVehiculo Propio?");
		label_13.setBounds(22, 93, 143, 14);
		panelTecE.add(label_13);

		JLabel label_14 = new JLabel("3. \u00BFDisponibilidad de Horario?");
		label_14.setBounds(22, 131, 156, 14);
		panelTecE.add(label_14);

		JLabel label_15 = new JLabel("4. \u00BFDisposicion de Viaje?");
		label_15.setBounds(22, 169, 143, 14);
		panelTecE.add(label_15);

		JLabel label_16 = new JLabel("5. \u00BFDispuesto a Mudarse?");
		label_16.setBounds(22, 207, 143, 14);
		panelTecE.add(label_16);

		JLabel label_17 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_17.setBounds(22, 398, 156, 14);
		panelTecE.add(label_17);

		JRadioButton radioButton_31 = new JRadioButton("Si");
		radioButton_31.setBounds(283, 354, 50, 23);
		panelTecE.add(radioButton_31);

		JRadioButton radioButton_32 = new JRadioButton("No");
		radioButton_32.setBounds(357, 354, 50, 23);
		panelTecE.add(radioButton_32);

		JLabel label_18 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		label_18.setBounds(22, 247, 193, 14);
		panelTecE.add(label_18);

		JLabel label_19 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		label_19.setBounds(22, 287, 178, 14);
		panelTecE.add(label_19);

		JLabel label_20 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		label_20.setBounds(22, 322, 242, 14);
		panelTecE.add(label_20);

		JLabel label_21 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		label_21.setBounds(22, 358, 218, 14);
		panelTecE.add(label_21);

		JRadioButton radioButton_33 = new JRadioButton("Si");
		radioButton_33.setBounds(283, 243, 50, 23);
		panelTecE.add(radioButton_33);

		JRadioButton radioButton_34 = new JRadioButton("Si");
		radioButton_34.setBounds(283, 283, 50, 23);
		panelTecE.add(radioButton_34);

		JRadioButton radioButton_35 = new JRadioButton("Si");
		radioButton_35.setBounds(283, 318, 50, 23);
		panelTecE.add(radioButton_35);

		JRadioButton radioButton_36 = new JRadioButton("No");
		radioButton_36.setBounds(357, 243, 50, 23);
		panelTecE.add(radioButton_36);

		JRadioButton radioButton_37 = new JRadioButton("No");
		radioButton_37.setBounds(357, 283, 50, 23);
		panelTecE.add(radioButton_37);

		JRadioButton radioButton_38 = new JRadioButton("No");
		radioButton_38.setBounds(357, 318, 50, 23);
		panelTecE.add(radioButton_38);

		JRadioButton radioButton_39 = new JRadioButton("No");
		radioButton_39.setBounds(357, 394, 50, 23);
		panelTecE.add(radioButton_39);

		JRadioButton radioButton_40 = new JRadioButton("Si");
		radioButton_40.setBounds(283, 394, 50, 23);
		panelTecE.add(radioButton_40);

		panelObreE = new JPanel();
		panelObreE.setLayout(null);
		panelObreE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelObreE.setBackground(Color.WHITE);
		panelObreE.setBounds(402, 159, 460, 434);
		contentPane.add(panelObreE);

		JRadioButton radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBounds(313, 52, 50, 23);
		panelObreE.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("No");
		radioButton_4.setBounds(385, 52, 50, 23);
		panelObreE.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBounds(313, 89, 50, 23);
		panelObreE.add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton("No");
		radioButton_6.setBounds(385, 89, 50, 23);
		panelObreE.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("Si");
		radioButton_7.setBounds(313, 127, 50, 23);
		panelObreE.add(radioButton_7);

		JRadioButton radioButton_8 = new JRadioButton("Si");
		radioButton_8.setBounds(313, 165, 50, 23);
		panelObreE.add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton("Si");
		radioButton_9.setBounds(313, 203, 50, 23);
		panelObreE.add(radioButton_9);

		JRadioButton radioButton_10 = new JRadioButton("Si");
		radioButton_10.setBounds(313, 239, 50, 23);
		panelObreE.add(radioButton_10);

		JRadioButton radioButton_11 = new JRadioButton("Si");
		radioButton_11.setBounds(313, 275, 50, 23);
		panelObreE.add(radioButton_11);

		JRadioButton radioButton_12 = new JRadioButton("Si");
		radioButton_12.setBounds(313, 312, 50, 23);
		panelObreE.add(radioButton_12);

		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBounds(385, 127, 50, 23);
		panelObreE.add(radioButton_13);

		JRadioButton radioButton_14 = new JRadioButton("No");
		radioButton_14.setBounds(385, 165, 50, 23);
		panelObreE.add(radioButton_14);

		JRadioButton radioButton_15 = new JRadioButton("No");
		radioButton_15.setBounds(385, 203, 50, 23);
		panelObreE.add(radioButton_15);

		JRadioButton radioButton_16 = new JRadioButton("No");
		radioButton_16.setBounds(385, 239, 50, 23);
		panelObreE.add(radioButton_16);

		JRadioButton radioButton_17 = new JRadioButton("No");
		radioButton_17.setBounds(385, 275, 50, 23);
		panelObreE.add(radioButton_17);

		JRadioButton radioButton_18 = new JRadioButton("No");
		radioButton_18.setBounds(385, 312, 50, 23);
		panelObreE.add(radioButton_18);

		JLabel label_2 = new JLabel("1. \u00BFHabla otro idioma?");
		label_2.setBounds(22, 56, 122, 14);
		panelObreE.add(label_2);

		JLabel label_3 = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
		label_3.setBounds(22, 93, 100, 14);
		panelObreE.add(label_3);

		JLabel label_4 = new JLabel("3. \u00BFDisponibilidad de Horario?");
		label_4.setBounds(22, 131, 156, 14);
		panelObreE.add(label_4);

		JLabel label_5 = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
		label_5.setBounds(22, 169, 156, 14);
		panelObreE.add(label_5);

		JLabel label_6 = new JLabel("5. \u00BFDispuesto a Mudarse?");
		label_6.setBounds(22, 207, 143, 14);
		panelObreE.add(label_6);

		JLabel label_7 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		label_7.setBounds(22, 243, 193, 14);
		panelObreE.add(label_7);

		JLabel label_8 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		label_8.setBounds(22, 279, 178, 14);
		panelObreE.add(label_8);

		JLabel label_9 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		label_9.setBounds(22, 316, 242, 14);
		panelObreE.add(label_9);

		JLabel label_10 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		label_10.setBounds(22, 349, 218, 14);
		panelObreE.add(label_10);

		JRadioButton radioButton_19 = new JRadioButton("No");
		radioButton_19.setBounds(385, 345, 50, 23);
		panelObreE.add(radioButton_19);

		JRadioButton radioButton_20 = new JRadioButton("Si");
		radioButton_20.setBounds(313, 345, 50, 23);
		panelObreE.add(radioButton_20);

		JLabel label_11 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_11.setBounds(22, 390, 156, 14);
		panelObreE.add(label_11);

		JRadioButton radioButton_21 = new JRadioButton("Si");
		radioButton_21.setBounds(315, 386, 50, 23);
		panelObreE.add(radioButton_21);

		JRadioButton radioButton_22 = new JRadioButton("No");
		radioButton_22.setBounds(385, 386, 50, 23);
		panelObreE.add(radioButton_22);
		
		ButtonGroup Grupo1 = new ButtonGroup();
		Grupo1.add(RBNObrero);
		Grupo1.add(RBNTecnico);
		Grupo1.add(RBNUniversitario);
		ButtonGroup Grupo2 = new ButtonGroup();
		Grupo2.add(RBN10);
		Grupo2.add(RBN30);
		Grupo2.add(RBN50);
		
		
		
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


	}
	
}
