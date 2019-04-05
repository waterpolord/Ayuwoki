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
import Logic.Principal;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 856, 687);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 25, 491, 134);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(10, 44, 46, 14);
		panel.add(label);
		
		TXTNombre = new JTextField();
		TXTNombre.setColumns(10);
		TXTNombre.setBackground(SystemColor.inactiveCaptionBorder);
		TXTNombre.setBounds(68, 40, 253, 25);
		panel.add(TXTNombre);
		
		JButton button = new JButton("Buscar");
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(367, 40, 89, 25);
		panel.add(button);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblTipo.setBounds(10, 88, 46, 14);
		panel.add(lblTipo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(68, 86, 253, 25);
		panel.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == 2) {
					try {
						Principal.getInstance().buscarPersonas(persona.getCorreo()).setSesion(false);;
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
		comboBox.setForeground(SystemColor.desktop);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Configuracion", "Editar Cuenta", "Cerrar Sesion"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(633, 11, 162, 20);
		contentPane.add(comboBox);
		
		JPanel panelReUniversitario = new JPanel();
		panelReUniversitario.setBounds(10, 203, 460, 434);
		contentPane.add(panelReUniversitario);
		panelReUniversitario.setLayout(null);
		panelReUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReUniversitario.setBackground(SystemColor.window);
		
		JRadioButton RBOtroUniSi = new JRadioButton("Si");
		RBOtroUniSi.setBounds(313, 52, 50, 23);
		panelReUniversitario.add(RBOtroUniSi);
		
		JRadioButton RBOtroUniNo = new JRadioButton("No");
		RBOtroUniNo.setBounds(385, 52, 50, 23);
		panelReUniversitario.add(RBOtroUniNo);
		
		JRadioButton RBVehUniSi = new JRadioButton("Si");
		RBVehUniSi.setBounds(313, 89, 50, 23);
		panelReUniversitario.add(RBVehUniSi);
		
		JRadioButton RBVehUniNo = new JRadioButton("No");
		RBVehUniNo.setBounds(385, 89, 50, 23);
		panelReUniversitario.add(RBVehUniNo);
		
		JRadioButton radioButton_36 = new JRadioButton("Si");
		radioButton_36.setBounds(313, 127, 50, 23);
		panelReUniversitario.add(radioButton_36);
		
		JRadioButton radioButton_37 = new JRadioButton("Si");
		radioButton_37.setBounds(313, 165, 50, 23);
		panelReUniversitario.add(radioButton_37);
		
		JRadioButton radioButton_38 = new JRadioButton("Si");
		radioButton_38.setBounds(313, 203, 50, 23);
		panelReUniversitario.add(radioButton_38);
		
		JRadioButton radioButton_39 = new JRadioButton("Si");
		radioButton_39.setBounds(313, 239, 50, 23);
		panelReUniversitario.add(radioButton_39);
		
		JRadioButton radioButton_40 = new JRadioButton("Si");
		radioButton_40.setBounds(313, 275, 50, 23);
		panelReUniversitario.add(radioButton_40);
		
		JRadioButton radioButton_41 = new JRadioButton("Si");
		radioButton_41.setBounds(313, 312, 50, 23);
		panelReUniversitario.add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton("No");
		radioButton_42.setBounds(385, 127, 50, 23);
		panelReUniversitario.add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton("No");
		radioButton_43.setBounds(385, 165, 50, 23);
		panelReUniversitario.add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton("No");
		radioButton_44.setBounds(385, 203, 50, 23);
		panelReUniversitario.add(radioButton_44);
		
		JRadioButton radioButton_45 = new JRadioButton("No");
		radioButton_45.setBounds(385, 239, 50, 23);
		panelReUniversitario.add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton("No");
		radioButton_46.setBounds(385, 275, 50, 23);
		panelReUniversitario.add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton("No");
		radioButton_47.setBounds(385, 312, 50, 23);
		panelReUniversitario.add(radioButton_47);
		
		JLabel lblhablaOtro = new JLabel("1. \u00BFHabla otro idioma?");
		lblhablaOtro.setBounds(22, 56, 122, 14);
		panelReUniversitario.add(lblhablaOtro);
		
		JLabel lblvehculoPropio = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
		lblvehculoPropio.setBounds(22, 93, 100, 14);
		panelReUniversitario.add(lblvehculoPropio);
		
		JLabel lbldisponibilidadDe = new JLabel("3. \u00BFDisponibilidad de Horario?");
		lbldisponibilidadDe.setBounds(22, 131, 156, 14);
		panelReUniversitario.add(lbldisponibilidadDe);
		
		JLabel lbldisposicinDe = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
		lbldisposicinDe.setBounds(22, 169, 156, 14);
		panelReUniversitario.add(lbldisposicinDe);
		
		JLabel lbldispuestoA = new JLabel("5. \u00BFDispuesto a Mudarse?");
		lbldispuestoA.setBounds(22, 207, 143, 14);
		panelReUniversitario.add(lbldispuestoA);
		
		JLabel lblpiensaAmpliar = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		lblpiensaAmpliar.setBounds(22, 243, 193, 14);
		panelReUniversitario.add(lblpiensaAmpliar);
		
		JLabel lbltrabajaraLos = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		lbltrabajaraLos.setBounds(22, 279, 178, 14);
		panelReUniversitario.add(lbltrabajaraLos);
		
		JLabel lblposeeExperiencia = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		lblposeeExperiencia.setBounds(22, 316, 242, 14);
		panelReUniversitario.add(lblposeeExperiencia);
		
		JLabel lblpuedeRealizar = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		lblpuedeRealizar.setBounds(22, 349, 218, 14);
		panelReUniversitario.add(lblpuedeRealizar);
		
		JRadioButton radioButton_14 = new JRadioButton("No");
		radioButton_14.setBounds(385, 345, 50, 23);
		panelReUniversitario.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("Si");
		radioButton_15.setBounds(313, 345, 50, 23);
		panelReUniversitario.add(radioButton_15);
		
		JLabel lblTrabajaEquipo = new JLabel("10. \u00BFTrabajas bien en equipo?");
		lblTrabajaEquipo.setBounds(22, 390, 156, 14);
		panelReUniversitario.add(lblTrabajaEquipo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setBounds(315, 386, 50, 23);
		panelReUniversitario.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton_16 = new JRadioButton("No");
		radioButton_16.setBounds(385, 386, 50, 23);
		panelReUniversitario.add(radioButton_16);
		
		JButton BTNGuardar = new JButton("Guardar");
		BTNGuardar.setBackground(SystemColor.activeCaption);
		BTNGuardar.setBounds(535, 550, 89, 37);
		contentPane.add(BTNGuardar);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBackground(SystemColor.activeCaption);
		button_2.setBounds(670, 550, 89, 37);
		contentPane.add(button_2);
		
		
		JPanel panelReTec = new JPanel();
		panelReTec.setBounds(10, 203, 460, 434);
		contentPane.add(panelReTec);
		panelReTec.setLayout(null);
		panelReTec.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReTec.setBackground(Color.WHITE);
		
		JRadioButton radioButton_2 = new JRadioButton("Si");
		radioButton_2.setBounds(283, 89, 50, 23);
		panelReTec.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("No");
		radioButton_3.setBounds(357, 89, 50, 23);
		panelReTec.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBounds(283, 127, 50, 23);
		panelReTec.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("No");
		radioButton_5.setBounds(357, 127, 50, 23);
		panelReTec.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBounds(283, 165, 50, 23);
		panelReTec.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Si");
		radioButton_7.setBounds(283, 203, 50, 23);
		panelReTec.add(radioButton_7);
		
		JRadioButton radioButton_12 = new JRadioButton("No");
		radioButton_12.setBounds(357, 165, 50, 23);
		panelReTec.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBounds(357, 203, 50, 23);
		panelReTec.add(radioButton_13);
		
		JLabel lblHablaIngles = new JLabel("1. \u00BFHabla otro Idioma?");
		lblHablaIngles.setBounds(22, 56, 143, 14);
		panelReTec.add(lblHablaIngles);
		
		JLabel lblVehiculoPropio = new JLabel("2. \u00BFVehiculo Propio?");
		lblVehiculoPropio.setBounds(22, 93, 143, 14);
		panelReTec.add(lblVehiculoPropio);
		
		JLabel lblDisponibilidadDeHorario = new JLabel("3. \u00BFDisponibilidad de Horario?");
		lblDisponibilidadDeHorario.setBounds(22, 131, 156, 14);
		panelReTec.add(lblDisponibilidadDeHorario);
		
		JLabel lblDisposicionDeViaje = new JLabel("4. \u00BFDisposicion de Viaje?");
		lblDisposicionDeViaje.setBounds(22, 169, 143, 14);
		panelReTec.add(lblDisposicionDeViaje);
		
		JLabel lblDispuestoAMudarse = new JLabel("5. \u00BFDispuesto a Mudarse?");
		lblDispuestoAMudarse.setBounds(22, 207, 143, 14);
		panelReTec.add(lblDispuestoAMudarse);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Frances", "Chino", "Italiano"}));
		comboBox_1.setBounds(246, 53, 133, 20);
		panelReTec.add(comboBox_1);
		
		JLabel label_19 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_19.setBounds(22, 398, 156, 14);
		panelReTec.add(label_19);
		
		JRadioButton radioButton_10 = new JRadioButton("Si");
		radioButton_10.setBounds(283, 354, 50, 23);
		panelReTec.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("No");
		radioButton_11.setBounds(357, 354, 50, 23);
		panelReTec.add(radioButton_11);
		
		JLabel label_10 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		label_10.setBounds(22, 247, 193, 14);
		panelReTec.add(label_10);
		
		JLabel label_11 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		label_11.setBounds(22, 287, 178, 14);
		panelReTec.add(label_11);
		
		JLabel label_12 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		label_12.setBounds(22, 322, 242, 14);
		panelReTec.add(label_12);
		
		JLabel label_13 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		label_13.setBounds(22, 358, 218, 14);
		panelReTec.add(label_13);
		
		JRadioButton radioButton_17 = new JRadioButton("Si");
		radioButton_17.setBounds(283, 243, 50, 23);
		panelReTec.add(radioButton_17);
		
		JRadioButton radioButton_32 = new JRadioButton("Si");
		radioButton_32.setBounds(283, 283, 50, 23);
		panelReTec.add(radioButton_32);
		
		JRadioButton radioButton_33 = new JRadioButton("Si");
		radioButton_33.setBounds(283, 318, 50, 23);
		panelReTec.add(radioButton_33);
		
		JRadioButton radioButton_34 = new JRadioButton("No");
		radioButton_34.setBounds(357, 243, 50, 23);
		panelReTec.add(radioButton_34);
		
		JRadioButton radioButton_35 = new JRadioButton("No");
		radioButton_35.setBounds(357, 283, 50, 23);
		panelReTec.add(radioButton_35);
		
		JRadioButton radioButton_48 = new JRadioButton("No");
		radioButton_48.setBounds(357, 318, 50, 23);
		panelReTec.add(radioButton_48);
		
		JRadioButton radioButton_49 = new JRadioButton("No");
		radioButton_49.setBounds(357, 394, 50, 23);
		panelReTec.add(radioButton_49);
		
		JRadioButton radioButton_50 = new JRadioButton("Si");
		radioButton_50.setBounds(283, 394, 50, 23);
		panelReTec.add(radioButton_50);
		
		JPanel panelReObr = new JPanel();
		panelReObr.setLayout(null);
		panelReObr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReObr.setBackground(Color.WHITE);
		panelReObr.setBounds(10, 203, 460, 434);
		contentPane.add(panelReObr);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBounds(302, 89, 50, 23);
		panelReObr.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(367, 89, 50, 23);
		panelReObr.add(radioButton_1);
		
		JRadioButton radioButton_18 = new JRadioButton("Si");
		radioButton_18.setBounds(302, 127, 50, 23);
		panelReObr.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("No");
		radioButton_19.setBounds(367, 127, 50, 23);
		panelReObr.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("Si");
		radioButton_20.setBounds(302, 165, 50, 23);
		panelReObr.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("Si");
		radioButton_21.setBounds(302, 203, 50, 23);
		panelReObr.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("Si");
		radioButton_22.setBounds(302, 239, 50, 23);
		panelReObr.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("Si");
		radioButton_23.setBounds(302, 275, 50, 23);
		panelReObr.add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton("Si");
		radioButton_24.setBounds(302, 312, 50, 23);
		panelReObr.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("Si");
		radioButton_25.setBounds(302, 345, 50, 23);
		panelReObr.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("No");
		radioButton_26.setBounds(367, 165, 50, 23);
		panelReObr.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("No");
		radioButton_27.setBounds(367, 203, 50, 23);
		panelReObr.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("No");
		radioButton_28.setBounds(367, 239, 50, 23);
		panelReObr.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("No");
		radioButton_29.setBounds(367, 275, 50, 23);
		panelReObr.add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton("No");
		radioButton_30.setBounds(367, 312, 50, 23);
		panelReObr.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("No");
		radioButton_31.setBounds(367, 345, 50, 23);
		panelReObr.add(radioButton_31);
		
		JLabel lblhablaOtroIdioma = new JLabel("1. \u00BFHa realizado cursos de formaci\u00F3n?");
		lblhablaOtroIdioma.setBounds(22, 56, 214, 14);
		panelReObr.add(lblhablaOtroIdioma);
		
		JLabel lblvehiculoPropio = new JLabel("2. \u00BFVehiculo Propio?");
		lblvehiculoPropio.setBounds(22, 93, 100, 14);
		panelReObr.add(lblvehiculoPropio);
		
		JLabel lbldisponibilidadDe_1 = new JLabel("3. \u00BFDisponibilidad de Horario?");
		lbldisponibilidadDe_1.setBounds(22, 131, 156, 14);
		panelReObr.add(lbldisponibilidadDe_1);
		
		JLabel lbldisposicionDe = new JLabel("4. \u00BFDisposicion de Viaje?");
		lbldisposicionDe.setBounds(22, 169, 156, 14);
		panelReObr.add(lbldisposicionDe);
		
		JLabel lblsabeManejar = new JLabel("5. \u00BFSabe manejar Numeros?");
		lblsabeManejar.setBounds(22, 207, 143, 14);
		panelReObr.add(lblsabeManejar);
		
		JLabel lblpiensaEstudiar = new JLabel("6. \u00BFPiensa estudiar alguna carreara o t\u00E9cnico?");
		lblpiensaEstudiar.setBounds(22, 243, 274, 14);
		panelReObr.add(lblpiensaEstudiar);
		
		JLabel lbltrabajaraLos_1 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		lbltrabajaraLos_1.setBounds(22, 279, 236, 14);
		panelReObr.add(lbltrabajaraLos_1);
		
		JLabel lblposeeExperiencia_1 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		lblposeeExperiencia_1.setBounds(22, 316, 257, 14);
		panelReObr.add(lblposeeExperiencia_1);
		
		JLabel lblpuedeRealizar_1 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		lblpuedeRealizar_1.setBounds(22, 349, 257, 14);
		panelReObr.add(lblpuedeRealizar_1);
		
		JLabel lbltrabajasBien = new JLabel("10. \u00BFTrabajas bien en equipo?");
		lbltrabajasBien.setBounds(22, 384, 156, 14);
		panelReObr.add(lbltrabajasBien);
		
		JRadioButton radioButton_8 = new JRadioButton("Si");
		radioButton_8.setBounds(302, 380, 50, 23);
		panelReObr.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("No");
		radioButton_9.setBounds(367, 380, 50, 23);
		panelReObr.add(radioButton_9);
		
		JRadioButton radioButton_51 = new JRadioButton("Si");
		radioButton_51.setBounds(302, 52, 50, 23);
		panelReObr.add(radioButton_51);
		
		JRadioButton radioButton_52 = new JRadioButton("No");
		radioButton_52.setBounds(367, 52, 50, 23);
		panelReObr.add(radioButton_52);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Monto a Ganar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(480, 345, 346, 106);
		contentPane.add(panel_1);
		
		JRadioButton radioButton_53 = new JRadioButton("Entre 10,000 o M\u00E1s");
		radioButton_53.setBounds(6, 31, 142, 23);
		panel_1.add(radioButton_53);
		
		JRadioButton radioButton_54 = new JRadioButton("Entre 30,000 o M\u00E1s");
		radioButton_54.setBounds(196, 31, 142, 23);
		panel_1.add(radioButton_54);
		
		JRadioButton radioButton_55 = new JRadioButton("Entre 50,000 o M\u00E1s");
		radioButton_55.setBounds(105, 76, 142, 23);
		panel_1.add(radioButton_55);
		
		
		
	}
}