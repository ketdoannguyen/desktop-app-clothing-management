/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GiaoDienChinh.JDialog;

import View.GiaoDienChinh.GiaoDienChinh;
import static View.GiaoDienChinh.JPanel.BanHangJPanel.*;
import View.GiaoDienChinh.JPanel.DonHangJPanel;
import View.GiaoDienChinh.JPanel.DonHangTrongJPanel;
import Controller.ConnectionMySQL_QuanLiBanHang;
import Controller.ConnectionMySQL_SanPhamDaBan;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.BanHangCode;
import Model.QuanLiDanhSoCode;

/**
 *
 * @author Admin
 */
public class GioHangBanHangJDialog extends javax.swing.JDialog {

    ArrayList<BanHangCode> list;
    public static int TaiLaiTrang = 1;

    public GioHangBanHangJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new ConnectionMySQL_SanPhamDaBan().getListThongTinDonHangBan();
        TaiLaiTrang = 1;

        PanelDonHang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButtonXoaDonHang = new javax.swing.JButton();
        jButtonHoaDon = new javax.swing.JButton();
        jButtonCapNhat = new javax.swing.JButton();
        jLabelThanhTien = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelTongTien = new javax.swing.JLabel();
        jLabelGiamGia = new javax.swing.JLabel();
        jButtonChiTietGiamGia = new javax.swing.JButton();
        jButtonQuayLai = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanelLamViec = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Giỏ hàng của bạn");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Giỏ hàng của bạn");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 420, 60));
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonXoaDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/xoabo.png"))); // NOI18N
        jButtonXoaDonHang.setToolTipText("Làm mới giao diện");
        jButtonXoaDonHang.setContentAreaFilled(false);
        jButtonXoaDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaDonHangActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonXoaDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        jButtonHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/bill.png"))); // NOI18N
        jButtonHoaDon.setToolTipText("Làm mới giao diện");
        jButtonHoaDon.setContentAreaFilled(false);
        jButtonHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHoaDonActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, -1));

        jButtonCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/tailai.png"))); // NOI18N
        jButtonCapNhat.setToolTipText("Cập nhật trang");
        jButtonCapNhat.setContentAreaFilled(false);
        jButtonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapNhatActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, -1));

        jLabelThanhTien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelThanhTien.setForeground(new java.awt.Color(0, 0, 255));
        jLabelThanhTien.setText("10,000,000 VNĐ");
        jPanel2.add(jLabelThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Thành tiền : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Tổng tiền   : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 150, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Giảm giá    :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 150, 40));

        jLabelTongTien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTongTien.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTongTien.setText("10,000,000 VNĐ");
        jPanel2.add(jLabelTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 40));

        jLabelGiamGia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGiamGia.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGiamGia.setText("13%");
        jPanel2.add(jLabelGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, 40));

        jButtonChiTietGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/chitietgiamgia.png"))); // NOI18N
        jButtonChiTietGiamGia.setContentAreaFilled(false);
        jButtonChiTietGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiTietGiamGiaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonChiTietGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 40, 50));

        jButtonQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/themgiohang1.png"))); // NOI18N
        jButtonQuayLai.setToolTipText("Tiếp tục mua hàng");
        jButtonQuayLai.setContentAreaFilled(false);
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 800, 120));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanelLamViecLayout = new javax.swing.GroupLayout(jPanelLamViec);
        jPanelLamViec.setLayout(jPanelLamViecLayout);
        jPanelLamViecLayout.setHorizontalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jPanelLamViecLayout.setVerticalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanelLamViec);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 430));

        getAccessibleContext().setAccessibleParent(null);

        setSize(new java.awt.Dimension(814, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    long ChuyenChuoiThanhSo(String n) {
        char[] ch = n.toCharArray();
        String s = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 48 && ch[i] <= 57) {
                s += ch[i];
            }
        }
        long num = Long.parseLong(s);
        return num;
    }

    String XuLiSo(long n) {
        String a = "", b = null;
        a = String.valueOf(n);
        switch (a.length()) {
            case 1:
            case 2:
            case 3:
                b = a;
                break;
            case 4:
                b = a.substring(0, 1) + "," + a.substring(1, 4);
                break;
            case 5:
                b = a.substring(0, 2) + "," + a.substring(2, 5);
                break;
            case 6:
                b = a.substring(0, 3) + "," + a.substring(3, 6);
                break;
            case 7:
                b = a.substring(0, 1) + "," + a.substring(1, 4) + "," + a.substring(4, 7);
                break;
            case 8:
                b = a.substring(0, 2) + "," + a.substring(2, 5) + "," + a.substring(5, 8);
                break;
            case 9:
                b = a.substring(0, 3) + "," + a.substring(3, 6) + "," + a.substring(6, 9);
                break;
            case 10:
                b = a.substring(0, 1) + "," + a.substring(1, 4) + "," + a.substring(4, 7) + "," + a.substring(7, 10);
                break;
            case 11:
                b = a.substring(0, 2) + "," + a.substring(2, 5) + "," + a.substring(5, 8) + "," + a.substring(8, 11);
                break;
            case 12:
                b = a.substring(0, 3) + "," + a.substring(3, 6) + "," + a.substring(6, 9) + "," + a.substring(9, 12);
                break;
        }
        return b;
    }
    long TongTien = 0;
    int PanelDonHangKiemTraHang = 0;

    void PanelDonHang() {
        TongTien = 0;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        list = new ConnectionMySQL_SanPhamDaBan().getListThongTinDonHangBan();
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            BanHangCode ban = list.get(i);
            if (ban.getLanBan() == soLanBann) {
                DonHangJPanel dh = new DonHangJPanel();
                dh.jLabelLoaiHang.setText(ban.getLoaiHang());
                dh.jLabelMaMatHang.setText(ban.getMaMatHang());
                dh.jLabelGiaBan.setText(XuLiSo(ban.getGiaBan()) + " VNĐ");
                dh.jLabelSoLuongBan.setText(ban.getSoLuongBan() + "");
                dh.jLabelThanhTienDonHang.setText(XuLiSo(ban.getTienBan()) + " VNĐ");
                TongTien += ChuyenChuoiThanhSo(dh.jLabelThanhTienDonHang.getText());

                dh.jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        TaiLaiTrang = 0;

                        int output = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa sản phẩm khỏi đơn hàng không?", "Xóa sản phẩm khỏi đơn hàng",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE);
                        if (output == JOptionPane.YES_OPTION) {
                            
                        }
                    }
                });

                jPanelLamViec.add(dh);
                k++;
            }
        }

        if (k == 0) {
            DonHangTrongJPanel dht1 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht1);
            DonHangTrongJPanel dht2 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht2);
            DonHangTrongJPanel dht3 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht3);
            PanelDonHangKiemTraHang = 1;
        } else if (k == 1) {
            DonHangTrongJPanel dht1 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht1);
            DonHangTrongJPanel dht2 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht2);
        } else if (k == 2) {
            DonHangTrongJPanel dht3 = new DonHangTrongJPanel();
            jPanelLamViec.add(dht3);
        }

        jPanelLamViec.validate();
        jPanelLamViec.repaint();

        jLabelTongTien.setText(XuLiSo(TongTien) + " VNĐ");
        int maGiam = LayMaGiamGiaTheKhachHang() + LayMaGiamGiaTongTien();
        jLabelGiamGia.setText(maGiam + "%");
        long thanhtien = (long) TongTien - (TongTien * maGiam / 100);
        jLabelThanhTien.setText(XuLiSo(thanhtien) + " VNĐ");
    }

    private void jButtonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapNhatActionPerformed

        jPanelLamViec.removeAll();
        PanelDonHang();
        TaiLaiTrang = 1;

        LuuThongTinGioHang();
    }//GEN-LAST:event_jButtonCapNhatActionPerformed
    void LuuThongTinGioHang() {
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            BanHangCode ban = list.get(i);
            if (ban.getLanBan() == soLanBann) {
                DonHangJPanel dh = (DonHangJPanel) jPanelLamViec.getComponent(k++);
                try {
                    if (new ConnectionMySQL_SanPhamDaBan().SoLuongBanGioHang(ban, Integer.parseInt(dh.jLabelSoLuongBan.getText()))) {
                    }
                } catch (SQLException ex) {
                }
            }
        }
    }

    void LuuThongTinSoLuongConCuaCacSanPham() {
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            BanHangCode ban = list.get(i);
            if (ban.getLanBan() == soLanBann) {
                DonHangJPanel dh = (DonHangJPanel) jPanelLamViec.getComponent(k++);
                QuanLiDanhSoCode x = new QuanLiDanhSoCode();
                x.setMaMatHang(dh.jLabelMaMatHang.getText());
                int soLuongBan = (int) Long.parseLong(ChuyenChuoiThanhSo(dh.jLabelSoLuongBan.getText()) + "");
                int giaBan = (int) Long.parseLong(ChuyenChuoiThanhSo(dh.jLabelGiaBan.getText()) + "");
                x.setSoLuongBan(soLuongBan);
                x.setGiaBan(giaBan);

                try {
                    if (new ConnectionMySQL_QuanLiBanHang().Edit(x)) {
                    }
                } catch (SQLException ex) {
                }
            }
        }
    }

    int LayMaGiamGiaTheKhachHang() {
        int maGiam = 0;

        for (int i = 0; i < list.size(); i++) {
            BanHangCode ban = list.get(i);
            if (ban.getLanBan() == soLanBann) {
                if (ban.getTheKhachHang().equals("Tân Thủ")) {
                    maGiam = 1;
                }
                if (ban.getTheKhachHang().equals("Titan")) {
                    maGiam = 2;
                }
                if (ban.getTheKhachHang().equals("VIP")) {
                    maGiam = 3;
                }
                if (ban.getTheKhachHang().equals("Bạch Kim")) {
                    maGiam = 4;
                }
                if (ban.getTheKhachHang().equals("Kim Cương")) {
                    maGiam = 5;
                }
                break;
            }
        }
        return maGiam;
    }

    int LayMaGiamGiaTongTien() {
        int maGiam = 0;
        if (ChuyenChuoiThanhSo(jLabelTongTien.getText()) >= 3000000) {
            maGiam = 6;
        } else if (ChuyenChuoiThanhSo(jLabelTongTien.getText()) >= 2000000) {
            maGiam = 4;
        } else if (ChuyenChuoiThanhSo(jLabelTongTien.getText()) >= 1000000) {
            maGiam = 2;
        } else if (ChuyenChuoiThanhSo(jLabelTongTien.getText()) >= 100000) {
            maGiam = 1;
        }
        return maGiam;
    }

    private void jButtonHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHoaDonActionPerformed
        if (PanelDonHangKiemTraHang == 1) {
            JOptionPane.showMessageDialog(this, "Giỏ hàng trống !!");
        } else if (TaiLaiTrang == 0) {
            JOptionPane.showMessageDialog(this, "Cập nhật trang !!");
            LuuThongTinGioHang();
            jPanelLamViec.removeAll();
            PanelDonHang();
            TaiLaiTrang = 1;
        } else {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thanh toán đơn hàng không ?", "Thanh toán đơn hàng",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (output == JOptionPane.YES_OPTION) {
                LuuThongTinSoLuongConCuaCacSanPham();
                jComboBoxTheKhachHang.setEnabled(true);
                soLanBann++;
                setVisible(false);
                TroChoi1JDialog trochoi = new TroChoi1JDialog(new GiaoDienChinh(), true);
                trochoi.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonHoaDonActionPerformed

    private void jButtonXoaDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaDonHangActionPerformed

        if (PanelDonHangKiemTraHang == 1) {
            JOptionPane.showMessageDialog(this, "Giỏ hàng trống !!");
        } else {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa giỏ hàng không ?", "Xóa giỏ hàng",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (output == JOptionPane.YES_OPTION) {
                PanelDonHangKiemTraHang = 1;
                try {
                    if (new ConnectionMySQL_SanPhamDaBan().DeleteQuanLi(soLanBann)) {
                        JOptionPane.showMessageDialog(this, "Xóa giỏ hàng thành công !!");
                        jPanelLamViec.removeAll();
                        PanelDonHang();
                    }
                } catch (SQLException ex) {
                }
            }
        }
    }//GEN-LAST:event_jButtonXoaDonHangActionPerformed

    private void jButtonChiTietGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiTietGiamGiaActionPerformed

        int maGiamThe = LayMaGiamGiaTheKhachHang();
        int maGiamTien = LayMaGiamGiaTongTien();
        JOptionPane.showMessageDialog(this, "Mã giảm giá thẻ khách hàng = " + maGiamThe + "%" + "\nMã giảm giá theo tổng tiền = " + maGiamTien + "%" + "\n\tTổng mã giảm giá = " + (maGiamThe + maGiamTien) + "%");
    }//GEN-LAST:event_jButtonChiTietGiamGiaActionPerformed

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        if (TaiLaiTrang == 0) {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu thay dổi không ?", "Thay đổi thông tin giỏ hàng",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (output == JOptionPane.YES_OPTION) {
                LuuThongTinGioHang();
                jPanelLamViec.removeAll();
                PanelDonHang();
                TaiLaiTrang = 1;
            } else if (output == JOptionPane.NO_OPTION) {
                setVisible(false);
                TaiLaiTrang = 0;
            }
        } else {
            setVisible(false);
            TaiLaiTrang = 0;
        }
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(GioHangBanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GioHangBanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GioHangBanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GioHangBanHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GioHangBanHangJDialog dialog = new GioHangBanHangJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonChiTietGiamGia;
    private javax.swing.JButton jButtonHoaDon;
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JButton jButtonXoaDonHang;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGiamGia;
    private javax.swing.JLabel jLabelThanhTien;
    private javax.swing.JLabel jLabelTongTien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLamViec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
