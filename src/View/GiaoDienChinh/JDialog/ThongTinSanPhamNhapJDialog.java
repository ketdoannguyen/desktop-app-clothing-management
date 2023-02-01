package View.GiaoDienChinh.JDialog;

import View.GiaoDienChinh.JPanel.NhapKhoJPanel;
import Controller.ConnectionMySQL_NhapKho;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.QuanLiDanhSoCode;

public class ThongTinSanPhamNhapJDialog extends javax.swing.JDialog {

    ArrayList<QuanLiDanhSoCode> list;
    public ThongTinSanPhamNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        NhapKhoJPanel c = new NhapKhoJPanel() ;
        list = new ConnectionMySQL_NhapKho().getListQuanLy();
        QuanLiDanhSoCode x = list.get(c.key);
        
        XuLiAnhSP(x.getLoaiHang(),"Quần Jean","QuanJean");
        XuLiAnhSP(x.getLoaiHang(),"Quần Kaki","QuanKaki");
        XuLiAnhSP(x.getLoaiHang(),"Quần Jogger","QuanJogger");
        XuLiAnhSP(x.getLoaiHang(),"Áo khoát len","AoKhoatLen");
        XuLiAnhSP(x.getLoaiHang(),"Áo khoát dù","AoKhoatDu");
        XuLiAnhSP(x.getLoaiHang(),"Áo khoát kaki","AoKhoatKaki");
        XuLiAnhSP(x.getLoaiHang(),"Áo khoát Jean","AoKhoatJean");
        XuLiAnhSP(x.getLoaiHang(),"Váy ngắn","VayNgan");
        XuLiAnhSP(x.getLoaiHang(),"Váy dài","VayDai");
        XuLiAnhSP(x.getLoaiHang(),"Áo sơ mi","AoSoMi");
        XuLiAnhSP(x.getLoaiHang(),"Áo Hoodie","AoHoodie");
        XuLiAnhSP(x.getLoaiHang(),"Áo len","AoLen");
        XuLiAnhSP(x.getLoaiHang(),"Áo thun","AoThun");
        XuLiAnhSP(x.getLoaiHang(),"Áo dài tay","AoDaiTay");
        XuLiAnhSP(x.getLoaiHang(),"Áo Croptop","AoCroptop");
        XuLiAnhSP(x.getLoaiHang(),"Áo Vest","AoVest");
        XuLiAnhSP(x.getLoaiHang(),"Tất","Tat");
        XuLiAnhSP(x.getLoaiHang(),"Găng tay","GangTay");
        XuLiAnhSP(x.getLoaiHang(),"Mũ","Mu");
        XuLiAnhSP(x.getLoaiHang(),"Khăn quàng cổ","KhanQuanCO");
        XuLiAnhSP(x.getLoaiHang(),"Loại khác","Khong");

        jLabelLoaiHang.setText(x.getLoaiHang());
        jLabelMaSanPham.setText(x.getMaMatHang());
        jLabelGioiTinh.setText(x.getGioiTinh());
        jLabelSize.setText(x.getSize());
        jLabelMau.setText(x.getMau());
        jLabelNoiSanXuat.setText(x.getNoiSanXuat());
        jLabelSoLuong.setText(XuLiSo(x.getSoLuongNhap())+" Cái");
        jLabelGiaNhap.setText(XuLiSo(x.getGiaNhap())+" VNĐ");
        jLabelGiaBan.setText(XuLiSo(x.getGiaBan())+" VNĐ");
        jLabelThoiGian.setText(x.getThoiGian()+"");
    }
    
   void XuLiAnhSP(String a,String b,String k){
       if (a.equals(b)){
            jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/"+k+".png")));
       }
   
   }
   String XuLiSo(long n){
        String a = "" , b = null;
        a = String.valueOf(n);
        switch(a.length()){
            case 1:
            case 2:
            case 3:
                b = a;
                break;
            case 4:
                b = a.substring(0,1)+","+a.substring(1,4);
                break;
            case 5:
                b = a.substring(0,2)+","+a.substring(2,5);
                break;
            case 6:
                b = a.substring(0,3)+","+a.substring(3,6);
                break;
            case 7:
                b = a.substring(0,1)+","+a.substring(1,4)+","+a.substring(4,7);
                break;
            case 8:
                b = a.substring(0,2)+","+a.substring(2,5)+","+a.substring(5,8);
                break;
            case 9:
                b = a.substring(0,3)+","+a.substring(3,6)+","+a.substring(6,9);
                break;
            case 10:
                b = a.substring(0,1)+","+a.substring(1,4)+","+a.substring(4,7)+","+a.substring(7,10);
                break;
            case 11:
                b = a.substring(0,2)+","+a.substring(2,5)+","+a.substring(5,8)+","+a.substring(8,11);
                break;
            case 12:
                b = a.substring(0,3)+","+a.substring(3,6)+","+a.substring(6,9)+","+a.substring(9,12);
                break;
        }
        return b  ;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelGiaBan = new javax.swing.JLabel();
        jButtonThoat = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButtonIn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabelAnhSP = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabelThoiGian = new javax.swing.JLabel();
        jLabelLoaiHang = new javax.swing.JLabel();
        jLabelMaSanPham = new javax.swing.JLabel();
        jLabelGioiTinh = new javax.swing.JLabel();
        jLabelSize = new javax.swing.JLabel();
        jLabelMau = new javax.swing.JLabel();
        jLabelNoiSanXuat = new javax.swing.JLabel();
        jLabelSoLuong = new javax.swing.JLabel();
        jLabelGiaNhap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin sản phẩm đã nhập kho");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Thông tin sản phẩm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 431, 58));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã SP      :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 43));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 67, 540, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Loại hàng :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 113, 43));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giới tính   :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 113, 43));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Size         :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 113, 43));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng nhập  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 140, 43));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Màu         :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 113, 43));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nơi sản xuất     :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, 43));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Ảnh sản phẩm");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 160, 43));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Giá nhập          :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 43));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Giá bán            :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 150, 43));

        jLabelGiaBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGiaBan.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGiaBan.setText("Quần Jean");
        jPanel1.add(jLabelGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 43));

        jButtonThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/thoat.png"))); // NOI18N
        jButtonThoat.setToolTipText("Thoát");
        jButtonThoat.setContentAreaFilled(false);
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 90, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Thời gian nhập :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 150, 43));

        jButtonIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/printer.png"))); // NOI18N
        jButtonIn.setToolTipText("In thông tin");
        jButtonIn.setContentAreaFilled(false);
        jButtonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 80, 70));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/diloghoa.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/AoKhoatDu.png"))); // NOI18N
        jLabelAnhSP.setContentAreaFilled(false);
        jPanel1.add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 160, 150));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/dialogsun.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 80, 70));

        jLabelThoiGian.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelThoiGian.setForeground(new java.awt.Color(0, 0, 255));
        jLabelThoiGian.setText("12:12:12 20/05/2001");
        jPanel1.add(jLabelThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 230, 43));

        jLabelLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLoaiHang.setForeground(new java.awt.Color(0, 0, 255));
        jLabelLoaiHang.setText("Áo khoát Jean");
        jPanel1.add(jLabelLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 43));

        jLabelMaSanPham.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMaSanPham.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMaSanPham.setText("Quần Jean");
        jPanel1.add(jLabelMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 43));

        jLabelGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGioiTinh.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGioiTinh.setText("Quần Jean");
        jPanel1.add(jLabelGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 43));

        jLabelSize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSize.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSize.setText("Quần Jean");
        jPanel1.add(jLabelSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, 43));

        jLabelMau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMau.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMau.setText("Quần Jean");
        jPanel1.add(jLabelMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 43));

        jLabelNoiSanXuat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNoiSanXuat.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNoiSanXuat.setText("Quần Jean");
        jPanel1.add(jLabelNoiSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, 43));

        jLabelSoLuong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSoLuong.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSoLuong.setText("Quần Jean");
        jPanel1.add(jLabelSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 43));

        jLabelGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGiaNhap.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGiaNhap.setText("Quần Jean");
        jPanel1.add(jLabelGiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 160, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInActionPerformed
        JOptionPane.showMessageDialog(this, "Hiện tại không thể in thông tin !!");
    }//GEN-LAST:event_jButtonInActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonThoatActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinSanPhamNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinSanPhamNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinSanPhamNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinSanPhamNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongTinSanPhamNhapJDialog dialog = new ThongTinSanPhamNhapJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonIn;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLabelAnhSP;
    private javax.swing.JLabel jLabelGiaBan;
    private javax.swing.JLabel jLabelGiaNhap;
    private javax.swing.JLabel jLabelGioiTinh;
    private javax.swing.JLabel jLabelLoaiHang;
    private javax.swing.JLabel jLabelMaSanPham;
    private javax.swing.JLabel jLabelMau;
    private javax.swing.JLabel jLabelNoiSanXuat;
    private javax.swing.JLabel jLabelSize;
    private javax.swing.JLabel jLabelSoLuong;
    private javax.swing.JLabel jLabelThoiGian;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
