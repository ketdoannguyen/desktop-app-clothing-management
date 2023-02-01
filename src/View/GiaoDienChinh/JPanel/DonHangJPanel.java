package View.GiaoDienChinh.JPanel;

import static View.GiaoDienChinh.JDialog.GioHangBanHangJDialog.*;
import Controller.ConnectionMySQL_QuanLiBanHang;
import Controller.ConnectionMySQL_SanPhamDaBan;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.BanHangCode;
import Model.QuanLiDanhSoCode;

public class DonHangJPanel extends javax.swing.JPanel {

    ArrayList<BanHangCode> list;
    static int soLanBan = 1;
    public DonHangJPanel() {
        initComponents();
        list = new ConnectionMySQL_SanPhamDaBan().getListThongTinDonHangBan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAnhSP = new javax.swing.JLabel();
        jPanelVienTrang = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelSoLuongBan = new javax.swing.JLabel();
        jButtonTang = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonThaTim = new javax.swing.JButton();
        jButtonGiam = new javax.swing.JButton();
        jLabelThanhTienDonHang = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelMaMatHang = new javax.swing.JLabel();
        jLabelLoaiHang = new javax.swing.JLabel();
        jLabelGiaBan = new javax.swing.JLabel();
        jLabelDauX = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAnhSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/donhang.png"))); // NOI18N
        jLabelAnhSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 100));

        jPanelVienTrang.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVienTrang.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVienTrang.add(jPanel3);

        add(jPanelVienTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 820, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Thành tiền : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Loại hàng : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã mặt hàng : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Số lượng bán : ");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 140, 30));

        jLabelSoLuongBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSoLuongBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSoLuongBan.setText("5");
        jLabelSoLuongBan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelSoLuongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 50, 30));

        jButtonTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/cong.png"))); // NOI18N
        jButtonTang.setContentAreaFilled(false);
        jButtonTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTangActionPerformed(evt);
            }
        });
        add(jButtonTang, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 30, 30));

        jButtonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/thungrac.png"))); // NOI18N
        jButtonXoa.setContentAreaFilled(false);
        add(jButtonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 50, 40));

        jButtonThaTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/traitim.png"))); // NOI18N
        jButtonThaTim.setContentAreaFilled(false);
        jButtonThaTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThaTimActionPerformed(evt);
            }
        });
        add(jButtonThaTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 50, 40));

        jButtonGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/tru.png"))); // NOI18N
        jButtonGiam.setContentAreaFilled(false);
        jButtonGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGiamActionPerformed(evt);
            }
        });
        add(jButtonGiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 30, 30));

        jLabelThanhTienDonHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelThanhTienDonHang.setText("1,000,000 VNĐ");
        add(jLabelThanhTienDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Giá bán      : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 120, 30));

        jLabelMaMatHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMaMatHang.setText("AKJ5");
        add(jLabelMaMatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 70, 30));

        jLabelLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLoaiHang.setText("Áo khoát Jean");
        add(jLabelLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 30));

        jLabelGiaBan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGiaBan.setText("1,000,000 VNĐ");
        add(jLabelGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 30));
        add(jLabelDauX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 210, 130));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    
    int soLanThaTim = 1 ;
    private void jButtonThaTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThaTimActionPerformed
        
        soLanThaTim++;
        if(soLanThaTim % 2 == 0){
            jButtonThaTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/traitimop.png")));
        }
        else{
            jButtonThaTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/traitim.png")));
        }
    }//GEN-LAST:event_jButtonThaTimActionPerformed
    long ChuyenChuoiThanhSo(String n){
        char[] ch = n.toCharArray();
        String s = "";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=48 && ch[i]<=57){
                s += ch[i];
            }     
        }
        long num = Long.parseLong(s);
        return num ;
    }
    int LaySoLuongConSanPham(){
        ArrayList<QuanLiDanhSoCode> list1;
        list1 = new ConnectionMySQL_QuanLiBanHang().getListBanHang();
        QuanLiDanhSoCode x ;
        for(int i=0;i<list1.size();i++){
            x = list1.get(i);
            if(x.getMaMatHang().equals(a)){
                System.out.println(x.getSoLuongCon());
                return x.getSoLuongCon() ;
            }
        }
        return -1;
    }
    int soLuongCon = LaySoLuongConSanPham();
    String a ;
    public void jButtonTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTangActionPerformed
        a = jLabelMaMatHang.getText() ;
        TaiLaiTrang = 0;
        if(soLuongCon==0){
            JOptionPane.showMessageDialog(this, "Số lượng còn = 0");
        }
        else{
            int k = Integer.parseInt(jLabelSoLuongBan.getText()) + 1 ;
            jLabelSoLuongBan.setText(k+"");
            long tien = Integer.parseInt(ChuyenChuoiThanhSo(jLabelGiaBan.getText())+"")*Integer.parseInt(jLabelSoLuongBan.getText());
            jLabelThanhTienDonHang.setText(XuLiSo(tien)+" VNĐ");
            soLuongCon--;
        }
    }//GEN-LAST:event_jButtonTangActionPerformed
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
   
    private void jButtonGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGiamActionPerformed
        TaiLaiTrang = 0;
        
        int k = Integer.parseInt(jLabelSoLuongBan.getText()) - 1 ;
        jLabelSoLuongBan.setText(k+"");
        long tien = Integer.parseInt(ChuyenChuoiThanhSo(jLabelGiaBan.getText())+"")*Integer.parseInt(jLabelSoLuongBan.getText());
        jLabelThanhTienDonHang.setText(XuLiSo(tien)+" VNĐ");
        
        if(jLabelSoLuongBan.getText().equals("0")){
            int output = JOptionPane.showConfirmDialog(this, "Số lượng bán = 0\nBạn có muốn xóa sản phẩm khỏi đơn hàng không?", "Xóa sản phẩm khỏi đơn hàng",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
            if (output == JOptionPane.YES_OPTION) {
                BanHangCode x = list.get(0);
                for(int i=0;i<list.size();i++){
                    x = list.get(i);
                    if((x.getLanBan()==XetSoLanBan()) && (x.getMaMatHang().equals(jLabelMaMatHang.getText()))){
                        break;
                    }
                }
                try {
                    if(new ConnectionMySQL_SanPhamDaBan().DeleteThanhPhanGioHang(x)){
                        jLabelDauX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/dauX.png")));
                        jButtonXoa.setEnabled(false);
                        jLabelSoLuongBan.setText("0");
                        jButtonGiam.setEnabled(false);
                        jButtonTang.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "Vui lòng tải lại giỏ hàng !!");
                    }
                } catch (SQLException ex) {}
            }
            else{
                jLabelSoLuongBan.setText("1");
                long tien1 = Integer.parseInt(ChuyenChuoiThanhSo(jLabelGiaBan.getText())+"");
                jLabelThanhTienDonHang.setText(XuLiSo(tien1)+" VNĐ");
            }
        }
    }//GEN-LAST:event_jButtonGiamActionPerformed

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5AncestorAdded
     int XetSoLanBan(){
        int max = 1;
        ArrayList<BanHangCode> list = new ConnectionMySQL_SanPhamDaBan().getListBanHang();
        for(int i=0;i<list.size();i++){
            BanHangCode banHang = list.get(i) ;
            if(max < banHang.getLanBan())
                max = banHang.getLanBan();
        }
        return max;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGiam;
    public javax.swing.JButton jButtonTang;
    private javax.swing.JButton jButtonThaTim;
    public javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabelAnhSP;
    private javax.swing.JLabel jLabelDauX;
    public javax.swing.JLabel jLabelGiaBan;
    public javax.swing.JLabel jLabelLoaiHang;
    public javax.swing.JLabel jLabelMaMatHang;
    public javax.swing.JLabel jLabelSoLuongBan;
    public javax.swing.JLabel jLabelThanhTienDonHang;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelVienTrang;
    // End of variables declaration//GEN-END:variables
}
