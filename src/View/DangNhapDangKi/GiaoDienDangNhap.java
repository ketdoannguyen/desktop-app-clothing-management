package View.DangNhapDangKi;

import View.GiaoDienChinh.GiaoDienChinh;
import javax.swing.JOptionPane;
import Controller.ConnectionMySQL_DangNhap;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import Model.DangNhapCode;

public class GiaoDienDangNhap extends javax.swing.JFrame {
    
    Container cont = this.getContentPane();
    private ArrayList<DangNhapCode> list;
    public GiaoDienDangNhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTenDangNhap = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonExit = new javax.swing.JButton();
        jButtonDangKi = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelTenDangNhap = new javax.swing.JLabel();
        jLabelMatKhau = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/NenDangNhap.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao diện đăng nhập"); // NOI18N
        setBackground(new java.awt.Color(204, 255, 204));
        setIconImages(getIconImages());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("Phần mềm"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Phần mềm quản lí bán quần áo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 530, 60));

        jTextFieldTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldTenDangNhap.setText("Tên đăng nhập");
        jTextFieldTenDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTenDangNhapMouseClicked(evt);
            }
        });
        jTextFieldTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTenDangNhapKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 223, 41));

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setText("jPasswordField1");
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 223, 41));

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/Exit.png"))); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, 53));

        jButtonDangKi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDangKi.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDangKi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/DangKi.png"))); // NOI18N
        jButtonDangKi.setText("Tạo tài khoản mới");
        jButtonDangKi.setContentAreaFilled(false);
        jButtonDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangKiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDangKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 53));

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/DangNhap.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, 53));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mật khẩu    :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 140, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Người dùng : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/Vui.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 60, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/jacket.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/VayDai.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 160, 130));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Chào mừng bạn đến với phần mềm quản lí cửa hàng bán quần áo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 640, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 30, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("H");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("A");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 30, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("P");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 30, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("P");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 255, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Y");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 30, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("N");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 30, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("E");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 30, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("W");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 30, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Y");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 30, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("E");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("A");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 30, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("R");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 30, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("2");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 30, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 255, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 30, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("2");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 30, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/clothes3.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabelTenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 40, 40));

        jLabelMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 40, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát phần mềm",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (output == JOptionPane.YES_OPTION) {
            try {
                Thread.sleep(50);
                System.exit(0);
            } catch (Exception e) {}
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldTenDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTenDangNhapMouseClicked
        if ("Tên đăng nhập".equals(jTextFieldTenDangNhap.getText())) {
            jTextFieldTenDangNhap.setText("");
        }
    }//GEN-LAST:event_jTextFieldTenDangNhapMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void jButtonDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangKiActionPerformed
        DangKiJDialog dk = new DangKiJDialog(this, true);
        dk.setVisible(true);
    }//GEN-LAST:event_jButtonDangKiActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        list = new ConnectionMySQL_DangNhap().getListDangNhap();
        char[] ch = jPasswordField.getPassword();
        int k=0;
        for(int i=0;i<list.size();i++){
            DangNhapCode x = list.get(i);
            char[] pass = x.getMatKhau().toCharArray();
            if(x.getTenDangNhap().equals(jTextFieldTenDangNhap.getText()) && Arrays.equals(pass, ch))
                k=1;
        } 
         if(k==1){
            setVisible(false);
            new GiaoDienChinh().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc mật khẩu bạn nhập không đúng!!");
        }     
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldTenDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTenDangNhapKeyReleased
        String s3 = jTextFieldTenDangNhap.getText() ;
        char[] ch = s3.toCharArray();
        int kiemtra = 0;
        if(!KiemTraTinhHopLeCuaTaiKhoan(s3)){
            kiemtra = 1 ;
        }
        if(ch.length<8 || ch.length >16){
            kiemtra = 1;
        }
        if(kiemtra==0){
            jLabelTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/dung.png")));
        }
        else{
            jLabelTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
        }
    }//GEN-LAST:event_jTextFieldTenDangNhapKeyReleased

    private void jPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyReleased
        String s = String.valueOf(jPasswordField.getPassword());
        char[] ch = s.toCharArray();
        int kiemtra = 0;
        if(!KiemTraTinhHopLeCuaTaiKhoan(s)){
            kiemtra = 1 ;
        }
        if(ch.length<8 || ch.length >16){
            kiemtra = 1;
        }
        if(kiemtra==0){
            jLabelMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/dung.png")));
        }
        else{
            jLabelMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
        }
    }//GEN-LAST:event_jPasswordFieldKeyReleased
    private boolean KiemTraTinhHopLeCuaTaiKhoan(String t){
        String s = t ;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if((ch[i] < 48 || ch[i] > 57) && (ch[i] < 65 || ch[i] > 90) && (ch[i] < 97 || ch[i] > 122))
                    return false ;
        }
        return true;
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangKi;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMatKhau;
    private javax.swing.JLabel jLabelTenDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
