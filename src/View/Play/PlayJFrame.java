package View.Play;

import View.DangNhapDangKi.GiaoDienDangNhap;

public class PlayJFrame extends javax.swing.JFrame {

    public PlayJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelAnhSP = new javax.swing.JLabel();
        jLabelAnhSP1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chào mừng bạn đến với phần mềm");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar.setBackground(new java.awt.Color(204, 204, 255));
        jProgressBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgressBar.setForeground(new java.awt.Color(255, 204, 102));
        jProgressBar.setOpaque(true);
        jProgressBar.setStringPainted(true);
        jPanel1.add(jProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 600, 30));

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Phần mềm quản lí cửa hàng bán quần áo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 670, 50));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Chào mừng bạn đến với");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 410, 60));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 102, 0));
        jLabel.setText("LOADING..........");
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 210, 30));

        jLabelAnhSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/dialogsun.png"))); // NOI18N
        jLabelAnhSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, 80));

        jLabelAnhSP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnhSP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/donhang.png"))); // NOI18N
        jLabelAnhSP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelAnhSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HAPPY NEW YEAR 2021");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 680, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        PlayJFrame x = new PlayJFrame();
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
            java.util.logging.Logger.getLogger(PlayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                x.setVisible(true);
            }
        });
        x.jLabel.setText("LOADING");
        for(int i=0;i<=100;i+=5){
            if(i==50){
                x.jLabel.setText("LOADING");
            }else{
                x.jLabel.setText(x.jLabel.getText()+".");
            }
            try{
                Thread.sleep(180);
                x.jProgressBar.setValue(i);
                if(i==100){
                    x.setVisible(false);
                    new GiaoDienDangNhap().setVisible(true);
                }
            }catch(Exception e){}
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabelAnhSP;
    public javax.swing.JLabel jLabelAnhSP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables

}
