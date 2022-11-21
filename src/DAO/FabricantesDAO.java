/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FabricantesDTO;
import View.CadastroFabricante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class FabricantesDAO {
    Connection conn;
	PreparedStatement pstm;
	
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
}
