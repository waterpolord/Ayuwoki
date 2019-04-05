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
	private JRadioButton rbn1;
	private JRadioButton rbn2;
	private JRadioButton rbn3;
	private JRadioButton rbn4;
	private JRadioButton rbn5;
	private JRadioButton rbn6;
	private JRadioButton rbn7;
	private JRadioButton rbn8;
	private JRadioButton rbn9;
	private JRadioButton rbn10;
	private JRadioButton rbn11;
	private JRadioButton rbn12;
	private JRadioButton rbn13;
	private JRadioButton rbn14;
	private JRadioButton rbn15;
	private JRadioButton rbn16;
	private JRadioButton rbn17;
	private JRadioButton rbn18;
	private JRadioButton rbn19;
	private JRadioButton rbn20;
	private JRadioButton rbn21;
	private JRadioButton rbn22;
	private JRadioButton rbn23;
	private JRadioButton rbn24;
	private JRadioButton rbn25;
	private JRadioButton rbn26;
	private JRadioButton rbn27;
	private JRadioButton rbn28;
	private JRadioButton rbn29;
	private JRadioButton rbn30;
	private JRadioButton rbn31;
	private JRadioButton rbn32;
	private JRadioButton rbn33;
	private JRadioButton rbn34;
	private JRadioButton rbn35;
	private JRadioButton rbn36;
	private JRadioButton rbn37;
	private JRadioButton rbn38;
	private JRadioButton rbn39;
	private JRadioButton rbn40;
	private JRadioButton rbn41;
	private JRadioButton rbn42;
	private JRadioButton rbn43;
	private JRadioButton rbn44;
	private JRadioButton rbn45;
	private JRadioButton rbn46;
	private JRadioButton rbn47;
	private JRadioButton rbn48;
	private JRadioButton rbn49;
	private JRadioButton rbn50;
	private JRadioButton rbn51;
	private JRadioButton rbn52;
	private JRadioButton rbn53;
	private JRadioButton rbn54;
	private JRadioButton rbn55;
	private JRadioButton rbn56;
	private JRadioButton rbn57;
	
	

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
		
		JRadioButton rbn1 = new JRadioButton("Si");
		rbn1.setBounds(313, 52, 50, 23);
		panelReUniversitario.add(rbn1);
		
		JRadioButton rbn2 = new JRadioButton("No");
		rbn2.setBounds(385, 52, 50, 23);
		panelReUniversitario.add(rbn2);
		
		JRadioButton rbn3 = new JRadioButton("Si");
		rbn3.setBounds(313, 89, 50, 23);
		panelReUniversitario.add(rbn3);
		
		JRadioButton rbn4 = new JRadioButton("No");
		rbn4.setBounds(385, 89, 50, 23);
		panelReUniversitario.add(rbn4);
		
		JRadioButton rbn5 = new JRadioButton("Si");
		rbn5.setBounds(313, 127, 50, 23);
		panelReUniversitario.add(rbn5);
		
		JRadioButton rbn6 = new JRadioButton("Si");
		rbn6.setBounds(313, 165, 50, 23);
		panelReUniversitario.add(rbn6);
		
		JRadioButton rbn7 = new JRadioButton("Si");
		rbn7.setBounds(313, 203, 50, 23);
		panelReUniversitario.add(rbn7);
		
		JRadioButton rbn8 = new JRadioButton("Si");
		rbn8.setBounds(313, 239, 50, 23);
		panelReUniversitario.add(rbn8);
		
		JRadioButton rbn9 = new JRadioButton("Si");
		rbn9.setBounds(313, 275, 50, 23);
		panelReUniversitario.add(rbn9);
		
		JRadioButton rbn10 = new JRadioButton("Si");
		rbn10.setBounds(313, 312, 50, 23);
		panelReUniversitario.add(rbn10);
		
		JRadioButton rbn11 = new JRadioButton("No");
		rbn11.setBounds(385, 127, 50, 23);
		panelReUniversitario.add(rbn11);
		
		JRadioButton rbn12 = new JRadioButton("No");
		rbn12.setBounds(385, 165, 50, 23);
		panelReUniversitario.add(rbn12);
		
		JRadioButton rbn13 = new JRadioButton("No");
		rbn13.setBounds(385, 203, 50, 23);
		panelReUniversitario.add(rbn13);
		
		JRadioButton rbn14 = new JRadioButton("No");
		rbn14.setBounds(385, 239, 50, 23);
		panelReUniversitario.add(rbn14);
		
		JRadioButton rbn15 = new JRadioButton("No");
		rbn15.setBounds(385, 275, 50, 23);
		panelReUniversitario.add(rbn15);
		
		JRadioButton rbn16 = new JRadioButton("No");
		rbn16.setBounds(385, 312, 50, 23);
		panelReUniversitario.add(rbn16);
		
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
		
		JRadioButton rbn17 = new JRadioButton("No");
		rbn17.setBounds(385, 345, 50, 23);
		panelReUniversitario.add(rbn17);
		
		JRadioButton rbn18 = new JRadioButton("Si");
		rbn18.setBounds(313, 345, 50, 23);
		panelReUniversitario.add(rbn18);
		
		JLabel lblTrabajaEquipo = new JLabel("10. \u00BFTrabajas bien en equipo?");
		lblTrabajaEquipo.setBounds(22, 390, 156, 14);
		panelReUniversitario.add(lblTrabajaEquipo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setBounds(315, 386, 50, 23);
		panelReUniversitario.add(rdbtnNewRadioButton);
		
		JRadioButton rbn19 = new JRadioButton("No");
		rbn19.setBounds(385, 386, 50, 23);
		panelReUniversitario.add(rbn19);
		
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
		
		JRadioButton rbn20 = new JRadioButton("Si");
		rbn20.setBounds(283, 89, 50, 23);
		panelReTec.add(rbn20);
		
		JRadioButton rbn21 = new JRadioButton("No");
		rbn21.setBounds(357, 89, 50, 23);
		panelReTec.add(rbn21);
		
		JRadioButton rbn22 = new JRadioButton("Si");
		rbn22.setBounds(283, 127, 50, 23);
		panelReTec.add(rbn22);
		
		JRadioButton rbn23 = new JRadioButton("No");
		rbn23.setBounds(357, 127, 50, 23);
		panelReTec.add(rbn23);
		
		JRadioButton rbn24 = new JRadioButton("Si");
		rbn24.setBounds(283, 165, 50, 23);
		panelReTec.add(rbn24);
		
		JRadioButton rbn25 = new JRadioButton("Si");
		rbn25.setBounds(283, 203, 50, 23);
		panelReTec.add(rbn25);
		
		JRadioButton rbn26 = new JRadioButton("No");
		rbn26.setBounds(357, 165, 50, 23);
		panelReTec.add(rbn26);
		
		JRadioButton rbn27 = new JRadioButton("No");
		rbn27.setBounds(357, 203, 50, 23);
		panelReTec.add(rbn27);
		
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
		
		JRadioButton rbn28 = new JRadioButton("Si");
		rbn28.setBounds(283, 354, 50, 23);
		panelReTec.add(rbn28);
		
		JRadioButton rbn29 = new JRadioButton("No");
		rbn29.setBounds(357, 354, 50, 23);
		panelReTec.add(rbn29);
		
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
		
		JRadioButton rbn30 = new JRadioButton("Si");
		rbn30.setBounds(283, 243, 50, 23);
		panelReTec.add(rbn30);
		
		JRadioButton rbn31 = new JRadioButton("Si");
		rbn31.setBounds(283, 283, 50, 23);
		panelReTec.add(rbn31);
		
		JRadioButton rbn32 = new JRadioButton("Si");
		rbn32.setBounds(283, 318, 50, 23);
		panelReTec.add(rbn32);
		
		JRadioButton rbn33 = new JRadioButton("No");
		rbn33.setBounds(357, 243, 50, 23);
		panelReTec.add(rbn33);
		
		JRadioButton rbn34 = new JRadioButton("No");
		rbn34.setBounds(357, 283, 50, 23);
		panelReTec.add(rbn34);
		
		JRadioButton rbn35 = new JRadioButton("No");
		rbn35.setBounds(357, 318, 50, 23);
		panelReTec.add(rbn35);
		
		JRadioButton rbn36 = new JRadioButton("No");
		rbn36.setBounds(357, 394, 50, 23);
		panelReTec.add(rbn36);
		
		JRadioButton rbn37 = new JRadioButton("Si");
		rbn37.setBounds(283, 394, 50, 23);
		panelReTec.add(rbn37);
		
		JPanel panelReObr = new JPanel();
		panelReObr.setLayout(null);
		panelReObr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReObr.setBackground(Color.WHITE);
		panelReObr.setBounds(10, 203, 460, 434);
		contentPane.add(panelReObr);
		
		JRadioButton rbn38 = new JRadioButton("Si");
		rbn38.setBounds(302, 89, 50, 23);
		panelReObr.add(rbn38);
		
		JRadioButton rbn39 = new JRadioButton("No");
		rbn39.setBounds(367, 89, 50, 23);
		panelReObr.add(rbn39);
		
		JRadioButton rbn40 = new JRadioButton("Si");
		rbn40.setBounds(302, 127, 50, 23);
		panelReObr.add(rbn40);
		
		JRadioButton rbn41 = new JRadioButton("No");
		rbn41.setBounds(367, 127, 50, 23);
		panelReObr.add(rbn41);
		
		JRadioButton rbn42 = new JRadioButton("Si");
		rbn42.setBounds(302, 165, 50, 23);
		panelReObr.add(rbn42);
		
		JRadioButton rbn43 = new JRadioButton("Si");
		rbn43.setBounds(302, 203, 50, 23);
		panelReObr.add(rbn43);
		
		JRadioButton rbn44 = new JRadioButton("Si");
		rbn44.setBounds(302, 239, 50, 23);
		panelReObr.add(rbn44);
		
		JRadioButton rbn45 = new JRadioButton("Si");
		rbn45.setBounds(302, 275, 50, 23);
		panelReObr.add(rbn45);
		
		JRadioButton rbn46 = new JRadioButton("Si");
		rbn46.setBounds(302, 312, 50, 23);
		panelReObr.add(rbn46);
		
		JRadioButton rbn47 = new JRadioButton("Si");
		rbn47.setBounds(302, 345, 50, 23);
		panelReObr.add(rbn47);
		
		JRadioButton rbn48 = new JRadioButton("No");
		rbn48.setBounds(367, 165, 50, 23);
		panelReObr.add(rbn48);
		
		JRadioButton rbn49 = new JRadioButton("No");
		rbn49.setBounds(367, 203, 50, 23);
		panelReObr.add(rbn49);
		
		JRadioButton rbn50 = new JRadioButton("No");
		rbn50.setBounds(367, 239, 50, 23);
		panelReObr.add(rbn50);
		
		JRadioButton rbn51 = new JRadioButton("No");
		rbn51.setBounds(367, 275, 50, 23);
		panelReObr.add(rbn51);
		
		JRadioButton rbn52 = new JRadioButton("No");
		rbn52.setBounds(367, 312, 50, 23);
		panelReObr.add(rbn52);
		
		JRadioButton rbn53 = new JRadioButton("No");
		rbn53.setBounds(367, 345, 50, 23);
		panelReObr.add(rbn53);
		
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
		
		JRadioButton rbn54 = new JRadioButton("Si");
		rbn54.setBounds(302, 380, 50, 23);
		panelReObr.add(rbn54);
		
		JRadioButton rbn55 = new JRadioButton("No");
		rbn55.setBounds(367, 380, 50, 23);
		panelReObr.add(rbn55);
		
		JRadioButton rbn56 = new JRadioButton("Si");
		rbn56.setBounds(302, 52, 50, 23);
		panelReObr.add(rbn56);
		
		JRadioButton rbn57 = new JRadioButton("No");
		rbn57.setBounds(367, 52, 50, 23);
		panelReObr.add(rbn57);
		
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