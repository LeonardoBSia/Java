package br.unisal.dao;

/**
 * Prover uma ponte de conexão com SGBD - Sistema Gerenciador de B. Dados
 * @author Leonardo Sia
 * @data 07/05/2024
 */

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	
	public class ConnectionFactory {
		public static Connection getConnection() throws SQLException{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				return DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/aula",
						"root",
						"Leo20100*"
						);
			}catch(ClassNotFoundException erro) {
				throw new SQLException("Houve um erro, não foi possível a conexão "
						+ erro);
			}
		}
	}

