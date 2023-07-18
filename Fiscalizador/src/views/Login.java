package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import infra.MySQLConnection;

public class Login extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtUsuario;
	protected JPasswordField txtContrasena;
	int xMouse, yMouse;
	private JLabel labelExit;
	private String usuPass;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		//Panel Izq
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 788, 527);
		panel.setBackground(new Color(239, 239, 239));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();

		panel_1.setBounds(484, 0, 304, 527);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel imgHotel = new JLabel("");
		imgHotel.setBounds(0, 0, 304, 538);
		panel_1.add(imgHotel);
		imgHotel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/media.png")));
		
		
		
		setTxtUsuario(new JTextField());
	    
		getTxtUsuario().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 if (getTxtUsuario().getText().equals("Ingrese su nombre de usuario")) {
					 getTxtUsuario().setText("");
					 getTxtUsuario().setForeground(Color.black);
			        }
			        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
			        	txtContrasena.setText("");
			        	txtContrasena.setForeground(Color.gray);
			        }
			}
		});
		getTxtUsuario().setFont(new Font("Verdana", Font.PLAIN, 16));
		getTxtUsuario().setText("");
		getTxtUsuario().setBackground(new Color(239, 239, 239));
		getTxtUsuario().setBorder(javax.swing.BorderFactory.createEmptyBorder());
		getTxtUsuario().setForeground(SystemColor.BLACK);
		getTxtUsuario().setBounds(65, 256, 324, 32);
		panel.add(getTxtUsuario());
		getTxtUsuario().setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 120, 215));
		separator.setBounds(65, 292, 324, 2);
		panel.add(separator);
		
		JLabel labelTitulo = new JLabel("INICIAR SESIÓN");
		labelTitulo.setForeground(SystemColor.BLACK);
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 26));
		labelTitulo.setBounds(65, 110, 250, 26);
		panel.add(labelTitulo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.textHighlight);
		separator_1.setBounds(65, 393, 324, 2);
		panel.add(separator_1);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBackground(new Color(239, 239, 239));
		txtContrasena.setText("");
		txtContrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (String.valueOf(txtContrasena.getPassword()).equals("")) {
					txtContrasena.setText("");
					txtContrasena.setForeground(Color.black);
		        }
		        if (getTxtUsuario().getText().isEmpty()) {
		        	getTxtUsuario().setText("");
		        	getTxtUsuario().setForeground(Color.gray);
		        }
			}
		});
		txtContrasena.setForeground(SystemColor.BLACK);
		txtContrasena.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtContrasena.setBounds(65, 353, 324, 32);
		panel.add(txtContrasena);
		
		JLabel LabelUsuario = new JLabel("USUARIO");
		LabelUsuario.setForeground(SystemColor.black);
		LabelUsuario.setFont(new Font("Libre Franklin", Font.PLAIN, 20));
		LabelUsuario.setBounds(65, 219, 107, 26);
		panel.add(LabelUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setForeground(SystemColor.black);
		lblContrasea.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblContrasea.setBounds(65, 316, 180, 26);
		panel.add(lblContrasea);
		
		JPanel btnLogin = new JPanel();
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(new Color(0, 156, 223));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(SystemColor.textHighlight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Login();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBackground(SystemColor.textHighlight);
		btnLogin.setBounds(65, 431, 122, 44);
		panel.add(btnLogin);
		btnLogin.setLayout(null);
		btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel = new JLabel("ENTRAR");
		lblNewLabel.setBounds(0, 0, 122, 44);
		btnLogin.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/agenteInicio.jpg")));
		lblNewLabel_1.setBounds(65, 65, 80, 60);
		//panel.add(lblNewLabel_1);
		
		JPanel btnexit = new JPanel();
		btnexit.setBounds(260, 431, 122, 44);
		panel.add(btnexit);
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnexit.setBackground(Color.red);
				labelExit.setForeground(Color.white);
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				 btnexit.setBackground(new Color(12, 138, 199));
			     labelExit.setForeground(Color.white);
			}
		});
		btnexit.setBackground(new Color(12, 138, 199));
		btnexit.setLayout(null);
		btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		labelExit = new JLabel("SALIR");
		labelExit.setBounds(0, 0, 122,44);
		btnexit.add(labelExit);
		labelExit.setForeground(SystemColor.controlLtHighlight);
		labelExit.setFont(new Font("Verdana", Font.PLAIN, 18));
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);		
		
		JPanel header = new JPanel();
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				headerMouseDragged(e);
			     
			}
		});
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				headerMousePressed(e);
			}
		});
		header.setBackground(SystemColor.window);
		header.setBounds(0, 0, 0, 36);
		panel.add(header);
		header.setLayout(null);
	}
	
	


	
	
	public void Login() throws ClassNotFoundException {
	    int resultado = 0;
	    MySQLConnection cc = new MySQLConnection();
	    Connection con = cc.Conexion();
	    String usuario = txtUsuario.getText();
	    String pass = String.valueOf(txtContrasena.getPassword());
	    String SQL = "SELECT * FROM usuarios WHERE Usuario='" + usuario + "' AND Password='" + pass + "'";
	    
	    try {
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(SQL);
	        
	        if (rs.next()) {
	            resultado = 1;
	            if (resultado == 1) {
	            	
	            	
	            	
	                MenuUsuario menu = new MenuUsuario();
	                menu.setVisible(true);
	                this.dispose();
	                
	                usuPass = usuario;
	                System.out.println(usuPass);
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Usuario o contraseña erroneos");
	        }
	    } catch (Exception e) {
	        // Manejar la excepción aquí
	    }

	}



	

	private void headerMousePressed(java.awt.event.MouseEvent evt) {
	        xMouse = evt.getX();
	        yMouse = evt.getY();
	    }//GEN-LAST:event_headerMousePressed

	    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
	        int x = evt.getXOnScreen();
	        int y = evt.getYOnScreen();
	        this.setLocation(x - xMouse, y - yMouse);
}

		public JTextField getTxtUsuario() {
			return txtUsuario;
		}

		public void setTxtUsuario(JTextField txtUsuario) {
			this.txtUsuario = txtUsuario;
		}

		public String getUsuarioPass() {
			return usuPass;
		}

		public void setUsuarioPass(String usuarioPass) {
			this.usuPass = usuarioPass;
		}
}
