package Logica;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import infra.MySQLConnection;

public class RegistroDao {
	
	Integer Id;
	String fecha;
	String lugar;
	String dominio;
	String tipo;
	String uso;
	String destino;
	Integer rto;
	Integer seg;
	Integer cin;
	Integer cub;
	Integer luc;
	Integer hab;
	Integer inf;
	Integer inc;
	
	
	 private static ResultSet IdGen;
	 MySQLConnection CN = new MySQLConnection();
	 PreparedStatement PS = null;


	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	public Integer getRto() {
		return rto;
	}
	public void setRto(Integer rto) {
		this.rto = rto;
	}
	public Integer getSeg() {
		return seg;
	}
	public void setSeg(Integer seg) {
		this.seg = seg;
	}
	public Integer getCin() {
		return cin;
	}
	public void setCin(Integer cin) {
		this.cin = cin;
	}
	public Integer getCub() {
		return cub;
	}
	public void setCub(Integer cub) {
		this.cub = cub;
	}
	public Integer getLuc() {
		return luc;
	}
	public void setLuc(Integer luc) {
		this.luc = luc;
	}
	public Integer getHab() {
		return hab;
	}
	public void setHab(Integer hab) {
		this.hab = hab;
	}
	public Integer getInf() {
		return inf;
	}
	public void setInf(Integer inf) {
		this.inf = inf;
	}
	public Integer getInc() {
		return inc;
	}
	public void setInc(Integer inc) {
		this.inc = inc;
	}
	public static ResultSet getIdGen() {
		return IdGen;
	}
	public static void setIdGen(ResultSet idGen) {
		IdGen = idGen;
	}
	public MySQLConnection getCN() {
		return CN;
	}
	public void setCN(MySQLConnection cN) {
		CN = cN;
	}
	public PreparedStatement getPS() {
		return PS;
	}
	public void setPS(PreparedStatement pS) {
		PS = pS;
	}





 public void GuardarMySQLR(String fecha, String lugar, String dominio, String destino, String tipo, String uso,
			Integer rto, Integer seg, Integer cin, Integer cub, Integer luc, Integer hab, Integer inf,
			Integer inc) {

	
	 setFecha(fecha);
	 setLugar(lugar);
	 setDominio(dominio);
	 setDestino(destino);
	 setTipo(tipo);
	 setUso(uso);
	 setRto(rto);
	 setSeg(seg);
	 setCin(cin);
	 setCub(cub);
	 setLuc(luc);
	 setHab(hab);
	 setInf(inf);
	 setInc(inc);
	 
	 
	 String SQL_INSERTR= "INSERT INTO fiscalizado (Fecha,Lugar, Dominio, Destino, Tipo, Uso, RTO, Seguro, Cinturon, Cubiertas, Luces, Habilitacion, Infraccion, Incautacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	 
	 try {
		CallableStatement cs = CN.Conexion().prepareCall(SQL_INSERTR);
		cs.setString(1, getFecha());
		cs.setString(2, getLugar());
		cs.setString(3, getDominio());
		cs.setString(4, getDestino());
		cs.setString(5, getTipo());
		cs.setString(6, getUso());
		cs.setInt(7, getRto());
		cs.setInt(8, getSeg());
		cs.setInt(9, getCin());
		cs.setInt(10, getCub());
		cs.setInt(11, getLuc());
		cs.setInt(12, getHab());
		cs.setInt(13, getInf());
		cs.setInt(14, getInc());
		cs.execute();
		IdGen= cs.getGeneratedKeys();
		if (IdGen.next()) {
		}
	
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "registro no guardado"+ e.toString());
		System.out.println( e.getMessage().toString());
	}
	
	 
 }

public DefaultTableModel buscarR(String buscar) throws ClassNotFoundException {
	
	String [] nombreCol = {" Id", "Fecha","Dominio", "Lugar", "Destino", "Infraccion"};
	String [] datos = new String [6];
	
	DefaultTableModel modelo = new DefaultTableModel(null,nombreCol);
	String consulta = "SELECT * FROM fiscalizado WHERE Fecha  like '%"+buscar+"%' or Dominio  like '%"+buscar+"%' or Lugar like '%"+buscar+"%'   or Destino like '%"+buscar+"%' or Infraccion like '%"+buscar+"%' "   ;
	//argumento de busqueda parcial  "SELECT * FROM reservas WHERE reservas.Id like '%"+buscar+"%' or FormaDePago like '%"+buscar+"%' ";
   
	Connection cn = null;
	MySQLConnection CN = new MySQLConnection();
    PreparedStatement PS = null;
    ResultSet rs = null;

    try {
		cn = CN.Conexion();
		PS = cn.prepareStatement(consulta);
		rs = PS.executeQuery();
	
		while (rs.next()) {
			datos[0] = rs.getString("Id");
			datos[1] = rs.getString("Fecha");
			datos[2] = rs.getString("Dominio");
			datos[3] = rs.getString( "Lugar");
			datos[4] = rs.getString("Destino");
			datos[5] = rs.getString("Infraccion");
			modelo.addRow(datos);
	
		}
		
	} catch (SQLException e) {
        e.printStackTrace();
        System.out.println("error"+e.toString());
    } finally {
        // Cerrar los recursos
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (PS != null) {
            try {
                PS.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
    return modelo;
}

public void verR(JTable tbRegistros) {
	 MySQLConnection CN = new MySQLConnection();
	 DefaultTableModel modelo = new DefaultTableModel();
	 
	 TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
	 tbRegistros.setRowSorter(OrdenarTabla);
	 
	    modelo.addColumn("Id");
	 	modelo.addColumn("Fecha");
		modelo.addColumn("Dominio");
		modelo.addColumn("Lugar");
		modelo.addColumn("Destino");
		modelo.addColumn("Infraccion");
	 
	 tbRegistros.setModel(modelo);
	 String sql = "SELECT Id, Fecha, Dominio, Lugar, Destino, Infraccion FROM fiscalizado";
	 
	 String[] datos = new String[6];
	 Statement st;
	 try {
		st = CN.Conexion().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()){ 
			datos[0] = rs.getString(1);
			datos[1] = rs.getString(2);
			datos[2] = rs.getString(3);
			datos[3] = rs.getString(4);
			datos[4] = rs.getString(5);
			datos[5] = rs.getString(6);
			modelo.addRow(datos);
		}
		tbRegistros.setModel(modelo);
		
		
	} catch (Exception e) {
	System.out.println(e.getMessage().toString());
	}
	 
 }

 public void selecR(JTable tbRegistros,  JTextField id, JTextField fecha, JTextField dominio, JTextField lugar,  JTextField destino, JTextField inf) {
	    try {
	        int fila = tbRegistros.getSelectedRow();
	        int columna = tbRegistros.getColumnCount();
	        
	        if (fila >= 0) {
	            Object[] datosFila = new Object[columna];
	            datosFila[0] = tbRegistros.getValueAt(fila, 0);
	            datosFila[1] = tbRegistros.getValueAt(fila, 1);
	            datosFila[2] = tbRegistros.getValueAt(fila, 2);
	            datosFila[3] = tbRegistros.getValueAt(fila, 3);
	            datosFila[4] = tbRegistros.getValueAt(fila, 4);
	            datosFila[5] = tbRegistros.getValueAt(fila, 5);
	            
	            
	            // Asignar los valores a los JTextField correspondientes
	            id.setText(datosFila[0].toString());
	            fecha.setText(datosFila[1].toString());
	            dominio.setText(datosFila[2].toString());
	            lugar.setText(datosFila[3].toString());
	            destino.setText(datosFila[4].toString());
	            inf.setText(datosFila[5].toString());
	            
	            // Imprimir los datos de la fila seleccionada
	            for (Object dato : datosFila) {
	                if (dato != null) {
	                    System.out.print(dato + " ");
	                }
	            }
	            System.out.println();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna registro");
	        }
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Error al seleccionar el registro: " + e.toString());
	    }
	}

 public void EliminarMySQLR(JTable tbRegistros) throws ClassNotFoundException {
	    int fila = tbRegistros.getSelectedRow();
	    int Id = Integer.parseInt(tbRegistros.getValueAt(fila, 0).toString());

	    MySQLConnection CN = new MySQLConnection();

	    String SQL_DELETE = "DELETE FROM fiscalizado WHERE Id = ?";

	    try {
	        PreparedStatement ps = CN.Conexion().prepareStatement(SQL_DELETE);
	        ps.setInt(1, Id);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected == 1) {
	            JOptionPane.showMessageDialog(null, "Registro eliminado.");
	        } else {
	            JOptionPane.showMessageDialog(null, "No se pudo eliminar la reserva.");
	        }
	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar la reserva: " + e.toString());
	        System.out.println(e.getMessage().toString());
	    }
	}
 
 
 
 

}


