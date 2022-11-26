/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FornecedorDTO;
import View.CadastroFornecedor;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Hector
 */
public class FornecedorDAO {
    Connection conn;
    PreparedStatement pstm;
    ArrayList<FornecedorDTO> lista = new ArrayList<>();
    ResultSet rs;
	
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

	public ArrayList<FornecedorDTO> listarFornecedor(){
		
		String sql = "Select * from fornecedor";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				FornecedorDTO objfornecedordto = new FornecedorDTO();
				objfornecedordto.setId_fornecedor(rs.getInt("id"));
				objfornecedordto.setNome_fornecedor(rs.getString("nome"));
				objfornecedordto.setCnpj_fornecedor(rs.getInt("cnpj"));
				objfornecedordto.setEndereco_fornecedor(rs.getString("endereco"));
				objfornecedordto.setTelefone_fornecedor(rs.getInt("telefone"));
				objfornecedordto.setEmail_fornecedor(rs.getString("email"));
								
				lista.add(objfornecedordto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
	public ArrayList<FornecedorDTO> buscarFornecedorCodigo(String buscar){
		
		String sql = "Select * from fornecedor where id like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				FornecedorDTO objfornecedordto = new FornecedorDTO();
				objfornecedordto.setId_fornecedor(rs.getInt("id"));
				objfornecedordto.setNome_fornecedor(rs.getString("nome"));
				objfornecedordto.setCnpj_fornecedor(rs.getInt("cnpj"));
				objfornecedordto.setEndereco_fornecedor(rs.getString("endereco"));
				objfornecedordto.setTelefone_fornecedor(rs.getInt("telefone"));
				objfornecedordto.setEmail_fornecedor(rs.getString("email"));
				
				lista.add(objfornecedordto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
	public ArrayList<FornecedorDTO> buscarFornecedorNome(String buscar){
		
		String sql = "Select * from fornecedor where nome like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				FornecedorDTO objfornecedordto = new FornecedorDTO();
				objfornecedordto.setId_fornecedor(rs.getInt("id"));
				objfornecedordto.setNome_fornecedor(rs.getString("nome"));
				objfornecedordto.setCnpj_fornecedor(rs.getInt("cnpj"));
				objfornecedordto.setEndereco_fornecedor(rs.getString("endereco"));
				objfornecedordto.setTelefone_fornecedor(rs.getInt("telefone"));
				objfornecedordto.setEmail_fornecedor(rs.getString("email"));
				
				lista.add(objfornecedordto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
	public ArrayList<FornecedorDTO> buscarFornecedorCnpj(String buscar){
		
		String sql = "Select * from fornecedor where cnpj like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				FornecedorDTO objfornecedordto = new FornecedorDTO();
				objfornecedordto.setId_fornecedor(rs.getInt("id"));
				objfornecedordto.setNome_fornecedor(rs.getString("nome"));
				objfornecedordto.setCnpj_fornecedor(rs.getInt("cnpj"));
				objfornecedordto.setEndereco_fornecedor(rs.getString("endereco"));
				objfornecedordto.setTelefone_fornecedor(rs.getInt("telefone"));
				objfornecedordto.setEmail_fornecedor(rs.getString("email"));
				
				lista.add(objfornecedordto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
        
        public void alterarFornecedor(FornecedorDTO objfornecedordto){
            String sql = "update fornecedor set nome = ?, cnpj = ?, endereco = ?, telefone = ?, email = ? where id = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(6, objfornecedordto.getId_fornecedor());
			pstm.setString(1, objfornecedordto.getNome_fornecedor());
			pstm.setInt(2, objfornecedordto.getCnpj_fornecedor());
			pstm.setString(3, objfornecedordto.getEndereco_fornecedor());
			pstm.setInt(4, objfornecedordto.getTelefone_fornecedor());
			pstm.setString(5, objfornecedordto.getEmail_fornecedor());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"As informações da peça foram alteradas com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Erro ao alterar informações da peça!" + erro);
		}
            
        }
        public void excluirFornecedor(FornecedorDTO objfornecedordto){
            String sql = "delete from fornecedor where id = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1,objfornecedordto.getId_fornecedor());
                
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir peças!!!");
            }
        }
}
