package View.GiaoDienChinh.JDialog;

import View.GiaoDienChinh.GiaoDienChinh;
import javax.swing.JOptionPane;

public class ThongTinUngDungJDialog extends javax.swing.JDialog {

    public ThongTinUngDungJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCapNhat = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jButtonVanBan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin ứng dụng quản lí cửa hàng bán quần áo");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Thông tin ứng dụng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/center.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 267, 271));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh5.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh4.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/anh6.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 67, 640, -1));

        jButtonCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/update.png"))); // NOI18N
        jButtonCapNhat.setToolTipText("Cập nhật ứng dụng");
        jButtonCapNhat.setContentAreaFilled(false);
        jButtonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapNhatActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 90, 70));

        jButtonThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/thoat.png"))); // NOI18N
        jButtonThoat.setToolTipText("Thoát");
        jButtonThoat.setContentAreaFilled(false);
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 90, 70));

        jButtonVanBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongTinJDialog/document.png"))); // NOI18N
        jButtonVanBan.setToolTipText("Thông tin ứng dụng");
        jButtonVanBan.setContentAreaFilled(false);
        jButtonVanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVanBanActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVanBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 90, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenn.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapNhatActionPerformed
        JOptionPane.showMessageDialog(this, "Phiên bản bạn đang dùng là phiên bản mới nhất !!");
    }//GEN-LAST:event_jButtonCapNhatActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonVanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVanBanActionPerformed
        ThongTinUngDungVanBanJDialog x = new ThongTinUngDungVanBanJDialog(new GiaoDienChinh(),true);
        setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_jButtonVanBanActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinUngDungJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinUngDungJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinUngDungJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinUngDungJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinUngDungJDialog dialog = new ThongTinUngDungJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapNhat;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonVanBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
