/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author felip
 */
public class TelaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPrincipal
     */
    public TelaMenuPrincipal() {
        initComponents();
        jLabelAvisoAst.setVisible(false);
        jLabelAvisoTexto.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jButtonVendas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonProdutos = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jLabelBreve = new javax.swing.JLabel();
        jLabelAvisoAst = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelAvisoTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE OTIMIZA????O DE ESTOQUE");

        jLabelX.setBackground(new java.awt.Color(255, 255, 255));
        jLabelX.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabelX.setForeground(new java.awt.Color(255, 255, 255));
        jLabelX.setText("X");
        jLabelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelXMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(jLabelX)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelX))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1, 1, 580, 54);

        jButtonVendas.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVendas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoEJPJ\\src\\main\\resources\\imagens\\sale.png")); // NOI18N
        jButtonVendas.setBorderPainted(false);
        jButtonVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVendas);
        jButtonVendas.setBounds(340, 130, 161, 137);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setText("PRODUTOS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 90, 102, 26);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("VENDAS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 90, 78, 26);

        jButtonProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoEJPJ\\src\\main\\resources\\imagens\\product.png")); // NOI18N
        jButtonProdutos.setBorderPainted(false);
        jButtonProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProdutos);
        jButtonProdutos.setBounds(80, 130, 161, 137);

        jButtonLogOut.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonLogOut.setText("LogOut");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogOut);
        jButtonLogOut.setBounds(240, 340, 100, 27);

        jLabelBreve.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelBreve.setForeground(new java.awt.Color(102, 102, 255));
        jLabelBreve.setText("Em breve.");
        jPanel1.add(jLabelBreve);
        jLabelBreve.setBounds(380, 280, 80, 20);

        jLabelAvisoAst.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabelAvisoAst.setForeground(new java.awt.Color(255, 51, 51));
        jLabelAvisoAst.setText("* ");
        jPanel1.add(jLabelAvisoAst);
        jLabelAvisoAst.setBounds(210, 90, 34, 36);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 390, 580, 11);

        jLabelAvisoTexto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelAvisoTexto.setForeground(new java.awt.Color(255, 51, 51));
        jLabelAvisoTexto.setText("<html><body>1 ou mais produtos em estoque cr??tico.<br>Favor checar estoque.</body></html>");
        jPanel1.add(jLabelAvisoTexto);
        jLabelAvisoTexto.setBounds(10, 270, 270, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(580, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        TelaProdutosVendas tela = new TelaProdutosVendas();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
//        TelaVendas tela = new TelaVendas();
//        tela.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelXMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAvisoAst;
    private javax.swing.JLabel jLabelAvisoTexto;
    private javax.swing.JLabel jLabelBreve;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
