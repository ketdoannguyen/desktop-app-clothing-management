package View.GiaoDienChinh.JDialog;

import View.GiaoDienChinh.JPanel.ThoiGianBanJPanel;
import Controller.ConnectionMySQL_SanPhamDaBan;
import java.util.ArrayList;
import Model.BanHangCode;

public class ThoiGianBanJDialog extends javax.swing.JDialog {

    ArrayList<BanHangCode> list;
    public ThoiGianBanJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DisPlay();
    }

    void DisPlay(){
        jPanelLamViec.setLayout(new javax.swing.BoxLayout(jPanelLamViec, javax.swing.BoxLayout.Y_AXIS));
        list = new ConnectionMySQL_SanPhamDaBan().getListThongTinDonHangBan();
        for(int i=0;i<list.size();i++){
            BanHangCode ban = list.get(i);
            ThoiGianBanJPanel dh = new ThoiGianBanJPanel();
            dh.jLabelLoaiHang.setText(ban.getLoaiHang());
            dh.jLabelMaSanPham.setText(ban.getMaMatHang());
            dh.jLabelGiaBan.setText(XuLiSo(ban.getGiaBan())+" VNĐ");
            dh.jLabelSoLuongBan.setText(XuLiSo(ban.getSoLuongBan())+" Cái");
            dh.jLabelThoiGianBan.setText(ban.getThoiGianBan()+"");
            dh.jLabelTienBan.setText(XuLiSo(ban.getTienBan())+ " VNĐ");
            dh.jLabelGiamGia.setText(ban.getGiamGia()+ "%");
            dh.jLabelThanhTien.setText(XuLiSo(ban.getTienPhaiTra())+ " VNĐ");
            dh.jLabelTheKhachHang.setText(ban.getTheKhachHang());
            jPanelLamViec.add(dh);
            
        }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelLamViec = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sản phẩm đã bán");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Danh sách sản phẩm đã bán");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 550, 60));

        javax.swing.GroupLayout jPanelLamViecLayout = new javax.swing.GroupLayout(jPanelLamViec);
        jPanelLamViec.setLayout(jPanelLamViecLayout);
        jPanelLamViecLayout.setHorizontalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanelLamViecLayout.setVerticalGroup(
            jPanelLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelLamViec);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 950, 490));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 87, 690, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

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

        setSize(new java.awt.Dimension(964, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ThoiGianBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThoiGianBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThoiGianBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThoiGianBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThoiGianBanJDialog dialog = new ThoiGianBanJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLamViec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
