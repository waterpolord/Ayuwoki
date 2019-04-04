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
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;

public class PerfilEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panelTecnico;
	private JLabel labelEspecialidad;
	private JPanel panelObrero;
	private JLabel labelHabilidad; 
	private  JComboBox<?>  CBXHabilidad;

	public PerfilEmpresa(Empresa empresa) {
		setTitle("Perfil Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tam = getToolkit().getScreenSize();
		setBounds(0,0,1185,659);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuracion", "Editar Cuenta", "Cerrar Sesion"}));
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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo De Personal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(10, 22, 346, 51);
		panel_2.add(panel_3);
		
		JRadioButton radioButton = new JRadioButton("Universitario");
		radioButton.setSelected(true);
		radioButton.setBounds(19, 17, 85, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Tecnico");
		radioButton_1.setSelected(false);
		radioButton_1.setBounds(139, 17, 85, 23);
		panel_3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Obrero");
		radioButton_2.setSelected(false);
		radioButton_2.setBounds(255, 17, 85, 23);
		panel_3.add(radioButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Universitario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panel_4.setBackground(SystemColor.activeCaption);
		panel_4.setBounds(10, 98, 346, 81);
		panel_2.add(panel_4);
		
		JLabel label_1 = new JLabel("Carrera:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 21, 91, 14);
		panel_4.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administración", "Derecho", "Economía", "Ingeniería", "Medicina", "Mercadeo"}));
		comboBox_1.setBounds(78, 34, 168, 25);
		panel_4.add(comboBox_1);
		
		
		panelTecnico = new JPanel();
		panelTecnico.setVisible(false);
		panelTecnico.setLayout(null);
		panelTecnico.setForeground(Color.WHITE);
		panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tecnico", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panelTecnico.setBackground(SystemColor.inactiveCaption);
		panelTecnico.setBounds(10, 98, 346, 81);
		panel_2.add(panelTecnico);
		
		labelEspecialidad = new JLabel("Especialidad:");
		labelEspecialidad.setForeground(Color.WHITE);
		labelEspecialidad.setBounds(10, 21, 91, 14);
		panelTecnico.add(labelEspecialidad);
		
		JComboBox CBXEspecialidad = new JComboBox();
		CBXEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Informatica", "Mercadeo", "Arte", "Turismo", "Contabilidad", "Enfermeria"}));
		CBXEspecialidad.setBounds(78, 34, 168, 25);
		panelTecnico.add(CBXEspecialidad);
		
		panelObrero = new JPanel();
		panelObrero.setVisible(false);
		panelObrero.setLayout(null);
		panelObrero.setForeground(Color.WHITE);
		panelObrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Obrero", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panelObrero.setBackground(SystemColor.inactiveCaption);
		panelObrero.setBounds(10, 98, 346, 81);
		panel_2.add(panelObrero);
		
		labelHabilidad = new JLabel("Habilidades:");
		labelHabilidad.setForeground(Color.WHITE);
		labelHabilidad.setBounds(10, 21, 91, 14);
		panelObrero.add(labelHabilidad);
		
		
		CBXHabilidad = new JComboBox();
		CBXHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Creativo", "Comunicativo", "Adaptable", "Trabajo en Equipo" }));
		CBXHabilidad.setBounds(78, 34, 168, 25);
		panelObrero.add(CBXHabilidad);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Monto a Ganar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(SystemColor.activeCaption);
		panel_5.setBounds(10, 201, 346, 106);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JRadioButton rdbtnOMas = new JRadioButton("Entre 10,000 o M\u00E1s");
		rdbtnOMas.setBounds(6, 31, 142, 23);
		panel_5.add(rdbtnOMas);
		
		JRadioButton rdbtnOMas_1 = new JRadioButton("Entre 30,000 o M\u00E1s");
		rdbtnOMas_1.setBounds(196, 31, 142, 23);
		panel_5.add(rdbtnOMas_1);
		
		JRadioButton rdbtnOMas_2 = new JRadioButton("Entre 50,000 o M\u00E1s");
		rdbtnOMas_2.setBounds(105, 76, 142, 23);
		panel_5.add(rdbtnOMas_2);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Personal");
		lblNewLabel.setBounds(20, 140, 114, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(142, 159, 67, 20);
		contentPane.add(spinner);
		
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
		JPanel panelUniE = new JPanel();
		panelUniE.setLayout(null);
		panelUniE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelUniE.setBackground(new Color(255, 255, 255));
		panelUniE.setBounds(402, 159, 460, 434);
		contentPane.add(panelUniE);
		
		JRadioButton radioButton_41 = new JRadioButton("Si");
		radioButton_41.setBounds(313, 52, 50, 23);
		panelUniE.add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton("No");
		radioButton_42.setBounds(385, 52, 50, 23);
		panelUniE.add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton("Si");
		radioButton_43.setBounds(313, 89, 50, 23);
		panelUniE.add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton("No");
		radioButton_44.setBounds(385, 89, 50, 23);
		panelUniE.add(radioButton_44);
		
		JRadioButton radioButton_45 = new JRadioButton("Si");
		radioButton_45.setBounds(313, 127, 50, 23);
		panelUniE.add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton("Si");
		radioButton_46.setBounds(313, 165, 50, 23);
		panelUniE.add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton("Si");
		radioButton_47.setBounds(313, 203, 50, 23);
		panelUniE.add(radioButton_47);
		
		JRadioButton radioButton_48 = new JRadioButton("Si");
		radioButton_48.setBounds(313, 239, 50, 23);
		panelUniE.add(radioButton_48);
		
		JRadioButton radioButton_49 = new JRadioButton("Si");
		radioButton_49.setBounds(313, 275, 50, 23);
		panelUniE.add(radioButton_49);
		
		JRadioButton radioButton_50 = new JRadioButton("Si");
		radioButton_50.setBounds(313, 312, 50, 23);
		panelUniE.add(radioButton_50);
		
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
		
		JRadioButton radioButton_58 = new JRadioButton("Si");
		radioButton_58.setBounds(313, 345, 50, 23);
		panelUniE.add(radioButton_58);
		
		JLabel label_31 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_31.setBounds(22, 390, 156, 14);
		panelUniE.add(label_31);
		
		JRadioButton radioButton_59 = new JRadioButton("Si");
		radioButton_59.setBounds(315, 386, 50, 23);
		panelUniE.add(radioButton_59);
		
		JRadioButton radioButton_60 = new JRadioButton("No");
		radioButton_60.setBounds(385, 386, 50, 23);
		panelUniE.add(radioButton_60);
		
		
		
		JPanel panelTecE = new JPanel();
		panelTecE.setLayout(null);
		panelTecE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(246, 53, 133, 20);
		panelTecE.add(comboBox_2);
		
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
		
		JPanel panelObreE = new JPanel();
		panelObreE.setLayout(null);
		panelObreE.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
	
	}
}
