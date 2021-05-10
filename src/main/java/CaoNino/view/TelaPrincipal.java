/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaoNino.view;

/**
 *
 * @author mateu
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
   public TelaPrincipal() {
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

        jButtonVerCaes = new javax.swing.JButton();
        jButtonAdotar = new javax.swing.JButton();
        jButtonFicha = new javax.swing.JButton();
        jButtonCadastrarPessoa = new javax.swing.JButton();
        jButtonCadastrarCao = new javax.swing.JButton();
        MenuTelaPrincipal = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCão = new javax.swing.JMenuItem();
        jMenuItemPessoa = new javax.swing.JMenuItem();
        jMenuItemFichas = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CaoNino");
        setResizable(false);

        jButtonVerCaes.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVerCaes.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButtonVerCaes.setText("Ver Cães");
        jButtonVerCaes.setAlignmentX(0.5F);
        jButtonVerCaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCaesActionPerformed(evt);
            }
        });

        jButtonAdotar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdotar.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButtonAdotar.setText("Adotar");
        jButtonAdotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdotarActionPerformed(evt);
            }
        });

        jButtonFicha.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFicha.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButtonFicha.setText("Fichas");
        jButtonFicha.setBorderPainted(false);

        jButtonCadastrarPessoa.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarPessoa.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButtonCadastrarPessoa.setText("Cadastrar Pessoa");
        jButtonCadastrarPessoa.setAlignmentX(0.5F);
        jButtonCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPessoaActionPerformed(evt);
            }
        });

        jButtonCadastrarCao.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonCadastrarCao.setText("Cadastrar Cão");
        jButtonCadastrarCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCaoActionPerformed(evt);
            }
        });

        MenuTelaPrincipal.setBorder(null);
        MenuTelaPrincipal.setMargin(new java.awt.Insets(0, 10, 0, 0));
        MenuTelaPrincipal.setMaximumSize(new java.awt.Dimension(102, 50));

        jMenuMenu.setText("Menu");
        jMenuMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuMenu.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jMenuMenu.setPreferredSize(new java.awt.Dimension(70, 22));
        jMenuMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuMenuKeyPressed(evt);
            }
        });
        MenuTelaPrincipal.add(jMenuMenu);

        jMenuCadastrar.setText("Cadastrar");
        jMenuCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuCadastrar.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jMenuCadastrar.setPreferredSize(new java.awt.Dimension(107, 22));

        jMenuItemCão.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCão.setText("Cão");
        jMenuItemCão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCãoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCão);

        jMenuItemPessoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemPessoa.setText("Pessoa");
        jMenuItemPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemPessoa);

        jMenuItemFichas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemFichas.setText("Fichas");
        jMenuItemFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFichasActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemFichas);

        MenuTelaPrincipal.add(jMenuCadastrar);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuSair.setMargin(new java.awt.Insets(10, 10, 10, 0));
        jMenuSair.setPreferredSize(new java.awt.Dimension(61, 42));
        MenuTelaPrincipal.add(jMenuSair);

        setJMenuBar(MenuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(549, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrarCao)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVerCaes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCadastrarCao, jButtonCadastrarPessoa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonCadastrarCao)
                .addGap(31, 31, 31)
                .addComponent(jButtonCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonVerCaes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonAdotar)
                .addGap(36, 36, 36)
                .addComponent(jButtonFicha)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAdotar, jButtonFicha, jButtonVerCaes});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCadastrarCao, jButtonCadastrarPessoa});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMenuKeyPressed

    private void jButtonVerCaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCaesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerCaesActionPerformed

    private void jButtonAdotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdotarActionPerformed
        this.dispose();
        new AdotarCachorro().setVisible(true);
    }//GEN-LAST:event_jButtonAdotarActionPerformed

    private void jMenuItemPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPessoaActionPerformed

    private void jMenuItemCãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCãoActionPerformed

    private void jMenuItemFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFichasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFichasActionPerformed

    private void jButtonCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPessoaActionPerformed
        this.dispose();
        new CadastrarPessoa().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarPessoaActionPerformed

    private void jButtonCadastrarCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCaoActionPerformed
        this.dispose();
        new CadastrarCachorro().setVisible(true);    
  
    }//GEN-LAST:event_jButtonCadastrarCaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuTelaPrincipal;
    private javax.swing.JButton jButtonAdotar;
    private javax.swing.JButton jButtonCadastrarCao;
    private javax.swing.JButton jButtonCadastrarPessoa;
    private javax.swing.JButton jButtonFicha;
    private javax.swing.JButton jButtonVerCaes;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCão;
    private javax.swing.JMenuItem jMenuItemFichas;
    private javax.swing.JMenuItem jMenuItemPessoa;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
