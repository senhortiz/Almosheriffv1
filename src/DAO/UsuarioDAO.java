/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import View.CadastroUsuario;
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
    PreparedStatement pstm;
    
	
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
        
        public void cadastrarUsuario(UsuarioDTO objusuariodto) {
		
		String sql = "INSERT INTO usuario(nome_usuario, senha_usuario) VALUES (?,?)";
		
		conexao = new ConexaoDAO().Conectar();
		CadastroUsuario objusuario = new CadastroUsuario();
		
		try {
			
			pstm = conexao.prepareStatement(sql);
			pstm.setString(1, objusuariodto.getNome_usuario());
			pstm.setString(2, objusuariodto.getSenha_usuario());
			                        
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
		}
	}
}
