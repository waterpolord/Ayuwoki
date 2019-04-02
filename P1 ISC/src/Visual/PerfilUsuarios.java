package Visual;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logic.Persona;

public class PerfilUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField TXTNombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PerfilUsuarios(Persona persona) {
		setTitle("Perfil Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 25, 491, 134);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(10, 44, 46, 14);
		panel.add(label);
		
		TXTNombre = new JTextField();
		TXTNombre.setColumns(10);
		TXTNombre.setBackground(SystemColor.inactiveCaption);
		TXTNombre.setBounds(68, 40, 253, 25);
		panel.add(TXTNombre);
		
		JButton button = new JButton("Buscar");
		button.setBackground(Color.WHITE);
		button.setBounds(367, 40, 89, 25);
		panel.add(button);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblTipo.setBounds(10, 88, 46, 14);
		panel.add(lblTipo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(68, 86, 253, 25);
		panel.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuracion", "Editar Cuenta", "Cerrar Sesion"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(633, 11, 162, 20);
		contentPane.add(comboBox);
		
		JPanel panelReUniversitario = new JPanel();
		panelReUniversitario.setLayout(null);
		panelReUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReUniversitario.setBackground(Color.WHITE);
		panelReUniversitario.setBounds(193, 190, 403, 386);
		contentPane.add(panelReUniversitario);
		
		JRadioButton radioButton_32 = new JRadioButton("Si");
		radioButton_32.setBounds(246, 89, 50, 23);
		panelReUniversitario.add(radioButton_32);
		
		JRadioButton radioButton_33 = new JRadioButton("No");
		radioButton_33.setBounds(329, 89, 50, 23);
		panelReUniversitario.add(radioButton_33);
		
		JRadioButton radioButton_34 = new JRadioButton("Si");
		radioButton_34.setBounds(246, 127, 50, 23);
		panelReUniversitario.add(radioButton_34);
		
		JRadioButton radioButton_35 = new JRadioButton("No");
		radioButton_35.setBounds(329, 127, 50, 23);
		panelReUniversitario.add(radioButton_35);
		
		JRadioButton radioButton_36 = new JRadioButton("Si");
		radioButton_36.setBounds(246, 165, 50, 23);
		panelReUniversitario.add(radioButton_36);
		
		JRadioButton radioButton_37 = new JRadioButton("Si");
		radioButton_37.setBounds(246, 203, 50, 23);
		panelReUniversitario.add(radioButton_37);
		
		JRadioButton radioButton_38 = new JRadioButton("Si");
		radioButton_38.setBounds(246, 239, 50, 23);
		panelReUniversitario.add(radioButton_38);
		
		JRadioButton radioButton_39 = new JRadioButton("Si");
		radioButton_39.setBounds(246, 275, 50, 23);
		panelReUniversitario.add(radioButton_39);
		
		JRadioButton radioButton_40 = new JRadioButton("Si");
		radioButton_40.setBounds(246, 312, 50, 23);
		panelReUniversitario.add(radioButton_40);
		
		JRadioButton radioButton_41 = new JRadioButton("Si");
		radioButton_41.setBounds(246, 345, 50, 23);
		panelReUniversitario.add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton("No");
		radioButton_42.setBounds(329, 165, 50, 23);
		panelReUniversitario.add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton("No");
		radioButton_43.setBounds(329, 203, 50, 23);
		panelReUniversitario.add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton("No");
		radioButton_44.setBounds(329, 239, 50, 23);
		panelReUniversitario.add(radioButton_44);
		
		JRadioButton radioButton_45 = new JRadioButton("No");
		radioButton_45.setBounds(329, 275, 50, 23);
		panelReUniversitario.add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton("No");
		radioButton_46.setBounds(329, 312, 50, 23);
		panelReUniversitario.add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton("No");
		radioButton_47.setBounds(329, 345, 50, 23);
		panelReUniversitario.add(radioButton_47);
		
		JLabel label_10 = new JLabel("Habla otro Idioma?");
		label_10.setBounds(22, 56, 100, 14);
		panelReUniversitario.add(label_10);
		
		JLabel label_11 = new JLabel("Vehiculo Propio?");
		label_11.setBounds(22, 93, 100, 14);
		panelReUniversitario.add(label_11);
		
		JLabel label_12 = new JLabel("Disponibilidad de Horario?");
		label_12.setBounds(22, 131, 156, 14);
		panelReUniversitario.add(label_12);
		
		JLabel label_13 = new JLabel("Disposicion de Viaje?");
		label_13.setBounds(22, 169, 100, 14);
		panelReUniversitario.add(label_13);
		
		JLabel label_14 = new JLabel("Dispuesto a Mudarse?");
		label_14.setBounds(22, 207, 143, 14);
		panelReUniversitario.add(label_14);
		
		JLabel label_15 = new JLabel("Maneaja Maquinarias?");
		label_15.setBounds(22, 243, 143, 14);
		panelReUniversitario.add(label_15);
		
		JLabel label_16 = new JLabel("Maneja funciones de Oficina?");
		label_16.setBounds(22, 279, 156, 14);
		panelReUniversitario.add(label_16);
		
		JLabel label_17 = new JLabel("Posee conocimientos Medicos?");
		label_17.setBounds(22, 316, 156, 14);
		panelReUniversitario.add(label_17);
		
		JLabel label_18 = new JLabel("Domina algun tipo de Software?");
		label_18.setBounds(22, 349, 178, 14);
		panelReUniversitario.add(label_18);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(246, 53, 133, 20);
		panelReUniversitario.add(comboBox_3);
		
		JPanel panelReTec = new JPanel();
		panelReTec.setBounds(193, 190, 403, 250);
		contentPane.add(panelReTec);
		panelReTec.setLayout(null);
		panelReTec.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReTec.setBackground(Color.WHITE);
		
		JRadioButton radioButton_2 = new JRadioButton("Si");
		radioButton_2.setBounds(246, 89, 50, 23);
		panelReTec.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("No");
		radioButton_3.setBounds(329, 89, 50, 23);
		panelReTec.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBounds(246, 127, 50, 23);
		panelReTec.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("No");
		radioButton_5.setBounds(329, 127, 50, 23);
		panelReTec.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBounds(246, 165, 50, 23);
		panelReTec.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Si");
		radioButton_7.setBounds(246, 203, 50, 23);
		panelReTec.add(radioButton_7);
		
		JRadioButton radioButton_12 = new JRadioButton("No");
		radioButton_12.setBounds(329, 165, 50, 23);
		panelReTec.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBounds(329, 203, 50, 23);
		panelReTec.add(radioButton_13);
		
		JLabel lblHablaIngles = new JLabel("Habla otro Idioma?");
		lblHablaIngles.setBounds(22, 56, 100, 14);
		panelReTec.add(lblHablaIngles);
		
		JLabel lblVehiculoPropio = new JLabel("Vehiculo Propio?");
		lblVehiculoPropio.setBounds(22, 93, 100, 14);
		panelReTec.add(lblVehiculoPropio);
		
		JLabel lblDisponibilidadDeHorario = new JLabel("Disponibilidad de Horario?");
		lblDisponibilidadDeHorario.setBounds(22, 131, 156, 14);
		panelReTec.add(lblDisponibilidadDeHorario);
		
		JLabel lblDisposicionDeViaje = new JLabel("Disposicion de Viaje?");
		lblDisposicionDeViaje.setBounds(22, 169, 100, 14);
		panelReTec.add(lblDisposicionDeViaje);
		
		JLabel lblDispuestoAMudarse = new JLabel("Dispuesto a Mudarse?");
		lblDispuestoAMudarse.setBounds(22, 207, 143, 14);
		panelReTec.add(lblDispuestoAMudarse);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Frances", "Chino", "Italiano"}));
		comboBox_1.setBounds(246, 53, 133, 20);
		panelReTec.add(comboBox_1);
		
		JPanel panelReObr = new JPanel();
		panelReObr.setLayout(null);
		panelReObr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReObr.setBackground(Color.WHITE);
		panelReObr.setBounds(193, 190, 403, 386);
		contentPane.add(panelReObr);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBounds(246, 89, 50, 23);
		panelReObr.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(329, 89, 50, 23);
		panelReObr.add(radioButton_1);
		
		JRadioButton radioButton_18 = new JRadioButton("Si");
		radioButton_18.setBounds(246, 127, 50, 23);
		panelReObr.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("No");
		radioButton_19.setBounds(329, 127, 50, 23);
		panelReObr.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("Si");
		radioButton_20.setBounds(246, 165, 50, 23);
		panelReObr.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("Si");
		radioButton_21.setBounds(246, 203, 50, 23);
		panelReObr.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("Si");
		radioButton_22.setBounds(246, 239, 50, 23);
		panelReObr.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("Si");
		radioButton_23.setBounds(246, 275, 50, 23);
		panelReObr.add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton("Si");
		radioButton_24.setBounds(246, 312, 50, 23);
		panelReObr.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("Si");
		radioButton_25.setBounds(246, 345, 50, 23);
		panelReObr.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("No");
		radioButton_26.setBounds(329, 165, 50, 23);
		panelReObr.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("No");
		radioButton_27.setBounds(329, 203, 50, 23);
		panelReObr.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("No");
		radioButton_28.setBounds(329, 239, 50, 23);
		panelReObr.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("No");
		radioButton_29.setBounds(329, 275, 50, 23);
		panelReObr.add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton("No");
		radioButton_30.setBounds(329, 312, 50, 23);
		panelReObr.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("No");
		radioButton_31.setBounds(329, 345, 50, 23);
		panelReObr.add(radioButton_31);
		
		JLabel label_1 = new JLabel("Habla otro Idioma?");
		label_1.setBounds(22, 56, 100, 14);
		panelReObr.add(label_1);
		
		JLabel label_2 = new JLabel("Vehiculo Propio?");
		label_2.setBounds(22, 93, 100, 14);
		panelReObr.add(label_2);
		
		JLabel label_3 = new JLabel("Disponibilidad de Horario?");
		label_3.setBounds(22, 131, 156, 14);
		panelReObr.add(label_3);
		
		JLabel label_4 = new JLabel("Disposicion de Viaje?");
		label_4.setBounds(22, 169, 100, 14);
		panelReObr.add(label_4);
		
		JLabel label_5 = new JLabel("Dispuesto a Mudarse?");
		label_5.setBounds(22, 207, 143, 14);
		panelReObr.add(label_5);
		
		JLabel label_6 = new JLabel("Maneaja Maquinarias?");
		label_6.setBounds(22, 243, 143, 14);
		panelReObr.add(label_6);
		
		JLabel label_7 = new JLabel("Maneja funciones de Oficina?");
		label_7.setBounds(22, 279, 156, 14);
		panelReObr.add(label_7);
		
		JLabel label_8 = new JLabel("Posee conocimientos Medicos?");
		label_8.setBounds(22, 316, 156, 14);
		panelReObr.add(label_8);
		
		JLabel label_9 = new JLabel("Domina algun tipo de Software?");
		label_9.setBounds(22, 349, 178, 14);
		panelReObr.add(label_9);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(246, 53, 133, 20);
		panelReObr.add(comboBox_2);
		
		JButton BTNGuardar = new JButton("Guardar");
		BTNGuardar.setBounds(237, 614, 89, 23);
		contentPane.add(BTNGuardar);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.setBounds(474, 614, 89, 23);
		contentPane.add(button_2);
	}
}