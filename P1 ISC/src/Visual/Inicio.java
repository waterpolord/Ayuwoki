package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Inicio extends JFrame {

	private JPanel PanelPrincipal;
	private JPanel PanelBotones;
 public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.WHITE);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		
		PanelBotones = new JPanel();
		PanelBotones.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton = new JButton("Iniciar Sesi\u00F3n \u25BA");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnNewButton_1 = new JButton("Usuario \u25BA");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnNewButton_2 = new JButton("Empresa \u25BA");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNuevo = new JLabel("Nuevo");
		lblNuevo.setBackground(Color.BLUE);
		lblNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_PanelBotones = new GroupLayout(PanelBotones);
		gl_PanelBotones.setHorizontalGroup(
			gl_PanelBotones.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNuevo, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
		);
		gl_PanelBotones.setVerticalGroup(
			gl_PanelBotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelBotones.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_PanelBotones.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelBotones.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNuevo, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelBotones.createSequentialGroup()
							.addGap(105)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
		);
		PanelBotones.setLayout(gl_PanelBotones);
		GroupLayout gl_PanelPrincipal = new GroupLayout(PanelPrincipal);
		gl_PanelPrincipal.setHorizontalGroup(
			gl_PanelPrincipal.createParallelGroup(Alignment.LEADING)
				.addComponent(PanelBotones, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
		);
		gl_PanelPrincipal.setVerticalGroup(
			gl_PanelPrincipal.createParallelGroup(Alignment.LEADING)
				.addComponent(PanelBotones, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
		);
		PanelPrincipal.setLayout(gl_PanelPrincipal);
		
	}
}
