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
    boolean computed = false;
    /**
     * Creates new form ROADTRIPCALCULATOR
     */
    public ROADTRIPCALCULATOR() {
        initComponents();
        
    }
    
    public static void fuelcostComputation(double mileage, double fuelcost, double distance, double totalprice) {
        double amountOfFuelUsed = distance / mileage;
        double priceOfGasUsed = amountOfFuelUsed * fuelcost;
        
        totalprice = totalprice + priceOfGasUsed;
        total.setText(String.format("%.2f", totalprice));
    }
    
    public static void travelTime(double traveltime) {
        double timeInHours = traveltime / 60;
        hour_time.setText(String.format("%.2f", timeInHours));
    }
    
    public static void travelCosts(double mileage, double distance, double totalprice) {
        double traveltimefood = (distance/55)*60;
        double traveltimenight = +traveltimefood;
        
        travel_time.setText(String.format("%.2f",traveltimefood));
        while (traveltimefood>240){
            traveltimefood-=240;
            totalprice += 30;
        }
        
        while (traveltimenight>600){
            traveltimenight-=600;
            totalprice += 80;
        }
        
        String stringedTotalPrice = Double.toString(totalprice);
        total.setText(String.format("%.2f", totalprice));
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
        reset_txt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hour_time = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROADTRIP CALCULATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Travel Time (In Hours)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gas Mileage (Miles per Gallon)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fuel Cost (USD)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        travel_time.setEditable(false);
        travel_time.setBackground(new java.awt.Color(49, 50, 51));
        travel_time.setForeground(new java.awt.Color(255, 255, 255));
        travel_time.setText("0");
        travel_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travel_timeActionPerformed(evt);
            }
        });
        jPanel1.add(travel_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 190, -1));

        mileage_txt.setBackground(new java.awt.Color(49, 50, 51));
        mileage_txt.setForeground(new java.awt.Color(255, 255, 255));
        mileage_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileage_txtActionPerformed(evt);
            }
        });
        jPanel1.add(mileage_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, -1));

        fuelcost_txt.setBackground(new java.awt.Color(49, 50, 51));
        fuelcost_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fuelcost_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Distance (Miles)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        distance_txt.setBackground(new java.awt.Color(49, 50, 51));
        distance_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(distance_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 190, -1));

        compute_btn.setText("Compute");
        compute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compute_btnActionPerformed(evt);
            }
        });
        jPanel1.add(compute_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        reset_txt.setText("Reset");
        reset_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_txtActionPerformed(evt);
            }
        });
        jPanel1.add(reset_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REMINDER:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        total.setBackground(new java.awt.Color(49, 50, 51));
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("0");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 190, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Cost ($)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("If the travel time exceeds 4 hours, an additional ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("a one-night hotel stay.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("fee of $30 will apply and If it exceeds 10 hours ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("an extra $80 will will be charged to cover ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        hour_time.setEditable(false);
        hour_time.setBackground(new java.awt.Color(49, 50, 51));
        hour_time.setForeground(new java.awt.Color(255, 255, 255));
        hour_time.setText("0");
        hour_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour_timeActionPerformed(evt);
            }
        });
        jPanel1.add(hour_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 190, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Travel Time (In Minutes)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(575, 567));
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
        double totalprice = Double.valueOf(total.getText());
        
        if (computed == false) {
            fuelcostComputation(mileage, fuelcost, distance, totalprice); // Method for fuel computation
            double totalpriceAgain = Double.valueOf(total.getText());
            travelCosts(mileage, distance, totalpriceAgain); // Method for travel costs such as food and hotel.
            double traveltime = Double.valueOf(travel_time.getText());
            travelTime(traveltime); // Converts minutes into hours
            computed = true;
        }
    }//GEN-LAST:event_compute_btnActionPerformed

    private void reset_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_txtActionPerformed
        mileage_txt.setText(null);  
        fuelcost_txt.setText(null); 
        distance_txt.setText(null); 
        total.setText("0"); 
        travel_time.setText("0");
        computed = false;

// TODO add your handling code here:
    }//GEN-LAST:event_reset_txtActionPerformed

    private void travel_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travel_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travel_timeActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void hour_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour_timeActionPerformed

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
    private javax.swing.JButton compute_btn;
    public static javax.swing.JTextField distance_txt;
    public static javax.swing.JTextField fuelcost_txt;
    public static javax.swing.JTextField hour_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField mileage_txt;
    private javax.swing.JButton reset_txt;
    public static javax.swing.JTextField total;
    public static javax.swing.JTextField travel_time;
    // End of variables declaration//GEN-END:variables
}
