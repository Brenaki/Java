/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Arredondando;

/**
 *
 * @author victo
 */
public class Arredondamentos extends javax.swing.JFrame {

    /**
     * Creates new form Arredondamentos
     */
    public Arredondamentos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAB = new javax.swing.JTextField();
        txtVA = new javax.swing.JTextField();
        txtAA = new javax.swing.JTextField();
        txtAC = new javax.swing.JTextField();
        bntVA = new javax.swing.JButton();
        bntAB = new javax.swing.JButton();
        bntAC = new javax.swing.JButton();
        bntAA = new javax.swing.JButton();
        lblVA = new javax.swing.JLabel();
        lblAB = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblAA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Arredondamentos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Abs:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Floor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Round:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ceil:");

        txtAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtABActionPerformed(evt);
            }
        });

        txtVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVAActionPerformed(evt);
            }
        });

        txtAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAAActionPerformed(evt);
            }
        });

        txtAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtACActionPerformed(evt);
            }
        });

        bntVA.setText("Valor Absoluto");
        bntVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVAActionPerformed(evt);
            }
        });

        bntAB.setText("ArredondaB");
        bntAB.setActionCommand("");
        bntAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntABActionPerformed(evt);
            }
        });

        bntAC.setText("ArredondaC");
        bntAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntACActionPerformed(evt);
            }
        });

        bntAA.setText("ArredondaA");
        bntAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAAActionPerformed(evt);
            }
        });

        lblVA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVA.setText("0");

        lblAB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAB.setText("0");

        lblAC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAC.setText("0");

        lblAA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAA.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bntAA)
                                .addGap(27, 27, 27)
                                .addComponent(lblAA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bntAC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtVA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bntVA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bntAB)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntVA)
                    .addComponent(lblVA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAB)
                    .addComponent(lblAB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bntAC)
                    .addComponent(lblAC))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAA)
                    .addComponent(lblAA))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtABActionPerformed

    private void txtVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVAActionPerformed

    private void txtAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAAActionPerformed

    private void txtACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtACActionPerformed

    private void bntVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVAActionPerformed
        // Valor Absoluto
        
        int VA = Integer.parseInt(txtVA.getText());
        int rVA = Math.abs(VA);
        lblVA.setText(Integer.toString(rVA));
    }//GEN-LAST:event_bntVAActionPerformed

    private void bntABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntABActionPerformed
        // Arredonda para BAIXO
        
        double AB = Double.parseDouble(txtAB.getText());
        double rAB = Math.floor(AB);
        lblAB.setText(Double.toString(rAB));
    }//GEN-LAST:event_bntABActionPerformed

    private void bntACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntACActionPerformed
        // Arredonda para CIMA
        
        float AC = Float.parseFloat(txtAC.getText());
        int rAC = (int) Math.ceil(AC);
        lblAC.setText(Integer.toHexString(rAC));
    }//GEN-LAST:event_bntACActionPerformed

    private void bntAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAAActionPerformed
        // Arrendoda ARITMETICAMENTE
        
        float AA = Float.parseFloat(txtAC.getText());
        int rAA = (int) Math.round(AA);
        lblAA.setText(Integer.toString(rAA));
    }//GEN-LAST:event_bntAAActionPerformed

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
            java.util.logging.Logger.getLogger(Arredondamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arredondamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arredondamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arredondamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arredondamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAA;
    private javax.swing.JButton bntAB;
    private javax.swing.JButton bntAC;
    private javax.swing.JButton bntVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAA;
    private javax.swing.JLabel lblAB;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblVA;
    private javax.swing.JTextField txtAA;
    private javax.swing.JTextField txtAB;
    private javax.swing.JTextField txtAC;
    private javax.swing.JTextField txtVA;
    // End of variables declaration//GEN-END:variables
}
