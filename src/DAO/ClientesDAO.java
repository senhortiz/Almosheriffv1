/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClientesDTO;
import View.CadastroClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class ClientesDAO {
    Connection conn;
	PreparedStatement pstm;
	
public void cadastrarClientes(ClientesDTO objclientesdto) {
		
		String sql = "INSERT INTO `clientes`(`nome`, `cpf`,`endereço`, `telefone`, `email`) VALUES (?,?,?,?,?)";
		
		conn = new ConexaoDAO().Conectar();
		CadastroClientes objcadastroclientes = new CadastroClientes();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objclientesdto.getNome_cliente());
			pstm.setInt(2, objclientesdto.getCpfcnpj_cliente());
			pstm.setString(3, objclientesdto.getEndereco_cliente());
			pstm.setInt(4, objclientesdto.getTelefone_cliente());
			pstm.setString(5, objclientesdto.getEmail_cliente());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Cliente já cadastrado!");
		}
	}
}
