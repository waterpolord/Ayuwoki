package Visual;
 
 
import static Conexion.Connect.getConexion;
import Interfaces.DAOExeption;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logic.*;
//import com.sun.jndi.cosnaming.CNCtx;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
 
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.sql.Date;
import javax.swing.JCheckBox;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import javax.swing.JList;
 
public class Inicio extends JFrame {
 
    // Declaraciones de variables
    private JPanel PanelPrincipal;
    private JPanel PanelBotones;
    private JButton BTNiniciarSesion;
    private JButton BTNUser;
    private Dimension Tam;
    private JPanel PanelLogin;
    private JPanel PanelUser;
    private JPanel PanelEmpresa;
    private JTextField textUsuario;
    private JPasswordField passwordContra;
    private JPanel panel_1;
    private JLabel labelNombre;
    private JTextField textNombre;
    private JLabel labelApellido;
    private JLabel labelCorreo;
    private JTextField txtCorreo;
    private JLabel labelContra;
    private JPasswordField passwordContrasena;
    private JLabel labelConfContra;
    private JPasswordField txtpassconfirm;
    private JPanel panel_2;
    private JRadioButton RBUniversitario;
    private JRadioButton RBTec;
    private JRadioButton RBObrero;
    private JRadioButton rbnEmpresasYUsuarios;
    private JRadioButton rbnUniversitarios;
    private JRadioButton rbnTecnicos;
    private JRadioButton rbnObreros;
    private JRadioButton rbnEmpresas;
    private JTextField textCorreoE;
    private JPasswordField passwordE;
    private JTextField TXTNombre;
    private JTextField textTelefono;
    private JTextField textEncargado;
    private JTextField txtApellido;
    private ButtonGroup grupoEstado;
    private ButtonGroup grupoTipo;
    private ButtonGroup grupoGraficas;
    private JPanel panelUniversitario;
    private JLabel labelCarrera;
    private JPanel panelTecnico;
    private JLabel labelEspecialidad;
    private JPanel panelObrero;
    private JLabel labelHabilidad;
    private  JComboBox<?>  CBXHabilidad;
    private JLabel LBver;
    private JLabel LBOcultar;
    private JLabel LBempresaNover;
    private JLabel LBempresaver;
    private JLabel LBNoconfirm;
    private JLabel LBConfirmver;
    private JLabel LBconfirmCorreo;
    private JLabel LBconfirmCorreoE;
    private JLabel LBClaveCorta;
    private JLabel LBClaveCortaE;
    private JLabel LBIgualdad;
    private JLabel LBIncorrecto;
    private JButton buttonLogin;
    private JComboBox CBXCarreras;
    private JComboBox CBXEspecialidad;
    private JButton btnCrearUser;
    private JButton btnCrearEmpresa;
    private JCheckBox checkSesion;
    private JPanel panel_3;
    private JPanel panel_5;
    private JComboBox<?> cbxGraficas;
    private JLabel lbContra;
    private JList listUniversitario;
    private DefaultListModel modeloUniversitario = new DefaultListModel();
    private JList listEspecialidad;
    private DefaultListModel modeloEspecialidad = new DefaultListModel();
    private JList listHabilidades;
    private DefaultListModel modeloHabilidades = new DefaultListModel();
    private JButton btnQuitarHabilidades;
    private JButton btnAgregarCarrera;
    private JButton btnAgregarEspecialidad;
    private JButton btnAgregarHabilidad;
    private JComboBox CBXPaisEmpresa;
    private JLabel lblPais;
 
 public Inicio() throws ClassNotFoundException, SQLException {
    getConexion();
    setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imgenes/FondoPortada.jpg")));
   
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowOpened(WindowEvent e) {
            try {
                try {
                    getConexion();
                    Principal.getInstance().Obtener();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                generarBarras();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DAOExeption ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
                        panel_5 = new JPanel();
                        panel_5.setVisible(true);
                        //PanelEmpresa = new JPanel();
                        //PanelLogin = new JPanel();
                        //PanelUser = new JPanel();
                        PanelEmpresa.setVisible(false);
                        PanelLogin.setVisible(false);
                        PanelUser.setVisible(false);
            try {
                Boolean bol = false;
                if(bol){
                    String correo = Principal.getInstance().dataEntrada().get(1).toString();
                    bol = Principal.getInstance().existeEmpresa(correo);
                    if(bol){
                        new PerfilUsuarios(Principal.getInstance().buscarPersonas(correo));
                        dispose();
                    }
                    else{
                        new PerfilEmpresa(Principal.getInstance().buscarEmpresas(correo));
                        dispose();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
                                     
 
        }
    });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        setTitle("Bolsa De Empleos");
        PanelPrincipal = new JPanel();
        PanelPrincipal.setBackground(Color.WHITE);
        PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(PanelPrincipal);
        PanelPrincipal.setLayout(null);
       
        BTNiniciarSesion = new JButton("");
        //BTNiniciarSesion.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
        BTNiniciarSesion.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Boton Iniciar Sesion.jpg")));
        BTNiniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                if(PanelLogin.isVisible()) {
                    PanelLogin.setVisible(false);
                }
                else {
                    PanelEmpresa.setVisible(false);
                    PanelLogin.setVisible(true);
                    PanelUser.setVisible(false);
                    setEnter(buttonLogin);
                }
            }
        });
        BTNiniciarSesion.setBounds(0, 47, 174, 58);
        BTNiniciarSesion.setHorizontalAlignment(SwingConstants.RIGHT);
       
        JButton BTNEmpresa = new JButton("");
        BTNEmpresa.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Empresa.jpg")));
        BTNEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(PanelEmpresa.isVisible()) {
                    PanelEmpresa.setVisible(false);
                }
                else {
                    PanelEmpresa.setVisible(true);
                    PanelLogin.setVisible(false);
                    PanelUser.setVisible(false);
                    setEnter(btnCrearEmpresa);
                }
            }
        });
        BTNEmpresa.setBounds(0, 283, 174, 58);
        BTNEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
       
        JLabel lblNuevo = new JLabel("Nuevo");
        lblNuevo.setFont(new Font("AntsyPants", Font.ITALIC, 23));
        lblNuevo.setBounds(0, 128, 150, 49);
        lblNuevo.setBackground(Color.BLUE);
        lblNuevo.setHorizontalAlignment(SwingConstants.CENTER);
        Tam = this.getToolkit().getScreenSize();
       
        PanelBotones = new JPanel();
        PanelBotones.setBounds(0, 0, 160, (int)Tam.height);
        PanelBotones.setBackground(SystemColor.activeCaption);
       
        this.setBounds(100, 100, (int)Tam.getWidth(),(int)Tam.height);
        this.setLocationRelativeTo(null);
        PanelEmpresa = new JPanel();
        PanelEmpresa.setBounds(170, 117, 688, 470);
        PanelEmpresa.setBackground(new Color(108, 122, 137, 160));
        PanelPrincipal.add(PanelEmpresa);
        PanelEmpresa.setLayout(null);
        PanelEmpresa.setVisible(false);
        
            
             JPanel panel_4 = new JPanel();
             panel_4.setLayout(null);
             panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Empresa", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255,255,255)));
             panel_4.setBounds(79, 11, 564, 380);
             panel_4.setBackground(new Color(119, 136, 153));
             PanelEmpresa.add(panel_4);
             
              JLabel labelCodigoE = new JLabel("Nombre:");
              labelCodigoE.setForeground(Color.WHITE);
              labelCodigoE.setBounds(10, 11, 83, 14);
              panel_4.add(labelCodigoE);
              
               JLabel labelCorreoE = new JLabel("Correo:");
               labelCorreoE.setForeground(Color.WHITE);
               labelCorreoE.setBounds(10, 138, 83, 14);
               panel_4.add(labelCorreoE);
               
                LBempresaNover = new JLabel("Ocultar");
                LBempresaNover.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
                LBempresaNover.setVisible(false);
                LBempresaNover.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        LBempresaNover.setVisible(false);
                        LBempresaver.setVisible(true);
                        passwordE.setEchoChar('s');
                    }
                });
                LBempresaNover.setForeground(Color.CYAN);
                LBempresaNover.setBounds(435, 181, 46, 14);
                panel_4.add(LBempresaNover);
                
                 LBempresaver = new JLabel("Ver");
                 LBempresaver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
                 LBempresaver.addMouseListener(new MouseAdapter() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                         LBempresaNover.setVisible(true);
                         LBempresaver.setVisible(false);
                         passwordE.setEchoChar((char)0);
                     }
                 });
                 LBempresaver.setForeground(Color.CYAN);
                 LBempresaver.setBounds(435, 181, 46, 14);
                 panel_4.add(LBempresaver);
                 
                  textCorreoE = new JTextField();
                  textCorreoE.addKeyListener(new KeyAdapter() {
                      @Override
                      public void keyReleased(KeyEvent e) {
                          if(txtCorreo.getText().length() > 4 ) {
                              try {
                                  if(Principal.getInstance().existeUser(textCorreoE.getText())) {
                                      LBconfirmCorreoE.setText("Correo no disponible");
                                      LBconfirmCorreoE.setForeground(Color.red);
                                      LBconfirmCorreoE.setVisible(true);
                                  }
                                  else {
                                      LBconfirmCorreoE.setText("Correo disponible");
                                      LBconfirmCorreoE.setForeground(Color.GREEN);
                                      LBconfirmCorreoE.setVisible(true);
                                  }
                              } catch (ClassNotFoundException | IOException e1) {
                                  // TODO Auto-generated catch block
                                  e1.printStackTrace();
                              }
                          }
                          else {
                              LBconfirmCorreo.setVisible(false);
                          }
                      }
                  });
                  
                   textCorreoE.setColumns(10);
                   textCorreoE.setBounds(70, 135, 353, 20);
                   panel_4.add(textCorreoE);
                   
                    JLabel labelConE = new JLabel("Contraseña:");
                    labelConE.setForeground(Color.WHITE);
                    labelConE.setBounds(10, 181, 125, 14);
                    panel_4.add(labelConE);
                    
                     passwordE = new JPasswordField();
                     passwordE.addKeyListener(new KeyAdapter() {
                         @Override
                         public void keyReleased(KeyEvent e) {
                             if(passwordE.getPassword().length < 4) {
                                 LBClaveCortaE.setVisible(true);
                                 LBClaveCortaE.setText("Esta contraseña es muy corta");
                                 LBClaveCortaE.setForeground(Color.ORANGE);
                             }
                             else {
                                 LBClaveCortaE.setVisible(false);
                             }
                            
                            
                         }
                         @Override
                         public void keyTyped(KeyEvent e) {
                            
                         }
                     });
                     passwordE.setBounds(70, 178, 353, 20);
                     panel_4.add(passwordE);
                     
                      LBconfirmCorreoE = new JLabel("");
                      LBconfirmCorreoE.setVisible(false);
                      LBconfirmCorreoE.setBounds(425, 156, 145, 14);
                      panel_4.add(LBconfirmCorreoE);
                      
                       LBClaveCortaE = new JLabel("");
                       LBClaveCortaE.setVisible(true);
                       LBClaveCortaE.setBounds(368, 181, 186, 14);
                       panel_4.add(LBClaveCortaE);
                       
                        JLabel labelEncargado = new JLabel("Encargado:");
                        labelEncargado.setForeground(Color.WHITE);
                        labelEncargado.setBounds(10, 225, 186, 14);
                        panel_4.add(labelEncargado);
                        
                         TXTNombre = new JTextField();
                         TXTNombre.addKeyListener(new KeyAdapter() {
                             @Override
                             public void keyTyped(KeyEvent evt) {
                                 char Letra = evt.getKeyChar();
                                 if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
                                     evt.consume();
                                 }
                             }
                         });
                         TXTNombre.setColumns(10);
                         TXTNombre.setBounds(70, 35, 353, 20);
                         panel_4.add(TXTNombre);
                         
                          JLabel labelTelefono = new JLabel("Telefono:");
                          labelTelefono.setForeground(Color.WHITE);
                          labelTelefono.setBounds(10, 69, 83, 14);
                          panel_4.add(labelTelefono);
                          MaskFormatter Numero = null;
                          
                          try {
                              Numero = new MaskFormatter("###-###-####");
                          } catch (ParseException e1) {
                              // TODO Auto-generated catch block
                              e1.printStackTrace();
                          }
                          textTelefono = new JFormattedTextField(Numero);
                          textTelefono.addKeyListener(new KeyAdapter() {
                              @Override
                              public void keyTyped(KeyEvent evt) {
                                  char Letra = evt.getKeyChar();
                                  if(Character.isLetter(Letra) || Letra == '.' || Letra == ','){
                                      evt.consume();
                                  }
                              }
                          });
                          textTelefono.setColumns(10);
                          textTelefono.setBounds(70, 66, 353, 20);
                          panel_4.add(textTelefono);
                          
                           textEncargado = new JTextField();
                           textEncargado.addKeyListener(new KeyAdapter() {
                               @Override
                               public void keyTyped(KeyEvent evt) {
                                   char Letra = evt.getKeyChar();
                                   if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
                                       evt.consume();
                                   }
                               }
                           });
                           textEncargado.setColumns(10);
                           textEncargado.setBounds(70, 222, 353, 20);
                           panel_4.add(textEncargado);
                           
                            JLabel lblTipo = new JLabel("Tipo:");
                            lblTipo.setForeground(Color.WHITE);
                            lblTipo.setBounds(10, 291, 186, 14);
                            panel_4.add(lblTipo);
                            
                             JComboBox CBXTipoEmpresa = new JComboBox();
                             try {
                                 
                                 ResultSet cn = Conexion.Connect.Consulta("SELECT Nombre FROM Tipo_empresa");
                                 Vector arr = new Vector();
                                 arr.add("<Tipo Empresa>");
                                 while(cn.next()){
                                     arr.add(cn.getString(1));
                                     
                                 }
                                 CBXTipoEmpresa.setModel(new DefaultComboBoxModel(arr));
                                
                                
                             } catch (ClassNotFoundException ex) {
                                 Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                             } catch (SQLException ex) {
                                 Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                             }
                             CBXTipoEmpresa.setBackground(Color.WHITE);
                             CBXTipoEmpresa.setBounds(70, 288, 353, 20);
                             panel_4.add(CBXTipoEmpresa);
                             
                             CBXPaisEmpresa = new JComboBox();
                             try {
                                 
                                 ResultSet cn = Conexion.Connect.Consulta("SELECT Nombre_pais FROM Pais");
                                 Vector arr = new Vector();
                                 while(cn.next()){
                                     arr.add(cn.getString(1));
                                     
                                 }
                                 CBXPaisEmpresa.setModel(new DefaultComboBoxModel(arr));
                                
                                
                             } catch (ClassNotFoundException ex) {
                                 Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                             } catch (SQLException ex) {
                                 Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                             }
                             CBXPaisEmpresa.setBounds(70, 97, 353, 20);
                             panel_4.add(CBXPaisEmpresa);
                             
                             lblPais = new JLabel("Pais:");
                             lblPais.setForeground(Color.WHITE);
                             lblPais.setBounds(10, 99, 83, 14);
                             panel_4.add(lblPais);
                             
                              btnCrearEmpresa = new JButton("Crear");
                              btnCrearEmpresa.setForeground(new Color(0, 128, 128));
                              btnCrearEmpresa.setBackground(Color.WHITE);
                              btnCrearEmpresa.addActionListener(new ActionListener() {
                                 
                                  public void actionPerformed(ActionEvent e) {
                                      String passC = new String(passwordE.getPassword());        
                                      Boolean esta = false;
                                      if(TXTNombre.getText().length() > 2 && textTelefono.getText().length() == 12  && textCorreoE.getText().length() > 4 && passC.length() > 3 && textEncargado.getText().length() > 2  ) {
                                             
                                                  try {
                                                      esta = Principal.getInstance().existeEmpresa(textCorreoE.getText());
                                                  } catch (ClassNotFoundException | IOException e1) {
                                                      // TODO Auto-generated catch block
                                                      e1.printStackTrace();
                                                  }
                                              if(esta == true) {
                                                  JOptionPane.showMessageDialog(null,"Este correo ya está en uso","Correo Repetido", 0);
                                              }
                                              else if(esta == false) {
                                                  String nom = TXTNombre.getText(),pas = new String(passwordE.getPassword());
                                                 
                                                  if  (CBXTipoEmpresa.getSelectedIndex() > 0) {
                                                      JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Empresa Creada Con Exito", 1);
                                                      Empresa empresa = new Empresa(nom,textTelefono.getText(),textCorreoE.getText(),pas,textEncargado.getText(),CBXTipoEmpresa.getSelectedItem().toString());
                                                      try {
                                                          Principal.getInstance().setTEmpresas(empresa);
                                                      } catch (ClassNotFoundException | IOException e1) {
                                                          // TODO Auto-generated catch block
                                                          e1.printStackTrace();
                                                      } catch (DAOExeption ex) {
                                                          Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                                      }
                                                      new PerfilEmpresa(empresa).setVisible(true);
                                                      dispose();
                                                  }
                                                 
                                                  else{
                                                      JOptionPane.showMessageDialog(null,"Selecciona un Tipo","Advertencia", 0);
                                                  }
                                              }
                                              }
                                     
                                 
                                      else {
                                          JOptionPane.showMessageDialog(null,"Debes llenar todos los campos ","Advertencia", 0);
                                      }
                                     
                                  }
                              });
                              
                              
                              
                              
                              
                              
                               btnCrearEmpresa.setBounds(196, 402, 89, 23);
                               PanelEmpresa.add(btnCrearEmpresa);
                               
                                JButton btnCancelarEmpresa = new JButton("Cancelar");
                                btnCancelarEmpresa.setForeground(new Color(255, 0, 0));
                                btnCancelarEmpresa.setBackground(Color.WHITE);
                                btnCancelarEmpresa.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           PanelEmpresa.setVisible(false);
                                       }
                                   });
                                btnCancelarEmpresa.setBounds(405, 402, 89, 23);
                                PanelEmpresa.add(btnCancelarEmpresa);
       
        PanelPrincipal.add(PanelBotones);
        PanelBotones.setLayout(null);
        PanelBotones.add(lblNuevo);
       
        BTNUser = new JButton("");
        BTNUser.setBounds(0, 174, 174, 58);
        PanelBotones.add(BTNUser);
        BTNUser.setIcon(new ImageIcon(Inicio.class.getResource("/Imgenes/Boton Usuario.jpg")));
        BTNUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(PanelUser.isVisible()) {
                    PanelUser.setVisible(false);
                }
                else {
                    PanelEmpresa.setVisible(false);
                    PanelLogin.setVisible(false);
                    PanelUser.setVisible(true);
                    setEnter(btnCrearUser);
                }
            }
        });
        BTNUser.setHorizontalAlignment(SwingConstants.RIGHT);
        PanelBotones.add(BTNiniciarSesion);
        PanelBotones.add(BTNEmpresa);
       
        PanelLogin = new JPanel();
        PanelLogin.setBounds(170, 28, 648, 78);
        PanelLogin.setBackground(new Color(103, 128, 159, 160));
        PanelLogin.setVisible(false);
        PanelPrincipal.add(PanelLogin);
        PanelLogin.setLayout(null);
       
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 731, 517);
        panel.setLayout(null);
        panel.setBackground(new Color(119, 136, 153));
        PanelLogin.add(panel);
       
        JLabel labelUsuario = new JLabel("Usuario/Correo:");
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setBounds(20, 21, 147, 14);
        panel.add(labelUsuario);
       
        JLabel labelContrasena = new JLabel("Clave:");
        labelContrasena.setForeground(Color.WHITE);
        labelContrasena.setBounds(274, 21, 105, 14);
        panel.add(labelContrasena);
       
        textUsuario = new JTextField();
       
        textUsuario.setColumns(10);
        textUsuario.setBounds(68, 40, 191, 20);
        panel.add(textUsuario);
       
        buttonLogin = new JButton("Entrar");
        buttonLogin.setBackground(Color.WHITE);
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String claveUser = new String(passwordContra.getPassword()),
                        claveEmpresa = new String(passwordContra.getPassword());
                Boolean user = null, empre = null, userPassword = null, empresaPassword = null;
                try {
//                    Principal.getInstance().Obtener();
                    user = Principal.getInstance().existeUser(textUsuario.getText());
                    empre = Principal.getInstance().existeEmpresa(textUsuario.getText());
                    userPassword = Principal.getInstance().ContraUser(claveUser);
                    empresaPassword = Principal.getInstance().ContraEmpresa(claveEmpresa);
                } catch (ClassNotFoundException | IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                if(user && userPassword) {
                    Persona login = null;
                    try {
                        
                        login = Principal.getInstance().buscarPersonas(textUsuario.getText());
                       
                    } catch (ClassNotFoundException | IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    if(checkSesion.isSelected()) {
                        try {
                            Principal.getInstance().buscarPersonas(textUsuario.getText()).setSesion(true,Principal.getInstance().buscarPersonas(textUsuario.getText()).getCorreo());
                        } catch (ClassNotFoundException | IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        };
                    }
                    
                    new PerfilUsuarios(login).setVisible(true);
                    dispose();
                }
                else if(empre && empresaPassword) {
                    Empresa empresa = null;
                    try {
                        empresa = Principal.getInstance().buscarEmpresas(textUsuario.getText());
                    } catch (ClassNotFoundException | IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    if(checkSesion.isSelected()) {
                        try {
                            Principal.getInstance().buscarEmpresas(textUsuario.getText()).setSesion(true,Principal.getInstance().buscarEmpresas(textUsuario.getText()).getCorreo());

                        } catch (ClassNotFoundException | IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    
                    new PerfilEmpresa(empresa).setVisible(true);
                    dispose();
                }
                else if(user || userPassword) {
                    LBIncorrecto.setVisible(true);
                }
                else if(empre || empresaPassword) {
                    LBIncorrecto.setVisible(true);
                }
                else {
                    int Mensaje = JOptionPane.showConfirmDialog(rootPane, "¿No tienes cuenta?\n Registrate ya!", "No encontrado", 1);
                    if(Mensaje == JOptionPane.OK_OPTION) {
                       
                        textNombre.setText("");
                        passwordContra.setText("");
                        PanelUser.setVisible(true);
                        setEnter(btnCrearUser);
                    }
                }
               
               
               
            }
        });
        buttonLogin.setBounds(549, 39, 89, 23);
        panel.add(buttonLogin);
       
        passwordContra = new JPasswordField();
       
        passwordContra.setBounds(348, 40, 191, 20);
        panel.add(passwordContra);
       
        LBIncorrecto = new JLabel("Nombre o Clave incorrectos");
        LBIncorrecto.setVisible(false);
        LBIncorrecto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        LBIncorrecto.setForeground(Color.CYAN);
        LBIncorrecto.setBounds(68, 62, 212, 14);
        panel.add(LBIncorrecto);
       
 
       
        checkSesion = new JCheckBox("Mantener sesión iniciada");
        checkSesion.setBackground(SystemColor.inactiveCaption);
        checkSesion.setBounds(330, 58, 176, 23);
        checkSesion.setSelected(true);
        panel.add(checkSesion);
       
        lbContra = new JLabel("Olvide Mi Clave");
        lbContra.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Correo = JOptionPane.showInputDialog("Introduzca Correo");
                try {
                    if(Principal.getInstance().existeUser(Correo)) {
                        Persona user = Principal.getInstance().buscarPersonas(Correo);
                        OlvidoClaveUser nueva = new  OlvidoClaveUser(user);
                        nueva.setModal(true);
                        nueva.setVisible(true);
                    }
                    else if(Principal.getInstance().existeEmpresa(Correo)) {
                        Empresa empre = Principal.getInstance().buscarEmpresas(Correo);
                        OlvidoClaveEmpresa nueva = new  OlvidoClaveEmpresa(empre);
                        nueva.setModal(true);
                        nueva.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Correo incorrecto","Advertencia", 0);
                    }
                } catch (ClassNotFoundException | IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        lbContra.addAncestorListener(new AncestorListener() {
            public void ancestorAdded(AncestorEvent event) {
            }
            public void ancestorMoved(AncestorEvent event) {
            }
                        @Override
            public void ancestorRemoved(AncestorEvent event) {
            }
        });
        lbContra.setBounds(519, 62, 137, 14);
        lbContra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        lbContra.setForeground(Color.CYAN);
        panel.add(lbContra);
       
        PanelUser = new JPanel();
        PanelUser.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    
                }
            }
        });
        PanelUser.setBounds(170, 107, 760, 400);
        PanelUser.setLayout(null);
        PanelUser.setBackground(new Color(108, 122, 137, 160));
                PanelUser.setVisible(false);
        PanelPrincipal.add(PanelUser);
       
       
       
        panel_1 = new JPanel();
        panel_1.setForeground(Color.WHITE);
       
        panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255,255,255)));
        panel_1.setBounds(82, 0, 642, 203);
        panel_1.setBackground(new Color(119, 136, 153));
        panel_1.setLayout(null);
        PanelUser.add(panel_1);
       
        labelNombre = new JLabel("Nombres:");
        labelNombre.setForeground(Color.WHITE);
        labelNombre.setBounds(10, 21, 97, 14);
        panel_1.add(labelNombre);
       
       
        LBNoconfirm = new JLabel("Ocultar");
        LBNoconfirm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        LBNoconfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LBNoconfirm.setVisible(false);
                LBConfirmver.setVisible(true);
                txtpassconfirm.setEchoChar('?');
            }
        });
        LBNoconfirm.setForeground(Color.CYAN);
        LBNoconfirm.setVisible(false);
        LBNoconfirm.setBounds(465, 151, 58, 14);
        panel_1.add(LBNoconfirm);
       
 
        LBConfirmver = new JLabel("Ver");
        LBConfirmver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        LBConfirmver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LBNoconfirm.setVisible(true);
                LBConfirmver.setVisible(false);
                txtpassconfirm.setEchoChar((char)0);
            }
        });
       
        LBConfirmver.setForeground(Color.CYAN);
        LBConfirmver.setBounds(468, 151, 33, 14);
        panel_1.add(LBConfirmver);
       
        textNombre = new JTextField();
        textNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char Letra = evt.getKeyChar();
               
                if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
                    evt.consume();
                }
               
               
            }
        });
       
        LBOcultar = new JLabel("Ocultar");
        LBOcultar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        LBOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LBOcultar.setVisible(false);
                LBver.setVisible(true);
                passwordContrasena.setEchoChar('?');
            }
        });
        LBOcultar.setForeground(Color.CYAN);
        LBOcultar.setBounds(195, 151, 50, 14);
        LBOcultar.setBackground(Color.CYAN);
        LBOcultar.setVisible(false);
        panel_1.add(LBOcultar);
       
        LBver = new JLabel("Ver");
        LBver.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        LBver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LBver.setVisible(false);
                LBOcultar.setVisible(true);
                passwordContrasena.setEchoChar((char)0);
            }
        });
        LBver.setForeground(Color.CYAN);
        LBver.setVerticalAlignment(SwingConstants.BOTTOM);
        LBver.setBounds(195, 151, 33, 14);
        panel_1.add(LBver);
       
       
        textNombre.setColumns(10);
        textNombre.setBounds(10, 36, 209, 20);
        panel_1.add(textNombre);
       
        labelApellido = new JLabel("Apellidos:");
        labelApellido.setForeground(Color.WHITE);
        labelApellido.setBounds(323, 21, 83, 14);
        panel_1.add(labelApellido);
       
        labelCorreo = new JLabel("Correo:");
        labelCorreo.setForeground(Color.WHITE);
        labelCorreo.setBounds(10, 67, 83, 14);
        panel_1.add(labelCorreo);
       
        txtCorreo = new JTextField();
        txtCorreo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(txtCorreo.getText().length() > 4 ) {
                    try {
                        if(Principal.getInstance().existeUser(txtCorreo.getText())) {
                            LBconfirmCorreo.setText("Correo no disponible");
                            LBconfirmCorreo.setForeground(Color.red);
                            LBconfirmCorreo.setVisible(true);
                        }
                        else {
                            LBconfirmCorreo.setText("Correo disponible");
                            LBconfirmCorreo.setForeground(Color.GREEN);
                            LBconfirmCorreo.setVisible(true);
                        }
                    } catch (ClassNotFoundException | IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                else {
                    LBconfirmCorreo.setVisible(false);
                }
            }
        });
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(10, 92, 311, 20);
        panel_1.add(txtCorreo);
       
        labelContra = new JLabel("Clave:");
        labelContra.setForeground(Color.WHITE);
        labelContra.setBounds(10, 123, 125, 14);
        panel_1.add(labelContra);
       
        passwordContrasena = new JPasswordField();
        passwordContrasena.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(passwordContrasena.getPassword().length < 4) {
                    LBClaveCorta.setVisible(true);
                    LBClaveCorta.setText("Esta clave es muy corta");
                    LBClaveCorta.setForeground(Color.ORANGE);
                }
                else {
                    LBClaveCorta.setVisible(false);
                }
               
               
            }
            @Override
            public void keyTyped(KeyEvent e) {
               
            }
        });
        passwordContrasena.setBounds(10, 148, 175, 20);
        panel_1.add(passwordContrasena);
       
        labelConfContra = new JLabel("Confirmar clave:");
        labelConfContra.setForeground(Color.WHITE);
        labelConfContra.setBounds(287, 123, 186, 14);
        panel_1.add(labelConfContra);
       
        txtpassconfirm = new JPasswordField();
        txtpassconfirm.setBounds(288, 148, 167, 20);
        panel_1.add(txtpassconfirm);
       
        txtApellido = new JTextField();
        txtApellido.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char Letra = evt.getKeyChar();
                if(Character.isDigit(Letra) || Letra == '.' || Letra == ','){
                    evt.consume();
                }
            }
        });
        txtApellido.setColumns(10);
        txtApellido.setBounds(323, 36, 200, 20);
        panel_1.add(txtApellido);
       
        LBconfirmCorreo = new JLabel("");
        LBconfirmCorreo
        .setVisible(false);
        LBconfirmCorreo.setBounds(323, 95, 133, 20);
        panel_1.add(LBconfirmCorreo);
       
        LBClaveCorta = new JLabel("");
        LBClaveCorta.setVisible(true);
        LBClaveCorta.setBounds(10, 168, 200, 14);
        panel_1.add(LBClaveCorta);
       
        LBIgualdad = new JLabel("");
        LBIgualdad.setBounds(241, 168, 215, 14);
        LBIgualdad.setVisible(false);
        panel_1.add(LBIgualdad);
       
        JDateChooser jdcFecha = new JDateChooser();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdcFecha.getDateEditor();
        editor.setEditable(false);
        jdcFecha.setDateFormatString("dd-MM-yyyy");
        jdcFecha.setBounds(508, 92, 117, 20);
        panel_1.add(jdcFecha);
       
        JLabel lbpais = new JLabel("Pais");
        lbpais.setForeground(Color.WHITE);
        lbpais.setBounds(515, 123, 117, 14);
        panel_1.add(lbpais);
        
        JComboBox CBXPais = new JComboBox();
        CBXPais.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        try {
            
            ResultSet cn = Conexion.Connect.Consulta("SELECT Nombre_pais FROM Pais");
            Vector arr = new Vector();
            while(cn.next()){
                arr.add(cn.getString(1));
                
            }
            CBXPais.setModel(new DefaultComboBoxModel(arr));
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CBXPais.setBounds(511, 136, 114, 20);
        panel_1.add(CBXPais);
        
        JLabel label = new JLabel("Fecha de nacimiento:");
        label.setForeground(Color.WHITE);
        label.setBounds(515, 67, 117, 14);
        panel_1.add(label);
       
        panel_2 = new JPanel();
        panel_2.setForeground(Color.WHITE);
        panel_2.setLayout(null);
        panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
        panel_2.setBounds(82, 204, 642, 47);
        panel_2.setBackground(new Color(119, 136, 153));
        PanelUser.add(panel_2);
       
   
        RBUniversitario = new JRadioButton("Universitario");
        RBUniversitario.setBackground(Color.WHITE);
        RBUniversitario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RBTec.setSelected(false);
                RBObrero.setSelected(false);
                panelTecnico.setVisible(false);
                panelObrero.setVisible(false);
                panelUniversitario.setVisible(true);
        }});
       
        RBUniversitario.setBounds(19, 17, 109, 23);
        RBUniversitario.setSelected(true);
        panel_2.add(RBUniversitario);
       
        RBTec = new JRadioButton("Tecnico");
        RBTec.setBackground(Color.WHITE);
        RBTec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RBUniversitario.setSelected(false);
                RBObrero.setSelected(false);
                panelUniversitario.setVisible(false);
                panelObrero.setVisible(false);
                panelTecnico.setVisible(true);
        }});
       
        RBTec.setSelected(false);
        RBTec.setBounds(200, 17, 109, 23);
        panel_2.add(RBTec);
       
        RBObrero = new JRadioButton("Obrero");
        RBObrero.setBackground(Color.WHITE);
        RBObrero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RBUniversitario.setSelected(false);
                RBTec.setSelected(false);
                panelUniversitario.setVisible(false);
                panelTecnico.setVisible(false);
                panelObrero.setVisible(true);
        }});
 
        RBObrero.setSelected(false);
        RBObrero.setBounds(379, 17, 109, 23);
        panel_2.add(RBObrero);
       
        panelUniversitario = new JPanel();
        panelUniversitario.setForeground(Color.WHITE);
        panelUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Universitario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
        panelUniversitario.setBackground(new Color(119, 136, 153));
        panelUniversitario.setBounds(82, 248, 642, 81);
        PanelUser.add(panelUniversitario);
       
        labelCarrera = new JLabel("Carrera:");
        labelCarrera.setForeground(Color.WHITE);
        labelCarrera.setBounds(10, 21, 91, 14);
        panelUniversitario.add(labelCarrera);
        panelUniversitario.setLayout(null);
       
         CBXCarreras = new JComboBox();
         CBXCarreras.setForeground(Color.BLACK);
         CBXCarreras.setBackground(Color.WHITE);
       
 
        try {
           
            ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Carreras");
            Vector arr = new Vector();
            while(cn.next()){
                arr.add(cn.getString(1));
            }
            CBXCarreras.setModel(new DefaultComboBoxModel(arr));
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        CBXCarreras.setBounds(78, 34, 251, 25);
        panelUniversitario.add(CBXCarreras);
       
        listUniversitario = new JList();
        listUniversitario.setBounds(339, 21, 150, 49);
        panelUniversitario.add(listUniversitario);
        listUniversitario.setModel(modeloUniversitario);
       
        btnAgregarCarrera = new JButton("Agregar");
        btnAgregarCarrera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valor = (String) CBXCarreras.getSelectedItem();
                if(CBXCarreras.getSelectedIndex() >= 0 && !(RepeatLista(CBXCarreras.getSelectedItem().toString(),modeloUniversitario))) {
                	modeloUniversitario.addElement(valor);
                }
                else if((RepeatLista(CBXCarreras.getSelectedItem().toString(),modeloUniversitario))) {
                	JOptionPane.showMessageDialog(null,"No se pueden repetir las carreras","Advertencia", 0);
                }
               
            }
        });
        btnAgregarCarrera.setBounds(496, 17, 86, 23);
        panelUniversitario.add(btnAgregarCarrera);
       
        JButton btnQuitarCarrera = new JButton("Quitar");
        btnQuitarCarrera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int posicion = listUniversitario.getSelectedIndex();
                if(listUniversitario.getSelectedIndex() >= 0)
                {	modeloUniversitario.remove(posicion);}
                else {
                	JOptionPane.showMessageDialog(null,"Debes seleccionar una carrera para eliminarla","Advertencia", 0);
                }
            }
        });
        btnQuitarCarrera.setBounds(496, 47, 86, 23);
        panelUniversitario.add(btnQuitarCarrera);
       
        panelTecnico = new JPanel();
        panelTecnico.setVisible(false);
        panelTecnico.setLayout(null);
        panelTecnico.setForeground(Color.WHITE);
        panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tecnico", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
        panelTecnico.setBackground(new Color(119, 136, 153));
        panelTecnico.setBounds(82, 248, 642, 81);
        PanelUser.add(panelTecnico);
       
        labelEspecialidad = new JLabel("Especialidad:");
        labelEspecialidad.setForeground(Color.WHITE);
        labelEspecialidad.setBounds(10, 21, 91, 14);
        panelTecnico.add(labelEspecialidad);
       
         CBXEspecialidad = new JComboBox();
         try {
             
             ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Especialidades");
             Vector arr = new Vector();
             while(cn.next()){
                 arr.add(cn.getString(1));
             }
             CBXEspecialidad.setModel(new DefaultComboBoxModel(arr));
            
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
         }
        CBXEspecialidad.setBounds(78, 34, 251, 25);
        panelTecnico.add(CBXEspecialidad);
       
        listEspecialidad = new JList();
        listEspecialidad.setBounds(339, 21, 150, 49);
        panelTecnico.add(listEspecialidad);
        listEspecialidad.setModel(modeloEspecialidad);
       
        btnAgregarEspecialidad = new JButton("Agregar");
        btnAgregarEspecialidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                if(CBXEspecialidad.getSelectedIndex() >= 0 &&  !(RepeatLista(CBXEspecialidad.getSelectedItem().toString(),modeloEspecialidad))){
                    
                    String valor = (String) CBXEspecialidad.getSelectedItem();
                    modeloEspecialidad.addElement(valor);
                }
                else if((RepeatLista(CBXEspecialidad.getSelectedItem().toString(),modeloEspecialidad))) {
                	JOptionPane.showMessageDialog(null,"No se pueden repetir las Especialidades","Advertencia", 0);
                }
                    
            }
        });
        btnAgregarEspecialidad.setBounds(496, 17, 86, 23);
        panelTecnico.add(btnAgregarEspecialidad);
       
        JButton btnQuitarEspecialidad = new JButton("Quitar");
        btnQuitarEspecialidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int posicion = listEspecialidad.getSelectedIndex();
                if(posicion >= 0){
                    modeloEspecialidad.remove(posicion);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Debes seleccionar una Especialidad para eliminarla","Advertencia", 0);
                }
            }
        });
        btnQuitarEspecialidad.setBounds(496, 47, 86, 23);
        panelTecnico.add(btnQuitarEspecialidad);
       
        panelObrero = new JPanel();
        panelObrero.setVisible(false);
        panelObrero.setLayout(null);
        panelObrero.setForeground(Color.WHITE);
        panelObrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Obrero", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,255,255)));
        panelObrero.setBackground(new Color(119, 136, 153));
        panelObrero.setBounds(82, 248, 642, 81);
        PanelUser.add(panelObrero);
       
        labelHabilidad = new JLabel("Habilidades:");
        labelHabilidad.setForeground(Color.WHITE);
        labelHabilidad.setBounds(10, 21, 91, 14);
        panelObrero.add(labelHabilidad);
       
       
        CBXHabilidad = new JComboBox();
        try {
            
            ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Habilidades");
            Vector arr = new Vector();
            while(cn.next()){
                arr.add(cn.getString(1));
            }
            CBXHabilidad.setModel(new DefaultComboBoxModel(arr));
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        CBXHabilidad.setBounds(78, 34, 251, 25);
        panelObrero.add(CBXHabilidad);
       
        listHabilidades = new JList();
        listHabilidades.setBounds(339, 21, 150, 49);
        panelObrero.add(listHabilidades);
        listHabilidades.setModel(modeloHabilidades);
       
        btnAgregarHabilidad = new JButton("Agregar");
        btnAgregarHabilidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(CBXHabilidad.getSelectedIndex() >= 0 &&  !(RepeatLista(CBXHabilidad.getSelectedItem().toString(),modeloHabilidades))){
                    
                    String valor = (String) CBXHabilidad.getSelectedItem();
                    modeloHabilidades.addElement(valor);
                }
                else if((RepeatLista(CBXHabilidad.getSelectedItem().toString(),modeloHabilidades))) {
                	JOptionPane.showMessageDialog(null,"No se pueden repetir las Habilidades","Advertencia", 0);
                }
            }
        });
        btnAgregarHabilidad.setBounds(496, 17, 86, 23);
        panelObrero.add(btnAgregarHabilidad);
       
        btnQuitarHabilidades = new JButton("Quitar");
        btnQuitarHabilidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int posicion = listHabilidades.getSelectedIndex();
                if(posicion >= 0){
                modeloHabilidades.remove(posicion);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Debes seleccionar una Habilidad para eliminarla","Advertencia", 0);
                }
            }
        });
        btnQuitarHabilidades.setBounds(496, 47, 86, 23);
        panelObrero.add(btnQuitarHabilidades);
        
       
        grupoEstado = new ButtonGroup();
        grupoTipo = new ButtonGroup();
        grupoTipo.add(RBObrero);
        grupoTipo.add(RBTec);
        grupoTipo.add(RBUniversitario);
       
        btnCrearUser = new JButton("Crear");
        btnCrearUser.setForeground(new Color(0, 128, 128));
        btnCrearUser.setBackground(Color.WHITE);
       
        btnCrearUser.addActionListener(new ActionListener() {
       
            public void actionPerformed(ActionEvent e) {
                String passC = new String(txtpassconfirm.getPassword()),
                        pass = new String(passwordContrasena.getPassword());
                Boolean esta = false;
                if(textNombre.getText().length() > 1 && txtCorreo.getText().length() > 4 && txtApellido.getText().length() > 1 && pass.equals(passC) && pass.length() > 3 && !(jdcFecha.getDate().toString().isEmpty())) {
                       
                            try {
                                esta = Principal.getInstance().existeUser(txtCorreo.getText());
                            } catch (ClassNotFoundException | IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                                                String[] nombres = textNombre.getText().split(" ");
                                                String nomb2 = null,ap2 = null;
						if(nombres.length > 1 ){
                                                    nomb2 = nombres[1];
                                                }
                                                
                                                String[] apellidos = txtApellido.getText().split(" ");
                                                if(apellidos.length > 1){
                                                    ap2 = apellidos[1];
                                                }
                                                
                                                Date fecha = new Date(jdcFecha.getDate().getTime());  
                                                ArrayList<String> mishab = new ArrayList();
                        if(esta == true) {
                            JOptionPane.showMessageDialog(null,"Este correo ya esta en uso","Correo Repetido", 0);
                        }
                        else if(esta == false) {
                            String nom = textNombre.getText();
                            if(RBObrero.isSelected() && !(modeloHabilidades.isEmpty()) ) {
                                mishab = setValores(modeloHabilidades);
                                Obrero nuevo = new Obrero(nombres[0].toString()
                                        ,nomb2
                                        ,apellidos[0].toString()
                                        ,ap2
                                        ,fecha
                                        ,
                                            txtCorreo.getText()
                                        , pass,true,CBXPais.getSelectedItem().toString(),mishab);
                                try {
                                     Principal.getInstance().setTpersonas(nuevo);
                                     Principal.getInstance().Obtener();
                                } catch (ClassNotFoundException | IOException e1) {
                                    // TODO Auto-generated catch block
                                    e1.printStackTrace();
                                } catch (DAOExeption ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Usuario Creado Con Exito", 1);
                                
                                try {
                                    new PerfilUsuarios(Principal.getInstance().buscarPersonas(nuevo.getCorreo())).setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                dispose();
                            }
                            else if(RBObrero.isSelected() && modeloHabilidades.isEmpty()){
                                JOptionPane.showMessageDialog(null,"Selecciona al menos una habilidad","Advertencia", 0);
                            }
                            if(RBTec.isSelected() && !(modeloEspecialidad.isEmpty())) {
                                mishab = setValores(modeloEspecialidad);
                                Tecnico nuevo = new Tecnico(nombres[0],nomb2,apellidos[0],ap2,fecha,
                                            txtCorreo.getText(), pass,true,CBXPais.getSelectedItem().toString(),mishab);
                                try {
                                    Principal.getInstance().setTpersonas(nuevo);
                                     Principal.getInstance().dataSalida(nuevo.getSesion(),nuevo.getCorreo());
                                } catch (ClassNotFoundException | IOException e1) {
                                    // TODO Auto-generated catch block
                                    e1.printStackTrace();
                                } catch (DAOExeption ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                JOptionPane.showMessageDialog(null,"Bienvenido "+nom,"Usuario Creado Con Exito", 1);
                                
                                    try {
                                    new PerfilUsuarios(Principal.getInstance().buscarPersonas(nuevo.getCorreo())).setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                
                                dispose();
                            }
                            else if(RBTec.isSelected() && modeloEspecialidad.isEmpty()) {
                                JOptionPane.showMessageDialog(null,"Selecciona una especialidad","Advertencia", 0);
                            }
                            if(RBUniversitario.isSelected() && !(modeloUniversitario.isEmpty())) {
                                mishab = setValores(modeloUniversitario);
                                Universitario nuevo = new Universitario(nombres[0],nomb2,apellidos[0],ap2,fecha,
                                            txtCorreo.getText(), pass,true,CBXPais.getSelectedItem().toString(),mishab);
                                try {
                                    Principal.getInstance().setTpersonas(nuevo);
                                    Principal.getInstance().dataSalida(nuevo.getSesion(),nuevo.getCorreo());
                                } catch (ClassNotFoundException | IOException e1) {
                                    // TODO Auto-generated catch block
                                    e1.printStackTrace();
                                } catch (DAOExeption ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                JOptionPane.showMessageDialog(null,"Bienvenid@ "+nom,"Usuario Creado Con Exito", 1);
                                
                                  try {
                                    new PerfilUsuarios(Principal.getInstance().buscarPersonas(nuevo.getCorreo())).setVisible(true);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                
                                dispose();
                            }
                            else if(RBUniversitario.isSelected() && modeloUniversitario.isEmpty() ){
                                JOptionPane.showMessageDialog(null,"Selecciona una carrera","Advertencia", 0);
                            }
                           
                        }
                   
                }
                else {
                            JOptionPane.showMessageDialog(null,"Debes llenar todos los campos \ny asegurarte de que la clave sea mayor que 4 caracteres.","Advertencia", 0);
                }
               
            }
        });
        btnCrearUser.setBounds(201, 357, 89, 23);
        PanelUser.add(btnCrearUser);
       
        JButton btnCancelarUsuario = new JButton("Cancelar");
        btnCancelarUsuario.setForeground(new Color(255, 0, 0));
        btnCancelarUsuario.setBackground(Color.WHITE);
         btnCancelarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelUser.setVisible(false);
            }
        });
        btnCancelarUsuario.setBounds(475, 357, 89, 23);
        PanelUser.add(btnCancelarUsuario);
       
        panel_3 = new JPanel();
        panel_3.setBounds(388, 200, 812, 380);
        PanelPrincipal.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));
       
        panel_5 = new JPanel();
        panel_5.setVisible(true);
        panel_5.setBounds(388, 592, 818, 106);
        PanelPrincipal.add(panel_5);
        panel_5.setLayout(null);
       
        rbnEmpresasYUsuarios = new JRadioButton("Empresas y Usuarios");
        rbnEmpresasYUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                            try {
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        rbnEmpresasYUsuarios.setBounds(78, 20, 138, 23);
        rbnEmpresasYUsuarios.setSelected(true);
        panel_5.add(rbnEmpresasYUsuarios);
       
        rbnUniversitarios = new JRadioButton("Universitarios");
        rbnUniversitarios.addActionListener(new ActionListener() {
                       
                       
            public void actionPerformed(ActionEvent e) {
                                 
               
                            try {
                               
                                ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Carreras");
                                Vector arr = new Vector();
                                arr.add("<Todos>");
                                while(cn.next()){
                                    arr.add(cn.getString(1));
                                }
                                cbxGraficas.setModel(new DefaultComboBoxModel(arr));
                cbxGraficas.setEnabled(true);
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        rbnUniversitarios.setBounds(237, 20, 109, 23);
        panel_5.add(rbnUniversitarios);
       
        rbnTecnicos = new JRadioButton("Tecnicos");
        rbnTecnicos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                            try {
                                ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Especialidades");
                                Vector arr = new Vector();
                                arr.add("<Todos>");
                                while(cn.next()){
                                    arr.add(cn.getString(1));
                                }
                                cbxGraficas.setModel(new DefaultComboBoxModel(arr));
                                cbxGraficas.setEnabled(true);
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        rbnTecnicos.setBounds(372, 20, 109, 23);
        panel_5.add(rbnTecnicos);
       
        rbnObreros = new JRadioButton("Obreros");
        rbnObreros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                            try {
                               
                                ResultSet cn = Conexion.Connect.Consulta("SELECT nombre FROM Habilidades");
                                Vector arr = new Vector();
                                arr.add("<Todos>");
                                while(cn.next()){
                                    arr.add(cn.getString(1));
                                }
                                cbxGraficas.setModel(new DefaultComboBoxModel(arr));
                                cbxGraficas.setEnabled(true);
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        rbnObreros.setBounds(503, 20, 109, 23);
        panel_5.add(rbnObreros);
       
        rbnEmpresas = new JRadioButton("Empresas");
        rbnEmpresas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                            try {
                                ResultSet cn = Conexion.Connect.Consulta("SELECT Nombre FROM Tipo_empresa");
                                Vector arr = new Vector();
                                arr.add("<Todos>");
                                while(cn.next()){
                                    arr.add(cn.getString(1));
                                }
                                cbxGraficas.setModel(new DefaultComboBoxModel(arr));
                                cbxGraficas.setEnabled(true);
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            }
        });
        rbnEmpresas.setBounds(640, 20, 109, 23);
        grupoGraficas = new ButtonGroup();
        grupoGraficas.add(rbnEmpresasYUsuarios);
        grupoGraficas.add(rbnTecnicos);
        grupoGraficas.add(rbnUniversitarios);
        grupoGraficas.add(rbnObreros);
        grupoGraficas.add(rbnEmpresas);
        panel_5.add(rbnEmpresas);
       
        cbxGraficas = new JComboBox();
        cbxGraficas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                            try {
                                generarBarras();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (FileNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAOExeption ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        cbxGraficas.setBounds(328, 63, 153, 20);
        panel_5.add(cbxGraficas);
       
    }
    public void setEnter(JButton BTN) {
        getRootPane().setDefaultButton(BTN);
    }
    
    public Boolean RepeatLista(String txt,DefaultListModel lista){
        ArrayList<String> var = new ArrayList();
        for (int i = 0; i < lista.getSize(); i++) {
            var.add(lista.get(i).toString()); 
            
        }
        for(String aux:var ){
            if(aux.equalsIgnoreCase(txt))
                return true;
        }
        return false;
    }
    
    public ArrayList<String> setValores(DefaultListModel lista){
        ArrayList<String> var = new ArrayList();
        for (int i = 0; i < lista.getSize(); i++) {
            var.add(lista.get(i).toString()); 
        }
        return var;
    }
   
    public void generarBarras() throws ClassNotFoundException, SQLException, FileNotFoundException, DAOExeption {
        
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        JFreeChart jf = ChartFactory.createBarChart3D("Estadisticas","", "Cantidad", ds,PlotOrientation.VERTICAL,
                true,true,true);
            try {
                Conexion.Connect.getConexion();
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(rbnEmpresasYUsuarios.isSelected()) {
                        int CEmpresas = 0,CUser = 0;
                        ResultSet cn,cn2;
                        cn = Conexion.Connect.Consulta("SELECT COUNT(cod_empresa) FROM Empresa");
                        cn2 = Conexion.Connect.Consulta("SELECT COUNT(cod_persona) FROM Persona");
                        while(cn.next() && cn2.next()){
                            CEmpresas = cn.getInt(1);
                            CUser = cn2.getInt(1);
                        }
            ds.addValue(CUser,"Personas","");
            ds.addValue(CEmpresas,"Empresas","");
            ChartPanel f = new ChartPanel(jf);
            cbxGraficas.setModel(new DefaultComboBoxModel(new String[] {" "}));
            cbxGraficas.setEnabled(false);
            panel_3.removeAll();
            panel_3.add(f,BorderLayout.CENTER);
            panel_3.validate();
        }
        if(rbnUniversitarios.isSelected()) {
            int ind = 0;
            ResultSet cn;
                        if(cbxGraficas.getSelectedIndex() == 0){
                            cn = Conexion.Connect.Consulta("SELECT COUNT(cod_persona) FROM Estudiante_Universitario");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
                        else{
                            cn = Conexion.Connect.Consulta("EXEC    [dbo].[FiltroUniversitario]\n   @Carrera = N'"+cbxGraficas.getSelectedItem().toString()+"'");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
                       
                        ds.addValue(ind,"Universitarios Activos","");
            ChartPanel f = new ChartPanel(jf);
            panel_3.removeAll();
            panel_3.add(f,BorderLayout.CENTER);
            panel_3.validate();
        }
        if(rbnTecnicos.isSelected()) {
            int ind = 0;
            ResultSet cn;
                        if(cbxGraficas.getSelectedIndex() == 0){
                            cn = Conexion.Connect.Consulta("SELECT COUNT(cod_persona) FROM Tecnico");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
                        else{
                            cn = Conexion.Connect.Consulta("EXEC [dbo].[FiltroTecnico]\n    @Especialidad = N'"+cbxGraficas.getSelectedItem().toString()+"'");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
                        ds.addValue(ind,"Tecnicos Activos","");
            ChartPanel f = new ChartPanel(jf);
            panel_3.removeAll();
            panel_3.add(f,BorderLayout.CENTER);
            panel_3.validate();
        }
        if(rbnObreros.isSelected()) {
            int ind = 0;
            ResultSet cn;
                        if(cbxGraficas.getSelectedIndex() == 0){
                            cn = Conexion.Connect.Consulta("SELECT COUNT(cod_persona) FROM Obrero");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
                        else{
                            cn = Conexion.Connect.Consulta("EXEC [dbo].[FiltroObrero]\n     @Habilidad = N'"+cbxGraficas.getSelectedItem().toString()+"'");
                            while(cn.next()){
                                ind = cn.getInt(1);
                            }
                        }
            ds.addValue(ind,"Obreros Activos","");
            ChartPanel f = new ChartPanel(jf);
            panel_3.removeAll();
            panel_3.add(f,BorderLayout.CENTER);
            panel_3.validate();
        }
        if(rbnEmpresas.isSelected()) {
                        ResultSet cn;
            int ind = 0,Cvac = 0;
            if(cbxGraficas.getSelectedIndex() == 0){
                            cn = Conexion.Connect.Consulta("SELECT COUNT(Empresa.cod_empresa),COUNT(Vacante_Empresa.cod_empresa) FROM Empresa INNER JOIN Vacante_Empresa ON Vacante_Empresa.cod_empresa = Empresa.cod_empresa");
                            while(cn.next()){
                                ind = cn.getInt(1);
                                Cvac = cn.getInt(2);
                            }
                        }
                        else{
                            cn = Conexion.Connect.Consulta("EXEC    [dbo].[FiltroEmpresa]\n     @TipoEmpresa = N'"+cbxGraficas.getSelectedItem().toString()+"'");
                            while(cn.next()){
                                ind = cn.getInt(1);
                                Cvac = cn.getInt(2);
                            }
                        }
            ds.addValue(ind,"Empresas Disponibles","");
            ds.addValue(Cvac,"Vacantes De Empleo Disponibles","");
            ChartPanel f = new ChartPanel(jf);
            panel_3.removeAll();
            panel_3.add(f,BorderLayout.CENTER);
            panel_3.validate();
        }
 
       
    }
}