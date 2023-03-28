package Fisca;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class paneles extends JFrame implements ActionListener{
	public JPanel panel1;
	public JPanel panel2;
	public JTextField cajaFecha;
	public JTextField cajaDominio;
	public JTextField cajaUsuario;
	public JPasswordField password;
	JOptionPane mensaje;
	public JRadioButton si;
	public JRadioButton no;
	public JButton boton1;
	public JLabel usuario;
	public JLabel etiqueta;
	public JLabel etfecha;
	static String usu;
	char[] pass;
	public String nombre;
	public String carga;
	private static final long serialVersionUID = 1L;

	public paneles() {
		this.setSize(900,700); //tamaño de la ventana principal
		setLocationRelativeTo(null);//posicion central en pantalla
		setTitle("FISCALIZA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		funciones1();
	}
	
	//PANEL 1
	
	private void Paneles1() {
		panel1 = new JPanel();	
		panel1.setLayout(null);
		this.getContentPane().add(panel1);//agreGAMOS PANEL A LA VENTANA
		
	}
	
	private void funciones1() {
		Paneles1();
		Ingreseusuario();//etiqueta
		ingreseUsuario(); // Validador
		etiquetas();//titulo
		botonsalir1(); //boton salir
		etiqueta1();//Imagen de fondo
		
	}
	
	
	
		private void etiquetas() {
		etiqueta = new JLabel("Area Operativa", SwingConstants.CENTER);
		
		etiqueta.setBounds(100, 50, 700, 70);
		etiqueta.setForeground(Color.blue);
		etiqueta.setFont(new Font("Lucida Console", Font.BOLD,60 ));// establecemos tipo y tamaño de letra
		panel1.add(etiqueta);
		
		
	}
		private void etiqueta1() {
			ImageIcon imagen1 = new ImageIcon("imagenes/svControl.png");
			JLabel iControl = new JLabel();
			iControl.setBounds(0, 0, 900,700);
			iControl.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(iControl.getWidth(), iControl.getHeight(), Image.SCALE_SMOOTH)));
			panel1.add(iControl);
			
		}
		private void Ingreseusuario() {
			usuario = new JLabel("Iniciar Sesion", SwingConstants.CENTER);
			panel1.add(usuario);
			usuario.setBounds(250, 220, 400, 60);
			usuario.setForeground(Color.black);
			//etiqueta.setOpaque(true);
			//usuario.setBackground(Color.orange);
			usuario.setFont(new Font("Calibri", Font.BOLD,50 ));// establecemos tipo y tamaño de letra
			
			

		}
		public void ingreseUsuario() {
					
			cajaUsuario = new JTextField(15);
			cajaUsuario.addActionListener(this);
			
			password = new JPasswordField(15);
			
			password.addActionListener(this);
			password.setBounds(375, 350, 150, 40);
			cajaUsuario.setBounds(375, 280, 150, 40);
			panel1.add(cajaUsuario);
			panel1.add(password);
			
			boton1 = new JButton("Acceder");
			boton1.setBounds(390, 410, 120, 40);
			boton1.setFont(new Font("Lucida Console", Font.PLAIN,15 ));
			panel1.add(boton1);
			
			boton1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					usu = cajaUsuario.getText();
					pass = password.getPassword();
					nombre = new String(pass);
					
					
						
					if (usu.equals("1")&&nombre.equals("1")) {
						panel1.removeAll();
						funciones2();
							
					}else {
						JOptionPane.showMessageDialog(null,"Incorrecto intente de nuevo");
					}
					
				}
			});
			}
		private void botonsalir1() {
			
			
			JButton boton2 = new JButton("Salir");
			boton2.setBounds(750, 600, 100, 40);
			boton2.setForeground(Color.red);
			panel1.add(boton2);
				
			boton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int msj = JOptionPane.showConfirmDialog(null, "¿Desea terminar?");
					
					if (msj==JOptionPane.YES_OPTION) {
						System.exit(0);
					}else if (msj==JOptionPane.NO_OPTION) {
						funciones1();
					}else if (msj==JOptionPane.CANCEL_OPTION) {
						funciones1();
					}	
					
					
				}
			});
		}
		
		
		
		
		// pANEL 2
		
		
		
		private void Paneles2() {
			panel2 = new JPanel();	
			panel2.setLayout(null);
			this.getContentPane().add(panel2);//agreGAMOS PANEL A LÑA VENTANA
		
		}
		
		
		private void funciones2() {
			Paneles2();
			etiFecha();
			ingreseFecha();
			etDominio();
			ingreseDominio();
			etTipo();
			SelecVehiculo();
			etUso();
			SelecUso();
			etCheck();
			checklist();
			etInfr();
			infraccion();
			etDestino();
			Bdestino();
			etLugar();
			ingreseLugar();
			etiLicencia();
			tieneLicencia();
			SelecLicencia();
			etiquetas3();
			botonsalir2();
			botones2();
			etiqueta2();
			
			
			
		}

		private void etiquetas3() {
			
			JLabel etiqueta = new JLabel("Control", SwingConstants.CENTER);
			panel2.add(etiqueta);
			etiqueta.setBounds(100, 50, 700, 70);
			etiqueta.setForeground(Color.blue);
			etiqueta.setFont(new Font("Lucida Console", Font.BOLD,60 ));// establecemos tipo y tamaño de letra
			
			
		}
		private void etiqueta2() {
			ImageIcon imagen = new ImageIcon("imagenes/svControl.png");
			JLabel iControl = new JLabel();
			iControl.setBounds(0, 0, 900,700);
			iControl.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(iControl.getWidth(), iControl.getHeight(), Image.SCALE_SMOOTH)));
			panel2.add(iControl);
			
		}
		private void etiFecha() {
			etfecha = new JLabel("Fecha", SwingConstants.CENTER);
			etfecha.setBounds(20, 130, 100, 30);
			etfecha.setForeground(Color.black);		
			etfecha.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(etfecha);
		}
		public String fechaAct() {
			
			Date fecha = new Date();
			SimpleDateFormat FechaAct = new SimpleDateFormat("dd/mm/yyyy");
			return FechaAct.format(fecha);
		}
		private void ingreseFecha() {
			
			cajaFecha = new JTextField(fechaAct());
			cajaFecha.setBounds(20, 165, 180, 30);
			cajaFecha.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(cajaFecha);
		}
		private void etDominio() {
			JLabel dominio = new JLabel("Ingrese Dominio", SwingConstants.CENTER);
			
			dominio.setBounds(20, 210, 180, 30);
			dominio.setForeground(Color.black);		
			dominio.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(dominio);
		}
		private void ingreseDominio() {
			
			cajaDominio = new JTextField();
			cajaDominio.setBounds(20, 245, 180, 30);
			cajaDominio.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(cajaDominio);
		}
		private void etTipo() {
			JLabel tipo = new JLabel("Tipo de Vehiculo", SwingConstants.CENTER);
			
			tipo.setBounds(15, 280, 200, 40);
			tipo.setForeground(Color.black);		
			tipo.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(tipo);
		}
		private void SelecVehiculo() {
			
			String [] TIPOS = {"AUTO", "PICK-UP", "CAMION-TRACTOR", "SEMI", "MOTO", "MAQUINARIA", "SPRINTER", "OMNIBUS",  "TODO TERRENO", "RURAL", "MINIBUS","FURGON"};
			JComboBox<?> listaDeTipos= new JComboBox<Object>(TIPOS);
			listaDeTipos.setBounds(20, 320, 180, 30);
		
			listaDeTipos.setFont(new Font("Lucida Console", Font.BOLD,15 ));
			listaDeTipos.setForeground(Color.black);
			panel2.add(listaDeTipos);
		}
		private void etUso() {
			JLabel uso = new JLabel("Uso del Vehiculo", SwingConstants.CENTER);
			
			uso.setBounds(15, 360, 200, 30);
			uso.setForeground(Color.black);		
			uso.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(uso);
		}
		private void SelecUso() {
			
			String [] USO = {"PARTICULAR", "CARGAS GENERALES", "CARGAS PELIGROSAS", "ALQUILADO", "TAXI", "REMIS", "OFICIAL", "TURISMO",  "TURISMO ALTERNATIVO"};
			JComboBox<?> listaDeUsos= new JComboBox<Object>(USO);
			listaDeUsos.setBounds(20, 395, 180, 30);
			listaDeUsos.setFont(new Font("arial", Font.BOLD,15 ));
			listaDeUsos.setForeground(Color.black);
			panel2.add(listaDeUsos);
		}
		private void etCheck() {
			JLabel uso = new JLabel("Uso del Vehiculo", SwingConstants.CENTER);
			
			uso.setBounds(15, 430, 200, 30);
			uso.setForeground(Color.black);		
			uso.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(uso);
		}
		private void checklist() {
			
			
			JCheckBox rto = new JCheckBox("RTO", false);		
			rto.setBounds(20, 465, 150, 20);
			rto.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(rto);
			
			JCheckBox seg = new JCheckBox("SEGURO", false);
			seg.setBounds(20, 485, 150, 20);
			seg.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(seg);
			
			JCheckBox cin = new JCheckBox("CINTURON", false);
			cin.setBounds(20, 505, 150, 20);
			cin.setFont(new Font("arial", Font.BOLD,15));
			
			panel2.add(cin);
			
			JCheckBox luc = new JCheckBox("LUCES", false);
			luc.setBounds(20, 525, 150, 20);
			luc.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(luc);
			
			JCheckBox hab = new JCheckBox("HABILITACION", false);
			hab.setBounds(20, 545, 150, 20);
			hab.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(hab);
			
		}
		private void etInfr() {
			JLabel infraccion = new JLabel("INFRACCION", SwingConstants.LEFT);
			
			infraccion.setBounds(680, 460, 150, 30);
			infraccion.setForeground(Color.black);		
			infraccion.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(infraccion);
		}
		private void infraccion() {
			si = new JRadioButton("SI", true);
			si.setBounds(680, 500, 55, 30);
			si.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(si);
			
			no = new JRadioButton("NO", true);
			no.setBounds(740, 500, 55, 30);
			no.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(no);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(si);
			licsel.add(no);
		}
		private void etDestino() {
			JLabel destino = new JLabel("Destino", SwingConstants.CENTER);
			
			destino.setBounds(360, 120, 180, 40);
			destino.setForeground(Color.black);		
			destino.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(destino);
		}
		private void Bdestino() {
			JRadioButton ushu = new JRadioButton("Ushuaia");
			ushu.setBounds(360, 170, 180,40);
			ushu.setFont(new Font("arial", Font.BOLD,15 ));
			ushu.setEnabled(true);
			panel2.add(ushu);
			
			JRadioButton tol = new JRadioButton("Tolhuin");
			tol.setBounds(360, 220, 180,40);
			tol.setFont(new Font("arial", Font.BOLD,15 ));
			tol.setEnabled(true);
			panel2.add(tol);
			
			JRadioButton rio = new JRadioButton("Rio Grande");
			rio.setBounds(360, 270, 180,40);
			rio.setFont(new Font("arial", Font.BOLD,15 ));
			rio.setEnabled(true);
			panel2.add(rio);
			
			JRadioButton centrosI = new JRadioButton("Centros Invernales");
			centrosI.setBounds(360, 320, 180,40);
			centrosI.setFont(new Font("arial", Font.BOLD,15 ));
			centrosI.setEnabled(true);
			panel2.add(centrosI);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(ushu);
			licsel.add(tol);
			licsel.add(rio);
			licsel.add(centrosI);
			
		}
		private void etLugar() {
			JLabel etiqueta4 = new JLabel("Lugar", SwingConstants.CENTER);
			
			etiqueta4.setBounds(680, 130, 100, 30);
			etiqueta4.setForeground(Color.black);		
			etiqueta4.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(etiqueta4);
		}private void ingreseLugar() {
			
			String [] Lugates = {"Puesto 365", "Parque Nacional","Lago Escondido", "Puesto Cesar Real"};
			JComboBox<?> listaDeLugares= new JComboBox<Object>(Lugates);
			listaDeLugares.setBounds(680, 170, 160, 30);
		
			listaDeLugares.setFont(new Font("arial", Font.BOLD,15 ));
			listaDeLugares.setForeground(Color.black);
			panel2.add(listaDeLugares);
		}
		private void etiLicencia() {
			JLabel etiqueta3 = new JLabel("Licencia Habilitante", SwingConstants.LEFT);
			
			etiqueta3.setBounds(680, 210, 200, 30);
			etiqueta3.setForeground(Color.black);		
			etiqueta3.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(etiqueta3);
		}
		private void tieneLicencia() {
					
			si = new JRadioButton("SI", true);
			si.setBounds(680, 250, 55, 20);
			si.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(si);
			
			no = new JRadioButton("NO", true);
			no.setBounds(740, 250, 55, 20);
			no.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(no);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(si);
			licsel.add(no);
			
		}
		private void SelecLicencia() {
			
			String [] Categorias = {"A1", "A2", "A3", "B1", "B2", "C1", "C2", "C3", "D1", "D2","D3","D4", "E1", "E2","F", "G1", "G2", "G3"};
			JComboBox<?> listaLicencias= new JComboBox<Object>(Categorias);
			listaLicencias.setBounds(680, 290, 100, 30);
			listaLicencias.setFont(new Font("arial", Font.BOLD,15 ));
			listaLicencias.setForeground(Color.black);
			panel2.add(listaLicencias);
		}
		private void botonsalir2() {
			
			
			JButton boton3 = new JButton("Salir");
			boton3.setBounds(750, 600, 100, 40);
			boton3.setForeground(Color.red);
			panel2.add(boton3);
				
			boton3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int msj = JOptionPane.showConfirmDialog(null, "¿Desea terminar?");
					
					if (msj==JOptionPane.YES_OPTION) {
						System.exit(0);
					}else if (msj==JOptionPane.NO_OPTION) {
						funciones2();
					}else if (msj==JOptionPane.CANCEL_OPTION) {
						funciones2();
					}	
					
					
				}
			});
		}
		private void botones2() {
			JButton guardar = new JButton("Guardar");
			guardar.setBounds(620, 600, 100, 40);
			guardar.setForeground(Color.black);
			panel2.add(guardar);
			ActionListener guardado = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("se guarda el texto "+ cajaDominio.getText());
				}
			};
			
			guardar.addActionListener(guardado);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
