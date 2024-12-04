package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection  getConn() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root","");
		}catch(ClassNotFoundException e) {
			System.out.println("Erro ao localizar o driver");
		}catch (SQLException e) {
			System.out.println("Erro na conexão");
		}
		return conn;
	}

}

