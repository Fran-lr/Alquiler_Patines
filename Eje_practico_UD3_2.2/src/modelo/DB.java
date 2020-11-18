package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	private Connection conn;

	public DB() {
		// Cargamos el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}

	}

	public void cerrarConexion() {
		try {// Cerrar la conexion
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection conseguirConexion() {
		try {// Conectamos a la base de datos

			String sURL = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			conn = DriverManager.getConnection(sURL, "root", "1111");

		} catch (SQLException e) {
			e.printStackTrace();
			e.getErrorCode();
			System.out.println("Error de conexion a la base de datos");
		}
		return conn;
	}

	public String comprobarConexion() {

		String com = "";

		if (conseguirConexion() != null) {
			com = "Conexion Correcta";
		} else {
			System.out.println();
			com = "Conexion Erronea";
		}

		return com;

	}
}
