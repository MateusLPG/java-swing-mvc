/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.view;

import CaoNino.controller.PessoaController;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class CadastrarPessoa extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPessoa
     */
    public CadastrarPessoa() {
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
        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelAdotarCachorro.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAdotarCachorro.setForeground(new java.awt.Color(153, 153, 153));
        jPanelAdotarCachorro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");
        jLabelNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço:");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email:");

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSexo.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione seu sexo", "Masculino", "Feminino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jLabelCPF.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF:");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Pessoa");

        jLabelTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone:");

        javax.swing.GroupLayout jPanelAdotarCachorroLayout = new javax.swing.GroupLayout(jPanelAdotarCachorro);
        jPanelAdotarCachorro.setLayout(jPanelAdotarCachorroLayout);
        jPanelAdotarCachorroLayout.setHorizontalGroup(
            jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                        .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEmail)
                                            .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelCPF, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                                        .addComponent(jLabelEndereco)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTelefone)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefone)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldEmail1)
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(jPanelAdotarCachorroLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jButtonCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanelAdotarCachorroLayout.setVerticalGroup(
            jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdotarCachorroLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(11, 11, 11)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addGap(16, 16, 16)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone))
                .addGap(48, 48, 48)
                .addGroup(jPanelAdotarCachorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCadastrar))
                .addGap(139, 139, 139))
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

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        long cpf = Long.parseLong(jTextFieldCPF.getText().toString());
        long telefone = Long.parseLong(jTextFieldTelefone.getText().toString());
        String sexo = jComboBoxSexo.getSelectedItem().toString();
        boolean sucesso;
        
        try {
            PessoaController pessoacontroller = new PessoaController();
            sucesso = pessoacontroller.cadastrarPessoa(jTextFieldNome.getText(), jTextFieldEndereco.getText(), telefone, jTextFieldEmail1.getText(), sexo, cpf);
        
            if (sucesso == true) {
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar pessoa!");
            }
            
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Excessão: " +e);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
}
    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelAdotarCachorro;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}