/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PecasDTO;
import View.CadastroPecas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class PecasDAO {
    Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<PecasDTO> lista = new ArrayList<>();
	
		
		public ResultSet listarFabricante() {
		conn = new ConexaoDAO().Conectar();
		String sql = "SELECT * FROM fabricante ORDER BY nome;";
		
		try {
			pstm = conn.prepareStatement(sql);
			return pstm.executeQuery();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Erro!" + erro.getMessage());
			return null;
		}
	}
	
	public void cadastrarPecas(PecasDTO objpecasdto) {
		
		String sql = "INSERT INTO Pecas(nome,fabricante,unidade,quantidade,valor,localizacao) values(?,?,?,?,?,?)";
		
		conn = new ConexaoDAO().Conectar();
		CadastroPecas objcadastropecas = new CadastroPecas();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objpecasdto.getNome_pecas());
			pstm.setObject(2, objpecasdto.getFabricante());
			pstm.setString(3, objpecasdto.getUnidade());
			pstm.setInt(4, objpecasdto.getQuantidade());
			pstm.setDouble(5, objpecasdto.getValor());
			pstm.setString(6, objpecasdto.getLocalizacao());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"Peça cadastrada com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "PecasDAO" + erro);
		}
	}
	
	public ArrayList<PecasDTO> listarPecas(){
		
		String sql = "Select * from pecas";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setCodigo_pecas(rs.getInt("codigo"));
				objpecasdto.setNome_pecas(rs.getString("nome"));
				objpecasdto.setFabricante(rs.getString("fabricante"));
				objpecasdto.setUnidade(rs.getString("unidade"));
				objpecasdto.setQuantidade(rs.getInt("quantidade"));
				objpecasdto.setValor(rs.getDouble("valor"));
				objpecasdto.setLocalizacao(rs.getString("localizacao"));
				
				lista.add(objpecasdto);
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
	public ArrayList<PecasDTO> buscarPecasCodigo(String buscar){
		
		String sql = "Select * from pecas where codigo like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setCodigo_pecas(rs.getInt("codigo"));
				objpecasdto.setNome_pecas(rs.getString("nome"));
				objpecasdto.setFabricante(rs.getString("fabricante"));
				objpecasdto.setUnidade(rs.getString("unidade"));
				objpecasdto.setQuantidade(rs.getInt("quantidade"));
				objpecasdto.setValor(rs.getDouble("valor"));
				objpecasdto.setLocalizacao(rs.getString("localizacao"));
				
				lista.add(objpecasdto);
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisaar");
		}
		return lista;
	}
	public ArrayList<PecasDTO> buscarPecasNome(String buscar){
		
		String sql = "Select * from pecas where nome like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setCodigo_pecas(rs.getInt("codigo"));
				objpecasdto.setNome_pecas(rs.getString("nome"));
				objpecasdto.setFabricante(rs.getString("fabricante"));
				objpecasdto.setUnidade(rs.getString("unidade"));
				objpecasdto.setQuantidade(rs.getInt("quantidade"));
				objpecasdto.setValor(rs.getDouble("valor"));
				objpecasdto.setLocalizacao(rs.getString("localizacao"));
				
				lista.add(objpecasdto);
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisaar");
		}
		return lista;
	}
	public ArrayList<PecasDTO> buscarPecasLoc(String buscar){
		
		String sql = "Select * from pecas where localizacao like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setCodigo_pecas(rs.getInt("codigo"));
				objpecasdto.setNome_pecas(rs.getString("nome"));
				objpecasdto.setFabricante(rs.getString("fabricante"));
				objpecasdto.setUnidade(rs.getString("unidade"));
				objpecasdto.setQuantidade(rs.getInt("quantidade"));
				objpecasdto.setValor(rs.getDouble("valor"));
				objpecasdto.setLocalizacao(rs.getString("localizacao"));
				
				lista.add(objpecasdto);
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisaar");
		}
		return lista;
	}
	public ArrayList<PecasDTO> buscarPecasFab(String buscar){
		
		String sql = "Select * from pecas where fabricante like ?";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"%"+buscar+"%");
						                        
                        rs = pstm.executeQuery();
			
			while(rs.next()) {
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setCodigo_pecas(rs.getInt("codigo"));
				objpecasdto.setNome_pecas(rs.getString("nome"));
				objpecasdto.setFabricante(rs.getString("fabricante"));
				objpecasdto.setUnidade(rs.getString("unidade"));
				objpecasdto.setQuantidade(rs.getInt("quantidade"));
				objpecasdto.setValor(rs.getDouble("valor"));
				objpecasdto.setLocalizacao(rs.getString("localizacao"));
				
				lista.add(objpecasdto);
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisaar");
		}
		return lista;
	}
        
        public void alterarPecas(PecasDTO objpecasdto){
            String sql = "update pecas set nome = ?, fabricante = ?, unidade = ?, quantidade = ?, valor = ?, localizacao = ? where codigo = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(7, objpecasdto.getCodigo_pecas());
			pstm.setString(1, objpecasdto.getNome_pecas());
			pstm.setObject(2, objpecasdto.getFabricante() );
			pstm.setString(3, objpecasdto.getUnidade());
			pstm.setInt(4, objpecasdto.getQuantidade());
			pstm.setDouble(5, objpecasdto.getValor());
			pstm.setString(6, objpecasdto.getLocalizacao());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"As informações da peça foram alteradas com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Erro ao alterar informações da peça!" + erro);
		}
            
        }
        public void excluirPecas(PecasDTO objpecasdto){
            String sql = "delete from pecas where codigo = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1,objpecasdto.getCodigo_pecas());
                
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir peças!!!");
            }
        }
}
