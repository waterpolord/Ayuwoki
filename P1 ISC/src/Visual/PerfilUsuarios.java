package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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

import Logic.Empleo;
import Logic.Obrero;
import Logic.Persona;
import Logic.Principal;
import Logic.Tecnico;
import Logic.Universitario;
import Logic.Vacante;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PerfilUsuarios extends JFrame {

	private JPanel contentPane;
	private JPanel panelReUniversitario;
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
	private JRadioButton rdbtnTodos;
	private JList Lista;
	private DefaultListModel<String> modelo1;
	private JRadioButton RBN10;
	private JRadioButton RBN30;
	private JRadioButton RBN50;
	private ButtonGroup grupo;
	private JButton BTNGuardar;
	private ArrayList<Vacante> solicitudesEnTabla = new ArrayList();
	

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
				
				
				if(persona.getSoli() == 0) {
					setgrupo(rbn1_1,rbn3_1,rbn5_1,rbn6_1,rbn7_1,rbn8_1,rbn9_1,rbn10_1,rbn18_1,rdbtnNewRadioButton,
							rbn2_1,
							rbn4_1,rbn11_1,rbn12_1,rbn13_1,rbn14_1,rbn15_1,rbn16_1,rbn17_1,rbn19_1);
					setEnter(BTNGuardar);
					
					}
				else {
					
					Boolean b = true,valores[] = persona.getSolicitud().getHab();
					int ind = persona.getSolicitud().getMonto();
					// Primera pregunta
					if(valores[0]) {
						fijarOpciones(rbn1_1);
						quitarOpciones(rbn2_1);
					}
					else{
						fijarOpciones(rbn2_1);
						quitarOpciones(rbn1_1);
					}
					
					// Segunda pregunta
					if(valores[1]) {
						
						fijarOpciones(rbn3_1);
						quitarOpciones(rbn4_1);
					}
					else {
						fijarOpciones(rbn4_1);
						quitarOpciones(rbn3_1);
					}
					
					// Tercera pregunta
					if(valores[2]) {
						rbn5_1.setSelected(b);
						fijarOpciones(rbn5_1);
						quitarOpciones(rbn11_1);
					}
					else {
						fijarOpciones(rbn11_1);
						quitarOpciones(rbn5_1);
					}
					
					// Cuarta pregunta
					if(valores[3]) {
					
						fijarOpciones(rbn6_1);
						quitarOpciones(rbn12_1);
						
					}
					else {
						fijarOpciones(rbn12_1);
						quitarOpciones(rbn6_1);
					}
					
					// Quinta pregunta
					if(valores[4]) {
						
						fijarOpciones(rbn7_1);
						quitarOpciones(rbn13_1);
					}
					else {
						fijarOpciones(rbn13_1);
						quitarOpciones(rbn7_1);
					}
					
					// Sexta pregunta
					if(valores[5]) {
						fijarOpciones(rbn8_1);
						quitarOpciones(rbn14_1);
					}
					else {
						fijarOpciones(rbn14_1);
						quitarOpciones(rbn8_1);
					}
					
					
					// Septima pregunta
					if(valores[6]) {
					
						fijarOpciones(rbn9_1);
						quitarOpciones(rbn15_1);
					}
					else{
						fijarOpciones(rbn15_1);
						quitarOpciones(rbn9_1);
					}
					
					// Octava pregunta
					if(valores[7] ) {
						fijarOpciones(rbn10_1);
						quitarOpciones(rbn16_1);
					}
					else {
						fijarOpciones(rbn16_1);
						quitarOpciones(rbn10_1);
					}
					
					// Novena pregunta
					if(valores[8]) {
						
						fijarOpciones(rbn18_1);
						quitarOpciones(rbn17_1);
					}
					else  {
						fijarOpciones(rbn17_1);
						quitarOpciones(rbn18_1);
					}
				
					// Decima pregunta
					if(valores[9] ) {
						
						fijarOpciones(rdbtnNewRadioButton);
						quitarOpciones(rbn19_1);
						
					}
					else {
						fijarOpciones(rbn19_1);
						quitarOpciones(rdbtnNewRadioButton);
					}
					if(ind == 10) {
						fijarOpciones(RBN10);
						quitarOpciones(RBN30);
						quitarOpciones(RBN50);
					}
					if(ind == 30) {
						fijarOpciones(RBN30);
						quitarOpciones(RBN10);
						quitarOpciones(RBN50);
					}
					if(ind == 50) {
						fijarOpciones(RBN50);
						quitarOpciones(RBN10);
						quitarOpciones(RBN30);
					}
					BTNGuardar.setVisible(false);
					
					}
					
				
				
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
		Dimension Tam = getToolkit().getScreenSize();
		Tam = this.getToolkit().getScreenSize();
		this.setBounds(100, 100, (int)Tam.getWidth(),(int)Tam.height);
		this.setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		modelo1 = new DefaultListModel();
		
		Lista = new JList();
		Lista.setVisible(false);
		Lista.setModel(modelo1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Buscar Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(95, 158, 160));
		
		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(10, 44, 46, 14);
		panel.add(label);
		
		TXTNombre = new JTextField();
		TXTNombre.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyReleased(KeyEvent e) {
				if(TXTNombre.getText().length() > 0) {
					int selec = 0;
					if(rbtUni.isSelected())
						selec = 1;
					if(rbtTec.isSelected())
						selec = 2;
					if(rbtObre.isSelected())
						selec = 3;
					ArrayList<String> nom = new ArrayList<String>();
					nom = Principal.getInstance().RetornarNombres(TXTNombre.getText(),selec);
					if(nom.size() > -1) {
						Lista.setVisible(true);
					}
					if(nom.isEmpty()) {
						nom.add("No Se Encuentra Ningun Usuario");
					}
					modelo1.clear();
					for(int i=0;i<nom.size();i++) {
						modelo1.add(i,nom.get(i));
					}
				}
				else {
					Lista.setVisible(false);
				}
				
			}
		});
		TXTNombre.setColumns(10);
		TXTNombre.setBackground(SystemColor.inactiveCaptionBorder);
		TXTNombre.setBounds(68, 40, 253, 25);
		panel.add(TXTNombre);
		
		
			
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
		comboBox.setBackground(new Color(95, 158, 160));
		
	    BTNGuardar = new JButton("Guardar");
		BTNGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean valores[] = new Boolean[10];
				int num = 0,monto = 10;
				if(RBN10.isSelected()) {
					monto = 10;
				}
				if(RBN30.isSelected()) {
					monto = 30;
				}
				if(RBN50.isSelected()) {
					monto = 50;
				}
				// Primera pregunta
				if(GrupoRespuestas1.getSelection() == rbn1_1.getModel()) {
					valores[0] = true;
					
				}
				else if(GrupoRespuestas1.getSelection() == rbn2_1.getModel()) {
					valores[0] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 1 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Segunda pregunta
				if(GrupoRespuestas2.getSelection() == rbn3_1.getModel()) {
					valores[1] = true;
				}
				else if(GrupoRespuestas2.getSelection() == rbn4_1.getModel()) {
					valores[1] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 2 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Tercera pregunta
				if(GrupoRespuestas3.getSelection() == rbn5_1.getModel()) {
					valores[2] = true;
				}
				else if(GrupoRespuestas3.getSelection() == rbn11_1.getModel()) {
					valores[2] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 3 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Cuarta pregunta
				if(GrupoRespuestas4.getSelection() == rbn6_1.getModel()) {
					valores[3] = true;
				}
				else if(GrupoRespuestas4.getSelection() == rbn12_1.getModel()) {
					valores[3] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 4 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Quinta pregunta
				if(GrupoRespuestas5.getSelection() == rbn7_1.getModel()) {
					valores[4] = true;
				}
				else if(GrupoRespuestas5.getSelection() == rbn13_1.getModel()) {
					valores[4] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 5 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Sexta pregunta
				if(GrupoRespuestas6.getSelection() == rbn8_1.getModel()) {
					valores[5] = true;
				}
				else if(GrupoRespuestas6.getSelection() == rbn14_1.getModel()) {
					valores[5] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 6 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Septima pregunta
				if(GrupoRespuestas7.getSelection() == rbn9_1.getModel()) {
					valores[6] = true;
				}
				else if(GrupoRespuestas7.getSelection() == rbn15_1.getModel()) {
					valores[6] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 7 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Octava pregunta
				if(GrupoRespuestas8.getSelection() == rbn10_1.getModel()) {
					valores[7] = true;
				}
				else if(GrupoRespuestas8.getSelection() == rbn16_1.getModel()) {
					valores[7] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 8 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Novena pregunta
				if(GrupoRespuestas9.getSelection() == rbn18_1.getModel()) {
					valores[8] = true;
				}
				else if(GrupoRespuestas9.getSelection() == rbn17_1.getModel()) {
					valores[8] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 9 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				// Decima pregunta
				if(GrupoRespuestas10.getSelection() == rdbtnNewRadioButton.getModel()) {
					valores[9] = true;
				}
				else if(GrupoRespuestas10.getSelection() == rbn19_1.getModel()) {
					valores[9] = false;
				}
				else {
					JOptionPane.showMessageDialog(null,"La pregunta 10 esta vacia","Llena Todos Los Campos",0);
					num = 1;
				}
				if(num == 0) {
					Empleo nuevo = new Empleo(valores,monto);
					persona.setSolicitud(nuevo);
					try {
						Principal.getInstance().setTEmpleos(nuevo);
					} catch (FileNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					for(Vacante vac:Principal.getInstance().getTVacantes()) {
						if(persona instanceof Universitario ) {
							if(vac.getTipoPersonal().equalsIgnoreCase(((Universitario) persona).getCarrera())) {
								if(vac.aplicaHabilidades(persona.getSolicitud())) {
									if(vac.getEstado()) {
										vac.solicitar(persona);
									}
									else {
										int ind = vac.reemplazoAplica(persona.getSolicitud());
										if(ind != -1) {
											vac.Reemplazo( persona , ind);
										}
									}
								}
							}
						}
						if(persona instanceof Tecnico ) {
							if(vac.getTipoPersonal().equalsIgnoreCase(((Tecnico) persona).getEspecialidad())) {
								if(vac.aplicaHabilidades(persona.getSolicitud())) {
									if(vac.getEstado()) {
										vac.solicitar(persona);
									}
									else {
										int ind = vac.reemplazoAplica(persona.getSolicitud());
										if(ind != -1) {
											vac.Reemplazo( persona , ind);
										}
									}
								}
							}
						}
						if(persona instanceof Obrero ) {
							if(vac.getTipoPersonal().equalsIgnoreCase(((Obrero) persona).getHabilidades().get(0))) {
								if(vac.aplicaHabilidades(persona.getSolicitud())) {
									if(vac.getEstado()) {
										vac.solicitar(persona);
									}
									else {
										int ind = vac.reemplazoAplica(persona.getSolicitud());
										if(ind != -1) {
											vac.Reemplazo( persona , ind);
										}
									}
								}
							}
						}
					}
					try {
						Principal.getInstance().dataSalida();
						JOptionPane.showMessageDialog(null,"La solicitud se guardo con exito","Confirmado",1);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,"No se guardo la solicitud","Advertencia",0);
					}
					
					
				}
			}
		});
		BTNGuardar.setBackground(SystemColor.activeCaption);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(persona.getSoli() == 1) {
					setPreguntas(persona.getSolicitud().getHab(),persona.getSolicitud().getMonto());
				}
				JOptionPane.showMessageDialog(null,"Se cancelo con exito","Confirmado",1);
				
				
			}
		});
		button_2.setBackground(SystemColor.activeCaption);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Monto a Ganar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(32, 178, 170));
		
		RBN10 = new JRadioButton("Entre 10,000 y 30,000");
		RBN10.setBounds(6, 31, 161, 23);
		RBN10.setSelected(true);
		panel_1.add(RBN10);
		
		RBN30 = new JRadioButton("Entre 30,000 y 50,000");
		RBN30.setBounds(196, 31, 161, 23);
		panel_1.add(RBN30);
		
		 RBN50 = new JRadioButton("50,000 o M\u00E1s");
		RBN50.setBounds(105, 76, 161, 23);
		panel_1.add(RBN50);
		
		grupo = new ButtonGroup();
		grupo.add(RBN10);
		grupo.add(RBN30);
		grupo.add(RBN50);
		
		if(persona instanceof Universitario ) {
			Borde = "Requerimientos";
		}
		if(persona instanceof Obrero ) {
			Borde = "Requerimientos Obrero";
		}
		if(persona instanceof Tecnico ) {
			Borde = "Requerimientos Tecnico";
		}
		
	    panelReUniversitario = new JPanel();
		panelReUniversitario.setLayout(null);
		panelReUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), Borde, TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelReUniversitario.setBackground(new Color(95, 158, 160));
		
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
		panel_2.setBackground(new Color(32, 178, 170));
		
		rbtUni = new JRadioButton("Universitario");
		rbtUni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbtTec.setSelected(false);
				rbtObre.setSelected(false);
				panelReUniversitario.setVisible(true);
				
		}});
		
		rbtUni.setSelected(false);
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
		rbtTec.setBounds(19, 43, 109, 23);
		panel_2.add(rbtTec);
		
		rbtObre = new JRadioButton("Obrero");
		rbtTec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rbtUni.setSelected(false);
				rbtTec.setSelected(false);
				panelReUniversitario.setVisible(true);
				
		}});
		rbtObre.setSelected(false);
		rbtObre.setBounds(200, 17, 109, 23);
		panel_2.add(rbtObre);
		
	    rdbtnTodos = new JRadioButton("Todos");
		rdbtnTodos.setSelected(true);
		rdbtnTodos.setBounds(200, 43, 109, 23);
		panel_2.add(rdbtnTodos);
		
		ButtonGroup Busc = new ButtonGroup();
		
		Busc.add(rbtObre);
		Busc.add(rbtTec);
		Busc.add(rbtUni);
		Busc.add(rdbtnTodos);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(166)
							.addComponent(panelReUniversitario, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(Lista, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(868)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(38)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(BTNGuardar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Lista, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BTNGuardar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(116))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(panelReUniversitario, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
		if(persona.getSoli() == 1) {
			setPreguntas(persona.getSolicitud().getHab(),persona.getSolicitud().getMonto());}
		
		
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
	
	public void setPreguntas(Boolean[] valores,int ind) {
		Boolean b = true;
		// Primera pregunta
		if(valores[0]) {
			rbn1_1.setSelected(true);
		}
		else{
			rbn2_1.setSelected(true);
		}
		
		// Segunda pregunta
		if(valores[1]) {
			rbn3_1.setSelected(b);
		}
		else {
			rbn4_1.setSelected(b);
		}
		
		// Tercera pregunta
		if(valores[2]) {
			rbn5_1.setSelected(b);
		}
		else {
			rbn11_1.setSelected(b);
		}
		
		// Cuarta pregunta
		if(valores[3]) {
			rbn6_1.setSelected(b);
			
		}
		else {
			 rbn12_1.setSelected(b);
		}
		
		// Quinta pregunta
		if(valores[4]) {
			rbn7_1.setSelected(b);
		}
		else {
			  rbn13_1.setSelected(b);
		}
		
		// Sexta pregunta
		if(valores[5]) {
			rbn8_1.setSelected(b);
		}
		else {
			rbn14_1.setSelected(b);
		}
		
		
		// Septima pregunta
		if(valores[6]) {
			rbn9_1.setSelected(b);
		}
		else{
			rbn15_1.setSelected(b);
		}
		
		// Octava pregunta
		if(valores[7] ) {
			rbn10_1.setSelected(b);
		}
		else {
			rbn16_1.setSelected(b);
		}
		
		// Novena pregunta
		if(valores[8]) {
			rbn18_1.setSelected(b);
		}
		else  {
			rbn17_1.setSelected(b);
		}
	
		// Decima pregunta
		if(valores[9] ) {
			rdbtnNewRadioButton.setSelected(b);
			
		}
		else {
			rbn19_1.setSelected(b);
		}
		if(ind == 10) {
			RBN10.setSelected(b);
		}
		if(ind == 30) {
			RBN30.setSelected(b);
		}
		if(ind == 50) {
			RBN50.setSelected(b);
		}
				
	}
	
	public void fijarOpciones( JRadioButton RBN1S ) {
		Boolean b = false;
		RBN1S.setEnabled(b);
		
	}
	public void quitarOpciones( JRadioButton RBN1S) {
		Boolean b = false;
		RBN1S.setVisible(b);

	}
	
	public void setEnter(JButton BTN) {
 		getRootPane().setDefaultButton(BTN);
 	}
}