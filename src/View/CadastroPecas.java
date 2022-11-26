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
        initComplementos();
        ListarPecas();
        restaurarDadosCbxFab();
        
        }
    
    public void initComplementos(){
        this.setLocationRelativeTo(null);
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        btnExcluir = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        radioCodigo = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        radioLoc = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Fabricante");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Unidade");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Valor");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Localização");

        txtNomePecas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        txtNomePecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePecasActionPerformed(evt);
            }
        });

        txtUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));

        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));

        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));

        txtLoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        txtLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botao-adicionar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Estoque");

        cbxFabricante.setBackground(new java.awt.Color(0, 153, 255));
        cbxFabricante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cbxFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    tabelaPecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    tabelaPecas.setSelectionBackground(new java.awt.Color(153, 204, 255));
    tabelaPecas.getTableHeader().setReorderingAllowed(false);
    tabelaPecas.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabelaPecasMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tabelaPecas);

    btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excluir.png"))); // NOI18N
    btnExcluir.setText("Excluir");
    btnExcluir.setBorderPainted(false);
    btnExcluir.setContentAreaFilled(false);
    btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnExcluir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExcluirActionPerformed(evt);
        }
    });

    txtPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
    txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPesquisarActionPerformed(evt);
        }
    });
    txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txtPesquisarKeyReleased(evt);
        }
    });

    jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
    jLabel8.setText("Codigo");

    txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
    txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtCodigo.setEnabled(false);

    btnAlterar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/intercambio.png"))); // NOI18N
    btnAlterar.setText("Alterar");
    btnAlterar.setBorderPainted(false);
    btnAlterar.setContentAreaFilled(false);
    btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAlterar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAlterarActionPerformed(evt);
        }
    });

    jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
    jLabel9.setText("Quantidade");

    radioCodigo.setBackground(new java.awt.Color(153, 204, 255));
    buttonGroup1.add(radioCodigo);
    radioCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    radioCodigo.setText("Codigo");
    radioCodigo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            radioCodigoActionPerformed(evt);
        }
    });

    radioNome.setBackground(new java.awt.Color(153, 204, 255));
    buttonGroup1.add(radioNome);
    radioNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    radioNome.setText("Nome");

    radioLoc.setBackground(new java.awt.Color(153, 204, 255));
    buttonGroup1.add(radioLoc);
    radioLoc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    radioLoc.setText("Localização");
    radioLoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            radioLocActionPerformed(evt);
        }
    });

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

    btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/limpar.png"))); // NOI18N
    btnLimpar.setBorderPainted(false);
    btnLimpar.setContentAreaFilled(false);
    btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnLimpar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomePecas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(radioCodigo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioNome)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioLoc)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btnAlterar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(17, 17, 17))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7)
            .addGap(376, 376, 376))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(127, 127, 127)
            .addComponent(btnLimpar)
            .addGap(18, 18, 18)
            .addComponent(btnSalvar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addGap(42, 42, 42)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNomePecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar))
                        .addComponent(btnLimpar))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioCodigo)
                        .addComponent(radioNome)
                        .addComponent(radioLoc))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel4))
            .addContainerGap(15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Peças");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        CadastrarPecas();
        ListarPecas();
        LimparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomePecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePecasActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirPecas();
        ListarPecas();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPecasMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaPecasMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarPecas();
        ListarPecas();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        RadioCodigo();
        RadioNome();
        RadioLocalizacao();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void radioCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCodigoActionPerformed

    private void txtLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocActionPerformed

    private void radioLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLocActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxFabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioLoc;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tabelaPecas;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtLoc;
    private javax.swing.JFormattedTextField txtNomePecas;
    private javax.swing.JFormattedTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtUnidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
    public void ListarPecas(){
        try {
            PecasDAO objpecasdao = new PecasDAO();
            
            DefaultTableModel model = (DefaultTableModel)tabelaPecas.getModel();
            
            model.setNumRows(0);
            
            ArrayList<PecasDTO> lista = objpecasdao.listarPecas();
            
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
    public void BuscarPecasCodigo(String buscar){
        try {
            PecasDAO objpecasdao = new PecasDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaPecas.getModel();
            model.setNumRows(0);
            
            ArrayList<PecasDTO> lista = objpecasdao.buscarPecasCodigo(buscar);
            
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
            //JOptionPane.showMessageDialog(null,"Erro na pesquisa!");
        }
}
    public void BuscarPecasNome(String buscar){
        try {
            PecasDAO objpecasdao = new PecasDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaPecas.getModel();
            model.setNumRows(0);
            
            ArrayList<PecasDTO> lista = objpecasdao.buscarPecasNome(buscar);
            
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
            //JOptionPane.showMessageDialog(null,"Erro na pesquisa!");
        }
}
    public void BuscarPecasLoc(String buscar){
        try {
            PecasDAO objpecasdao = new PecasDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaPecas.getModel();
            model.setNumRows(0);
            
            ArrayList<PecasDTO> lista = objpecasdao.buscarPecasLoc(buscar);
            
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
            //JOptionPane.showMessageDialog(null,"Erro na pesquisa!");
        }
}
   private void CarregarCampos(){
            int setar = tabelaPecas.getSelectedRow();
            
            txtCodigo.setText(tabelaPecas.getModel().getValueAt(setar, 0).toString());
            txtNomePecas.setText(tabelaPecas.getModel().getValueAt(setar,1).toString());
            cbxFabricante.setSelectedItem(tabelaPecas.getModel().getValueAt(setar,2).toString());
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
       cbxFabricante.setSelectedItem("Selecione");
       txtUnidade.setText("");
       txtQuantidade.setText("");
       txtValor.setText("");
       txtLoc.setText("");
       txtNomePecas.requestFocus();
   }
   
   private void AlterarPecas(){
       int id_pecas,quantidade;
       String nome_pecas,idFabricante,unidade,localizacao;
       Double valor;
       
       id_pecas = Integer.parseInt(txtCodigo.getText());
       quantidade = Integer.parseInt(txtQuantidade.getText());
       nome_pecas = txtNomePecas.getText();
       idFabricante = cbxFabricante.getSelectedItem().toString();
       unidade = txtUnidade.getText();
       localizacao = txtLoc.getText();
       valor = Double.parseDouble(txtValor.getText());
       
       PecasDTO objpecasdto = new PecasDTO();
       objpecasdto.setCodigo_pecas(id_pecas);
       objpecasdto.setNome_pecas(nome_pecas);
       objpecasdto.setFabricante(idFabricante);
       objpecasdto.setUnidade(unidade);
       objpecasdto.setQuantidade(quantidade);
       objpecasdto.setValor(valor);
       objpecasdto.setLocalizacao(localizacao);
       
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
        public void ExcluirPecas(){
            int id_pecas;
            
            id_pecas = Integer.parseInt(txtCodigo.getText());
            
            PecasDTO objpecasdto = new PecasDTO();
            objpecasdto.setCodigo_pecas(id_pecas);
            
            PecasDAO objpecasdao = new PecasDAO();
            objpecasdao.excluirPecas(objpecasdto);
        }
        public void RadioCodigo(){
            if(radioCodigo.isSelected()){
                BuscarPecasCodigo(txtPesquisar.getText());
                }
        }
        public void RadioNome(){
            if(radioNome.isSelected()){
                BuscarPecasNome(txtPesquisar.getText());
            }
        }
        public void RadioLocalizacao(){
            if(radioLoc.isSelected()){
                BuscarPecasLoc(txtPesquisar.getText());
            }
        }
}

