/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package celilcavus.yemekHaneApp.GUI;

import celilcavus.yemekHaneApp.Interfaces.IEdit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celil
 */
public class FrmOrders extends javax.swing.JFrame implements IEdit {

    /**
     * Creates new form FrmOrders
     */
    public FrmOrders() {
        initComponents();
        this.GetEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAddCustomers = new celilcavus.yemekHaneApp.MyCompenents.MyButton();
        btnAddProduct = new celilcavus.yemekHaneApp.MyCompenents.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 646));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAddCustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\Celil\\Documents\\NetBeansProjects\\YemekHaneApplicatiom\\src\\main\\java\\yemekHaneApp\\Icons\\Crowd.png")); // NOI18N
        btnAddCustomers.setText("Add Customers");
        btnAddCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomersActionPerformed(evt);
            }
        });

        btnAddProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\Celil\\Documents\\NetBeansProjects\\YemekHaneApplicatiom\\src\\main\\java\\yemekHaneApp\\Icons\\Package.png")); // NOI18N
        btnAddProduct.setText("Add Products");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 646, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        new FrmProduct().setVisible(true);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnAddCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomersActionPerformed
        // TODO add your handling code here:
        new FrmCustomers().setVisible(true);
    }//GEN-LAST:event_btnAddCustomersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrders().setVisible(true);
            }
        });
    }

    @Override
    public void GetEdits() {
     
        this.setLocationRelativeTo(null);
        
        String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE"},};
        String[] columnNames = {"Name", "Roll Number", "Department"};

        DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames);
        this.jTable1.setModel(defaultTableModel);

        // Column Names
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private celilcavus.yemekHaneApp.MyCompenents.MyButton btnAddCustomers;
    private celilcavus.yemekHaneApp.MyCompenents.MyButton btnAddProduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}