/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.view;

import CaoNino.controller.CaninoController;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class CadastrarCachorro extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCachorro
     */
    public CadastrarCachorro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdotarCachorro = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabelRaca = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldCor = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelAdotarCachorro.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAdotarCachorro.setForeground(new java.awt.Color(153, 153, 153));
        jPanelAdotarCachorro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");
        jLabelNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelRaca.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRaca.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelRaca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRaca.setText("Raça:");

        jLabelCor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCor.setText("Cor:");

        jLabelPeso.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelPeso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPeso.setText("Peso:");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Cão");

        javax.swing.GroupLayout jPanelAdotarCachorroLayout = new javax.swing.GroupLayout(jPanelAdotarCachorro);
        jPanelAdotarCachorro.setLayout(jPanelAdotarCachorroLayout);
        jPanelAdotarCachorroLayout.setHorizontalGroup(
            jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAdotarCachorroLayout.createSequentialGroup()
                            .addGap(289, 289, 289)
                            .addComponent(jButtonCadastrar)
                            .addGap(31, 31, 31)
                            .addComponent(jButtonLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAdotarCachorroLayout.createSequentialGroup()
                            .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                                    .addGap(192, 192, 192)
                                    .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelRaca)
                                        .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                                            .addComponent(jLabelCor)
                                            .addGap(12, 12, 12)))
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelPeso, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jTextFieldCor)
                                .addComponent(jTextFieldNome)
                                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanelAdotarCachorroLayout.setVerticalGroup(
            jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(11, 11, 11)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRaca))
                .addGap(16, 16, 16)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCor))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso))
                .addGap(32, 32, 32)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonVoltar))
                .addGap(240, 240, 240))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAdotarCachorro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAdotarCachorro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        double peso = Double.parseDouble(jTextFieldPeso.getText().toString());
        boolean sucesso;
            
        try{
        CaninoController caninocontroller = new CaninoController();
        sucesso = caninocontroller.cadastrarCanino(jTextFieldNome.getText(), jTextFieldEndereco.getText(), jTextFieldCor.getText(), peso);
        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro no Cadastro!");
            }
            
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
                
            }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastrarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCachorro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRaca;
    private javax.swing.JPanel jPanelAdotarCachorro;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
