/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnumopusms;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author A100519
 */
public class clientesUpdate extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public clientesUpdate() {
        initComponents();
    }
    public int idCliente;
    public void executeSQLQuery(String query, String message){
        Connection con = dbConnection.getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1){
                JOptionPane.showMessageDialog(null, "Dados "+message+" com sucesso");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Dados não "+message);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        buttonExit = new javax.swing.JButton();
        labelMOpus = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        labelArea = new javax.swing.JLabel();
        fieldNomeCliente = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        fieldMorada = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        fieldCodP = new javax.swing.JTextField();
        labelNomeFunc = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        fieldLocalidade = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        labelPassword1 = new javax.swing.JLabel();
        labelPassword2 = new javax.swing.JLabel();
        fieldNumTel = new javax.swing.JTextField();
        labelPassword3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(106, 49, 127));

        buttonExit.setBackground(new java.awt.Color(255, 204, 102));
        buttonExit.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        buttonExit.setText("X");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelMOpus.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelMOpus.setForeground(new java.awt.Color(255, 255, 255));
        labelMOpus.setText("Magnum Opus");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelArea.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelArea.setText("Atualizar Dados de Cliente");

        fieldNomeCliente.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeClienteActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUsername.setText("Morada");

        fieldMorada.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMoradaActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword.setText("Cód. Postal");

        fieldCodP.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldCodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodPActionPerformed(evt);
            }
        });

        labelNomeFunc.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelNomeFunc.setText("Nome");

        buttonUpdate.setBackground(new java.awt.Color(255, 204, 102));
        buttonUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonUpdate.setText("ATUALIZAR");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        fieldLocalidade.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldLocalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLocalidadeActionPerformed(evt);
            }
        });

        fieldCidade.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCidadeActionPerformed(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword1.setText("Localidade");

        labelPassword2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword2.setText("Cidade");

        fieldNumTel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldNumTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumTelActionPerformed(evt);
            }
        });

        labelPassword3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword3.setText("Telemóvel");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPassword3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(fieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonUpdate))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelArea)))
                .addGap(55, 55, 55))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buttonUpdate))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldMorada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCodP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(labelMOpus)
                .addGap(204, 204, 204)
                .addComponent(buttonExit)
                .addContainerGap())
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMOpus)
                    .addComponent(buttonExit))
                .addGap(24, 24, 24)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void fieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeClienteActionPerformed

    private void fieldMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMoradaActionPerformed

    private void fieldCodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodPActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        String query;
        query = "UPDATE `clientes` SET `nome_cliente`= '"+fieldNomeCliente.getText()+
                "',`morada`='"+fieldMorada.getText()+"',`cod_postal`='"+
                fieldCodP.getText()+"',`localidade`='"+fieldLocalidade.getText()+
                "',`cidade`='"+fieldCidade.getText()+"',`num_tel`='"+
                fieldNumTel.getText()+"' WHERE cod_cliente = '"+idCliente+"'";

        executeSQLQuery(query, "atualizados");
        clients clients = new clients();
        clients.setVisible(true);
        clients.pack();
        clients.setLocationRelativeTo(null);
        DefaultTableModel model = (DefaultTableModel) clients.tableClients.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount -1; i >= 0; i--){
            model.removeRow(i);
        }
        clients.show_client();
        this.dispose();
        
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void fieldLocalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLocalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLocalidadeActionPerformed

    private void fieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCidadeActionPerformed

    private void fieldNumTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumTelActionPerformed

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
            java.util.logging.Logger.getLogger(clientesUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientesUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientesUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientesUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientesUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonUpdate;
    public static javax.swing.JTextField fieldCidade;
    public static javax.swing.JTextField fieldCodP;
    public static javax.swing.JTextField fieldLocalidade;
    public static javax.swing.JTextField fieldMorada;
    public static javax.swing.JTextField fieldNomeCliente;
    public static javax.swing.JTextField fieldNumTel;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelMOpus;
    private javax.swing.JLabel labelNomeFunc;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelPassword3;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
