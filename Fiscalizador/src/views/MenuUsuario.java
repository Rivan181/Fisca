package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	int xMouse, yMouse;
	private JLabel labelExit;
	private JLabel labelRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuario frame = new MenuUsuario();
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
	public MenuUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuUsuario.class.getResource("/imagenes/agenteInicio.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 944, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237,237,237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		JPanel btnexit = new JPanel();
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
				 btnexit.setBackground(new Color(237,237,237));
			     labelExit.setForeground(Color.black);
			}
		});
		  btnexit.setLayout(null);
			btnexit.setBackground(new Color(237,237,237));
			btnexit.setBounds(891, 0, 53, 36);
			contentPane.add(btnexit);
			
			labelExit = new JLabel("X");
			labelExit.setBounds(0, 0, 53, 36);
			btnexit.add(labelExit);
			labelExit.setHorizontalAlignment(SwingConstants.CENTER);
			labelExit.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		
		
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
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(97, 110, 204, 46));
		panelMenu.setBounds(0, 0, 257, 609);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(50, 58, 150, 150);
		panelMenu.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/agenteInicio2.jpg")));
		
		JPanel btnRegistro = new JPanel();
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistro.setBackground(new Color(97, 110, 204));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
			btnRegistro.setBackground(new Color(72, 88, 205));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Registros reservas = new Registros();
				reservas.setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(0, 255, 257, 56);
		btnRegistro.setBackground(new Color(72, 88, 205));
		panelMenu.add(btnRegistro);
		btnRegistro.setLayout(null);
		
		labelRegistro = new JLabel("Registro de fiscalizacion");
		//labelRegistro.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/reservado.png")));
		labelRegistro.setForeground(SystemColor.text);
		labelRegistro.setBounds(0, 11, 250, 34);
		labelRegistro.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		btnRegistro.add(labelRegistro);
		
		JPanel btnBusqueda = new JPanel();
		btnBusqueda.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBusqueda.setBackground(new Color(97, 110, 204));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBusqueda.setBackground(new Color(72, 88, 205));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Busqueda busqueda = new Busqueda();
				busqueda.setVisible(true);
				dispose();
			}
		});
		btnBusqueda.setBounds(0, 312, 257, 56);
		btnBusqueda.setBackground(new Color(72, 88, 205));
		panelMenu.add(btnBusqueda);
		btnBusqueda.setLayout(null);
		
		JLabel lblBusquedaDeRegistros = new JLabel("Búscar registro");
		//lblBusquedaDeRegistros.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/pessoas.png")));
		lblBusquedaDeRegistros.setBounds(27, 11, 200, 34);
		lblBusquedaDeRegistros.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusquedaDeRegistros.setForeground(Color.WHITE);
		lblBusquedaDeRegistros.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnBusqueda.add(lblBusquedaDeRegistros);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 219, 201, 2);
	//	panelMenu.add(separator);
		header.setLayout(null);
		header.setBackground(Color.WHITE);
		header.setBounds(0, 0, 944, 36);
	//	contentPane.add(header);
		
		JPanel btnResumen = new JPanel();
		btnResumen.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnResumen.setBackground(new Color(97, 110, 204));				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnResumen.setBackground(new Color(72, 88, 205));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Busqueda busqueda = new Busqueda();
				busqueda.setVisible(true);
				dispose();
			}
		});
		btnResumen.setBounds(0, 368, 257, 56);
		btnResumen.setBackground(new Color(255, 181, 51));
		//panelMenu.add(btnResumen);
		btnResumen.setLayout(null);
		
		JLabel lblResumen = new JLabel("Resumen");
		//lblResumen.setIcon(new ImageIcon(MenuUsuario.class.getResource("/imagenes/pessoas.png")));
		lblResumen.setBounds(27,11, 200, 34);
		lblResumen.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumen.setForeground(Color.WHITE);
		lblResumen.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnResumen.add(lblResumen);
		
		JSeparator separator_1 = new JSeparator();
		separator.setBounds(26, 260, 201, 2);
		panelMenu.add(separator_1);
		header.setLayout(null);
		header.setBackground(Color.WHITE);
		header.setBounds(0, 0, 944, 36);
		//contentPane.add(header);
		
	
		
	
		
		
	    JPanel panelFecha = new JPanel();
	    panelFecha.setBackground(new Color(255, 181, 51));
	    panelFecha.setBounds(256, 0, 688, 161);
	    panelFecha.setBorder(BorderFactory.createBevelBorder(1));
	  //  contentPane.add(panelFecha);
	    panelFecha.setLayout(null);
	    
	  
	    
	    JLabel lblNewLabel_1 = new JLabel("Sistema de fiscalizacion");
	    lblNewLabel_1.setBounds(300, 140, 400, 42);
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
	    contentPane.add(lblNewLabel_1);
	    lblNewLabel_1.setForeground(Color.BLACK);
	    lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 35));
	    
	    JLabel labelFecha = new JLabel("New label");
	    labelFecha.setBounds(700, 30, 350, 36);
	    labelFecha.setHorizontalAlignment(SwingConstants.LEFT);
	    contentPane.add(labelFecha);
	    labelFecha.setForeground(Color.BLACK);
	    labelFecha.setFont(new Font("Roboto", Font.PLAIN, 25));
	    Date fechaActual = new Date(); //fecha y hora actual
	    String fecha = new SimpleDateFormat("dd/MM/yyyy").format(fechaActual); //formatear la fecha en una cadena
	    labelFecha.setText("Hoy es " + fecha); //setear la representacion en cadena de la fecha
	/* try {
		 Login login = new Login(); 
		    login.Login();
		    String usu = login.getUsuarioPass().toString();
		    System.out.println(usu);
	} catch (Exception e) {
		System.out.println(e.getMessage().toString());
		// TODO: handle exception
	}
*/

	    
	    
	  
	    
	    JLabel lblNewLabel = new JLabel("Bienvenido " );
	    lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 30));
	    lblNewLabel.setBounds(302, 234, 500, 46);
	    contentPane.add(lblNewLabel);
	    
	    String textoDescripcion = "<html><body>Sistema de fiscalizacon paralos agentes de control. Registre y visualice los dominios fiscalizados mediante un sistema practico e intuitivo.</body></html>";
	    JLabel labelDescripcion = new JLabel(textoDescripcion);
	    labelDescripcion.setFont(new Font("Roboto", Font.PLAIN, 17));
	   labelDescripcion.setBackground(new Color(227, 228, 228));
	    labelDescripcion.setBounds(312, 291, 598, 66);
	    contentPane.add(labelDescripcion);
	    
	    String textoDescripcion1 = "<html><body> Este sistema optimizara la tarea de fiscalizacion, garantizando la uniformidad de los datos. Ademas le permitira consultar de forma rapida las normas nesesarias para dicha tarea.</body></html>";
	    JLabel labelDescripcion_1 = new JLabel(textoDescripcion1);
	    labelDescripcion_1.setFont(new Font("Roboto", Font.PLAIN, 17));
	    labelDescripcion_1.setBounds(311, 345, 569, 88);
	    contentPane.add(labelDescripcion_1);
	    
	    JLabel lblNewLabel_3 = new JLabel("- Registro de DOMINIOS");
	    lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblNewLabel_3.setBounds(312, 444, 295, 27);
	    lblNewLabel_3.setBackground(new Color(227, 228, 228));
	    contentPane.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_3_1 = new JLabel("- Consulta en la base de datos");
	    lblNewLabel_3_1.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblNewLabel_3_1.setBounds(312, 482, 355, 27);
	    contentPane.add(lblNewLabel_3_1);
	    
	    JLabel lblNewLabel_3_2 = new JLabel("- Consultas a las normas vigentes");
	    lblNewLabel_3_2.setFont(new Font("Roboto", Font.PLAIN, 17));
	    lblNewLabel_3_2.setBounds(312, 520, 295, 27);
	    contentPane.add(lblNewLabel_3_2);
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
}
