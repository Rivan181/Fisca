package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import Logica.RegistroDao;


@SuppressWarnings("serial")
public class Registros extends JFrame {

	private JPanel contentPane;
	public  JTextField txtDominio = null;
	public  JComboBox<String> txtTipos;
	public  JDateChooser txtFecha;

	public JComboBox<String> txtDestino;
	public JComboBox<String> txtUso;
	public JComboBox<String> txtLicencia;
	public JComboBox<String> txtLugar;
	
	public JCheckBox Rto;
	int xMouse, yMouse;
	private JLabel labelExit;
	private JLabel labelAtras;	
	private JCheckBox SEG;
	private Component CIN;
	private Component CUB;
	private JCheckBox LUC;
	private JCheckBox HAB;
	private JCheckBox INF;
	private JCheckBox INC;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Registros frame = new Registros();
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
	public Registros() {
		
		super("Registro");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 560);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		


		//panel izq
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(237,237,237));
		panel.setBounds(0, 0, 910, 560);
		contentPane.add(panel);
		panel.setLayout(null);
		
		// Código que crea los elementos de la interfáz gráfica
		
		JLabel lblTitulo = new JLabel("Lista de control");
		lblTitulo.setBounds(75, 40, 300, 42);
		lblTitulo.setForeground(Color.black);
		lblTitulo.setFont(new Font("Roboto", Font.BOLD, 30));
		panel.add(lblTitulo);
		
	
		
		
		
		JLabel lblCheckIn = new JLabel("FECHA");
		lblCheckIn.setForeground(SystemColor.textInactiveText);
		lblCheckIn.setBounds(75, 120, 150, 14);
		lblCheckIn.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblCheckIn);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(SystemColor.textHighlight);
		separator_1_2.setBounds(60, 190, 280, 2);
		separator_1_2.setBackground(SystemColor.textHighlight);
		panel.add(separator_1_2);
		
		JLabel lblDominio = new JLabel("DOMINIO");
		lblDominio.setForeground(SystemColor.textInactiveText);
		lblDominio.setBounds(75, 200, 220, 15);
		lblDominio.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblDominio);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(SystemColor.textHighlight);
		separator_1_1.setBounds(60, 265, 280, 11);
		separator_1_1.setBackground(SystemColor.textHighlight);
		panel.add(separator_1_1);
	
		JLabel lblFormaPago = new JLabel("DESTINO");
		lblFormaPago.setForeground(SystemColor.textInactiveText);
		lblFormaPago.setBounds(75, 275, 187, 24);
		lblFormaPago.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblFormaPago);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBounds(60, 355, 280, 2);
		separator_1.setBackground(SystemColor.textHighlight);
		panel.add(separator_1);
		
		JLabel lblTipo = new JLabel("TIPO DE VEHICULO");
		lblTipo.setForeground(SystemColor.textInactiveText);
		lblTipo.setBounds(75, 365, 187, 24);
		lblTipo.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblTipo);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setForeground(SystemColor.textHighlight);
		separator_1_4.setBackground(SystemColor.textHighlight);
		separator_1_4.setBounds(60, 435, 280, 2);
		panel.add(separator_1_4);
		
		//panel derecho
		
		JSeparator separatorv = new JSeparator(JSeparator.VERTICAL);
		separatorv.setForeground(SystemColor.textHighlight);
		separatorv.setBounds(455, 150, 4, 290);
		separatorv.setBackground(SystemColor.textHighlight);
		panel.add(separatorv);

		JLabel lblUso = new JLabel("TIPO DE USO");
		lblUso.setForeground(SystemColor.textInactiveText);
		lblUso.setBounds(570, 120, 187, 24);
		lblUso.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblUso);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setForeground(SystemColor.textHighlight);
		separator_1_5.setBackground(SystemColor.textHighlight);
		separator_1_5.setBounds(555, 190, 280, 2);
		panel.add(separator_1_5);
		
		JLabel lblLicencia = new JLabel("TIPO DE LICENCIA");
		lblLicencia.setForeground(SystemColor.textInactiveText);
		lblLicencia.setBounds(570, 195, 187, 24);
		lblLicencia.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblLicencia);
		
		JSeparator separator_1_6 = new JSeparator();
		separator_1_6.setForeground(SystemColor.textHighlight);
		separator_1_6.setBackground(SystemColor.textHighlight);
		separator_1_6.setBounds(555, 265, 280, 2);
		panel.add(separator_1_6);
		
		JLabel lblLugar = new JLabel("LUGAR");
		lblLugar.setForeground(SystemColor.textInactiveText);
		lblLugar.setBounds(570, 275, 187, 24);
		lblLugar.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		panel.add(lblLugar);
		
		JSeparator separator_1_7 = new JSeparator();
		separator_1_7.setForeground(SystemColor.textHighlight);
		separator_1_7.setBackground(SystemColor.textHighlight);
		separator_1_7.setBounds(555, 350, 280, 2);
		panel.add(separator_1_7);
	

		JPanel btnexit = new JPanel();
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showOptionDialog(null, "¿Seguro de terminar?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"SI", "NO"}, "SI");
				if (result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
				else if  (result == JOptionPane.NO_OPTION) {
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnexit.setBackground(Color.red);
				labelExit.setForeground(Color.white);
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				 btnexit.setBackground(new Color(237,237,237));
			     labelExit.setForeground(Color.white);
			}
		});
		btnexit.setLayout(null);
		btnexit.setBackground(new Color(237,237,237));
		btnexit.setBounds(857, 0, 53, 36);
		panel.add(btnexit);
		
		labelExit = new JLabel("X");
		labelExit.setForeground(Color.black);
		labelExit.setBounds(0, 0, 53, 36);
		btnexit.add(labelExit);
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);
		labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JPanel btnAtras = new JPanel();
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuUsuario usuario = new MenuUsuario();
				usuario.setVisible(true);
				dispose();				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAtras.setBackground(new Color(237,237,237));
				labelAtras.setForeground(Color.white);
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				 btnAtras.setBackground(new Color(237,237,237));
			     labelAtras.setForeground(Color.black);
			}
		});
		btnAtras.setLayout(null);
		btnAtras.setBackground(new Color(237,237,237));
		btnAtras.setBounds(0, 0, 53, 36);
		panel.add(btnAtras);
		
		labelAtras = new JLabel("<");
		labelAtras.setBounds(0, 0, 53, 36);
		btnAtras.add(labelAtras);
		labelAtras.setHorizontalAlignment(SwingConstants.CENTER);
		labelAtras.setFont(new Font("Roboto", Font.PLAIN, 23));
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 910, 36);
		header.setBackground(new Color(237,237,237));
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
		header.setLayout(null);
		header.setBackground(new Color(237,237,237));
		panel.add(header);
		
		
		

	
		txtFecha = new JDateChooser();
		txtFecha.setDate(new Date()	);
		txtFecha.getCalendarButton().setBackground(SystemColor.textHighlight);
		txtFecha.getCalendarButton().setIcon(new ImageIcon(Registros.class.getResource("/imagenes/reservado.png")));
		txtFecha.getCalendarButton().setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFecha.setBounds(75, 145, 250, 35);
		txtFecha.setAlignmentX(SwingConstants.CENTER);
		txtFecha.getCalendarButton().setBounds(228, 0, 21, 33);
		txtFecha.setBackground(Color.WHITE);
		txtFecha.setBorder(new LineBorder(SystemColor.window));
		txtFecha.setDateFormatString("yyyy-MM-dd");
		txtFecha.setFont(new Font("Roboto", Font.PLAIN, 20));
		panel.add(txtFecha);
		
		
		txtDominio = new JTextField();
		txtDominio.setBackground(SystemColor.text);
		txtDominio.setHorizontalAlignment(SwingConstants.CENTER);
		txtDominio.setForeground(Color.BLACK);
		txtDominio.setBounds(75, 220, 250, 33);
		txtDominio.setFont(new Font("Roboto Black", Font.BOLD, 20));
		txtDominio.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
		panel.add(txtDominio);

		

		txtDestino = new JComboBox<String>();
		txtDestino.setBounds(75, 305, 250, 38);
		txtDestino.setBackground(SystemColor.text);
		txtDestino.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		txtDestino.setFont(new Font("Roboto", Font.BOLD, 20));
		txtDestino.setModel(new DefaultComboBoxModel<String>(new String[] {"","Centros invernales","Ushuaia", "Tolhuin", "Ruta Comp. J","Rio Grande "}));
		panel.add(txtDestino);
		
		txtLugar = new JComboBox<String>();
		txtLugar.setBounds(570, 305, 250, 38);
		txtLugar.setBackground(SystemColor.text);
		txtLugar.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		txtLugar.setFont(new Font("Roboto", Font.BOLD, 20));
		txtLugar.setModel(new DefaultComboBoxModel<String>(new String[] {"Puesto 365", "Puesto Cesar Real", "Lago Escondido","Parque Nacional"}));
		panel.add(txtLugar);
		
		txtTipos = new JComboBox<String>();
		txtTipos.setBounds(75, 390, 250, 38);
		txtTipos.setBackground(SystemColor.text);
		txtTipos.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		txtTipos.setFont(new Font("Roboto", Font.BOLD, 20));
		txtTipos.setModel(new DefaultComboBoxModel<String>(new String[] {"", "AUTO","PICK UP", "CAMION","SEMIREMOLQUE","MINIBUS","TRANSPORTE", "TODO TERRENO", "FURGON"}));
		panel.add(txtTipos);
		
		txtUso = new JComboBox<String>();
		txtUso.setBounds(570, 145, 250, 38);
		txtUso.setBackground(SystemColor.text);
		txtUso.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		txtUso.setFont(new Font("Roboto", Font.BOLD, 20));
		txtUso.setModel(new DefaultComboBoxModel<String>(new String[] {"","PATICULAR", "ALQUILER","CARGAS GENERALES","CARGAS PELIGROSAS", "TURISMO", "TURISMO ALTERNATIVO","TAXI","REMIS"}));
		panel.add(txtUso);
		
		txtLicencia = new JComboBox<String>();
		txtLicencia.setBounds(570, 220, 250, 38);
		txtLicencia.setBackground(SystemColor.text);
		txtLicencia.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		txtLicencia.setFont(new Font("Roboto", Font.BOLD, 20));
		txtLicencia.setModel(new DefaultComboBoxModel<String>(new String[] { "","B1", "B2", "D1","D2","D3", "D4", "C1","C2","C3","E1","E2","G1","G2","G2","A1","A2","A3"}));
		panel.add(txtLicencia);
		
		Rto = new JCheckBox("RTO");
		Rto.setBounds(570,365, 70, 30);
		Rto.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(Rto);
		
		SEG = new JCheckBox("SEG");
		SEG.setBounds(660,365, 70, 30);
		SEG.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(SEG);		
		
		CIN = new JCheckBox("CIN");
		CIN.setBounds(760,365, 70, 30);
		CIN.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(CIN);		
		
		CUB = new JCheckBox("CUB");
		CUB.setBounds(570,410, 70, 30);
		CUB.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(CUB);		
		
		LUC = new JCheckBox("LUC");
		LUC.setBounds(760,410, 70, 30);
		LUC.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(LUC);		
		
		HAB = new JCheckBox("HAB");
		HAB.setBounds(660,410, 70, 30);
		HAB.setFont(new Font("Roboto", Font.BOLD, 20));
		panel.add(HAB);		
		
		INF = new JCheckBox("INFRACCION");
		INF.setBounds(75,493, 150, 40);
		INF.setFont(new Font("Roboto", Font.BOLD, 20));
		INF.setBackground(new Color(242, 78, 0));
		INF.setForeground(Color.WHITE);
		panel.add(INF);		
		
		INC = new JCheckBox("INCAUTACION");
		INC.setBounds(250,493, 170, 40);
		INC.setFont(new Font("Roboto", Font.BOLD, 20));
		INC.setBackground(new Color(242, 78, 0));
		INC.setForeground(Color.WHITE);
		panel.add(INC);		
			
			
		JPanel btnGuardar = new JPanel();
		btnGuardar.addMouseListener(new MouseAdapter() {
			
			@Override
		   public void mouseClicked(MouseEvent e) {
				RegistroDao datos= new RegistroDao();
				
				if(!txtDominio.getText().isEmpty() && !txtDestino.getSelectedItem().equals("") && !txtTipos.getSelectedItem().equals("") &&  !txtUso.getSelectedItem().equals("") && !txtLicencia.getSelectedItem().equals("") )  {
				Date Fecha = txtFecha.getDate();
			    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String fecha = dateFormat.format(Fecha);
				
				String lugar = txtLugar.getSelectedItem().toString();
				String dominio = txtDominio.getText();
				String destino = txtDestino.getSelectedItem().toString();
				String tipo = txtTipos.getSelectedItem().toString();
				String uso = txtUso.getSelectedItem().toString();
				Integer rto = Rto.isSelected() ? 1 :  0;
				Integer seg = SEG.isSelected() ? 1 :  0;
				Integer cin = ((AbstractButton) CIN).isSelected() ? 1 :  0;
				Integer cub = ((AbstractButton) CUB).isSelected() ? 1 :  0;
				Integer luc = LUC.isSelected() ? 1 :  0;
				Integer hab = HAB.isSelected() ? 1 :  0;
				Integer inf = INF.isSelected() ? 1 :  0;
				Integer inc = INC.isSelected() ? 1 :  0;

				datos.GuardarMySQLR(fecha,lugar, dominio, destino, tipo, uso, rto, seg, cin, cub, luc, hab, inf, inc);
				JOptionPane.showMessageDialog(null, "Registro guardado");
				
				txtDominio.setText("");
				txtDestino.setSelectedItem("");
				txtTipos.setSelectedItem("");
				txtUso.setSelectedItem("");
				txtLicencia.setSelectedItem("");
				Rto.setSelected(false);
				SEG.setSelected(false);
				((AbstractButton) CIN).setSelected(false);
				((AbstractButton) CUB).setSelected(false);
				HAB.setSelected(false);
				LUC.setSelected(false);
				INF.setSelected(false);
				INC.setSelected(false);
				}else {
					JOptionPane.showMessageDialog(null, "Faltan datos");
				}
			}						
		});
		btnGuardar.setLayout(null);
		btnGuardar.setBackground(new Color(97, 110, 204));
		btnGuardar.setBounds(600, 493, 150, 40);
		panel.add(btnGuardar);
		btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		JLabel lblGuardar = new JLabel("GUARDAR");
		lblGuardar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuardar.setForeground(Color.WHITE);
		lblGuardar.setFont(new Font("Roboto", Font.PLAIN,20));
		lblGuardar.setBounds(0, 0, 150, 40);
		btnGuardar.add(lblGuardar);

	}
		

	 private void headerMousePressed(java.awt.event.MouseEvent evt) {
	        xMouse = evt.getX();
	        yMouse = evt.getY();
	    }

	    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
	        int x = evt.getXOnScreen();
	        int y = evt.getYOnScreen();
	        this.setLocation(x - xMouse, y - yMouse);
}
}