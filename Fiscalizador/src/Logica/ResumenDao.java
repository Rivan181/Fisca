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

public class ResumenDao {
	
	
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





public DefaultTableModel buscarRes(String buscar) throws ClassNotFoundException {
	
	String [] nombreCol = {"Periodo", "Registros","RTO", "Seguro", "Luces", "Cinturon","Cubirtas", "Habilitacion",  "Infracciones", "Incautaciones"};
	String [] datos = new String [10];
	//consulta a realizar
	/*SELECT Fecha AS Periodo, count(CASE WHEN RTO = 1 THEN 1 END) AS RTO, 
	count(CASE WHEN Seguro = 1 THEN 1 END) AS Seguro,
	count(CASE WHEN Cinturon = 1 THEN 1 END) AS Cinturon,
	count(CASE WHEN Cubiertas = 1 THEN 1 END) AS Cubiertas,
	count(CASE WHEN Luces = 1 THEN 1 END) AS Luces,
	count(CASE WHEN Habilitacion = 1 THEN 1 END) AS Habilitacion,
	count(CASE WHEN Infraccion = 1 THEN 1 END) AS Infraccion,
	count(CASE WHEN Incautacion = 1 THEN 1 END) AS Incautacion
	FROM fiscalizado
	GROUP BY Fecha;
	*/
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
			datos[0] = rs.getString("Periodo");
			datos[1] = rs.getString("Registros");
			datos[2] = rs.getString("RTO");
			datos[3] = rs.getString( "Seguro");
			datos[4] = rs.getString("Luces");
			datos[5] = rs.getString("Cinturon");
			datos[6] = rs.getString("Cubirtas");
			datos[7] = rs.getString("Habilitacion");
			datos[8] = rs.getString("Infracciones");
			datos[9] = rs.getString("Incautaciones");
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

public void verRes(JTable tbRegistros) {
	 MySQLConnection CN = new MySQLConnection();
	 DefaultTableModel modelo = new DefaultTableModel();
	 
	 TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
	 tbRegistros.setRowSorter(OrdenarTabla);
	 
		modelo.addColumn("Periodo");
		modelo.addColumn("Registros");
		modelo.addColumn("RTO");
		modelo.addColumn("Seguro");
		modelo.addColumn("Luces");
		modelo.addColumn("Cinturon");
		modelo.addColumn("Cubirtas");
		modelo.addColumn("Habilitacion");
		modelo.addColumn("Infracciones");
		modelo.addColumn("Incautaciones");
	 
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


}
