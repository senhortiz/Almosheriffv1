/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ConexaoDAO;
import DAO.PecasDAO;
import DTO.PecasDTO;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class CadastroPecas extends javax.swing.JFrame {
Connection conn;
PreparedStatement pstm;
    /**
     * Creates new form CadastrarPecas
     */
    public CadastroPecas() {
        initComponents();
        listarPecas();
        restaurarDadosCbxFab();
        }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomePecas = new javax.swing.JFormattedTextField();
        txtUnidade = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JFormattedTextField();
        txtLoc = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxFabricante = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPecas = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Fabricante");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Unidade");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Valor");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Localização");

        txtNomePecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePecasActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Estoque");

        cbxFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        tabelaPecas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabelaPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Fabricante", "Unidade", "Quantidade", "Valor", "Localização"
            }
        ));
        tabelaPecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPecasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPecas);

        btnPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Codigo");

        txtCodigo.setEnabled(false);

        btnAlterar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5))
                                            .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)))
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(txtValor)
                                        .addComponent(txtLoc)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar)
                                    .addGap(53, 53, 53)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomePecas)
                                    .addComponent(cbxFabricante, 0, 179, Short.MAX_VALUE)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtUnidade)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(383, 383, 383))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomePecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addGap(81, 81, 81)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Peças");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        CadastrarPecas();
        listarPecas();
        LimparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomePecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePecasActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tabelaPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPecasMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaPecasMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarPecas();
        listarPecas();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxFabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPecas;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtLoc;
    private javax.swing.JFormattedTextField txtNomePecas;
    private javax.swing.JFormattedTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtUnidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
    public void listarPecas(){
        try {
            PecasDAO objfuncionariodao = new PecasDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaPecas.getModel();
            model.setNumRows(0);
            
            ArrayList<PecasDTO> lista = objfuncionariodao.listarPecas();
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigo_pecas(),
                    lista.get(num).getNome_pecas(),
                    lista.get(num).getFabricante(),
                    lista.get(num).getUnidade(),
                    lista.get(num).getQuantidade(),
                    lista.get(num).getValor(),
                    lista.get(num).getLocalizacao()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro na pesquisa!");
        }
}
   private void CarregarCampos(){
            int setar = tabelaPecas.getSelectedRow();
            
            txtCodigo.setText(tabelaPecas.getModel().getValueAt(setar, 0).toString());
            txtNomePecas.setText(tabelaPecas.getModel().getValueAt(setar,1).toString());
            txtUnidade.setText(tabelaPecas.getModel().getValueAt(setar, 3).toString());
            txtQuantidade.setText(tabelaPecas.getModel().getValueAt(setar,4).toString());
            txtValor.setText(tabelaPecas.getModel().getValueAt(setar, 5).toString());
            txtLoc.setText(tabelaPecas.getModel().getValueAt(setar, 6).toString());
            
        }
   private void CadastrarPecas(){
    String nomePecas,unidade,localizacao;
				int quantidade;
                                String idFabricante;
				Double valor;
				
				
				nomePecas = txtNomePecas.getText();
				idFabricante = cbxFabricante.getSelectedItem().toString();
                                unidade = txtUnidade.getText();
				localizacao = txtLoc.getText();
				quantidade = Integer.parseInt(txtQuantidade.getText());
				valor = Double.parseDouble(txtValor.getText());
				
				PecasDTO objpecasdto = new PecasDTO();
				objpecasdto.setNome_pecas(nomePecas);
				objpecasdto.setFabricante(idFabricante);
				objpecasdto.setUnidade(unidade);
				objpecasdto.setLocalizacao(localizacao);
				objpecasdto.setQuantidade(quantidade);
				objpecasdto.setValor(valor);
				
				PecasDAO objpecasdao = new PecasDAO();
				objpecasdao.cadastrarPecas(objpecasdto);
}
   private void LimparCampos(){
       txtCodigo.setText("");
       txtNomePecas.setText("");
       //txtCodigo.setText("");
       txtUnidade.setText("");
       txtQuantidade.setText("");
       txtValor.setText("");
       txtLoc.setText("");
       txtNomePecas.requestFocus();
   }
   
   private void AlterarPecas(){
       int id_pecas,quantidade;
       String nome_pecas,fabricante,unidade,localizacao;
       Double valor;
       
       id_pecas = Integer.parseInt(txtCodigo.getText());
       quantidade = Integer.parseInt(txtQuantidade.getText());
       nome_pecas = txtNomePecas.getText();
       //fabricante = txtFabricantePecas.getText();
       unidade = txtUnidade.getText();
       localizacao = txtLoc.getText();
       valor = Double.parseDouble(txtValor.getText());
       
       PecasDTO objpecasdto = new PecasDTO();
       objpecasdto.setCodigo_pecas(id_pecas);
       objpecasdto.setNome_pecas(nome_pecas);
       //objpecasdto.setFabricante(fabricante);
       objpecasdto.setUnidade(unidade);
       objpecasdto.setQuantidade(quantidade);
       objpecasdto.setValor(valor);
       
       PecasDAO objpecasdao = new PecasDAO();
       objpecasdao.alterarPecas(objpecasdto);
   }
   Vector<Integer> id_fabricante = new Vector<Integer>();
	public void restaurarDadosCbxFab() {
		
		try {
			
			PecasDAO objpecasdao = new PecasDAO();
			ResultSet rs = objpecasdao.listarFabricante();
			
			while(rs.next()) {
				id_fabricante.addElement(rs.getInt(1));
				cbxFabricante.addItem(rs.getString(2));
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro na cbx ");
		}
	}
        
}

