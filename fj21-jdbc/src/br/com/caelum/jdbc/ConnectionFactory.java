package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		Connection con = null;
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","");
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
	//	return con;

	}


}
