/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class UsuarioDAO {
    Connection conexao;
	
	public ResultSet autentificacaoUsuario(UsuarioDTO bancoalmox) {
		conexao = new ConexaoDAO().Conectar();
		
		try {
			String sql = "select * from usuario where nome_usuario = ? and senha_usuario =?";
			
			PreparedStatement pstm = conexao.prepareStatement(sql);
			pstm.setString(1, bancoalmox.getNome_usuario());
			pstm.setString(2, bancoalmox.getSenha_usuario());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
			return null;
		}
		
	}
}
