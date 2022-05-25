package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Programa {

	public static void main(String[] args) throws SQLException  {
		
//		incluir();
		listar();
//		atualizar();
//		apagar();
					
	}
	public static void apagar() throws SQLException{
		
		// 1.Abrir conexao com banco de dados;
		
		String url = "jdbc:sqlite:C:\\Lewy\\2-bi\\DesenvolvimentodeSoftware\\24-05\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
			
		//2.Criar o comando e executar o SQL.
		
		Statement comando = conexao.createStatement();
		String queryDelete = "UPDATE cliente SET nome = 'Ana Maria' WHERE codigo = 3";
		comando.execute(queryDelete);
		
	}
	
	public static void atualizar() throws SQLException{
		
		// 1.Abrir conexao com banco de dados;
		
		String url = "jdbc:sqlite:C:\\Lewy\\2-bi\\DesenvolvimentodeSoftware\\24-05\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
			
		//2.Criar o comando e executar o SQL.
		
		Statement comando = conexao.createStatement();
		String queryUpdate = "UPDATE cliente SET nome = 'Ana Maria' WHERE codigo = 3";
		comando.executeUpdate(queryUpdate);
		
	}

	public static void incluir() throws SQLException{
		
		// 1.Abrir conexao com banco de dados;
		
		String url = "jdbc:sqlite:C:\\Lewy\\2-bi\\DesenvolvimentodeSoftware\\24-05\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
			
		//2.Criar o comando e executar o SQL.
		
		Statement comando = conexao.createStatement();
		String queryInsert = "INSERT INTO cliente (nome, dt_nasc, cpf, email) VALUES ('Ana', '2000/06/23', '7654321', 'ana@gmail.com')";
		comando.execute(queryInsert);
		
	}
			
	
	public static void listar() throws SQLException{
		
		// 1.Abrir conexao com banco de dados;
		
		String url = "jdbc:sqlite:C:\\Lewy\\2-bi\\DesenvolvimentodeSoftware\\24-05\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
		
		
		//2.Criar o comando e executar o SQL.
		Statement comando = conexao.createStatement();
		String querySelect = "SELECT * FROM cliente";
		ResultSet resultado  = comando.executeQuery(querySelect);
		
		//3. Mostrar os dados
		while (resultado.next()) {
			int codigo = resultado.getInt(1);
			String dt_nasc = resultado.getString(2);
			String cpf = resultado.getString(3);
			String email = resultado.getString(4);
			String nome = resultado.getString(5);
			
			System.out.println("Codigo: " + codigo);
			System.out.println("Nome: "  + nome);
			System.out.println("------------");
			
		}
	}

	
	
}
