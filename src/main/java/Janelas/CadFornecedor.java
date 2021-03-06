/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import Objetos.Fornecedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Stokler
 */
public class CadFornecedor extends javax.swing.JFrame {

    Fornecedor forn = new Fornecedor();

    /**
     * Creates new form CadFornecedor
     */
    public CadFornecedor() {
        initComponents();
    }

    public CadFornecedor(Fornecedor forn) {
        initComponents();
        this.forn = forn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCadFornecedor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLRSocial = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLRepresentante = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jTRSocial = new javax.swing.JTextField();
        jTCnpj = new javax.swing.JTextField();
        jTRepresentante = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jTTelefone = new javax.swing.JTextField();
        jBCadastrarFor = new javax.swing.JButton();
        jBLimparFor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLCadFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCadFornecedor.setText("Cadastro do Fornecedor");

        jLRSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRSocial.setText("Raz??o Social");

        jLCnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCnpj.setText("CNPJ");

        jLRepresentante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRepresentante.setText("Representante");

        jLEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEndereco.setText("Endere??o");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone");

        jTRSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRepresentante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrarFor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrarFor.setText("Cadastrar");
        jBCadastrarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarForActionPerformed(evt);
            }
        });

        jBLimparFor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimparFor.setText("Limpar");
        jBLimparFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparForActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLTelefone)
                    .addComponent(jLCnpj)
                    .addComponent(jLRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLRepresentante)
                    .addComponent(jLEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBCadastrarFor)
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimparFor)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLRSocial)
                                    .addComponent(jTRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(jLCnpj))
                            .addComponent(jTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLRepresentante))
                    .addComponent(jTRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEndereco)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimparFor)
                    .addComponent(jBCadastrarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadFornecedor)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarForActionPerformed

        try {
            forn.setCnpj(jTCnpj.getText());
            forn.setEndereco(jTEndereco.getText());
            forn.setNomeRepesentante(jTRepresentante.getText());
            forn.setRazaoSocial(jTRSocial.getText());
            forn.setTelefone(jTTelefone.getText());

            String dados = "\n" + "Raz??o Social: " + jTRSocial.getText() + "\n"
                    + "CNPJ: " + jTCnpj.getText() + " \n"
                    + "Representante: " + jTRepresentante.getText() + "\n"
                    + "Endere??o: " + jTEndereco.getText() + "\n"
                    + "Tel: " + jTTelefone.getText();

            JOptionPane.showMessageDialog(this, "Fornecedor Cadastrado com sucesso!\n" + dados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Preencha os Campos Corretamente!");
        }

    }//GEN-LAST:event_jBCadastrarForActionPerformed

    private void jBLimparForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparForActionPerformed

        jTCnpj.setText("");
        jTEndereco.setText("");
        jTRepresentante.setText("");
        jTRSocial.setText("");
        jTTelefone.setText("");

    }//GEN-LAST:event_jBLimparForActionPerformed

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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarFor;
    private javax.swing.JButton jBLimparFor;
    private javax.swing.JLabel jLCadFornecedor;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLRSocial;
    private javax.swing.JLabel jLRepresentante;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCnpj;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTRSocial;
    private javax.swing.JTextField jTRepresentante;
    private javax.swing.JTextField jTTelefone;
    // End of variables declaration//GEN-END:variables

}
