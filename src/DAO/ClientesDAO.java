/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClientesDTO;
import View.CadastroClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Hector
 */
public class ClientesDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClientesDTO> lista = new ArrayList<>();
	
public void cadastrarClientes(ClientesDTO objclientesdto) {
		
		String sql = "INSERT INTO `clientes`(`nome`, `cpfcnpj`,`endereco`, `telefone`, `email`) VALUES (?,?,?,?,?)";
		
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
public ArrayList<ClientesDTO> listarClientes(){
		
		String sql = "Select * from clientes";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				ClientesDTO objclientesdto = new ClientesDTO();
				objclientesdto.setId_cliente(rs.getInt("id"));
				objclientesdto.setNome_cliente(rs.getString("nome"));
				objclientesdto.setCpfcnpj_cliente(rs.getInt("cpfcnpj"));
				objclientesdto.setEndereco_cliente(rs.getString("endereco"));
				objclientesdto.setTelefone_cliente(rs.getInt("telefone"));
				objclientesdto.setEmail_cliente(rs.getString("email"));
				
				lista.add(objclientesdto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
public void alterarClientes(ClientesDTO objclientesdto){
            String sql = "update clientes set nome = ?, cpfcnpj = ?, endereco = ?, telefone = ?, email = ? where id = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(6, objclientesdto.getId_cliente());
			pstm.setString(1, objclientesdto.getNome_cliente());
			pstm.setInt(2, objclientesdto.getCpfcnpj_cliente());
			pstm.setString(3, objclientesdto.getEndereco_cliente());
			pstm.setInt(4, objclientesdto.getTelefone_cliente());
			pstm.setString(5, objclientesdto.getEmail_cliente());
						
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"As informações da peça foram alteradas com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Erro ao alterar informações da peça!" + erro);
		}
            
        }

        public void excluirClientes(ClientesDTO objclientesdto){
            String sql = "delete from clientes where id = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1,objclientesdto.getId_cliente());
                
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir cliente!!!");
            }
        }
}
