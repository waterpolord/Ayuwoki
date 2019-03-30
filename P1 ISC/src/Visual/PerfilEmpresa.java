package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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
		setBounds(100, 100, 859, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuracion", "Editar Cuenta", "Cerrar Sesion"}));
		comboBox.setBounds(591, 11, 162, 20);
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requisitos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(436, 162, 403, 386);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setBounds(246, 52, 50, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setBounds(329, 52, 50, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBounds(246, 89, 50, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("No");
		radioButton_4.setBounds(329, 89, 50, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBounds(246, 127, 50, 23);
		panel_1.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("No");
		radioButton_6.setBounds(329, 127, 50, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Si");
		radioButton_7.setBounds(246, 165, 50, 23);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("Si");
		radioButton_8.setBounds(246, 203, 50, 23);
		panel_1.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("Si");
		radioButton_9.setBounds(246, 239, 50, 23);
		panel_1.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Si");
		radioButton_10.setBounds(246, 275, 50, 23);
		panel_1.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("Si");
		radioButton_11.setBounds(246, 312, 50, 23);
		panel_1.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("Si");
		radioButton_12.setBounds(246, 345, 50, 23);
		panel_1.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBounds(329, 165, 50, 23);
		panel_1.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("No");
		radioButton_14.setBounds(329, 203, 50, 23);
		panel_1.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("No");
		radioButton_15.setBounds(329, 239, 50, 23);
		panel_1.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("No");
		radioButton_16.setBounds(329, 275, 50, 23);
		panel_1.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("No");
		radioButton_17.setBounds(329, 312, 50, 23);
		panel_1.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("No");
		radioButton_18.setBounds(329, 345, 50, 23);
		panel_1.add(radioButton_18);
		
		JLabel lblNewLabel_1 = new JLabel("Hablar Ingles");
		lblNewLabel_1.setBounds(22, 56, 100, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vehiculo Propio");
		lblNewLabel_2.setBounds(22, 93, 100, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblDisponibilidadDeViajar = new JLabel("Disponibilidad de Horario");
		lblDisponibilidadDeViajar.setBounds(22, 131, 156, 14);
		panel_1.add(lblDisponibilidadDeViajar);
		
		JLabel lblDisposicionDeViajar = new JLabel("Disposicion de Viajar");
		lblDisposicionDeViajar.setBounds(22, 169, 100, 14);
		panel_1.add(lblDisposicionDeViajar);
		
		JLabel lblDisposicionAMudarse = new JLabel("Disposicion a Mudarse");
		lblDisposicionAMudarse.setBounds(22, 207, 143, 14);
		panel_1.add(lblDisposicionAMudarse);
		
		JLabel lblManeajerMaquinarias = new JLabel("Maneajer Maquinarias");
		lblManeajerMaquinarias.setBounds(22, 243, 143, 14);
		panel_1.add(lblManeajerMaquinarias);
		
		JLabel lblManejoDeFunciones = new JLabel("Manejo de Funciones de Oficina");
		lblManejoDeFunciones.setBounds(22, 279, 156, 14);
		panel_1.add(lblManejoDeFunciones);
		
		JLabel lblConocimientosMedicos = new JLabel("Conocimientos Medicos");
		lblConocimientosMedicos.setBounds(22, 316, 156, 14);
		panel_1.add(lblConocimientosMedicos);
		
		JLabel lblDominioDeSoftware = new JLabel("Dominio de Software");
		lblDominioDeSoftware.setBounds(22, 349, 143, 14);
		panel_1.add(lblDominioDeSoftware);
		
		JButton btnNewButton = new JButton("Subir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(79, 525, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(227, 525, 89, 23);
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
		panel_2.setBounds(5, 212, 366, 298);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo De Personal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBackground(SystemColor.inactiveCaption);
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
		panel_4.setBackground(SystemColor.inactiveCaption);
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
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.setBounds(10, 201, 346, 86);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JRadioButton rdbtnOMas = new JRadioButton("10 o Mas");
		rdbtnOMas.setBounds(6, 31, 82, 23);
		panel_5.add(rdbtnOMas);
		
		JRadioButton rdbtnOMas_1 = new JRadioButton("30 o Mas");
		rdbtnOMas_1.setBounds(136, 31, 82, 23);
		panel_5.add(rdbtnOMas_1);
		
		JRadioButton rdbtnOMas_2 = new JRadioButton("50 o Mas");
		rdbtnOMas_2.setBounds(258, 31, 82, 23);
		panel_5.add(rdbtnOMas_2);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Personal");
		lblNewLabel.setBounds(20, 140, 114, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(142, 159, 67, 20);
		contentPane.add(spinner);
		
	
	
	}
}
