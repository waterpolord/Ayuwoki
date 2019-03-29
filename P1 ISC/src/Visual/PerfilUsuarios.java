package Visual;

import java.awt.BorderLayout;

import Logic.Persona;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PerfilUsuarios extends JFrame {

	private JPanel contentPane;
 PerfilUsuarios(Persona persona) {
	    initComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
	}
 private void initComponents() {
	 contentPane = new JPanel();
	 
 }

}
