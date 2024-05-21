package br.unisal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.unisal.modelagem.Cliente; 



public class TesteConexao {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			if(con != null) {
				System.out.println("Conexão Realizada");
				Cliente cliente = new Cliente();
				cliente.setCpf(987654321);
				cliente.setNome("Leonardo");
				cliente.setEndRua("Av. Brasil");
				cliente.setEndNum(1000);
				cliente.setEndBairro("Jardim Glória");
				cliente.setEndCidade("Americana");
				cliente.setEndUF("SP");
				cliente.setSexo("M");
				
				ClienteDao dao = new ClienteDao();
				dao.adicionar(cliente);
				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

