package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class ConfiguracionUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPanel panelEstado;
	private JPanel panelinfo;
	JRadioButton rdbtnSi = new JRadioButton("Si");
	JRadioButton rdbtnNo = new JRadioButton("No");
	ButtonGroup grupo = new ButtonGroup();



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
				grupo= new ButtonGroup();
				panelEstado.setVisible(false);
				panelinfo.setVisible(false);
			}
		});
		setBounds(100, 100, 706, 491);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		//setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBounds(0, 28, 160, 452);
		panel.setBackground(new Color(1, 50, 67));
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnCuenta = new JButton("Informaci\u00F3n");
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEstado.setVisible(true);
				panelinfo.setVisible(false);
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
				}else {
					JOptionPane.showMessageDialog(null, "Aun no tiene trabajo", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
					
				}
			}
			
		});
		
		btnEstado.setBounds(10, 92, 129, 46);
		panel.add(btnEstado);
		
		panelinfo = new JPanel();
		panelinfo.setBounds(235, 28, 395, 250);
		panelinfo.setBackground(new Color(1, 50, 67));
		contentPanel.add(panelinfo);
		panelinfo.setLayout(null);
		
		JLabel label = new JLabel(user.getCorreo());
		label.setForeground(Color.WHITE);
		label.setBounds(23, 27, 122, 20);
		panelinfo.add(label);
		
		textField = new JTextField(user.getNombre());
		textField.setBounds(23, 67, 122, 20);
		panelinfo.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(user.getApellido());
		textField_1.setBounds(188, 67, 116, 20);
		panelinfo.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCambiarContrase = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrase.setForeground(Color.WHITE);
		lblCambiarContrase.setBounds(23, 108, 122, 14);
		panelinfo.add(lblCambiarContrase);
		
		JLabel lblConfirmarContrase = new JLabel("Confirmar Contrase\u00F1a");
		lblConfirmarContrase.setForeground(Color.WHITE);
		lblConfirmarContrase.setBounds(188, 108, 154, 14);
		panelinfo.add(lblConfirmarContrase);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(23, 133, 122, 20);
		panelinfo.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(188, 133, 125, 20);
		panelinfo.add(passwordField_1);
		
		JButton btnAplicarCambios = new JButton("Aplicar Cambios");
		btnAplicarCambios.setBounds(243, 204, 142, 23);
		panelinfo.add(btnAplicarCambios);
		
		panelEstado = new JPanel();
		panelEstado.setBounds(178, 47, 452, 235);
		panelEstado.setBackground(new Color(1, 50, 67));
		contentPanel.add(panelEstado);
		panelEstado.setLayout(null);
		
		JLabel label_1 = new JLabel("Se encuentra desempleado?");
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
		
		
		rdbtnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		rdbtnNo.setBounds(255, 110, 53, 23);
		panelEstado.add(rdbtnNo);
		

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
		
		grupo.add(rdbtnSi);
		grupo.add(rdbtnNo);
	}
	
		
}
