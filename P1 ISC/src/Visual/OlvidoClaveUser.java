package Visual;

import Interfaces.DAOExeption;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.Persona;
import Logic.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OlvidoClaveUser extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField pass;
	private JPasswordField confirm;


	
	/**
	 * Create the dialog.
	 */
	public OlvidoClaveUser(Persona user) {
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNuevaContrasea = new JLabel("Nueva Contrase\u00F1a");
			lblNuevaContrasea.setBounds(143, 49, 103, 14);
			contentPanel.add(lblNuevaContrasea);
		}
		{
			pass = new JPasswordField();
			pass.setBounds(143, 74, 103, 20);
			contentPanel.add(pass);
		}
		{
			JLabel lblConfirmar = new JLabel("        Confirmar");
			lblConfirmar.setBounds(143, 127, 103, 14);
			contentPanel.add(lblConfirmar);
		}
		{
			confirm = new JPasswordField();
			confirm.setBounds(143, 152, 103, 20);
			contentPanel.add(confirm);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Confirmar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String Pass = new String(pass.getPassword()),
								PassC = new String(confirm.getPassword());
						if(Pass.length() > 3 && Pass.equalsIgnoreCase(PassC)) {
							user.setClave(Pass);
							try {
								user.Modificar(user);
								JOptionPane.showMessageDialog(null,"Contrase�a guardada con exito","Guardado",1);
								dispose();
							} catch (DAOExeption ex) { 
                                                        Logger.getLogger(OlvidoClaveUser.class.getName()).log(Level.SEVERE, null, ex);
                                                    } 
						}
						else {
							JOptionPane.showMessageDialog(null,"Asegurate de llenar todos los campos y que sean iguales","Advertencia",0);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
