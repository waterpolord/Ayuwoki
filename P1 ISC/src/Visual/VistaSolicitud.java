package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logic.Obrero;
import Logic.Persona;
import Logic.Tecnico;
import Logic.Universitario;
import Logic.Vacante;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaSolicitud extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel modeloT;


	public VistaSolicitud(Vacante vacante, String Titulo) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Object[] encontrado = new Object[3];
				if(vacante.getCantSolicitantes() > 0) {
					for(Persona aux:vacante.getPersonas()) {
						encontrado[0] = aux.getNombre();
						encontrado[1] = aux.getApellido();
						if(aux instanceof Universitario) {
							encontrado[2] = ((Universitario) aux).getCarrera();
						}
						if(aux instanceof Tecnico) {
							encontrado[2] = ((Tecnico) aux).getEspecialidad();
						}
						if(aux instanceof Obrero) {
							encontrado[2] = vacante.getTipoPersonal();
						}
						((DefaultTableModel) table.getModel()).addRow(encontrado);
					}
				}
			}
		});
		setBounds(100, 100, 666, 441);
		setTitle(Titulo);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		modeloT = new DefaultTableModel();
		modeloT.addColumn("Nombre");
		modeloT.addColumn("Apellido");
		modeloT.addColumn("Carrera");
		contentPanel.setLayout(null);
		{
			JLabel lbNombre = new JLabel(vacante.getPuesto());
			lbNombre.setBounds(293, 0, 99, 23);
			contentPanel.add(lbNombre);
		}
		
		table = new JTable(modeloT);
		table.setColumnSelectionAllowed(true);
		table.setBounds(70, 250, 272, -165);
		table.setModel(modeloT);
		contentPanel.add(table);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
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