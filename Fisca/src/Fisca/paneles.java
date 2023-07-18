package Fisca;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	int valorSeleccionado = 0;
	

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
			cuainfr();
			etiqueta2();
			
			
			
		}

		private void etiquetas3() {
			
			JLabel etiqueta = new JLabel("Control", SwingConstants.CENTER);
			panel2.add(etiqueta);
			etiqueta.setBounds(100, 40, 700, 70);
			etiqueta.setForeground(Color.black);
			etiqueta.setFont(new Font("Lucida Console", Font.BOLD,60 ));// establecemos tipo y tamaño de letra
			
			
		}
		private void etiqueta2() {
			ImageIcon imagen = new ImageIcon("imagenes/fondo.jpg");
			JLabel iControl = new JLabel();
			iControl.setBounds(0, 0, 900,700);
			iControl.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(iControl.getWidth(), iControl.getHeight(), Image.SCALE_SMOOTH)));
			panel2.add(iControl);
			
		}
		private void etiFecha() {
			etfecha = new JLabel("Fecha", SwingConstants.LEFT);
			etfecha.setBounds(20, 120, 100, 30);
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
			JLabel dominio = new JLabel("Ingrese Dominio", SwingConstants.LEFT);
			
			dominio.setBounds(20, 220, 180, 30);
			dominio.setForeground(Color.black);		
			dominio.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(dominio);
		}
		private void ingreseDominio() {
			
			cajaDominio = new JTextField();
			cajaDominio.setBounds(20, 255, 180, 30);
			cajaDominio.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(cajaDominio);
		}
		private void etTipo() {
			JLabel tipo = new JLabel("Tipo de Vehiculo", SwingConstants.LEFT);
			
			tipo.setBounds(350, 330, 300, 30);
			tipo.setForeground(Color.black);		
			tipo.setFont(new Font("arial", Font.BOLD,25 ));// establecemos tipo y tamaño de letra
			panel2.add(tipo);
		}
		private void SelecVehiculo() {
			
			JRadioButton au = new JRadioButton("AUTO");
			au.setBounds(280, 370, 70,30);
			au.setFont(new Font("arial", Font.BOLD,15 ));
			au.setOpaque(false);
			au.setContentAreaFilled(false);
			au.setBorderPainted(false);
			au.setEnabled(true);
			panel2.add(au);
			
			JRadioButton pic = new JRadioButton("PICK-UP");
			pic.setBounds(280, 400, 100,30);
			pic.setFont(new Font("arial", Font.BOLD,15 ));
			pic.setOpaque(false);
			pic.setContentAreaFilled(false);
			pic.setBorderPainted(false);
			pic.setEnabled(true);
			panel2.add(pic);
			
			JRadioButton cam = new JRadioButton("CAMION-TRACTOR");
			cam.setBounds(420, 400, 170,30);
			cam.setFont(new Font("arial", Font.BOLD,15 ));
			cam.setOpaque(false);
			cam.setContentAreaFilled(false);
			cam.setBorderPainted(false);
			cam.setEnabled(true);
			panel2.add(cam);
			
			JRadioButton sem = new JRadioButton("SEMI");
			sem.setBounds(420, 370, 70,30);
			sem.setFont(new Font("arial", Font.BOLD,15 ));
			sem.setOpaque(false);
			sem.setContentAreaFilled(false);
			sem.setBorderPainted(false);
			sem.setEnabled(true);
			panel2.add(sem);
			
			JRadioButton mot = new JRadioButton("MOTO");
			mot.setBounds(280, 520, 80,30);
			mot.setFont(new Font("arial", Font.BOLD,15 ));
			mot.setOpaque(false);
			mot.setContentAreaFilled(false);
			mot.setBorderPainted(false);
			mot.setEnabled(true);
			panel2.add(mot);
			
			JRadioButton maq = new JRadioButton("MAQUINARIA");
			maq.setBounds(280, 430, 140,30);
			maq.setFont(new Font("arial", Font.BOLD,15 ));
			maq.setOpaque(false);
			maq.setContentAreaFilled(false);
			maq.setBorderPainted(false);
			maq.setEnabled(true);
			panel2.add(maq);
			
			JRadioButton spr = new JRadioButton("SPRINTER");
			spr.setBounds(420, 430, 120,30);
			spr.setFont(new Font("arial", Font.BOLD,15 ));
			spr.setOpaque(false);
			spr.setContentAreaFilled(false);
			spr.setBorderPainted(false);
			spr.setEnabled(true);
			panel2.add(spr);
			
			JRadioButton omn = new JRadioButton("OMNIBUS");
			omn.setBounds(280, 460, 120,30);
			omn.setFont(new Font("arial", Font.BOLD,15 ));
			omn.setOpaque(false);
			omn.setContentAreaFilled(false);
			omn.setBorderPainted(false);
			omn.setEnabled(true);
			panel2.add(omn);
			
			JRadioButton TT = new JRadioButton("TODO TERRENO");
			TT.setBounds(420, 460, 150,30);
			TT.setFont(new Font("arial", Font.BOLD,15 ));
			TT.setOpaque(false);
			TT.setContentAreaFilled(false);
			TT.setBorderPainted(false);
			TT.setEnabled(true);
			panel2.add(TT);
			
			JRadioButton rur = new JRadioButton("RURAL");
			rur.setBounds(280, 490, 80,30);
			rur.setFont(new Font("arial", Font.BOLD,15 ));
			rur.setOpaque(false);
			rur.setContentAreaFilled(false);
			rur.setBorderPainted(false);
			rur.setEnabled(true);
			panel2.add(rur);
			
			JRadioButton min = new JRadioButton("MINIBUS");
			min.setBounds(420, 490, 100,30);
			min.setFont(new Font("arial", Font.BOLD,15 ));
			min.setOpaque(false);
			min.setContentAreaFilled(false);
			min.setBorderPainted(false);
			min.setEnabled(true);
			panel2.add(min);
			
			JRadioButton fur = new JRadioButton("FURGON");
			fur.setBounds(420, 520, 110,30);
			fur.setFont(new Font("arial", Font.BOLD,15 ));
			fur.setOpaque(false);
			fur.setContentAreaFilled(false);
			fur.setBorderPainted(false);
			fur.setEnabled(true);
			panel2.add(fur);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(au);
			licsel.add(pic);
			licsel.add(cam);
			licsel.add(sem);
			licsel.add(mot);
			licsel.add(maq);
			licsel.add(spr);
			licsel.add(omn);
			licsel.add(TT);
			licsel.add(rur);
			licsel.add(min);
			licsel.add(fur);
			
			/*
			String [] TIPOS = {"AUTO", "PICK-UP", "CAMION-TRACTOR", "SEMI", "MOTO", "MAQUINARIA", "SPRINTER", "OMNIBUS",  "TODO TERRENO", "RURAL", "MINIBUS","FURGON"};
			JComboBox<?> listaDeTipos= new JComboBox<Object>(TIPOS);
			listaDeTipos.setBounds(20, 320, 180, 30);
			
			listaDeTipos.setFont(new Font("Lucida Console", Font.BOLD,15 ));
			listaDeTipos.setForeground(Color.black);
			panel2.add(listaDeTipos);*/
		}
		private void etUso() {
			JLabel uso = new JLabel("Uso del Vehiculo", SwingConstants.LEFT);
			
			uso.setBounds(20, 310, 300, 40);
			uso.setForeground(Color.black);		
			uso.setFont(new Font("arial", Font.BOLD,25 ));// establecemos tipo y tamaño de letra
			panel2.add(uso);
		}
		private void SelecUso() {
			JRadioButton par = new JRadioButton("PARTICULAR");
			par.setBounds(10, 370, 200,30);
			par.setFont(new Font("arial", Font.BOLD,15 ));
			par.setOpaque(false);
			par.setContentAreaFilled(false);
			par.setBorderPainted(false);
			par.setEnabled(true);
			panel2.add(par);
			
			JRadioButton CG = new JRadioButton("CARGAS GENERALES");
			CG.setBounds(10, 400, 200,30);
			CG.setFont(new Font("arial", Font.BOLD,15 ));
			CG.setOpaque(false);
			CG.setContentAreaFilled(false);
			CG.setBorderPainted(false);
			CG.setEnabled(true);
			panel2.add(CG);
			
			JRadioButton CP = new JRadioButton("CARGAS PELIGROSAS");
			CP.setBounds(10, 430, 200,30);
			CP.setFont(new Font("arial", Font.BOLD,15 ));
			CP.setOpaque(false);
			CP.setContentAreaFilled(false);
			CP.setBorderPainted(false);
			CP.setEnabled(true);
			panel2.add(CP);
			
			JRadioButton ALQ = new JRadioButton("ALQUILADO");
			ALQ.setBounds(10, 460, 200,30);
			ALQ.setFont(new Font("arial", Font.BOLD,15 ));
			ALQ.setOpaque(false);
			ALQ.setContentAreaFilled(false);
			ALQ.setBorderPainted(false);
			ALQ.setEnabled(true);
			panel2.add(ALQ);
			
			JRadioButton TAX = new JRadioButton("TAXI");
			TAX.setBounds(10, 490, 180,30);
			TAX.setFont(new Font("arial", Font.BOLD,15 ));
			TAX.setOpaque(false);
			TAX.setContentAreaFilled(false);
			TAX.setBorderPainted(false);
			TAX.setEnabled(true);
			panel2.add(TAX);
			
			JRadioButton REM = new JRadioButton("REMIS");
			REM.setBounds(10, 520, 180,30);
			REM.setFont(new Font("arial", Font.BOLD,15 ));
			REM.setOpaque(false);
			REM.setContentAreaFilled(false);
			REM.setBorderPainted(false);
			REM.setEnabled(true);
			panel2.add(REM);
			
			JRadioButton TUR = new JRadioButton("TURISMO");
			TUR.setBounds(10, 550, 180,30);
			TUR.setFont(new Font("arial", Font.BOLD,15 ));
			TUR.setOpaque(false);
			TUR.setContentAreaFilled(false);
			TUR.setBorderPainted(false);
			TUR.setEnabled(true);
			panel2.add(TUR);
			
			JRadioButton TUA = new JRadioButton("TURISMO ALTERNATIVO");
			TUA.setBounds(10, 580, 210,30);
			TUA.setFont(new Font("arial", Font.BOLD,15 ));
			TUA.setOpaque(false);
			TUA.setContentAreaFilled(false);
			TUA.setBorderPainted(false);
			TUA.setEnabled(true);
			panel2.add(TUA);
			
			JRadioButton OF = new JRadioButton("OFICIAL");
			OF.setBounds(10, 610, 180,30);
			OF.setFont(new Font("arial", Font.BOLD,15 ));
			OF.setOpaque(false);
			OF.setContentAreaFilled(false);
			OF.setBorderPainted(false);
			OF.setEnabled(true);
			panel2.add(OF);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(par);
			licsel.add(CG);
			licsel.add(CP);
			licsel.add(ALQ);
			licsel.add(TAX);
			licsel.add(REM);
			licsel.add(TUR);
			licsel.add(TUA);
			licsel.add(OF);
			
			/*
			String [] USO = {"PARTICULAR", "CARGAS GENERALES", "CARGAS PELIGROSAS", "ALQUILADO", "TAXI", "REMIS", "OFICIAL", "TURISMO",  "TURISMO ALTERNATIVO"};
			JComboBox<?> listaDeUsos= new JComboBox<Object>(USO);
			listaDeUsos.setBounds(280, 395, 180, 30);
			listaDeUsos.setFont(new Font("arial", Font.BOLD,15 ));
			listaDeUsos.setForeground(Color.black);
			panel2.add(listaDeUsos);*/
		}
		private void etCheck() {
			JLabel uso = new JLabel("Verificar", SwingConstants.CENTER);
			
			uso.setBounds(680, 310, 200, 30);
			uso.setForeground(Color.black);		
			uso.setFont(new Font("arial", Font.BOLD,25 ));// establecemos tipo y tamaño de letra
			panel2.add(uso);
		}
		private void checklist() {
			
			
			JCheckBox rto = new JCheckBox("RTO", false);		
			rto.setBounds(680, 370, 150, 20);
			rto.setFont(new Font("arial", Font.BOLD,15 ));
			rto.setOpaque(false);
			rto.setContentAreaFilled(false);
			rto.setBorderPainted(false);
			panel2.add(rto);
			
			JCheckBox seg = new JCheckBox("SEGURO", false);
			seg.setBounds(680, 400, 150, 20);
			seg.setFont(new Font("arial", Font.BOLD,15 ));
			seg.setOpaque(false);
			seg.setContentAreaFilled(false);
			seg.setBorderPainted(false);
			panel2.add(seg);
			
			JCheckBox cin = new JCheckBox("CINTURON", false);
			cin.setBounds(680,430, 150, 20);
			cin.setFont(new Font("arial", Font.BOLD,15));
			cin.setOpaque(false);
			cin.setContentAreaFilled(false);
			cin.setBorderPainted(false);
			
			panel2.add(cin);
			
			JCheckBox luc = new JCheckBox("LUCES", false);
			luc.setBounds(680, 460, 150, 20);
			luc.setFont(new Font("arial", Font.BOLD,15 ));
			luc.setOpaque(false);
			luc.setContentAreaFilled(false);
			luc.setBorderPainted(false);
			panel2.add(luc);
			
			JCheckBox hab = new JCheckBox("HABILITACION", false);
			hab.setBounds(680, 490, 150, 20);
			hab.setFont(new Font("arial", Font.BOLD,15 ));
			hab.setOpaque(false);
			hab.setContentAreaFilled(false);
			hab.setBorderPainted(false);
			panel2.add(hab);
			
		}
		private void etInfr() {
			JLabel infraccion = new JLabel("INFRACCION", SwingConstants.LEFT);
			
			infraccion.setBounds(375, 570, 150, 30);
			infraccion.setForeground(Color.black);		
			infraccion.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(infraccion);
		}
		private void cuainfr() {
			ImageIcon imageni = new ImageIcon("imagenes/vinilica-beige.jpg");
			JLabel iControl = new JLabel();
			iControl.setBounds(370, 560, 140,90);
			iControl.setIcon(new ImageIcon(imageni.getImage().getScaledInstance(iControl.getWidth(), iControl.getHeight(), Image.SCALE_SMOOTH)));
			panel2.add(iControl);
		
		}
		private void infraccion() {
			si = new JRadioButton("SI", true);
			si.setBounds(385, 610, 55, 30);
			si.setFont(new Font("arial", Font.BOLD,15 ));
			si.setOpaque(false);
			si.setContentAreaFilled(false);
			si.setBorderPainted(false);
			panel2.add(si);
			
			no = new JRadioButton("NO", true);
			no.setBounds(430, 610, 55, 30);
			no.setFont(new Font("arial", Font.BOLD,15 ));
			no.setOpaque(false);
			no.setContentAreaFilled(false);
			no.setBorderPainted(false);
			panel2.add(no);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(si);
			licsel.add(no);
			
			si.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("infraccion");
					
				}
			});
			
			no.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("sin infraccion");
					
				}
			});
			
			if (si.isSelected()) {
			    valorSeleccionado = 1;
			} else if (no.isSelected()) {
			    valorSeleccionado = 1;
			} 
			System.out.println("el valor es " + valorSeleccionado);
			
			
		}
		private void etDestino() {
			JLabel destino = new JLabel("Destino", SwingConstants.LEFT);
			
			destino.setBounds(240, 120, 180, 40);
			destino.setForeground(Color.black);		
			destino.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(destino);
		}
		private void Bdestino() {
			JRadioButton ushu = new JRadioButton("Ushuaia");
			ushu.setBounds(230, 170, 180,30);
			ushu.setFont(new Font("arial", Font.BOLD,15 ));
			ushu.setOpaque(false);
			ushu.setContentAreaFilled(false);
			ushu.setBorderPainted(false);
			ushu.setEnabled(true);
			panel2.add(ushu);
			
			JRadioButton tol = new JRadioButton("Tolhuin");
			tol.setBounds(230, 200, 180,30);
			tol.setFont(new Font("arial", Font.BOLD,15 ));
			tol.setOpaque(false);
			tol.setContentAreaFilled(false);
			tol.setBorderPainted(false);
			tol.setEnabled(true);
			panel2.add(tol);
			
			JRadioButton rio = new JRadioButton("Rio Grande");
			rio.setBounds(230, 230, 180,30);
			rio.setFont(new Font("arial", Font.BOLD,15 ));
			rio.setOpaque(false);
			rio.setContentAreaFilled(false);
			rio.setBorderPainted(false);
			rio.setEnabled(true);
			panel2.add(rio);
			
			JRadioButton centrosI = new JRadioButton("Centros Invernales");
			centrosI.setBounds(230, 260, 180,30);
			centrosI.setFont(new Font("arial", Font.BOLD,15 ));
			centrosI.setOpaque(false);
			centrosI.setContentAreaFilled(false);
			centrosI.setBorderPainted(false);
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
			
			etiqueta4.setBounds(480, 120, 100, 30);
			etiqueta4.setForeground(Color.black);	
			etiqueta4.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(etiqueta4);
		}
		private void ingreseLugar() {
			JRadioButton P365 = new JRadioButton("Puesto 365");
			P365.setBounds(480, 170, 180,30);
			P365.setOpaque(false);
			P365.setContentAreaFilled(false);
			P365.setBorderPainted(false);
			P365.setFont(new Font("arial", Font.BOLD,15 ));
			P365.setEnabled(true);
			panel2.add(P365);
			
			JRadioButton PN = new JRadioButton("Parque Nacional");
			PN.setBounds(480, 200, 180,30);
			PN.setOpaque(false);
			PN.setContentAreaFilled(false);
			PN.setBorderPainted(false);
			PN.setFont(new Font("arial", Font.BOLD,15 ));
			PN.setEnabled(true);
			panel2.add(PN);
			
			JRadioButton LE = new JRadioButton("Lago Escondido");
			LE.setBounds(480, 230, 180,30);
			LE.setOpaque(false);
			LE.setContentAreaFilled(false);
			LE.setBorderPainted(false);
			LE.setFont(new Font("arial", Font.BOLD,15 ));
			LE.setEnabled(true);
			panel2.add(LE);
			
			JRadioButton PCR = new JRadioButton("Puesto Cesar Real");
			PCR.setBounds(480, 260, 180,30);
			PCR.setOpaque(false);
			PCR.setContentAreaFilled(false);
			PCR .setBorderPainted(false);
			PCR.setFont(new Font("arial", Font.BOLD,15 ));
			PCR.setEnabled(true);
			panel2.add(PCR);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(P365);
			licsel.add(PN);
			licsel.add(LE);
			licsel.add(PCR);
			/*String [] Lugates = {"Puesto 365", "Parque Nacional","Lago Escondido", "Puesto Cesar Real"};
			JComboBox<?> listaDeLugares= new JComboBox<Object>(Lugates);
			listaDeLugares.setBounds(680, 170, 160, 30);
		
			listaDeLugares.setFont(new Font("arial", Font.BOLD,15 ));
			listaDeLugares.setForeground(Color.black);
			panel2.add(listaDeLugares);*/
		}
		private void etiLicencia() {
			JLabel etiqueta3 = new JLabel("Licencia Habilitante", SwingConstants.LEFT);
			
			etiqueta3.setBounds(680, 120, 200, 30);
			etiqueta3.setForeground(Color.black);		
			etiqueta3.setFont(new Font("arial", Font.BOLD,20 ));// establecemos tipo y tamaño de letra
			panel2.add(etiqueta3);
		}
		private void tieneLicencia() {
			/*		
			si = new JRadioButton("SI", true);
			si.setBounds(715, 360, 50, 30);
			si.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(si);
			
			
			no = new JRadioButton("NO", true);
			no.setBounds(770, 360, 50, 30);
			no.setFont(new Font("arial", Font.BOLD,15 ));
			panel2.add(no);
			
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(si);
			licsel.add(no);
			*/
		}
		private void SelecLicencia() {
			JRadioButton A = new JRadioButton("A");
			A.setBounds(700, 170, 40,30);
			A.setFont(new Font("arial", Font.BOLD,15 ));
			A.setOpaque(false);
			A.setContentAreaFilled(false);
			A.setBorderPainted(false);
			A.setEnabled(true);
			panel2.add(A);
			
			JRadioButton B = new JRadioButton("B");
			B.setBounds(745, 170, 40,30);
			B.setFont(new Font("arial", Font.BOLD,15 ));
			B.setOpaque(false);
			B.setContentAreaFilled(false);
			B.setBorderPainted(false);
			B.setEnabled(true);
			panel2.add(B);
			
			JRadioButton C = new JRadioButton("C");
			C.setBounds(790, 170, 40,30);
			C.setFont(new Font("arial", Font.BOLD,15 ));
			C.setOpaque(false);
			C.setContentAreaFilled(false);
			C.setBorderPainted(false);
			C.setEnabled(true);
			panel2.add(C);
			
			JRadioButton D = new JRadioButton("D");
			D.setBounds(700, 200, 40,30);
			D.setFont(new Font("arial", Font.BOLD,15 ));
			D.setOpaque(false);
			D.setContentAreaFilled(false);
			D.setBorderPainted(false);
			D.setEnabled(true);
			panel2.add(D);
			
			JRadioButton E = new JRadioButton("E");
			E.setBounds(745, 200, 40,30);
			E.setFont(new Font("arial", Font.BOLD,15 ));
			E.setOpaque(false);
			E.setContentAreaFilled(false);
			E.setBorderPainted(false);
			E.setEnabled(true);
			panel2.add(E);
			
			JRadioButton G = new JRadioButton("G");
			G.setBounds(790, 200, 40,30);
			G.setFont(new Font("arial", Font.BOLD,15 ));
			G.setOpaque(false);
			G.setContentAreaFilled(false);
			G.setBorderPainted(false);
			G.setEnabled(true);
			panel2.add(G);
			
			ButtonGroup licsel = new ButtonGroup();
			licsel.add(A);
			licsel.add(B);
			licsel.add(C);
			licsel.add(D);
			licsel.add(E);
			licsel.add(G);
			/*
			String [] Categorias = {"A1", "A2", "A3", "B1", "B2", "C1", "C2", "C3", "D1", "D2","D3","D4", "E1", "E2","F", "G1", "G2", "G3"};
			JComboBox<?> listaLicencias= new JComboBox<Object>(Categorias);
			listaLicencias.setBounds(680, 290, 100, 30);
			listaLicencias.setFont(new Font("arial", Font.BOLD,15 ));
			listaLicencias.setForeground(Color.black);
			panel2.add(listaLicencias);*/
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
