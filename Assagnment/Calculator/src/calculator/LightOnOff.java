package calculator;


import java.awt.Color;
import javax.swing.ImageIcon;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al Imran Kosto
 */
public class LightOnOff extends javax.swing.JFrame {

    /**
     * Creates new form LightOnOff
     */
    public LightOnOff() {
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

        tbPower = new javax.swing.JToggleButton();
        lImage = new javax.swing.JLabel();
        Bcrre = new javax.swing.JButton();
        Btempareture = new javax.swing.JButton();
        Bs = new javax.swing.JButton();
        Bbinari = new javax.swing.JButton();
        Bsci = new javax.swing.JButton();
        BAge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPower.setText("OFF");
        tbPower.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPowerActionPerformed(evt);
            }
        });

        lImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.gif"))); // NOI18N

        Bcrre.setText("Currency");
        Bcrre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrreActionPerformed(evt);
            }
        });

        Btempareture.setText("Temperature");
        Btempareture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtemparetureActionPerformed(evt);
            }
        });

        Bs.setText("Normal");
        Bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsActionPerformed(evt);
            }
        });

        Bbinari.setText("Binari");

        Bsci.setText("Scientific");
        Bsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsciActionPerformed(evt);
            }
        });

        BAge.setText("Age");
        BAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(tbPower, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btempareture, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bsci, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPower, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lImage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btempareture, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsci, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPowerActionPerformed
        if(tbPower.isSelected()){
            tbPower.setBackground(Color.red);
            tbPower.setText("ON");
            lImage.setIcon(new ImageIcon(getClass().getResource("/Images/2.jpg")));
        }
        else{
            tbPower.setBackground(Color.green);
            tbPower.setText("OFF");
            lImage.setIcon(new ImageIcon(getClass().getResource("/Images/1.gif")));
        }
    }//GEN-LAST:event_tbPowerActionPerformed

    private void BcrreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrreActionPerformed
        Currency obb= new Currency();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BcrreActionPerformed

    private void BtemparetureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtemparetureActionPerformed
        Temperature obb= new Temperature();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BtemparetureActionPerformed

    private void BsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsActionPerformed
        // TODO add your handling code here:
        calculator ob= new calculator();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_BsActionPerformed

    private void BsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsciActionPerformed
        Scientific obb= new Scientific();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BsciActionPerformed

    private void BAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgeActionPerformed
        Age obb= new Age();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BAgeActionPerformed

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
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LightOnOff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAge;
    private javax.swing.JButton Bbinari;
    private javax.swing.JButton Bcrre;
    private javax.swing.JButton Bs;
    private javax.swing.JButton Bsci;
    private javax.swing.JButton Btempareture;
    private javax.swing.JLabel lImage;
    private javax.swing.JToggleButton tbPower;
    // End of variables declaration//GEN-END:variables
}
