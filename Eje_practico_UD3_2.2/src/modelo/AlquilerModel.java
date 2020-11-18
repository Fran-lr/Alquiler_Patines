package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class AlquilerModel {

	private DB con;

	public void altaCliente() throws SQLException {
		
		
		
		String comprobarCon = con.comprobarConexion();
		System.out.println(comprobarCon);

		Connection conn = con.conseguirConexion();
		PreparedStatement stmt = null;

		String nCompleto = "Paco Gomez";
		String nSerie = "23rfw4324";
		Date fAlquiler = new Date();
		Date fDevolucion = new Date();
		String Observaciones = "Observaqcion 3";


		String comando = "insert into alquiler values(?,?,?,?,?)";

		stmt = conn.prepareStatement(comando);

		stmt.setString(1, nCompleto);//Intoducimos el cliente
		stmt.setString(2, nSerie);
		stmt.setDate(3, (java.sql.Date) fAlquiler);
		stmt.setDate(4, (java.sql.Date) fDevolucion);
		stmt.setString(5, Observaciones);
	

		stmt.executeUpdate();
		stmt.close();
		conn.close();

	}

}
