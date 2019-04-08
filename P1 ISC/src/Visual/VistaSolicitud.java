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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VistaSolicitud extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private DefaultTableModel modeloT;
	private JLabel lbNombre;
	private JTable table;
	private JButton btnver;


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
		{
			lbNombre = new JLabel(vacante.getPuesto());
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(table.getSelectedRow() > -1) {
					btnver.setEnabled(true);
				}
			}
		});
		
		JButton btnConfirmar = new JButton("Confirmar Contratacion");
		
		JButton btnNewButton = new JButton("Actualizar");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbNombre, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(btnConfirmar)
								.addGap(28)
								.addComponent(btnNewButton))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lbNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfirmar)
						.addComponent(btnNewButton))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Carrera"
			}
		));
		scrollPane.setViewportView(table);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				 btnver = new JButton("Ver");
				btnver.setEnabled(false);
				btnver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btnver.setActionCommand("OK");
				buttonPane.add(btnver);
				getRootPane().setDefaultButton(btnver);
			}
			{
				JButton cancelButton = new JButton("Volver");
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