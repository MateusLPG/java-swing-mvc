/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.view;

import CaoNino.controller.FichaAdocaoController;
import CaoNino.dao.AdotarDAO;
import CaoNino.dao.ConnectionMVC;
import CaoNino.dao.ExceptionDAO;
import CaoNino.model.Canino;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author mateu
 */
public class AdotarCachorro extends javax.swing.JFrame {

    /**
     * Creates new form AdotarCachorro
     */
    
    public AdotarCachorro() {
        initComponents();
        lotarCombo();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNomeAnimal = new javax.swing.JLabel();
        jLabelNomeAdotante = new javax.swing.JLabel();
        jButtonAdotar = new javax.swing.JButton();
        jComboBoxNomeAnimal = new javax.swing.JComboBox<>();
        jComboBoxNomePessoa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adotar Cachorro Abrigo CaoNino");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Cadastrar Adoção");

        jLabelNomeAnimal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelNomeAnimal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeAnimal.setText("Nome do Animal:");

        jLabelNomeAdotante.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelNomeAdotante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeAdotante.setText("Nome do Adotante:");

        jButtonAdotar.setText("Adotar");
        jButtonAdotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdotarActionPerformed(evt);
            }
        });

        jComboBoxNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeAnimalActionPerformed(evt);
            }
        });

        jComboBoxNomePessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste 3", "Teste 4" }));
        jComboBoxNomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomePessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButtonAdotar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVoltar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNomeAdotante)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabelNomeAnimal)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAnimal)
                    .addComponent(jComboBoxNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAdotante)
                    .addComponent(jComboBoxNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdotar)
                    .addComponent(jButtonVoltar))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdotarActionPerformed
        
        String nomeCachorro = jComboBoxNomeAnimal.getSelectedItem().toString();
        String nomePessoa = jComboBoxNomePessoa.getSelectedItem().toString();
        boolean sucesso;
        
        try {
        FichaAdocaoController fichaadocaocontroller = new FichaAdocaoController();
        sucesso = fichaadocaocontroller.cadastrarFicha(nomeCachorro, nomePessoa);
        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro!");
        }
    }//GEN-LAST:event_jButtonAdotarActionPerformed
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!" + e);
        
        }

    }
    private void jComboBoxNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeAnimalActionPerformed

    }//GEN-LAST:event_jComboBoxNomeAnimalActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxNomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomePessoaActionPerformed
    
    
    public void lotarCombo() {
        AdotarDAO adotardao = new AdotarDAO();
        
        ArrayList<Canino> lista = new ArrayList<>();
        lista = adotardao.listarCachorros();
        
        jComboBoxNomeAnimal.removeAllItems();
        jComboBoxNomeAnimal.addItem(null);
        
        for (Canino canino : lista){
            
            jComboBoxNomeAnimal.addItem(canino.getNome());
        
        }
        
                
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdotarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdotarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdotarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdotarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdotarCachorro().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdotar;
    private javax.swing.JButton jButtonVoltar;
    public javax.swing.JComboBox<String> jComboBoxNomeAnimal;
    private javax.swing.JComboBox<String> jComboBoxNomePessoa;
    private javax.swing.JLabel jLabelNomeAdotante;
    private javax.swing.JLabel jLabelNomeAnimal;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables



}
