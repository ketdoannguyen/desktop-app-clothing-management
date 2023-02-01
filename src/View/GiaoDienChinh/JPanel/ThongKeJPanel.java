/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GiaoDienChinh.JPanel;

import View.GiaoDienChinh.JPanel.ThongKe.KhoHangJPanel;
import View.GiaoDienChinh.JPanel.ThongKe.TienBanJPanel;
import View.GiaoDienChinh.JPanel.ThongKe.TienVonJPanel;
import View.GiaoDienChinh.JPanel.ThongKe.TienLoiJPanel;
import View.GiaoDienChinh.JPanel.ThongKe.SoLuongJPanel;
import View.GiaoDienChinh.JPanel.ThongKe.GiaCaJPanel;
import Controller.ConnectionMySQL_QuanLiBanHang;
import java.util.ArrayList;
import Model.QuanLiDanhSoCode;

/**
 *
 * @author Admin
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
        Tong();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelLamViec = new javax.swing.JPanel();
        jButtonKhoHang = new javax.swing.JButton();
        jButtonSoLuong = new javax.swing.JButton();
        jButtonGiaCa = new javax.swing.JButton();
        jButtonTienVon = new javax.swing.JButton();
        jButtonTienBan = new javax.swing.JButton();
        jButtonTienLoi = new javax.swing.JButton();
        jLabelTien = new javax.swing.JLabel();
        jLabelTong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelHoa1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelHoa2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1190, 670));
        setPreferredSize(new java.awt.Dimension(1200, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Thống kê kho hàng");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 460, 80));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 590, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/iconThongKe1.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 130, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/iconThongKe.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 120));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanelLamViecLayout = new javax.swing.GroupLayout(jPanelLamViec);
        jPanelLamViec.setLayout(jPanelLamViecLayout);
        jPanelLamViecLayout.setHorizontalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
        );
        jPanelLamViecLayout.setVerticalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelLamViec);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 940, 450));

        jButtonKhoHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonKhoHang.setText("Kho hàng");
        jButtonKhoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKhoHangActionPerformed(evt);
            }
        });
        add(jButtonKhoHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 50));

        jButtonSoLuong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSoLuong.setText("Số Lượng");
        jButtonSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoLuongActionPerformed(evt);
            }
        });
        add(jButtonSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 50));

        jButtonGiaCa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGiaCa.setText("Giá cả");
        jButtonGiaCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGiaCaActionPerformed(evt);
            }
        });
        add(jButtonGiaCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 50));

        jButtonTienVon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonTienVon.setText("Tiền Vốn");
        jButtonTienVon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTienVonActionPerformed(evt);
            }
        });
        add(jButtonTienVon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 50));

        jButtonTienBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonTienBan.setText("Tiền Bán");
        jButtonTienBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTienBanActionPerformed(evt);
            }
        });
        add(jButtonTienBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 50));

        jButtonTienLoi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonTienLoi.setText("Tiền Lời");
        jButtonTienLoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTienLoiActionPerformed(evt);
            }
        });
        add(jButtonTienLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 200, 50));

        jLabelTien.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabelTien.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTien.setText("1,000,000,000 VNĐ");
        add(jLabelTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 230, 60));

        jLabelTong.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabelTong.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTong.setText("Tổng :");
        add(jLabelTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, 100, 80));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/happy-new-year.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 524, 120, 140));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/2021.png"))); // NOI18N
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 130, 172));

        jLabelHoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/floral.png"))); // NOI18N
        add(jLabelHoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 590, 430, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/dog.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 80, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/cat.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 80, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/bee.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 80, 80));

        jLabelHoa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ThongKe/sunflower.png"))); // NOI18N
        add(jLabelHoa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 390, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTienLoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTienLoiActionPerformed
        Icon();
        long TongTien = 0;
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            TienLoiJPanel kho = new TienLoiJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelSLBan.setText(XuLiSo(x.getSoLuongBan())+" Cái");
            kho.jLabelGiaBan.setText(XuLiSo(x.getGiaBan())+" VNĐ");
            kho.jLabelSLNhap.setText(XuLiSo(x.getSoLuongNhap())+" Cái");
            kho.jLabelGiaNhap.setText(XuLiSo(x.getGiaNhap())+" VNĐ");
            kho.jLabelTienLoi.setText(XuLiSo(x.getTienLoi())+" VNĐ");
            TongTien += x.getTienLoi() ;
            jPanelLamViec.add(kho);
        }
        jLabelTien.setText(XuLiSo(TongTien)+" VNĐ");
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonTienLoiActionPerformed

    private void jButtonKhoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKhoHangActionPerformed
        Tong();
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            KhoHangJPanel kho = new KhoHangJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelSize.setText(x.getSize());
            kho.jLabelMau.setText(x.getMau());
            kho.jLabelNoiSanXuat.setText(x.getNoiSanXuat());
            kho.jLabelGioiTinh.setText(x.getGioiTinh());
            kho.jLabelThoiGianNhap.setText(x.getThoiGian());
            jPanelLamViec.add(kho);
        }
        
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonKhoHangActionPerformed

    private void jButtonSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoLuongActionPerformed
        Tong();
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            SoLuongJPanel kho = new SoLuongJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelSLNhap.setText(XuLiSo(x.getSoLuongNhap())+" Cái");
            kho.jLabelSLBan.setText(XuLiSo(x.getSoLuongBan())+" Cái");
            kho.jLabelSLCon.setText(XuLiSo(x.getSoLuongCon())+" Cái");
            
            jPanelLamViec.add(kho);
        }
        
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonSoLuongActionPerformed

    private void jButtonGiaCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGiaCaActionPerformed
        Tong();
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            GiaCaJPanel kho = new GiaCaJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelGiaNhap.setText(XuLiSo(x.getGiaNhap())+" VNĐ");
            kho.jLabelGiaBan.setText(XuLiSo(x.getGiaBan())+" VNĐ");
            
            jPanelLamViec.add(kho);
        }
        
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonGiaCaActionPerformed

    private void jButtonTienVonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTienVonActionPerformed
        Icon();
        long TongTien = 0;
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            TienVonJPanel kho = new TienVonJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelSLNhap.setText(XuLiSo(x.getSoLuongNhap())+" Cái");
            kho.jLabelGiaNhap.setText(XuLiSo(x.getGiaNhap())+" VNĐ");
            kho.jLabelVon.setText(XuLiSo(x.getTienVon())+" VNĐ");
            TongTien += x.getTienVon() ;
            jPanelLamViec.add(kho);
        }
        jLabelTien.setText(XuLiSo(TongTien)+" VNĐ");
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonTienVonActionPerformed

    private void jButtonTienBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTienBanActionPerformed
        Icon();
        long TongTien = 0;
        ArrayList<QuanLiDanhSoCode> list = new ConnectionMySQL_QuanLiBanHang().getListBanHang() ;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        jPanelLamViec.removeAll();
        for(int i=0;i<list.size();i++){
            QuanLiDanhSoCode x = list.get(i);
            TienBanJPanel kho = new TienBanJPanel() ;
            kho.jLabelLoaiHang.setText(x.getLoaiHang());
            kho.jLabelMaSanPham.setText(x.getMaMatHang());
            kho.jLabelSLBan.setText(XuLiSo(x.getSoLuongBan())+" Cái");
            kho.jLabelGiaBan.setText(XuLiSo(x.getGiaBan())+" VNĐ");
            kho.jLabelTienBan.setText(XuLiSo(x.getTienBan())+" VNĐ");
            TongTien += x.getTienBan() ;
            jPanelLamViec.add(kho);
        }
        jLabelTien.setText(XuLiSo(TongTien)+" VNĐ");
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
    }//GEN-LAST:event_jButtonTienBanActionPerformed
    void Tong(){
        jLabelTong.setText("");
        jLabelTien.setText("");
        jLabelHoa1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelHoa2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    }
    void Icon(){
        jLabelHoa1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jLabelHoa2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jLabelTong.setText("Tổng :");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGiaCa;
    private javax.swing.JButton jButtonKhoHang;
    private javax.swing.JButton jButtonSoLuong;
    private javax.swing.JButton jButtonTienBan;
    private javax.swing.JButton jButtonTienLoi;
    private javax.swing.JButton jButtonTienVon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHoa1;
    private javax.swing.JLabel jLabelHoa2;
    private javax.swing.JLabel jLabelTien;
    private javax.swing.JLabel jLabelTong;
    private javax.swing.JPanel jPanelLamViec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
