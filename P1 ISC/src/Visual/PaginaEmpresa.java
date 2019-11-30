package Visual;

import java.awt.BorderLayout;
import Logic.*;

import java.awt.FlowLayout;

import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class PaginaEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTitulo;
	private JTextArea textArea;
	private JButton button;
	private JLabel label;
	private JButton btnInfo;
	private Boolean guard = false;
	

	public PaginaEmpresa(Empresa empresa) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(119, 136, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblTitulo = new JLabel(empresa.getNombre());
			lblTitulo.setBounds(0, 0, 450, 20);
			lblTitulo.setBackground(new Color(32, 178, 170));
			lblTitulo.setForeground(Color.BLACK);
			lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
			
			contentPanel.add(lblTitulo);
		}
		{
			JButton btnNewButton = new JButton("\u2190");
			btnNewButton.setBounds(0, -1, 68, 23);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			contentPanel.add(btnNewButton);
		}
		
		JLabel lblInformacion = new JLabel("Informaci\u00F3n");
		lblInformacion.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblInformacion.setBounds(169, 31, 108, 14);
		contentPanel.add(lblInformacion);
		
		JLabel lblNewLabel = new JLabel(empresa.getCorreo());
		lblNewLabel.setBounds(10, 63, 139, 14);
		contentPanel.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(27, 88, 371, 108);
		contentPanel.add(textArea);
		
		btnInfo = new JButton("A\u00F1adir Descripci\u00F3n");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(guard == false) {
					textArea.setEnabled(true);
					btnInfo.setText("Guardar");
					guard = true;
					}
				else {
					textArea.setEnabled(false);
					btnInfo.setText("A�adir Descripci�n");
					guard = false;
					
					try {
						Principal.getInstance().dataSalida();
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnInfo.setBackground(SystemColor.activeCaption);
		btnInfo.setBounds(37, 207, 151, 23);
		contentPanel.add(btnInfo);
		getRootPane().setDefaultButton(btnInfo);
		{
			JLabel label_1 = new JLabel(empresa.getTelefono());
			label_1.setBounds(298, 63, 100, 14);
			contentPanel.add(label_1);
		}
	
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBackground(new Color(119, 136, 153));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);

			}
		}
	}
	public void Quitar() {
		btnInfo.setVisible(false);
		textArea.setEditable(false);
	}
}
