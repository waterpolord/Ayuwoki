package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import Logic.Persona;
import Logic.Principal;
import Logic.Vacante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.acl.Group;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class ConfiguracionUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JPasswordField pass;
	private JPasswordField passConfirm;
	private JPanel panelEstado;
	private JPanel panelinfo;
	private JRadioButton rdbtnSi = new JRadioButton("Si");
	private JPanel panelEstadistica;



	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ConfiguracionUsuario(Persona user) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				panelEstadistica.setVisible(false);
				panelEstado.setVisible(false);
				panelinfo.setVisible(false);
			}
		});
		setBounds(100, 100, 706, 491);
		setTitle("Modificacion de cuenta");
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		//setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBounds(0, 28, 160, 452);
		panel.setBackground(SystemColor.activeCaption);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnCuenta = new JButton("Informaci\u00F3n");
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEstado.setVisible(false);
				panelinfo.setVisible(true);
				panelEstadistica.setVisible(false);
			}
		});
		btnCuenta.setBounds(10, 11, 129, 34);
		panel.add(btnCuenta);
		
		JButton btnEstado = new JButton("Estado");
		btnEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.getEstado() == false) {
					panelEstado.setVisible(true);
					panelinfo.setVisible(false);
					panelEstadistica.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Aun no tiene trabajo", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
					
				}
			}
			
		});
		
		btnEstado.setBounds(10, 92, 129, 46);
		panel.add(btnEstado);
		
		JButton btnEstadisticas = new JButton("Estadisticas");
		btnEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEstadistica.setVisible(true);
				panelEstado.setVisible(false);
				panelinfo.setVisible(false);
				setAnalisis(user);
			}
			
		});
		btnEstadisticas.setBounds(10, 162, 129, 39);
		panel.add(btnEstadisticas);
		
		panelinfo = new JPanel();
		panelinfo.setBounds(235, 28, 395, 250);
		panelinfo.setBackground(new Color(119, 136, 153));
		contentPanel.add(panelinfo);
		panelinfo.setLayout(null);
		
		JLabel label = new JLabel(user.getCorreo());
		label.setForeground(Color.WHITE);
		label.setBounds(23, 27, 122, 20);
		panelinfo.add(label);
		
		txtNombre = new JTextField(user.getNombre());
		txtNombre.setEditable(false);
		txtNombre.setBounds(23, 67, 122, 20);
		panelinfo.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField(user.getPrimerApellido());
		txtApellido.setEditable(false);
		txtApellido.setBounds(188, 67, 116, 20);
		panelinfo.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblCambiarContrase = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrase.setForeground(Color.WHITE);
		lblCambiarContrase.setBounds(23, 108, 122, 14);
		panelinfo.add(lblCambiarContrase);
		
		JLabel lblConfirmarContrase = new JLabel("Confirmar Contrase\u00F1a");
		lblConfirmarContrase.setForeground(Color.WHITE);
		lblConfirmarContrase.setBounds(188, 108, 154, 14);
		panelinfo.add(lblConfirmarContrase);
		
		pass = new JPasswordField();
		pass.setBounds(23, 133, 122, 20);
		panelinfo.add(pass);
		
		passConfirm = new JPasswordField();
		passConfirm.setBounds(188, 133, 125, 20);
		panelinfo.add(passConfirm);
		
		JButton btnAplicarCambios = new JButton("Aplicar Cambios");
		btnAplicarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pass = new String(pass.getPassword()),PassC = new String(passConfirm.getPassword());
				if(txtApellido.getText().length() > 1 && txtNombre.getText().length() > 1 && Pass.equals(PassC)) {
					user.setPrimerNombre(txtNombre.getText());
					user.setPrimerApellido(txtApellido.getText());
					if(Pass.length() > 3 && PassC.length() > 3) {
						user.setClave(Pass);
					}
					try {
						Principal.getInstance().dataSalida();
						JOptionPane.showMessageDialog(null,"Cambios Guardados","Modificaci�n aceptada",1);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Revisa los campos y las contrase�as","Advertencia",0);
				}
			}
		});
		btnAplicarCambios.setBounds(243, 204, 142, 23);
		panelinfo.add(btnAplicarCambios);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setEditable(true);
			}
		});
		button.setIcon(new ImageIcon(ConfiguracionUsuario.class.getResource("/Imgenes/Edit.png")));
		button.setBounds(145, 64, 33, 23);
		panelinfo.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtApellido.setEditable(true);
			}
		});
		button_1.setBounds(309, 66, 33, 23);
		panelinfo.add(button_1);
		
		panelEstado = new JPanel();
		panelEstado.setBounds(178, 47, 452, 235);
		panelEstado.setBackground(new Color(119, 136, 153));
		contentPanel.add(panelEstado);
		panelEstado.setLayout(null);
		
		JLabel label_1 = new JLabel("�Se encuentra desempleado?");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 11, 419, 57);
		panelEstado.add(label_1);
		rdbtnSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			
				
			
			}
		});
		
		
		rdbtnSi.setBounds(90, 110, 53, 23);
		panelEstado.add(rdbtnSi);
		

		JButton btnAplicarCambios_1 = new JButton("Aplicar Cambios");
		btnAplicarCambios_1.setBounds(255, 197, 161, 23);
		panelEstado.add(btnAplicarCambios_1);
		btnAplicarCambios_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if ( rdbtnSi.isSelected()) {
					for(Vacante aux :Principal.getInstance().getTVacantes()) {
						if(aux.getEstado()==false && aux.VacanteRepite(user.getCorreo())) {
						aux.setEstado(true);
						user.setEstado(true);
						try {
							Principal.getInstance().dataSalida();
							JOptionPane.showMessageDialog(null, "Cambios Guardados", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
						}
					}
				}
			}
	
				
		});
		
		panelEstadistica = new JPanel();
		panelEstadistica.setBackground(new Color(230, 230, 250));
		panelEstadistica.setBounds(166, 47, 542, 394);
		contentPanel.add(panelEstadistica);
		
		
	}
	
	public void setAnalisis(Persona user) {
		int ind = 0;
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
 		JFreeChart jf = ChartFactory.createBarChart3D("Estadisticas","Vacantes", "", ds,PlotOrientation.VERTICAL, 
 				true,true,true);
 		for(Vacante vac:Principal.getInstance().getTVacantes()) {
 			if(vac.vacanteEstadistica(user.getCorreo())) {
 				ind++;
 			}
 		}
 		ds.addValue(ind,"Tipos","Vacantes de empleo con mas de 80% de aceptaci�n ("+ind+")");
			ChartPanel f = new ChartPanel(jf);
			
 		panelEstadistica.removeAll();
 		panelEstadistica.add(f,BorderLayout.CENTER);
 		panelEstadistica.validate();
	}
		
}
