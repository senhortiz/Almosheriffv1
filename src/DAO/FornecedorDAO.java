/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FornecedorDTO;
import View.CadastroFornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class FornecedorDAO {
    Connection conn;
	PreparedStatement pstm;
	
public void cadastrarFornecedor(FornecedorDTO objfornecedordto) {
		
		String sql = "INSERT INTO  fornecedor (nome,cnpj,endereco,telefone,email) VALUES (?,?,?,?,?)";
		
		conn = new ConexaoDAO().Conectar();
		CadastroFornecedor objcadastrofornecedor = new CadastroFornecedor();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objfornecedordto.getNome_fornecedor());
			pstm.setInt(2, objfornecedordto.getCnpj_fornecedor());
			pstm.setString(3, objfornecedordto.getEndereco_fornecedor());
			pstm.setInt(4, objfornecedordto.getTelefone_fornecedor());
			pstm.setString(5, objfornecedordto.getEmail_fornecedor());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Fornecedor já cadastrado!");
		}
	}
}
