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
		setBounds(100, 100, 821, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 25, 491, 83);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuracion", "Editar Cuenta", "Cerrar Sesion"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(633, 11, 162, 20);
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(184, 119, 403, 386);
		contentPane.add(panel_1);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBounds(246, 52, 50, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(329, 52, 50, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Si");
		radioButton_2.setBounds(246, 89, 50, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("No");
		radioButton_3.setBounds(329, 89, 50, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBounds(246, 127, 50, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("No");
		radioButton_5.setBounds(329, 127, 50, 23);
		panel_1.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBounds(246, 165, 50, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Si");
		radioButton_7.setBounds(246, 203, 50, 23);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("Si");
		radioButton_8.setBounds(246, 239, 50, 23);
		panel_1.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("Si");
		radioButton_9.setBounds(246, 275, 50, 23);
		panel_1.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Si");
		radioButton_10.setBounds(246, 312, 50, 23);
		panel_1.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("Si");
		radioButton_11.setBounds(246, 345, 50, 23);
		panel_1.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("No");
		radioButton_12.setBounds(329, 165, 50, 23);
		panel_1.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBounds(329, 203, 50, 23);
		panel_1.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("No");
		radioButton_14.setBounds(329, 239, 50, 23);
		panel_1.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("No");
		radioButton_15.setBounds(329, 275, 50, 23);
		panel_1.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("No");
		radioButton_16.setBounds(329, 312, 50, 23);
		panel_1.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("No");
		radioButton_17.setBounds(329, 345, 50, 23);
		panel_1.add(radioButton_17);
		
		JLabel lblHablaIngles = new JLabel("Habla Ingles?");
		lblHablaIngles.setBounds(22, 56, 100, 14);
		panel_1.add(lblHablaIngles);
		
		JLabel lblVehiculoPropio = new JLabel("Vehiculo Propio?");
		lblVehiculoPropio.setBounds(22, 93, 100, 14);
		panel_1.add(lblVehiculoPropio);
		
		JLabel lblDisponibilidadDeHorario = new JLabel("Disponibilidad de Horario?");
		lblDisponibilidadDeHorario.setBounds(22, 131, 156, 14);
		panel_1.add(lblDisponibilidadDeHorario);
		
		JLabel lblDisposicionDeViaje = new JLabel("Disposicion de Viaje?");
		lblDisposicionDeViaje.setBounds(22, 169, 100, 14);
		panel_1.add(lblDisposicionDeViaje);
		
		JLabel lblDispuestoAMudarse = new JLabel("Dispuesto a Mudarse?");
		lblDispuestoAMudarse.setBounds(22, 207, 143, 14);
		panel_1.add(lblDispuestoAMudarse);
		
		JLabel lblManeajaMaquinarias = new JLabel("Maneaja Maquinarias?");
		lblManeajaMaquinarias.setBounds(22, 243, 143, 14);
		panel_1.add(lblManeajaMaquinarias);
		
		JLabel lblManejaFuncionesDe = new JLabel("Maneja funciones de Oficina?");
		lblManejaFuncionesDe.setBounds(22, 279, 156, 14);
		panel_1.add(lblManejaFuncionesDe);
		
		JLabel lblPoseeConocimientosMedicos = new JLabel("Posee conocimientos Medicos?");
		lblPoseeConocimientosMedicos.setBounds(22, 316, 156, 14);
		panel_1.add(lblPoseeConocimientosMedicos);
		
		JLabel lblDominaAlgunTipo = new JLabel("Domina algun tipo de Software?");
		lblDominaAlgunTipo.setBounds(22, 349, 178, 14);
		panel_1.add(lblDominaAlgunTipo);
		
		JButton button_1 = new JButton("Subir");
		button_1.setBounds(253, 529, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.setBounds(420, 529, 89, 23);
		contentPane.add(button_2);
	}
}