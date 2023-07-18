package conex;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexion {

	Connection con;
	private String url = "jdbc:mysql://localhost:3306/fiscaliza?useUnicode=true&use"+"JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"+"serverTimezone=UTC";
	public conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fiscalizador", "root","Classic6317");
			System.out.println("conexion exitosa");
		} catch (Exception e) {
			System.err.println("error de conexion" + e);
		}
				
	}

	public static void main(String[] args) {
		
		conexion cn = new conexion();
		java.sql.Statement st;
		ResultSet rs;
		try {
			if (cn.con != null) {
			st = cn.con.createStatement();
			rs = st.executeQuery("select * from control");
			while (rs.next()) {
				System.out.println(rs.getString("Dominio"));
			}
			cn.con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
}
