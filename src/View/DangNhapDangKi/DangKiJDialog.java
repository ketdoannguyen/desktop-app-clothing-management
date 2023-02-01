
package View.DangNhapDangKi;
import javax.swing.JOptionPane;
import java.util.Random;
import Controller.ConnectionMySQL_DangNhap;
import java.awt.Container;
import java.util.ArrayList;
import Model.DangNhapCode;

public class DangKiJDialog extends javax.swing.JDialog {

    Container cont = this.getContentPane();
    private ArrayList<DangNhapCode> list;
    public DangKiJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        list = new ConnectionMySQL_DangNhap().getListDangNhap();
        jLabelRandom.setText(RanDomMaXacNhan()+"");
    }
    
    DangKiJDialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTenDangNhap = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMaXacNhan = new javax.swing.JTextField();
        jLabelRandom = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox = new javax.swing.JCheckBox();
        jButtonDangKi = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonDangNhap = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelMaXacNhan = new javax.swing.JLabel();
        jLabelTenDangNhap = new javax.swing.JLabel();
        jLabelMatKhau = new javax.swing.JLabel();
        jLabelNhapLaiMatKhau = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng kí tài khoản");
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(61, 131, 232));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Đăng kí tài khoản");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 14, -1, 59));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" Người dùng        :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 90, 155, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Mật khẩu            : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 143, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(" Nhập lại MK      :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 201, 155, 40));

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
        jPanel1.add(jTextFieldTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 89, 320, 41));

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
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 142, 320, 41));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 200, 320, 41));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(" Mã xác nhận     :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 258, 155, 40));

        jTextFieldMaXacNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldMaXacNhan.setText("123456");
        jTextFieldMaXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMaXacNhanMouseClicked(evt);
            }
        });
        jTextFieldMaXacNhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMaXacNhanKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldMaXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 256, 106, 41));

        jLabelRandom.setFont(new java.awt.Font("Viner Hand ITC", 3, 30)); // NOI18N
        jLabelRandom.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRandom.setText("546457");
        jPanel1.add(jLabelRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 130, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("                 ĐIỀU KIỆN & ĐIỀU KHOẢN ĐĂNG KÝ TÀI KHOẢN\nA. Đối tượng sử dụng \n    Phần mềm quản lí cửa hàng bán hàng quần áo dành cho người \nquản lí , chủ cửa hàng , người có trách nhiệm với cửa hàng , nhân viên\nthu ngân , nhân viên bán hàng , những người có chức trách liên quan\nB. Trách nhiệm đăng kí\n   - Khi đăng kí tài khoản phải có sự đồng ý của chủ cửa hàng hay \nngười quản lí,không đăng kí tài khoản bài bửa hay đăng kí quá nhiều \ntài khoản cùng lúc\n   - Vui lòng nhớ tên đăng nhập và mật khẩu đã đăng kí\n\nCảm ơn đã dùng phần mềm quản lí bán hàng quần áo");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 316, 491, 92));

        jCheckBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jCheckBox.setText("Tôi đã đọc và đồng ý những điều khoản trên");
        jPanel1.add(jCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 414, -1, -1));

        jButtonDangKi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDangKi.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDangKi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/DangKi.png"))); // NOI18N
        jButtonDangKi.setText("Đăng kí");
        jButtonDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangKiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDangKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 442, -1, 53));

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/Exit.png"))); // NOI18N
        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 442, -1, 53));

        jButtonDangNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDangNhap.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/DangNhap.png"))); // NOI18N
        jButtonDangNhap.setText("Bạn đã có tài khoản?");
        jButtonDangNhap.setContentAreaFilled(false);
        jButtonDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 506, -1, 53));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangki1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 495, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangki2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 0, -1, 83));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dangki3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 73));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/quaylaidangki4.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 40));

        jLabelMaXacNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMaXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 30, 40));

        jLabelTenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 40, 40));

        jLabelMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 40, 30));

        jLabelNhapLaiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelNhapLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?","Thoát phần mềm"
            ,JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE);
        if(output == JOptionPane.YES_OPTION){
            try {
                Thread.sleep(50);
                System.exit(0);
            }catch(Exception e) {}
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldMaXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMaXacNhanMouseClicked
        jTextFieldMaXacNhan.setText("");
    }//GEN-LAST:event_jTextFieldMaXacNhanMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
        jLabelNhapLaiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
        jLabelMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void jTextFieldTenDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTenDangNhapMouseClicked
        if("Tên đăng nhập".equals(jTextFieldTenDangNhap.getText())){
            jTextFieldTenDangNhap.setText("");
        }
    }//GEN-LAST:event_jTextFieldTenDangNhapMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelRandom.setText(RanDomMaXacNhan()+"");
        jLabelMaXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangNhapActionPerformed
        try {
            Thread.sleep(100);
            setVisible(false);
        }catch(Exception e) {}
    }//GEN-LAST:event_jButtonDangNhapActionPerformed

    private void jButtonDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangKiActionPerformed
        int key = 0 ;
        for(int i=0;i<list.size();i++){
            DangNhapCode c = list.get(i);
            if(c.getTenDangNhap().equals(jTextFieldTenDangNhap.getText())){
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã tồn tại");
                key = 1;
                break;
            }
        }
        String s1 = jPasswordField.getText() ;
        String s2 = jPasswordField1.getText() ;
        String s3 = jTextFieldTenDangNhap.getText() ;
        if((!KiemTraTinhHopLeCuaTaiKhoan(s1)) || (!KiemTraTinhHopLeCuaTaiKhoan(s2)) || (!KiemTraTinhHopLeCuaTaiKhoan(s3))){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập và mật khẩu chỉ gồm chữ cái và chữ số !!");
            key = 1;
        }
        if(!s1.equals(s2)){
            JOptionPane.showMessageDialog(rootPane, "Hai mật khẩu không trùng khớp !!");
            key = 1;
        }
        if((!KiemTraDoDaiCuaTaiKhoan(s1)) || (!KiemTraDoDaiCuaTaiKhoan(s2)) || (!KiemTraDoDaiCuaTaiKhoan(s3))) {
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập và mật khẩu có độ dài từ 8 đến 16 kí tụ !!");
            key = 1;
        }
        if(!(jTextFieldMaXacNhan.getText()).equals((jLabelRandom.getText()))){
            JOptionPane.showMessageDialog(rootPane, "Mã xác nhận không chính xác !!");
            key = 1;
        }
        if(!(jCheckBox.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "Đồng ý điều khoản điều lệ đăng kí tài khoản !!");
            key = 1;
        }
        if(key == 0){
            DangNhapCode x = new DangNhapCode() ;
            x.setTenDangNhap(jTextFieldTenDangNhap.getText());
            x.setMatKhau(jPasswordField.getText());
            try {
                if(new ConnectionMySQL_DangNhap().addDangNhap(x)){
                    JOptionPane.showMessageDialog(rootPane, "Tạo tài khoản thành công !!");
                    list.add(x);
                    try {
                        Thread.sleep(500);
                        setVisible(false);
                    } catch (Exception e) {}
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Lỗi !!!");
                }   
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi !!!");
                ex.printStackTrace();
            }  
        }     
    }//GEN-LAST:event_jButtonDangKiActionPerformed

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

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        String ss = String.valueOf(jPasswordField.getPassword());
        String s = String.valueOf(jPasswordField1.getPassword());
        char[] ch = s.toCharArray();
        int kiemtra = 0;
        if(!KiemTraTinhHopLeCuaTaiKhoan(s)){
            kiemtra = 1 ;
        }
        if(ch.length<8 || ch.length >16){
            kiemtra = 1;
        }
        if(!ss.equals(s)){
            kiemtra = 1;
        }
        if(kiemtra==0){
            jLabelNhapLaiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/dung.png")));
        }
        else{
            jLabelNhapLaiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jTextFieldMaXacNhanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMaXacNhanKeyReleased
        if(!(jTextFieldMaXacNhan.getText()).equals((jLabelRandom.getText()))){
            jLabelMaXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/sai.png")));
        }
        else{
            jLabelMaXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DangNhap/dung.png")));
        }
    }//GEN-LAST:event_jTextFieldMaXacNhanKeyReleased
    
    private boolean KiemTraTinhHopLeCuaTaiKhoan(String t){
        String s = t ;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if((ch[i] < 48 || ch[i] > 57) && (ch[i] < 65 || ch[i] > 90) && (ch[i] < 97 || ch[i] > 122))
                    return false ;
        }
        return true;
    }
    private boolean KiemTraDoDaiCuaTaiKhoan(String t){
        String s = t ;
        char[] ch = s.toCharArray();
        if(ch.length <8 || ch.length > 16)
            return false;
        return true ;
    }
    int RanDomMaXacNhan(){
        Random rd = new Random();
        int k = 100000 + rd.nextInt(899999);
        return k;
    }
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
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangKiJDialog dialog = new DangKiJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDangKi;
    private javax.swing.JButton jButtonDangNhap;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMaXacNhan;
    private javax.swing.JLabel jLabelMatKhau;
    private javax.swing.JLabel jLabelNhapLaiMatKhau;
    private javax.swing.JLabel jLabelRandom;
    private javax.swing.JLabel jLabelTenDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldMaXacNhan;
    private javax.swing.JTextField jTextFieldTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
