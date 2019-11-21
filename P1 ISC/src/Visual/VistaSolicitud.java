package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logic.Empresa;
import Logic.Obrero;
import Logic.Persona;
import Logic.Principal;
import Logic.Tecnico;
import Logic.Universitario;
import Logic.Vacante;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;

public class VistaSolicitud extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private DefaultTableModel modeloT;
	private JLabel lbNombre;
	private JTable table;
	private JButton btnver;
	private JButton btnNewButton;
	private JButton btnConfirmar;
	

	public VistaSolicitud(Vacante vacante, String Titulo,String correo,Empresa empresa) {
		setBackground(new Color(119, 136, 153));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Object[] encontrado = new Object[4];
				if(vacante.getEstado()) {
					if(vacante.getCantSolicitantes() > 0) {
						for(Persona aux:vacante.getPersonas()) {
							encontrado[0] = aux.getNombre();
							encontrado[1] = aux.getApellido();
							encontrado[3] = aux.getCorreo();
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
				else {
					for(Persona aux:vacante.getPersonas()) {
						encontrado[0] = aux.getNombre();
						encontrado[1] = aux.getApellido();
						encontrado[3] = aux.getCorreo();
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
					btnNewButton.setVisible(false);
					btnConfirmar.setVisible(false);
				}
			}
			
		}); 
		setBounds(100, 100, 450, 441);
		setTitle(Titulo);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(119, 136, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		modeloT = new DefaultTableModel();
		modeloT.addColumn("Nombre");
		modeloT.addColumn("Apellido");
		modeloT.addColumn("Carrera");
		modeloT.addColumn("Correo");
		{
			lbNombre = new JLabel(vacante.getPuesto());
			lbNombre.setBackground(new Color(255, 255, 255));
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
		
		btnConfirmar = new JButton("Confirmar Contrataci\u00F3n");
		btnConfirmar.setForeground(new Color(0, 128, 128));
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int selecF = table.getSelectedRow();
					if(selecF > -1 && !(vacante.VacanteRepite(table.getModel().getValueAt(selecF, 3).toString()))) {
					if (selecF < 0) {
						JOptionPane.showMessageDialog(null, "No ha seleccionado a niguna persona", "Advertencia", JOptionPane.INFORMATION_MESSAGE, null);
						
					} else {
						try {
							//vacante.restCant();
							Principal.getInstance().buscarPersonas(table.getModel().getValueAt(selecF, 3).toString()).setEstado(false);
							Principal.getInstance().buscarEmpresas(correo).BuscarVacantes(vacante.getCodigo()).restCant();
							Principal.getInstance().dataSalida();
							JOptionPane.showMessageDialog(null, "Ha contratado a una Persona", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
							if(Principal.getInstance().buscarEmpresas(correo).BuscarVacantes(vacante.getCodigo()).getCant() == 0) {
								vacante.setEstado(false);
								Principal.getInstance().buscarEmpresas(correo).BuscarVacantes(vacante.getCodigo()).setEstado(false);
								JOptionPane.showMessageDialog(null, "La solicitud vacante ha sido completada con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
								int ind = 0;
								for(Vacante vac:empresa.getMisVacantes()) {
									
									for(Persona aux:vac.getPersonas()) {
										if(aux.getEstado() == false && vac.getEstado() && vac.getCodigo() != vacante.getCodigo()) {
											vac.cancelar(ind);
											break;
										}
										ind++;
									}
									ind = 0;
									
									
								}
							}
							
							
							
							Principal.getInstance().dataSalida();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Esta persona ya esta contratada", "Informacion", JOptionPane.INFORMATION_MESSAGE, null);
					}
				}
		});
		
				
						
				
		
		btnNewButton = new JButton("Actualizar");
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vacante.getCantInicial() != vacante.getCantSolicitantes())
					for(Persona aux:Principal.getInstance().getTpersonas()) {
					if(aux.getEstado()) {
						if(aux.getSoli() == 1 && !(vacante.VacanteRepite(aux.getCorreo()))) {
							if(aux instanceof Tecnico && vacante.getPuesto().equalsIgnoreCase("Tecnico") &&
									((Tecnico) aux).getEspecialidad().equalsIgnoreCase(vacante.getTipoPersonal())) {
								Object[] encontrado = new Object[4];
								if(vacante.aplicaHabilidades(aux.getSolicitud())) {
									try {
										vacante.solicitar(Principal.getInstance().buscarPersonas(aux.getCorreo()));
									} catch (ClassNotFoundException | IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									table.removeAll();
									for(Persona vac:vacante.getPersonas()) {
										encontrado[0] = vac.getNombre();
										encontrado[1] = vac.getApellido();
										encontrado[3] = vac.getCorreo();
										
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
						if(aux instanceof Universitario && vacante.getPuesto().equalsIgnoreCase("Universitario") &&
								((Universitario) aux).getCarrera().equalsIgnoreCase(vacante.getTipoPersonal())) {
							Object[] encontrado = new Object[4];
							if(vacante.aplicaHabilidades(aux.getSolicitud()) ) {
								try {
									vacante.solicitar(Principal.getInstance().buscarPersonas(aux.getCorreo()));
								} catch (ClassNotFoundException | IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								table.removeAll();
								for(Persona vac:vacante.getPersonas()) {
									encontrado[0] = vac.getNombre();
									encontrado[1] = vac.getApellido();
									encontrado[3] = vac.getCorreo();
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
						if(aux instanceof Obrero && vacante.getPuesto().equalsIgnoreCase("Obrero") &&
								((Obrero) aux).getHabilidades().get(0).equalsIgnoreCase(vacante.getTipoPersonal())) {
							Object[] encontrado = new Object[4];
							if(vacante.aplicaHabilidades(aux.getSolicitud())) {
								try {
									vacante.solicitar(Principal.getInstance().buscarPersonas(aux.getCorreo()));
								} catch (ClassNotFoundException | IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								table.removeAll();
								for(Persona vac:vacante.getPersonas()) {
									encontrado[0] = vac.getNombre();
									encontrado[1] = vac.getApellido();
									encontrado[3] = vac.getCorreo();
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
					}
					}
					
			}
				}
			
		});
			
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbNombre, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addGap(10)
								.addComponent(btnConfirmar))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(61))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lbNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConfirmar)
						.addComponent(btnNewButton))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Carrera"," Correo "
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
				 btnver.setForeground(new Color(119, 136, 153));
				 btnver.setBackground(new Color(255, 255, 255));
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
				cancelButton.setForeground(new Color(119, 136, 153));
				cancelButton.setBackground(new Color(255, 255, 255));
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