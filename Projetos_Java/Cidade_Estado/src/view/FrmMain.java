package view;


public class FrmMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMain.class.getName());

 
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCad = new javax.swing.JMenuItem();
        jMenuItemSaiir = new javax.swing.JMenuItem();
        btnmenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelDesktopLayout = new javax.swing.GroupLayout(painelDesktop);
        painelDesktop.setLayout(painelDesktopLayout);
        painelDesktopLayout.setHorizontalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelDesktopLayout.setVerticalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jMenuItemCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCad.setText("Cadastrar-se");
        jMenuItemCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCad);

        jMenuItemSaiir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemSaiir.setText("Sair");
        jMenuItemSaiir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaiirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSaiir);

        jMenuBar1.add(jMenu1);

        btnmenuSair.setText("Sair");
        btnmenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnmenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadActionPerformed
      FrmCadUsuario cadusu =   new FrmCadUsuario();
      painelDesktop.add(cadusu);
      cadusu.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadActionPerformed

    private void jMenuItemSaiirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaiirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSaiirActionPerformed

    private void btnmenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnmenuSairActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmMain().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnmenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCad;
    private javax.swing.JMenuItem jMenuItemSaiir;
    private javax.swing.JDesktopPane painelDesktop;
    // End of variables declaration//GEN-END:variables
}
