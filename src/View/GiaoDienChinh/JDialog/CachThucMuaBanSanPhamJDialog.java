package View.GiaoDienChinh.JDialog;

public class CachThucMuaBanSanPhamJDialog extends javax.swing.JDialog {

    public CachThucMuaBanSanPhamJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cách thức mua bán sản phẩm");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jTextArea.setForeground(new java.awt.Color(0, 0, 255));
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jTextArea.setText("                                CÁCH THỨC MUA BÁN \nA. Chức năng : Mua Bán Sản Phẩm\nB. Đối tượng sử dụng : Người quản lí , nhân viên , khách hàng\nC.Hướng dẫn sử dụng :\n    I. Nhân viên\n       - Nhân viên tư vấn và bán sản phẩm cho khách .\n       - Trên giao diện , nhân viên điền thông tin số lượng sản phẩm                bán và cấp bậc thẻ khách hàng để nhận giảm giá \n       - Nhân viên hướng dẫn khách hàng tham gia các sự kiện trò                   chơi trên giao diện để nhận thêm về mã giảm giá\n    II. Khách hàng\n       - Khách hàng lựa chọn sản phẩm và số lượng cần mua , cung               cấp thẻ khách hàng cho nhân viên để nhận được giảm giá\n       - Chào mừng xuân sang , nên cửa hàng có nhiều sự kiện trò                 chơi trúng thưởng nhận thẻ giảm giá hoặc những phần\n           quà giá trị .Khách hàng sẽ nhận được sự hướng dẫn của \n           nhân viên để tham gia trò chơi và nhận về nhiều sản phẩm               giá trị\n       - Khách hàng nhận sản phẩm đã mua và cung cấp phương \n          thức thanh toán cho nhân viên quán\n    III. Thẻ khách hàng\n        Có 5 loại thẻ khách hàng là thẻ tân thủ , thẻ Titan , thẻ VIP ,         thẻ Bạch Kim và thẻ Kim Cương\n           - Thẻ Tân Thủ     : Giảm giá đơn giảm đi 1%\n           - Thẻ Titan          : Giảm giá đơn giảm đi 2%\n           - Thẻ VIP            : Giảm giá đơn giảm đi 3%\n           - Thẻ Bạch Kim    : Giảm giá đơn giảm đi 4%\n           - Thẻ Kim Cương : Giảm giá đơn giảm đi 5%\n    IV. Chế độ giảm giá\n        - Khách hàng nhận được giảm giá thông tha thẻ khách hàng ,          thông qua sự kiện trò chơi để nhận mã \n        - Khách hàng còn có thể nhận giảm giá theo giá trị mua hàng \n             + Tổng đơn hàng < 100,000VNĐ : Giảm 0%\n             + Tổng đơn hàng >= 100,000VNĐ : Giảm 1%\n             + Tổng đơn hàng >= 1,000,000VNĐ : Giảm 2%\n             + Tổng đơn hàng >= 2,000,000VNĐ : Giảm 4%\n             + Tổng đơn hàng >= 3,000,000VNĐ : Giảm 6%\n    V. Trò chơi\n     Trong mỗi trò chơi sẽ có những hướng dẫn cách thức và thể lệ riêng .Qúy khách tham gia trò chơi vui vẻ và lãnh thật nhiều quà\n\n       Chúc quý khách năm mới tràn đầy vui vẻ và hạnh phúc");
        jTextArea.setWrapStyleWord(true);
        jTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jTextArea.setDoubleBuffered(true);
        jTextArea.setDragEnabled(true);
        jTextArea.setEnabled(false);
        jTextArea.setFocusCycleRoot(true);
        jTextArea.setFocusTraversalPolicyProvider(true);
        jTextArea.setInheritsPopupMenu(true);
        jTextArea.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jTextArea.setSelectionColor(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(jTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(654, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CachThucMuaBanSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CachThucMuaBanSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CachThucMuaBanSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CachThucMuaBanSanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CachThucMuaBanSanPhamJDialog dialog = new CachThucMuaBanSanPhamJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
