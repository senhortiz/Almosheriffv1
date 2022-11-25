/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FabricantesDTO;
import View.CadastroFabricante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Hector
 */
public class FabricantesDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FabricantesDTO> lista = new ArrayList<>();
	
public void cadastrarFabricantes(FabricantesDTO objfabricantedto) {
		
		String sql = "INSERT INTO fabricante(nome) values(?)";
		
		conn = new ConexaoDAO().Conectar();
		CadastroFabricante objcadastrofabricante = new CadastroFabricante();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objfabricantedto.getNome_fabricante());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"Fabricante cadastrado com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Fabricante já cadastrado!");
		}
	}
public ArrayList<FabricantesDTO> listarFabricantes(){
		
		String sql = "Select * from fabricante";
		conn = new ConexaoDAO().Conectar();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				FabricantesDTO objfabricantesdto = new FabricantesDTO();
				objfabricantesdto.setId_fabricante(rs.getInt("id"));
				objfabricantesdto.setNome_fabricante(rs.getString("nome"));
				
				lista.add(objfabricantesdto);
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"Falha ao pesquisar");
		}
		return lista;
	}
public void alterarFabricantes(FabricantesDTO objfabricantesdto){
            String sql = "update fabricante set nome = ? where id = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(2, objfabricantesdto.getId_fabricante());
			pstm.setString(1, objfabricantesdto.getNome_fabricante());
						
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null,"As informações da peça foram alteradas com sucesso!");
		} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Erro ao alterar informações da peça!" + erro);
		}
            
        }

        public void excluirFabricantes(FabricantesDTO objfabricantesdto){
            String sql = "delete from fabricante where codigo = ?";
            conn = new ConexaoDAO().Conectar();
            
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1,objfabricantesdto.getId_fabricante());
                
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir peças!!!");
            }
        }
}

