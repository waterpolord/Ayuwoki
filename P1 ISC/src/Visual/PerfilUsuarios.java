package Visual;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PerfilUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField TXTNombre;
	private JTextField textField;
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
	private JRadioButton rbn1_1;
	private JRadioButton rbn2_1;
	private JRadioButton rbn3_1;
	private JRadioButton rbn4_1;
	private JRadioButton rbn5_1;
	private JRadioButton rbn6_1;
	private JRadioButton rbn7_1;
	private JRadioButton rbn8_1;
	private JRadioButton rbn9_1;
	private JRadioButton rbn10_1;
	private JRadioButton rbn11_1;
	private JRadioButton rbn12_1;
	private JRadioButton rbn13_1;
	private JRadioButton rbn14_1;
	private JRadioButton rbn15_1;
	private JRadioButton rbn16_1;
	private JRadioButton rbn17_1;
	private JRadioButton rbn18_1;
	private JRadioButton rbn19_1;
	private JRadioButton rbn20_1;
	private JRadioButton rbn21_1;
	private JRadioButton rbn22_1;
	private JRadioButton rbn23_1;
	private JRadioButton rbn24_1;
	private JRadioButton rbn25_1;
	private JRadioButton rbn26_1;
	private JRadioButton rbn27_1;
	private JRadioButton rbn28_1;
	private JRadioButton rbn29_1;
	private JRadioButton rbn30_1;
	private JRadioButton rbn31_1;
	private JRadioButton rbn32_1;
	private JRadioButton rbn33_1;
	private JRadioButton rbn34_1;
	private JRadioButton rbn35_1;
	private JRadioButton rbn36_1;
	private JRadioButton rbn37_1;
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
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PerfilUsuarios(Persona persona) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setgrupo(rbn1_1,rbn3_1,rbn5_1,rbn6_1,rbn7_1,rbn8_1,rbn9_1,rbn10_1,rbn18_1,rdbtnNewRadioButton,rbn2_1,rbn2_1,rbn11_1,rbn12_1,rbn13_1,rbn14_1,rbn15_1,rbn16_1,rbn17_1,rbn19_1);
			}
		});
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
		
		
		
		
		JPanel panelReObr = new JPanel();
		panelReObr.setLayout(null);
		panelReObr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReObr.setBackground(Color.WHITE);
		panelReObr.setBounds(10, 203, 460, 434);
		contentPane.add(panelReObr);
		
		rbn38 = new JRadioButton("Si");
		rbn38.setBounds(313, 239, 50, 23);
		panelReObr.add(rbn38);
		
		rbn39 = new JRadioButton("No");
		rbn39.setBounds(385, 52, 50, 23);
		panelReObr.add(rbn39);
		
		rbn40 = new JRadioButton("Si");
		rbn40.setBounds(313, 89, 50, 23);
		panelReObr.add(rbn40);
		
		rbn41 = new JRadioButton("No");
		rbn41.setBounds(385, 89, 50, 23);
		panelReObr.add(rbn41);
		
		rbn42 = new JRadioButton("Si");
		rbn42.setBounds(313, 127, 50, 23);
		panelReObr.add(rbn42);
		
		rbn43 = new JRadioButton("Si");
		rbn43.setBounds(313, 165, 50, 23);
		panelReObr.add(rbn43);
		
		rbn44 = new JRadioButton("Si");
		rbn44.setBounds(313, 203, 50, 23);
		panelReObr.add(rbn44);
		
		rbn45 = new JRadioButton("Si");
		rbn45.setBounds(313, 275, 50, 23);
		panelReObr.add(rbn45);
		
		rbn46 = new JRadioButton("Si");
		rbn46.setBounds(313, 312, 50, 23);
		panelReObr.add(rbn46);
		
		rbn47 = new JRadioButton("Si");
		rbn47.setBounds(313, 345, 50, 23);
		panelReObr.add(rbn47);
		
		rbn48 = new JRadioButton("No");
		rbn48.setBounds(385, 165, 50, 23);
		panelReObr.add(rbn48);
		
		rbn49 = new JRadioButton("No");
		rbn49.setBounds(385, 165, 50, 23);
		panelReObr.add(rbn49);
		
		rbn50 = new JRadioButton("No");
		rbn50.setBounds(385, 203, 50, 23);
		panelReObr.add(rbn50);
		
		rbn51 = new JRadioButton("No");
		rbn51.setBounds(385, 239, 50, 23);
		panelReObr.add(rbn51);
		
		rbn52 = new JRadioButton("No");
		rbn52.setBounds(385, 275, 50, 23);
		panelReObr.add(rbn52);
		
		rbn53 = new JRadioButton("No");
		rbn53.setBounds(385, 312, 50, 23);
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
		
		rbn54 = new JRadioButton("No");
		rbn54.setBounds(385, 345, 50, 23);
		panelReObr.add(rbn54);
		
		rbn55 = new JRadioButton("Si");
		rbn55.setBounds(315, 345, 50, 23);
		panelReObr.add(rbn55);
		
		rbn56 = new JRadioButton("Si");
		rbn56.setBounds(315, 386, 50, 23);
		panelReObr.add(rbn56);
		
		
		rbn57 = new JRadioButton("No");
		rbn57.setBounds(385, 386, 50, 23);
		panelReObr.add(rbn57);
		
		radioButton = new JRadioButton("Si");
		radioButton.setBounds(313, 52, 50, 23);
		panelReObr.add(radioButton);
		
		radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(385, 127, 50, 23);
		panelReObr.add(radioButton_1);
		

		
		JPanel panelReTec = new JPanel();
		panelReTec.setBounds(10, 203, 460, 434);
		contentPane.add(panelReTec);
		panelReTec.setLayout(null);
		panelReTec.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Tecnicos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReTec.setBackground(Color.WHITE);
		
		rbn20_1 = new JRadioButton("Si");
		rbn20_1.setBounds(313, 52, 50, 23);
		panelReTec.add(rbn20_1);
		
		rbn21_1 = new JRadioButton("No");
		rbn21_1.setBounds(385, 52, 50, 23);
		panelReTec.add(rbn21_1);
		
		rbn22_1 = new JRadioButton("Si");
		rbn22_1.setBounds(313, 89, 50, 23);
		panelReTec.add(rbn22_1);
		
		rbn23_1 = new JRadioButton("No");
		rbn23_1.setBounds(385, 89, 50, 23);
		panelReTec.add(rbn23_1);
		
		rbn24_1 = new JRadioButton("Si");
		rbn24_1.setBounds(313, 127, 50, 23);
		panelReTec.add(rbn24_1);
		
		rbn25_1 = new JRadioButton("Si");
		rbn25_1.setBounds(313, 165, 50, 23);
		panelReTec.add(rbn25_1);
		
		rbn26_1 = new JRadioButton("Si");
		rbn26_1.setBounds(313, 203, 50, 23);
		panelReTec.add(rbn26_1);
		
		rbn27_1 = new JRadioButton("Si");
		rbn27_1.setBounds(313, 239, 50, 23);
		panelReTec.add(rbn27_1);
		
		JLabel lblHablaIngles = new JLabel("1. \u00BFHabla otro Idioma?");
		lblHablaIngles.setBounds(22, 56, 122, 14);
		panelReTec.add(lblHablaIngles);
		
		JLabel lblVehiculoPropio = new JLabel("2. \u00BFVehiculo Propio?");
		lblVehiculoPropio.setBounds(22, 93, 100, 14);
		panelReTec.add(lblVehiculoPropio);
		
		JLabel lblDisponibilidadDeHorario = new JLabel("3. \u00BFDisponibilidad de Horario?");
		lblDisponibilidadDeHorario.setBounds(22, 131, 156, 14);
		panelReTec.add(lblDisponibilidadDeHorario);
		
		JLabel lblDisposicionDeViaje = new JLabel("4. \u00BFDisposicion de Viaje?");
		lblDisposicionDeViaje.setBounds(22, 169, 156, 14);
		panelReTec.add(lblDisposicionDeViaje);
		
		JLabel lblDispuestoAMudarse = new JLabel("5. \u00BFDispuesto a Mudarse?");
		lblDispuestoAMudarse.setBounds(22, 207, 143, 14);
		panelReTec.add(lblDispuestoAMudarse);
		
		JLabel label_19 = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		label_19.setBounds(22, 243, 193, 14);
		panelReTec.add(label_19);
		
		rbn28_1 = new JRadioButton("Si");
		rbn28_1.setBounds(313, 275, 50, 23);
		panelReTec.add(rbn28_1);
		
		rbn29_1 = new JRadioButton("Si");
		rbn29_1.setBounds(313, 312, 50, 23);
		panelReTec.add(rbn29_1);
		
		JLabel lbltrabajaraLos_2 = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		lbltrabajaraLos_2.setBounds(22, 279, 181, 14);
		panelReTec.add(lbltrabajaraLos_2);
		
		JLabel label_11 = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		label_11.setBounds(22, 316, 242, 14);
		panelReTec.add(label_11);
		
		JLabel label_12 = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		label_12.setBounds(22, 349, 218, 14);
		panelReTec.add(label_12);
		
		JLabel label_13 = new JLabel("10. \u00BFTrabajas bien en equipo?");
		label_13.setBounds(22, 390, 156, 14);
		panelReTec.add(label_13);
		
		rbn30_1 = new JRadioButton("No");
		rbn30_1.setBounds(385, 127, 50, 23);
		panelReTec.add(rbn30_1);
		
		rbn31_1 = new JRadioButton("No");
		rbn31_1.setBounds(385, 165, 50, 23);
		panelReTec.add(rbn31_1);
		
		rbn32_1 = new JRadioButton("No");
		rbn32_1.setBounds(385, 203, 50, 23);
		panelReTec.add(rbn32_1);
		
		rbn33_1 = new JRadioButton("No");
		rbn33_1.setBounds(385, 239, 50, 23);
		panelReTec.add(rbn33_1);
		
		rbn34_1 = new JRadioButton("No");
		rbn34_1.setBounds(385, 275, 50, 23);
		panelReTec.add(rbn34_1);
		
		rbn35_1 = new JRadioButton("No");
		rbn35_1.setBounds(385, 312, 50, 23);
		panelReTec.add(rbn35_1);
		
		rbn36_1 = new JRadioButton("Si");
		rbn36_1.setBounds(313, 386, 50, 23);
		panelReTec.add(rbn36_1);
		
		rbn37_1 = new JRadioButton("No");
		rbn37_1.setBounds(385, 345, 50, 23);
		panelReTec.add(rbn37_1);
		
		rbn38 = new JRadioButton("Si");
		rbn38.setBounds(313, 345, 50, 23);
		panelReTec.add(rbn38);
		
		rbn39 = new JRadioButton("No");
		rbn39.setBounds(385, 386, 50, 23);
		panelReTec.add(rbn39);
		
		JPanel panelReUniversitario = new JPanel();
		panelReUniversitario.setBounds(10, 203, 460, 434);
		contentPane.add(panelReUniversitario);
		panelReUniversitario.setLayout(null);
		panelReUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requerimientos Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReUniversitario.setBackground(SystemColor.window);
		
		rbn1_1 = new JRadioButton("Si");
		rbn1_1.setBounds(313, 52, 50, 23);
		panelReUniversitario.add(rbn1_1);
		
		rbn2_1 = new JRadioButton("No");
		rbn2_1.setBounds(385, 52, 50, 23);
		panelReUniversitario.add(rbn2_1);
		
		rbn3_1 = new JRadioButton("Si");
		rbn3_1.setBounds(313, 89, 50, 23);
		panelReUniversitario.add(rbn3_1);
		
		rbn4_1 = new JRadioButton("No");
		rbn4_1.setBounds(385, 89, 50, 23);
		panelReUniversitario.add(rbn4_1);
		
		rbn5_1 = new JRadioButton("Si");
		rbn5_1.setBounds(313, 127, 50, 23);
		panelReUniversitario.add(rbn5_1);
		
		rbn6_1 = new JRadioButton("Si");
		rbn6_1.setBounds(313, 165, 50, 23);
		panelReUniversitario.add(rbn6_1);
		
		rbn7_1 = new JRadioButton("Si");
		rbn7_1.setBounds(313, 203, 50, 23);
		panelReUniversitario.add(rbn7_1);
		
		rbn8_1 = new JRadioButton("Si");
		rbn8_1.setBounds(313, 239, 50, 23);
		panelReUniversitario.add(rbn8_1);
		
		rbn9_1 = new JRadioButton("Si");
		rbn9_1.setBounds(313, 275, 50, 23);
		panelReUniversitario.add(rbn9_1);
		
		rbn10_1 = new JRadioButton("Si");
		rbn10_1.setBounds(313, 312, 50, 23);
		panelReUniversitario.add(rbn10_1);
		
		rbn11_1 = new JRadioButton("No");
		rbn11_1.setBounds(385, 127, 50, 23);
		panelReUniversitario.add(rbn11_1);
		
		rbn12_1 = new JRadioButton("No");
		rbn12_1.setBounds(385, 165, 50, 23);
		panelReUniversitario.add(rbn12_1);
		
		rbn13_1 = new JRadioButton("No");
		rbn13_1.setBounds(385, 203, 50, 23);
		panelReUniversitario.add(rbn13_1);
		
		rbn14_1 = new JRadioButton("No");
		rbn14_1.setBounds(385, 239, 50, 23);
		panelReUniversitario.add(rbn14_1);
		
		rbn15_1 = new JRadioButton("No");
		rbn15_1.setBounds(385, 275, 50, 23);
		panelReUniversitario.add(rbn15_1);
		
		rbn16_1 = new JRadioButton("No");
		rbn16_1.setBounds(385, 312, 50, 23);
		panelReUniversitario.add(rbn16_1);
		
		JLabel lblhablaOtro = new JLabel("1. \u00BFHabla otro idioma?");
		lblhablaOtro.setBounds(22, 56, 194, 14);
		panelReUniversitario.add(lblhablaOtro);
		
		JLabel lblvehculoPropio = new JLabel("2. \u00BFVeh\u00EDculo Propio?");
		lblvehculoPropio.setBounds(22, 93, 156, 14);
		panelReUniversitario.add(lblvehculoPropio);
		
		JLabel lbldisponibilidadDe = new JLabel("3. \u00BFDisponibilidad de Horario?");
		lbldisponibilidadDe.setBounds(22, 131, 194, 14);
		panelReUniversitario.add(lbldisponibilidadDe);
		
		JLabel lbldisposicinDe = new JLabel("4. \u00BFDisposici\u00F3n de Viaje?");
		lbldisposicinDe.setBounds(22, 169, 156, 14);
		panelReUniversitario.add(lbldisposicinDe);
		
		JLabel lbldispuestoA = new JLabel("5. \u00BFDispuesto a Mudarse?");
		lbldispuestoA.setBounds(22, 207, 178, 14);
		panelReUniversitario.add(lbldispuestoA);
		
		JLabel lblpiensaAmpliar = new JLabel("6. \u00BFPiensa ampliar sus conocimientos?");
		lblpiensaAmpliar.setBounds(22, 243, 274, 14);
		panelReUniversitario.add(lblpiensaAmpliar);
		
		JLabel lbltrabajaraLos = new JLabel("7. \u00BFTrabajar\u00EDa los fines de semana?");
		lbltrabajaraLos.setBounds(22, 279, 245, 14);
		panelReUniversitario.add(lbltrabajaraLos);
		
		JLabel lblposeeExperiencia = new JLabel("8. \u00BFPosee Experiencia de trabajos anteriores?");
		lblposeeExperiencia.setBounds(22, 316, 263, 14);
		panelReUniversitario.add(lblposeeExperiencia);
		
		JLabel lblpuedeRealizar = new JLabel("9. \u00BFPuede realizar m\u00E1s de una tarea a la vez?");
		lblpuedeRealizar.setBounds(22, 349, 274, 14);
		panelReUniversitario.add(lblpuedeRealizar);
		
		rbn17_1 = new JRadioButton("No");
		rbn17_1.setBounds(385, 345, 50, 23);
		panelReUniversitario.add(rbn17_1);
		
		rbn18_1 = new JRadioButton("Si");
		rbn18_1.setBounds(313, 345, 50, 23);
		panelReUniversitario.add(rbn18_1);
		
		JLabel lblTrabajaEquipo = new JLabel("10. \u00BFTrabajas bien en equipo?");
		lblTrabajaEquipo.setBounds(22, 390, 194, 14);
		panelReUniversitario.add(lblTrabajaEquipo);
		
		rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setBounds(315, 386, 50, 23);
		panelReUniversitario.add(rdbtnNewRadioButton);
		
		rbn19_1 = new JRadioButton("No");
		rbn19_1.setBounds(385, 386, 50, 23);
		panelReUniversitario.add(rbn19_1);
		
		
		
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
		GrupoRespuestas1.add(RBN1N);
		GrupoRespuestas2.add(RBN2N);
		GrupoRespuestas3.add(RBN3N);
		GrupoRespuestas4.add(RBN4N);
		GrupoRespuestas5.add(RBN5N);
		GrupoRespuestas6.add(RBN6N);
		GrupoRespuestas7.add(RBN7N);
		GrupoRespuestas8.add(RBN8N);
		GrupoRespuestas9.add(RBN9N);
		GrupoRespuestas10.add(RBN10N);

	}
}