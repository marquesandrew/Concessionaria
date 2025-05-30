/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concessionaria.view;



/**
 *
 * @author Usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
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

        jDesktopPane_Principal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Arquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItem_CadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroVeiculo = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuario = new javax.swing.JMenuItem();
        jMenu_Vendas = new javax.swing.JMenu();
        jMenuItem_VenderVeiculo = new javax.swing.JMenuItem();
        jMenu6_Relatorios = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão Concessionária");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sistema de gestão de Concessionária");

        jDesktopPane_Principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_PrincipalLayout = new javax.swing.GroupLayout(jDesktopPane_Principal);
        jDesktopPane_Principal.setLayout(jDesktopPane_PrincipalLayout);
        jDesktopPane_PrincipalLayout.setHorizontalGroup(
            jDesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane_PrincipalLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jDesktopPane_PrincipalLayout.setVerticalGroup(
            jDesktopPane_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane_PrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(598, Short.MAX_VALUE))
        );

        jMenu_Arquivo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\application.png")); // NOI18N
        jMenu_Arquivo.setText("Arquivo");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\door_out.png")); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu_Arquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenu_Arquivo);

        jMenuCadastros.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\car.png")); // NOI18N
        jMenuCadastros.setText("Cadastros");

        jMenuItem_CadastroCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\user.png")); // NOI18N
        jMenuItem_CadastroCliente.setText("Clientes");
        jMenuItem_CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastroClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem_CadastroCliente);

        jMenuItemCadastroVeiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\car.png")); // NOI18N
        jMenuItemCadastroVeiculo.setText("Veículos");
        jMenuItemCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroVeiculo);

        jMenuItemCadastroUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\user_add.png")); // NOI18N
        jMenuItemCadastroUsuario.setText("Usuários");
        jMenuItemCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenu_Vendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\basket.png")); // NOI18N
        jMenu_Vendas.setText("Vendas");

        jMenuItem_VenderVeiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\basket_add.png")); // NOI18N
        jMenuItem_VenderVeiculo.setText("Vender Veiculo");
        jMenu_Vendas.add(jMenuItem_VenderVeiculo);

        jMenuBar1.add(jMenu_Vendas);

        jMenu6_Relatorios.setText("Relatórios");
        jMenuBar1.add(jMenu6_Relatorios);

        jMenuSobre.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\information.png")); // NOI18N
        jMenuSobre.setText("Sobre");

        jMenuItemSistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Documentos\\PJP\\PJP\\Aula6Exercicios\\aula6ExerExtra\\Concessionaria\\src\\main\\resources\\imagens\\server_chart.png")); // NOI18N
        jMenuItemSistema.setText("Sistema");
        jMenuItemSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSistemaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSistema);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane_Principal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane_Principal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItem_CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastroClienteActionPerformed
        TelaCliente cadastroCliente = new TelaCliente();
        jDesktopPane_Principal.add(cadastroCliente);
        cadastroCliente.setVisible(true);    
    }//GEN-LAST:event_jMenuItem_CadastroClienteActionPerformed

    private void jMenuItemCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVeiculoActionPerformed
        TelaVeiculo cadastroVeiculo = new TelaVeiculo();
        jDesktopPane_Principal.add(cadastroVeiculo);
        cadastroVeiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroVeiculoActionPerformed

    private void jMenuItemCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuarioActionPerformed
        TelaUsuario cadastroUsuario = new TelaUsuario();
        jDesktopPane_Principal.add(cadastroUsuario);
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroUsuarioActionPerformed

    private void jMenuItemSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSistemaActionPerformed
        TelaSobre sobreSistema = new TelaSobre();
        jDesktopPane_Principal.add(sobreSistema);
        sobreSistema.setVisible(true);
    }//GEN-LAST:event_jMenuItemSistemaActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane_Principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6_Relatorios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemCadastroUsuario;
    private javax.swing.JMenuItem jMenuItemCadastroVeiculo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSistema;
    private javax.swing.JMenuItem jMenuItem_CadastroCliente;
    private javax.swing.JMenuItem jMenuItem_VenderVeiculo;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenu jMenu_Arquivo;
    private javax.swing.JMenu jMenu_Vendas;
    // End of variables declaration//GEN-END:variables
}
