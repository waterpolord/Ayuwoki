package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logic.Obrero;
import Logic.Persona;
import Logic.Principal;
import Logic.Tecnico;
import Logic.Universitario;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PerfilUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField TXTNombre;
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
	private JRadioButton rbn38;
	private JRadioButton rbn39;
	private JRadioButton rdbtnNewRadioButton;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	private JLabel lb7;
	private JLabel lb8;
	private JLabel lb9;
	private JLabel lb10;
	private String Borde;
	private JRadioButton rbtUni;
	private JRadioButton rbtTec;
	private JRadioButton rbtObre;
	

	

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
				setgrupo(rbn1_1,rbn3_1,rbn5_1,rbn6_1,rbn7_1,rbn8_1,rbn9_1,rbn10_1,rbn18_1,rdbtnNewRadioButton,
						rbn2_1,
						rbn4_1,rbn11_1,rbn12_1,rbn13_1,rbn14_1,rbn15_1,rbn16_1,rbn17_1,rbn19_1);
				
				if(persona instanceof Universitario) {
					lb1.setText("1.¿Habla otro idioma?");
					lb2.setText("2.¿Vehiculo Propio?");
					lb3.setText("3.¿Disponibilidad de Horario?\r\n");
					lb4.setText("4.¿Disposicion de Viaje?");
					lb5.setText("5.¿Dispuesto a Mudarse?");
					lb6.setText("6.¿Piensa ampliar sus estudios de alguna manera?");
					lb7.setText("7.¿Trabajaria los fines de semana?");
					lb8.setText("8.¿Posee Experiencia de trabajos anteriore?");
					lb9.setText("9.¿Puede realizar mas de una tarea a la vez?");
					lb10.setText("10.¿Trabajas bien en equipo?");
					
				}
				if(persona instanceof Obrero ) {
					lb1.setText("1.¿Ha realizado cursos de formación?");
					lb2.setText("2.¿Vehiculo Propio?");
					lb3.setText("3.¿Disponibilidad de Horario?");
					lb4.setText("4.¿Tienes disponibilidad para viajar a nivel nacional?");
					lb5.setText("5.¿Sabe manejar Numeros?");
					lb6.setText("6.¿Piensa estudiar alguna carreara o tecnico en el futuro?");
					lb7.setText("7.¿Trabajaria los fines de semana?");
					lb8.setText("8.¿Posee Experiencia de trabajos anteriores?");
					lb9.setText("9.¿Puede realizar mas de una tarea a la vez?");
					lb10.setText("10.¿Trabajas bien en equipo?");
					
				}
				if(persona instanceof Tecnico) {
					lb1.setText("1.¿Habla otro idioma?");
					lb2.setText("2.¿Vehiculo Propio?");
					lb3.setText("3.¿Disponibilidad de Horario?");
					lb4.setText("4.¿Disposicion de Viaje?");
					lb5.setText("5.¿Dispuesto a Mudarse?");
					lb6.setText("6.¿Piensa ampliar sus estudios de alguna manera?");
					lb7.setText("7.¿Trabajaria los fines de semana?");
					lb8.setText("8.¿Posee Experiencia de trabajos anteriore?");
					lb9.setText("9.¿Puede realizar mas de una tarea a la vez?");
					lb10.setText("10.¿Trabajas bien en equipo?");
					
				}
			}
		});
		setTitle("Perfil Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tam = getToolkit().getScreenSize();
		setBounds(250,30,889,687);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 25, 491, 81);
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
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		button.setBounds(367, 40, 89, 25);
		panel.add(button);
		
		
			
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
		panel_1.setBounds(480, 345, 363, 106);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnEntreA = new JRadioButton("Entre 10,000 y 30,000");
		rdbtnEntreA.setBounds(6, 31, 161, 23);
		panel_1.add(rdbtnEntreA);
		
		JRadioButton rdbtnEntreY = new JRadioButton("Entre 30,000 y 50,000");
		rdbtnEntreY.setBounds(196, 31, 161, 23);
		panel_1.add(rdbtnEntreY);
		
		JRadioButton radioButton_55 = new JRadioButton("50,000 o M\u00E1s");
		radioButton_55.setBounds(105, 76, 161, 23);
		panel_1.add(radioButton_55);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnEntreA);
		grupo.add(rdbtnEntreY);
		grupo.add(radioButton_55);
		
		if(persona instanceof Universitario ) {
			Borde = "Requerimientos Universitario";
		}
		if(persona instanceof Obrero ) {
			Borde = "Requerimientos Obrero";
		}
		if(persona instanceof Tecnico ) {
			Borde = "Requerimientos Tecnico";
		}
		
		JPanel panelReUniversitario = new JPanel();
		panelReUniversitario.setBounds(10, 203, 460, 434);
		contentPane.add(panelReUniversitario);
		panelReUniversitario.setLayout(null);
		panelReUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), Borde, TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		lb1 = new JLabel();
		lb1.setBounds(22, 56, 194, 14);
		panelReUniversitario.add(lb1);
		
		lb2 = new JLabel();
		lb2.setBounds(22, 93, 156, 14);
		panelReUniversitario.add(lb2);
		
		lb3 = new JLabel();
		lb3.setBounds(22, 131, 194, 14);
		panelReUniversitario.add(lb3);
		
		lb4 = new JLabel();
		lb4.setBounds(22, 169, 156, 14);
		panelReUniversitario.add(lb4);
		
		lb5 = new JLabel();
		lb5.setBounds(22, 207, 178, 14);
		panelReUniversitario.add(lb5);
		
		lb6 = new JLabel();
		lb6.setBounds(22, 243, 274, 14);
		panelReUniversitario.add(lb6);
		
		lb7 = new JLabel();
		lb7.setBounds(22, 279, 245, 14);
		panelReUniversitario.add(lb7);
		
		lb8 = new JLabel();
		lb8.setBounds(22, 316, 263, 14);
		panelReUniversitario.add(lb8);
		
		lb9 = new JLabel();
		lb9.setBounds(22, 349, 274, 14);
		panelReUniversitario.add(lb9);
		
		rbn17_1 = new JRadioButton("No");
		rbn17_1.setBounds(385, 345, 50, 23);
		panelReUniversitario.add(rbn17_1);
		
		rbn18_1 = new JRadioButton("Si");
		rbn18_1.setBounds(313, 345, 50, 23);
		panelReUniversitario.add(rbn18_1);
		
		lb10 = new JLabel();
		lb10.setBounds(22, 390, 194, 14);
		panelReUniversitario.add(lb10);
		
		rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setBounds(315, 386, 50, 23);
		panelReUniversitario.add(rdbtnNewRadioButton);
		
		rbn19_1 = new JRadioButton("No");
		rbn19_1.setBounds(385, 386, 50, 23);
		panelReUniversitario.add(rbn19_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(10, 109, 491, 47);
		contentPane.add(panel_2);
		
		rbtUni = new JRadioButton("Universitario");
		rbtUni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbtTec.setSelected(false);
				rbtObre.setSelected(false);
				panelReUniversitario.setVisible(true);
				
		}});
		
		rbtUni.setSelected(true);
		rbtUni.setBounds(19, 17, 109, 23);
		panel_2.add(rbtUni);
		
		rbtTec = new JRadioButton("Tecnico");
		rbtTec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbtUni.setSelected(false);
				rbtObre.setSelected(false);
				panelReUniversitario.setVisible(true);
				
		}});
		
		rbtTec.setSelected(false);
		rbtTec.setBounds(200, 17, 109, 23);
		panel_2.add(rbtTec);
		
		rbtObre = new JRadioButton("Obrero");
		rbtTec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbtUni.setSelected(false);
				rbtTec.setSelected(false);
				panelReUniversitario.setVisible(true);
				
		}});
		rbtObre.setSelected(false);
		rbtObre.setBounds(376, 17, 109, 23);
		panel_2.add(rbtObre);
		
		
		
		
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