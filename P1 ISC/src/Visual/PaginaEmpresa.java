package Visual;

import java.awt.BorderLayout;
import Logic.*;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTitulo;

	public PaginaEmpresa(Empresa empresa) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblTitulo = new JLabel(empresa.getNombre());
			lblTitulo.setBounds(0, 0, 450, 20);
			lblTitulo.setBackground(Color.BLUE);
			lblTitulo.setForeground(Color.BLACK);
			lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
			
			contentPanel.add(lblTitulo);
		}
		{
			JButton btnNewButton = new JButton("\u2190");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(0, -1, 43, 23);
			contentPanel.add(btnNewButton);
		}
		
		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setBounds(192, 31, 68, 14);
		contentPanel.add(lblInformacion);
		
		JLabel lblNewLabel = new JLabel(empresa.getCorreo());
		lblNewLabel.setBounds(10, 63, 139, 14);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
