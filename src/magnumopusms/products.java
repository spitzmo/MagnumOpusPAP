/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnumopusms;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static magnumopusms.mainform.idUser;
import static magnumopusms.mainform.userAtual;

/**
 *
 * @author A100519
 */
public class products extends javax.swing.JFrame {

    /**
     * Creates new form orders
     */
    Connection con = null;
    public products() {
        initComponents();
        show_product();
        con = dbConnection.getConnection();
    }
    public void executeSQLQuery(String query, String message){
        Connection con = dbConnection.getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1){
                JOptionPane.showMessageDialog(null, "Dados "+message+" com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Dados não "+message);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void executeSQLQueryNoMessage(String query){
        Connection con = dbConnection.getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "Erro! (executeSQLQueryNoMessage)");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public ArrayList<Product> productsList(){
        ArrayList<Product> productsList = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM produtos, categorias, sub_categorias"
                + " WHERE produtos.cod_categoria = categorias.cod_categoria"
                + " AND produtos.cod_subcategoria = sub_categorias.cod_subcategoria";
        try{
            ps = dbConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            Product product;
            while(rs.next()){
                product = new Product(rs.getInt("cod_produto"), rs.getString("nome_produto"), rs.getString("nome_categoria"), rs.getString("nome_subcategoria"), rs.getInt("quant_disp"), rs.getString("preco"), rs.getInt("iva"));
                productsList.add(product);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return productsList;
    }
    public void show_product(){
        ArrayList<Product> list = productsList();
        DefaultTableModel model = (DefaultTableModel)tableProducts.getModel();
        Object[] row = new Object[7];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getNome_produto();
            row[2]=list.get(i).getNome_categoria();
            row[3]=list.get(i).getNome_subcategoria();
            row[4]=list.get(i).getQuant_disp();
            row[5]=list.get(i).getPreco();
            row[6]=list.get(i).getIVA();

           
            model.addRow(row);
        }}
    public void search (String str){
        DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableProducts.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + str));
    }
    public void calc_iva(){
        String query = "UPDATE produtos P, sub_categorias SC SET valor_iva = P.preco * SC.iva WHERE P.cod_subcategoria = SC.cod_subcategoria";
        
        executeSQLQueryNoMessage(query);
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
        buttonAdd = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        labelInventario = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        fieldProcurar = new javax.swing.JTextField();

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

        buttonAdd.setBackground(new java.awt.Color(255, 204, 102));
        buttonAdd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonAdd.setText("ADICIONAR");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonBack.setBackground(new java.awt.Color(255, 204, 102));
        buttonBack.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        buttonBack.setText("VOLTAR");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Categoria", "SubCategoria", "Quantidade", "Preço", "IVA"
            }
        ));
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        labelInventario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelInventario.setText("Inventário");

        buttonUpdate.setBackground(new java.awt.Color(255, 204, 102));
        buttonUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonUpdate.setText("ATUALIZAR");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(255, 204, 102));
        buttonDelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonDelete.setText("ELIMINAR");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        fieldProcurar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fieldProcurar.setText("Pesquisar...");
        fieldProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldProcurarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBack)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(labelInventario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMOpus)
                .addGap(392, 392, 392)
                .addComponent(buttonExit)
                .addGap(23, 23, 23))
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
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        productsAdd productsAdd = new productsAdd();
        productsAdd.setVisible(true);
        productsAdd.pack();
        productsAdd.setLocationRelativeTo(null);
        productsAdd.getCategorias();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM login WHERE id = ?";

        try{
            ps= dbConnection.getConnection().prepareStatement(query);

            ps.setInt(1, idUser);

            rs = ps.executeQuery();
            if(rs.next()){
                userAtual = (rs.getString("nome_func"));
                mainform mainform = new mainform();
                mainform.setVisible(true);
                mainform.pack();
                mainform.setLocationRelativeTo(null);
                mainform.welcomeLabel.setText("Bem-vindo, " +userAtual);
                this.dispose();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_buttonBackActionPerformed

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked

    }//GEN-LAST:event_tableProductsMouseClicked

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        int i = tableProducts.getSelectedRow();
        TableModel model = tableProducts.getModel();
        productsUpdate productsUpdate = new productsUpdate();
        productsUpdate.idProd = (int) model.getValueAt(i,0);
        productsUpdate.fieldNomeProd.setText(model.getValueAt(i,1).toString());
        productsUpdate.getCategorias();
        productsUpdate.categoriaComboBox.setSelectedItem(model.getValueAt(i,2).toString());
        productsUpdate.subcategoriaComboBox.setSelectedItem(model.getValueAt(i,3).toString());
        productsUpdate.fieldQuant.setText(model.getValueAt(i,4).toString());
        productsUpdate.setVisible(true);
        productsUpdate.pack();
        productsUpdate.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int i = tableProducts.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
        String id = model.getValueAt(i,0).toString();
        String query = "DELETE FROM produtos WHERE cod_produto = '"+id+"'";

        executeSQLQuery(query, "apagados");
        int rowCount = model.getRowCount();
        for (i = rowCount -1; i >= 0; i--){
            model.removeRow(i);
        }
        show_product();
        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void fieldProcurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldProcurarKeyReleased
        String searchString = fieldProcurar.getText();
        search(searchString);
    }//GEN-LAST:event_fieldProcurarKeyReleased

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
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextField fieldProcurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInventario;
    private javax.swing.JLabel labelMOpus;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables
}
