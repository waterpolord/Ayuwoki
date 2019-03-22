package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;


public class RegPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textCodigo;
	private JTextField textUsuario;
	private JPasswordField passwordContraseña;
	private JPasswordField passwordConfContra;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPersona dialog = new RegPersona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPersona() {
		setBounds(100, 100, 554, 454);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Personal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(34, 11, 466, 193);
			contentPanel.add(panel);
			{
				JLabel labelNombre = new JLabel("Nombre:");
				labelNombre.setBounds(10, 67, 97, 14);
				panel.add(labelNombre);
			}
			{
				textNombre = new JTextField();
				textNombre.setColumns(10);
				textNombre.setBounds(10, 92, 209, 20);
				panel.add(textNombre);
			}
			{
				JLabel labelCodigo = new JLabel("Codigo:");
				labelCodigo.setBounds(10, 11, 46, 14);
				panel.add(labelCodigo);
			}
			{
				textCodigo = new JTextField();
				textCodigo.setText("1");
				textCodigo.setEditable(false);
				textCodigo.setColumns(10);
				textCodigo.setBounds(10, 36, 209, 20);
				panel.add(textCodigo);
			}
			{
				JLabel labelUsuario = new JLabel("Usuario:");
				labelUsuario.setBounds(10, 123, 83, 14);
				panel.add(labelUsuario);
			}
			{
				textUsuario = new JTextField();
				textUsuario.setColumns(10);
				textUsuario.setBounds(10, 148, 209, 20);
				panel.add(textUsuario);
			}
			{
				JLabel labelContraseña = new JLabel("Contrase\u00F1a:");
				labelContraseña.setBounds(256, 67, 125, 14);
				panel.add(labelContraseña);
			}
			{
				passwordContraseña = new JPasswordField();
				passwordContraseña.setBounds(255, 92, 198, 20);
				panel.add(passwordContraseña);
			}
			{
				JLabel labelConfContraseña = new JLabel("Confirmar Contrase\u00F1a:");
				labelConfContraseña.setBounds(256, 123, 186, 14);
				panel.add(labelConfContraseña);
			}
			{
				passwordConfContra = new JPasswordField();
				passwordConfContra.setBounds(255, 148, 198, 20);
				panel.add(passwordConfContra);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(34, 215, 466, 47);
			contentPanel.add(panel);
			{
				JRadioButton rdbtnUniversitario = new JRadioButton("Universitario");
				rdbtnUniversitario.setSelected(true);
				rdbtnUniversitario.setBounds(6, 17, 109, 23);
				panel.add(rdbtnUniversitario);
			}
			{
				JRadioButton rdbtnTecnico = new JRadioButton("Tecnico");
				rdbtnTecnico.setSelected(false);
				rdbtnTecnico.setBounds(171, 17, 109, 23);
				panel.add(rdbtnTecnico);
			}
			{
				JRadioButton rdbtnObrero = new JRadioButton("Obrero");
				rdbtnObrero.setSelected(false);
				rdbtnObrero.setBounds(333, 17, 109, 23);
				panel.add(rdbtnObrero);
			}
		}
		
		
		
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
