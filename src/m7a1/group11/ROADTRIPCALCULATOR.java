/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package m7a1.group11;

/**
 *
 * @author WINDOWS
 */
public class ROADTRIPCALCULATOR extends javax.swing.JFrame {

    /**
     * Creates new form ROADTRIPCALCULATOR
     */
    public ROADTRIPCALCULATOR() {
        initComponents();
        
    }
    
    public static void fuelcostComputation(double mileage, double fuelcost, double distance, double totalprice) {
        System.out.println("PLACEHOLDER");
        
        System.out.println(mileage);
        System.out.println(fuelcost);
        System.out.println(distance);
        
        double amountOfFuelUsed = distance / mileage;
        double priceOfGasUsed = amountOfFuelUsed * fuelcost;
        
        totalprice = totalprice + priceOfGasUsed;
        String stringedTotalPrice = Double.toString(totalprice);
        total_txt.setText(stringedTotalPrice);
    }
    
    public static void travelTime() {
        ;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        travel_time = new javax.swing.JTextField();
        mileage_txt = new javax.swing.JTextField();
        fuelcost_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        distance_txt = new javax.swing.JTextField();
        compute_btn = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROADTRIP CALCULATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Travel Time (In Minutes)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gas Mileage");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fuel Cost");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        travel_time.setText("0");
        travel_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travel_timeActionPerformed(evt);
            }
        });
        jPanel1.add(travel_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 240, -1));

        mileage_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileage_txtActionPerformed(evt);
            }
        });
        jPanel1.add(mileage_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, -1));
        jPanel1.add(fuelcost_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Distance");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel1.add(distance_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 190, -1));

        compute_btn.setText("Compute");
        compute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compute_btnActionPerformed(evt);
            }
        });
        jPanel1.add(compute_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel1.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        total_txt.setText("0");
        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });
        jPanel1.add(total_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(616, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mileage_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mileage_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mileage_txtActionPerformed

    private void compute_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compute_btnActionPerformed
        // TODO add your handling code here:
        double mileage = Double.valueOf(mileage_txt.getText());
        double fuelcost = Double.valueOf(fuelcost_txt.getText());
        double distance = Double.valueOf(distance_txt.getText());
        double totalprice = Double.valueOf(total_txt.getText());
        
        fuelcostComputation(mileage, fuelcost, distance, totalprice);
    }//GEN-LAST:event_compute_btnActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        mileage_txt.setText(null);  
        fuelcost_txt.setText(null); 
        distance_txt.setText(null); 
        total_txt.setText(null); 
        travel_time.setText(null); 

// TODO add your handling code here:
    }//GEN-LAST:event_CLEARActionPerformed

    private void travel_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travel_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travel_timeActionPerformed

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_txtActionPerformed

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
            java.util.logging.Logger.getLogger(ROADTRIPCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ROADTRIPCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ROADTRIPCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ROADTRIPCALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ROADTRIPCALCULATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton compute_btn;
    public static javax.swing.JTextField distance_txt;
    public static javax.swing.JTextField fuelcost_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField mileage_txt;
    public static javax.swing.JTextField total_txt;
    public static javax.swing.JTextField travel_time;
    // End of variables declaration//GEN-END:variables
}
