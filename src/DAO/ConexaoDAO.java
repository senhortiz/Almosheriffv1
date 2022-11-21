/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hector
 */
public class ConexaoDAO {
    private static Connection conexao = null;
	public Connection Conectar () {
		try {
			if (conexao==null) {
				String url = "jdbc:mysql://localhost/bancoalmox";
				conexao = DriverManager.getConnection(url,"root","");
			}
		} catch (SQLException erro) {
			erro.printStackTrace();
		}
		return conexao;
	}
	public static void FecharConexao(Connection c) {
		try {
			if (c!=null) {
				c.close();
				conexao = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
