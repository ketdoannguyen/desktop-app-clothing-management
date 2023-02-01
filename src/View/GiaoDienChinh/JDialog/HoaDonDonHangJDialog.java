/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GiaoDienChinh.JDialog;

import View.GiaoDienChinh.GiaoDienChinh;
import static View.GiaoDienChinh.JDialog.TroChoi1JDialog.key;
import View.GiaoDienChinh.JPanel.HoaDonDonHangJPanel;
import View.GiaoDienChinh.JPanel.HoaDonDonHangTrongJPanel;
import Controller.ConnectionMySQL_SanPhamDaBan;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.BanHangCode;

/**
 *
 * @author Admin
 */
public class HoaDonDonHangJDialog extends javax.swing.JDialog {

    ArrayList<BanHangCode> list;
    static int soLanBan = 1;
    
    public HoaDonDonHangJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        list = new ConnectionMySQL_SanPhamDaBan().getListThongTinDonHangBan();
        soLanBan = XetSoLanBan();
        PanelHoaDonDonHang();
        int maGiam = Integer.parseInt(ChuyenChuoiThanhSo(jLabelGiamGia.getText())+"");
        try {
            for(int i=0;i<list.size();i++){
                BanHangCode ban = list.get(i) ;
                if(ban.getLanBan() == soLanBan){
                    BanHangCode ban1 = new BanHangCode() ;
                    ban1.setGiamGia(maGiam);
                    ban1.setThoiGianBan(ban.getThoiGianBan());
                    long tienPhaiTra = ban.getTienBan() - ban.getTienBan()*maGiam/100  ;
                    ban1.setTienPhaiTra(tienPhaiTra);
                    if(new ConnectionMySQL_SanPhamDaBan().LuuTruThongTinCuoi(ban1)){}
                }
            }
            if(new ConnectionMySQL_SanPhamDaBan().DeleteDonHangLoi()){}
            
        } catch (SQLException ex) {}      
    }
    public static long TongTien ;
    void PanelHoaDonDonHang(){
        TongTien = 0;
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        int k = 0;
        for(int i=0;i<list.size();i++){
            BanHangCode ban = list.get(i);
            if(ban.getLanBan() == soLanBan){
                HoaDonDonHangJPanel dh = new HoaDonDonHangJPanel();
                dh.jLabelLoaiHang.setText(ban.getLoaiHang());
                dh.jLabelMaMatHang.setText(ban.getMaMatHang());
                dh.jLabelGiaBan.setText(XuLiSo(ban.getGiaBan())+" VNĐ");
                dh.jLabelSoLuongBan.setText(ban.getSoLuongBan()+"");
                dh.jLabelThanhTien.setText(XuLiSo(ban.getTienBan())+ " VNĐ");
                TongTien+=ChuyenChuoiThanhSo(dh.jLabelThanhTien.getText());
                jPanelLamViec.add(dh);
                k++;
                
                BanHangCode x = new BanHangCode();
            }
        }
        
        if(k==0){
            HoaDonDonHangTrongJPanel dht1 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht1);
            HoaDonDonHangTrongJPanel dht2 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht2);
            HoaDonDonHangTrongJPanel dht3 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht3);
        }
        else if(k==1){
            HoaDonDonHangTrongJPanel dht1 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht1);
            HoaDonDonHangTrongJPanel dht2 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht2);
        }
        else if(k == 2){
            HoaDonDonHangTrongJPanel dht1 = new HoaDonDonHangTrongJPanel();
            jPanelLamViec.add(dht1);
        }
        jPanelLamViec.validate();
        jPanelLamViec.repaint();
        
        jLabelGiaTamTinh.setText(XuLiSo(TongTien)+" VNĐ");
        int maGiam = LayMaGiamGiaTheKhachHang() + LayMaGiamGiaTongTien() + key;
        jLabelGiamGia.setText(maGiam+"%");
        long thanhtien = (long) TongTien - (TongTien*maGiam/100);
        jLabelThanhTien.setText(XuLiSo(thanhtien)+" VNĐ");
    }
    public int LayMaGiamGiaTheKhachHang(){
        int maGiam = 0;
        
        for(int i=0;i<list.size();i++){
            BanHangCode ban = list.get(i);
            if(ban.getLanBan() == soLanBan){
                if(ban.getTheKhachHang().equals("Tân Thủ"))
                    maGiam = 1;
                if(ban.getTheKhachHang().equals("Titan"))
                    maGiam = 2;
                if(ban.getTheKhachHang().equals("VIP"))
                    maGiam = 3;
                if(ban.getTheKhachHang().equals("Bạch Kim"))
                    maGiam = 4;
                if(ban.getTheKhachHang().equals("Kim Cương"))
                    maGiam = 5;
                break;
            }      
        }
        return maGiam ;
    }
    public int LayMaGiamGiaTongTien(){
        int maGiam = 0;
        if(ChuyenChuoiThanhSo(jLabelGiaTamTinh.getText()) >= 3000000)
            maGiam=6;
        else if(ChuyenChuoiThanhSo(jLabelGiaTamTinh.getText()) >= 2000000)
            maGiam=4;
        else if(ChuyenChuoiThanhSo(jLabelGiaTamTinh.getText()) >= 1000000)
            maGiam=2;
        else if(ChuyenChuoiThanhSo(jLabelGiaTamTinh.getText()) >= 100000)
            maGiam=1;
        return maGiam ;
    }
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
     int XetSoLanBan(){
        int max = 1;
        for(int i=0;i<list.size();i++){
            BanHangCode banHang = list.get(i) ;
            if(max < banHang.getLanBan())
                max = banHang.getLanBan();
        }
        return max;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonThoat1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelGiaTamTinh = new javax.swing.JLabel();
        jLabelGiamGia = new javax.swing.JLabel();
        jLabelThanhTien = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonChiTietGiamGia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelLamViec = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hóa đơn thanh toán");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/TrangTriHoaDon.png"))); // NOI18N
        jButtonThoat1.setToolTipText("Thoát");
        jButtonThoat1.setContentAreaFilled(false);
        jButtonThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoat1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonThoat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Hóa Đơn Thanh Toán");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 520, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Giá tạm tính   :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Giảm giá        :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 150, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Thành tiền     :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 150, 40));

        jLabelGiaTamTinh.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelGiaTamTinh.setText("10,000,000 VNĐ");
        jPanel1.add(jLabelGiaTamTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 150, 40));

        jLabelGiamGia.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelGiamGia.setText("10%");
        jPanel1.add(jLabelGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 60, 40));

        jLabelThanhTien.setBackground(new java.awt.Color(51, 51, 255));
        jLabelThanhTien.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabelThanhTien.setForeground(new java.awt.Color(0, 0, 255));
        jLabelThanhTien.setText("10,000,000 VNĐ");
        jPanel1.add(jLabelThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 180, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 74, 610, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/dialogsun.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 80, 70));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/happy-new-year.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 140, 164));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/2021.png"))); // NOI18N
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, 172));

        jButtonChiTietGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DonHang/chitietgiamgia.png"))); // NOI18N
        jButtonChiTietGiamGia.setContentAreaFilled(false);
        jButtonChiTietGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiTietGiamGiaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonChiTietGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 60, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanelLamViecLayout = new javax.swing.GroupLayout(jPanelLamViec);
        jPanelLamViec.setLayout(jPanelLamViecLayout);
        jPanelLamViecLayout.setHorizontalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jPanelLamViecLayout.setVerticalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelLamViec);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        setSize(new java.awt.Dimension(811, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoat1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonThoat1ActionPerformed
    
 
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        CamOnJDialog x = new CamOnJDialog(new GiaoDienChinh(),true);
        x.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButtonChiTietGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiTietGiamGiaActionPerformed
        int maGiamThe = LayMaGiamGiaTheKhachHang() ;
        int maGiamTien = LayMaGiamGiaTongTien();
        int maGiamTroChoi = key ;
        JOptionPane.showMessageDialog(this, "Mã giảm giá thẻ khách hàng = "+maGiamThe+"%"
                +"\nMã giảm giá theo tổng tiền = "+maGiamTien+"%"
                +"\nMã giảm giá nhận được từ trò chơi = "
                +maGiamTroChoi+"%"+"\n\tTổng mã giảm giá = "+(maGiamThe+maGiamTien+maGiamTroChoi)+"%");
    }//GEN-LAST:event_jButtonChiTietGiamGiaActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonDonHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonDonHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonDonHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonDonHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HoaDonDonHangJDialog dialog = new HoaDonDonHangJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonChiTietGiamGia;
    private javax.swing.JButton jButtonThoat1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelGiaTamTinh;
    private javax.swing.JLabel jLabelGiamGia;
    private javax.swing.JLabel jLabelThanhTien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLamViec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
