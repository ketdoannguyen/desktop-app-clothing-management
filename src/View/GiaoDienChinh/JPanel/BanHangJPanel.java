package View.GiaoDienChinh.JPanel;

import View.GiaoDienChinh.GiaoDienChinh;
import View.GiaoDienChinh.JDialog.CachThucMuaBanSanPhamJDialog;
import View.GiaoDienChinh.JDialog.GioHangBanHangJDialog;
import View.GiaoDienChinh.JDialog.ThongTinSanPhamNhapJDialog;
import static View.GiaoDienChinh.JPanel.NhapKhoJPanel.key;
import Time.TimePlay;
import Controller.ConnectionMySQL_QuanLiBanHang;
import Controller.ConnectionMySQL_SanPhamDaBan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.BanHangCode;
import Model.QuanLiDanhSoCode;
import java.text.MessageFormat;
import javax.swing.JTable;

public class BanHangJPanel extends javax.swing.JPanel {

    private int index ;
    ArrayList<QuanLiDanhSoCode> list;
    DefaultTableModel model;
    public static int soLanBann ;
 
    public BanHangJPanel() {
        initComponents();
        soLanBann = XetSoLanBan();
        list = new ConnectionMySQL_QuanLiBanHang().getListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }

    public void showTable() {
        int i=1;
        for (QuanLiDanhSoCode s : list) {
            model.addRow(new Object[]{
                i++, s.getLoaiHang(), s.getMaMatHang(), s.getGioiTinh() ,s.getSize(), s.getMau(),s.getNoiSanXuat(),s.getSoLuongCon(),s.getGiaBan()
            });
        }
    }
    public void AllTable(){
        list.clear();
        list = new ConnectionMySQL_QuanLiBanHang().getListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }
   
    public void LocTable(){
        list.clear();
        int k = jComboBoxLoaiHang.getSelectedIndex() ;
        String str = jTextFieldTimKiem.getText() ;
        
        int key = 0 ;
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] ==60 || ch[i] ==61 || ch[i] ==62){
                list = new ConnectionMySQL_QuanLiBanHang().LocListSoBanHang(TimKiemMatHang(k),str);
                key = 1;
            }
        }
        if(key==0)
            list = new ConnectionMySQL_QuanLiBanHang().LocListBanHang(TimKiemMatHang(k),str);
            model = (DefaultTableModel) jTable.getModel();
        showTable();
    }
    private String TimKiemMatHang(int i){
        if(i==0)
            return "LoaiHang" ;
        if(i==1)
            return "MaMatHang" ;
        if(i==2)
            return "GioiTinh" ;
        if(i==3)
            return "Size" ;
        if(i==4)
            return "Mau" ;
        if(i==5)
            return "NoiSanXuat" ;
        if(i==6)
            return "GiaBan" ;
        if(i==7)
            return "SoLuongCon" ;
        return "";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelAnhSP = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jTextFieldLoaiHang = new javax.swing.JTextField();
        jTextFieldNoiSanXuat = new javax.swing.JTextField();
        jTextFieldSoLuongCon = new javax.swing.JTextField();
        jTextFieldMaMatHang = new javax.swing.JTextField();
        jTextFieldGiaBan = new javax.swing.JTextField();
        jTextFieldGioiTinh = new javax.swing.JTextField();
        jTextFieldSize = new javax.swing.JTextField();
        jTextFieldMau = new javax.swing.JTextField();
        jComboBoxLoaiHang = new javax.swing.JComboBox<>();
        jButtonTru = new javax.swing.JButton();
        jButtonCong = new javax.swing.JButton();
        jButtonThongTinSP = new javax.swing.JButton();
        jButtonThongTinGiaoDienBanHang = new javax.swing.JButton();
        jButtonTongDonHang = new javax.swing.JButton();
        jTextFieldSoLuongBan = new javax.swing.JTextField();
        jComboBoxTheKhachHang = new javax.swing.JComboBox<>();
        jButtonTatCa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonTaiLai = new javax.swing.JButton();
        jButtonBanHang = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jButtonXuatFilePDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Mua bán sản phẩm");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 510, 80));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 590, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/law.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -10, 160, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/trade.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 150));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Loại hàng      :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mã mặt hàng    :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Giới tính       :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Size SP          :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Màu SP         :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nơi sản xuất : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Thẻ khách hàng vip :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 190, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Giá bán        :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 140, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ảnh Sản Phẩm");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 160, 40));

        jLabelAnhSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/Khong.png"))); // NOI18N
        jLabelAnhSP.setToolTipText("Ảnh minh họa sản phẩm");
        add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 130, 130));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Số lượng còn :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Số lượng bán :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 40));

        jTextFieldTimKiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldTimKiem.setToolTipText("Nhập thông tin cần tìm kiếm");
        add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 290, 40));

        jTextFieldLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldLoaiHang.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldLoaiHang.setToolTipText("Loại Hàng");
        jTextFieldLoaiHang.setEnabled(false);
        add(jTextFieldLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 240, 40));

        jTextFieldNoiSanXuat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldNoiSanXuat.setToolTipText("Nơi sản xuất");
        jTextFieldNoiSanXuat.setEnabled(false);
        add(jTextFieldNoiSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 160, 40));

        jTextFieldSoLuongCon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongCon.setToolTipText("Số lượng còn");
        jTextFieldSoLuongCon.setEnabled(false);
        add(jTextFieldSoLuongCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 170, 40));

        jTextFieldMaMatHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldMaMatHang.setToolTipText("Mã mặt hàng");
        jTextFieldMaMatHang.setEnabled(false);
        add(jTextFieldMaMatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 240, 40));

        jTextFieldGiaBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGiaBan.setToolTipText("Giá bán");
        jTextFieldGiaBan.setEnabled(false);
        add(jTextFieldGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 210, 40));

        jTextFieldGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGioiTinh.setToolTipText("Giới tính");
        jTextFieldGioiTinh.setEnabled(false);
        add(jTextFieldGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 40));

        jTextFieldSize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSize.setToolTipText("Size");
        jTextFieldSize.setEnabled(false);
        add(jTextFieldSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 170, 40));

        jTextFieldMau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldMau.setToolTipText("Màu sản phẩm");
        jTextFieldMau.setEnabled(false);
        add(jTextFieldMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 170, 40));

        jComboBoxLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại hàng", "Mã Sản Phẩm", "Giới tính", "Size", "Màu", "Nơi sản xuất", "Giá bán", "Số lượng còn" }));
        jComboBoxLoaiHang.setToolTipText("Phân loại thông tin cần tìm kiếm");
        jComboBoxLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLoaiHangActionPerformed(evt);
            }
        });
        add(jComboBoxLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, 40));

        jButtonTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/tru.png"))); // NOI18N
        jButtonTru.setContentAreaFilled(false);
        jButtonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTruActionPerformed(evt);
            }
        });
        add(jButtonTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 262, -1, -1));

        jButtonCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/cong.png"))); // NOI18N
        jButtonCong.setContentAreaFilled(false);
        jButtonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCongActionPerformed(evt);
            }
        });
        add(jButtonCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, -1, -1));

        jButtonThongTinSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/information.png"))); // NOI18N
        jButtonThongTinSP.setToolTipText("Thông tin sản phẩm ");
        jButtonThongTinSP.setContentAreaFilled(false);
        jButtonThongTinSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongTinSPActionPerformed(evt);
            }
        });
        add(jButtonThongTinSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 80, 80));

        jButtonThongTinGiaoDienBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/calendar.png"))); // NOI18N
        jButtonThongTinGiaoDienBanHang.setToolTipText("Nguyên tắc , thể thức bán hàng");
        jButtonThongTinGiaoDienBanHang.setContentAreaFilled(false);
        jButtonThongTinGiaoDienBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongTinGiaoDienBanHangActionPerformed(evt);
            }
        });
        add(jButtonThongTinGiaoDienBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, 80, -1));

        jButtonTongDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/giohang1.png"))); // NOI18N
        jButtonTongDonHang.setToolTipText("Giỏ hàng của bạn");
        jButtonTongDonHang.setContentAreaFilled(false);
        jButtonTongDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTongDonHangActionPerformed(evt);
            }
        });
        add(jButtonTongDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 80, 70));

        jTextFieldSoLuongBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongBan.setToolTipText("Số lượng bán");
        add(jTextFieldSoLuongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 150, 40));

        jComboBoxTheKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTheKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tân Thủ", "Titan", "VIP", "Bạch Kim", "Kim Cương" }));
        jComboBoxTheKhachHang.setSelectedIndex(-1);
        jComboBoxTheKhachHang.setToolTipText("Thẻ khách hàng");
        add(jComboBoxTheKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 200, 40));

        jButtonTatCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/reply.png"))); // NOI18N
        jButtonTatCa.setToolTipText("Tất cả các sản phẩm trong kho hàng");
        jButtonTatCa.setContentAreaFilled(false);
        jButtonTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTatCaActionPerformed(evt);
            }
        });
        add(jButtonTatCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jTable.setBackground(new java.awt.Color(255, 255, 204));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Loại hàng", "Mã SP", "Giới tính", "Size", "Màu ", "Nơi sản xuất", "Số lượng còn", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setToolTipText("");
        jTable.setFocusTraversalPolicyProvider(true);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setRowHeight(30);
        jTable.setRowMargin(5);
        jTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable.setShowGrid(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTableMouseDragged(evt);
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(120);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1200, 240));

        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/refresh.png"))); // NOI18N
        jButtonTaiLai.setToolTipText("Làm mới giao diện");
        jButtonTaiLai.setContentAreaFilled(false);
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 80, -1));

        jButtonBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/themgiohang.png"))); // NOI18N
        jButtonBanHang.setToolTipText("Thêm sản phẩm vào giỏ hàng");
        jButtonBanHang.setContentAreaFilled(false);
        jButtonBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBanHangActionPerformed(evt);
            }
        });
        add(jButtonBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 80, 70));

        jButtonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/search1.png"))); // NOI18N
        jButtonTimKiem.setToolTipText("Tìm kiếm thông tin");
        jButtonTimKiem.setContentAreaFilled(false);
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });
        add(jButtonTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jButtonXuatFilePDF.setIcon(new javax.swing.ImageIcon("D:\\HocKi1-2020-2021\\NetBeans\\NetBeansJava\\DoAnJava\\src\\Image\\NhapKho\\xuatpdf.png")); // NOI18N
        jButtonXuatFilePDF.setToolTipText("Thông tin sản phẩm ");
        jButtonXuatFilePDF.setContentAreaFilled(false);
        jButtonXuatFilePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuatFilePDFActionPerformed(evt);
            }
        });
        add(jButtonXuatFilePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 340, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 680));
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean KiemTraSo(String s){
        char[] ch = s.toCharArray();
        if(ch.length==0)
            return false;
        for(int i=0;i<ch.length;i++){
            if(ch[i]<48 || ch[i]>57)
                return false;
        }
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0')
                k++;
        }
        if(k==0)
            return false;
        return true;
    }
    public boolean KiemTraSo0(String s){
        char[] ch = s.toCharArray();
        if(ch.length==0)
            return false;
        for(int i=0;i<ch.length;i++){
            if(ch[i]<48 || ch[i]>57)
                return false;
        }
        return true;
    }
    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCongActionPerformed
        if(jTextFieldSoLuongBan.getText().equals("")){
            jTextFieldSoLuongBan.setText("0");
        }
        if(!KiemTraSo0(jTextFieldSoLuongBan.getText())){
            JOptionPane.showMessageDialog(this, "Số lượng bán là chữ số !!");
        }
        else{
            int k = Integer.parseInt(jTextFieldSoLuongBan.getText()) + 1 ;
            jTextFieldSoLuongBan.setText(k+"");
        }
    }//GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonThongTinSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongTinSPActionPerformed
        index = jTable.getSelectedRow() ;
        key = jTable.getSelectedRow() ;
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Hãy chọn sản phẩm xem thông tin !!");
        }
        else{
            ThongTinSanPhamNhapJDialog x = new ThongTinSanPhamNhapJDialog(new GiaoDienChinh(),true);
            x.setVisible(true);
        } 
    }//GEN-LAST:event_jButtonThongTinSPActionPerformed
    
    private void jButtonThongTinGiaoDienBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongTinGiaoDienBanHangActionPerformed
        CachThucMuaBanSanPhamJDialog x = new CachThucMuaBanSanPhamJDialog(new GiaoDienChinh() , true) ;
        x.setVisible(true);
    }//GEN-LAST:event_jButtonThongTinGiaoDienBanHangActionPerformed
    
    int XetSoLanBan(){
        int max = 1;
        ArrayList<BanHangCode> list = new ConnectionMySQL_SanPhamDaBan().getListBanHang();
        for(int i=0;i<list.size();i++){
            BanHangCode banHang = list.get(i) ;
            if(max < banHang.getLanBan())
                max = banHang.getLanBan();
        }
        return max + 1;
    }
    private void jButtonTongDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTongDonHangActionPerformed
        GioHangBanHangJDialog x = new GioHangBanHangJDialog(new GiaoDienChinh(),true);
        x.setVisible(true);
    }//GEN-LAST:event_jButtonTongDonHangActionPerformed
    void KiemTraANHSP(){
        AnhSP("","Khong");
        AnhSP("Quần Jean","QuanJean");
        AnhSP("Quần Kaki","QuanKaki");
        AnhSP("Quần Jogger","QuanJogger");
        AnhSP("Áo khoát len","AoKhoatLen");
        AnhSP("Áo khoát dù","AoKhoatDu");
        AnhSP("Áo khoát kaki","AoKhoatKaki");
        AnhSP("Áo khoát Jean","AoKhoatJean");
        AnhSP("Váy ngắn","VayNgan");
        AnhSP("Váy dài","VayDai");
        AnhSP("Áo sơ mi","AoSoMi");
        AnhSP("Áo Hoodie","AoHoodie");
        AnhSP("Áo len","AoLen");
        AnhSP("Áo thun","AoThun");
        AnhSP("Áo dài tay","AoDaiTay");
        AnhSP("Áo Croptop","AoCroptop");
        AnhSP("Áo Vest","AoVest");
        AnhSP("Găng tay","GangTay");
        AnhSP("Khăn quàng cổ","KhanQuanCo");
        AnhSP("Tất","Tat");
        AnhSP("Mũ","Mu");
        AnhSP("Loại khác","Khong"); 
    }
    private void AnhSP(String s,String k){
        if (jTextFieldLoaiHang.getText().equals(s)) {
            jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/"+k+".png")));
        }
    }
    
    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        jTextFieldLoaiHang.setText("");
        jTextFieldMaMatHang.setText("");
        jTextFieldGioiTinh.setText("");
        jTextFieldSize.setText("");
        jTextFieldMau.setText("");
        jTextFieldNoiSanXuat.setText("");
        jTextFieldSoLuongCon.setText("");
        jTextFieldSoLuongBan.setText("");
        jTextFieldGiaBan.setText("");
        jComboBoxTheKhachHang.setSelectedIndex(-1);
        jTable.clearSelection();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed
    
    private void jButtonBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBanHangActionPerformed
        index = jTable.getSelectedRow() ;
        if(index == -1){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Hãy chọn sản phẩm muốn bán hàng !!");
        }
        else if(jComboBoxTheKhachHang.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui lòng nhập thẻ khách hàng !!");
        }
        else if(Integer.parseInt(jTextFieldSoLuongBan.getText()) == 0){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui lòng nhập số lượng cần bán !!");
        }
        else if(Integer.parseInt(jTextFieldSoLuongCon.getText()) < Integer.parseInt(jTextFieldSoLuongBan.getText())){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Số lượng còn trong kho không đủ để bán !!");
        }
        else if(list.size() == 0){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Hãy nhập kho sản phẩm !!");
        }else{
            int soLuongCon = ( (int) model.getValueAt(index,7)) - Integer.parseInt(jTextFieldSoLuongBan.getText());
            model.setValueAt(soLuongCon, index, 7);
            BanHangCode ban = new BanHangCode();
            ban.setLanBan(soLanBann);
            ban.setLoaiHang(jTextFieldLoaiHang.getText());
            ban.setMaMatHang(jTextFieldMaMatHang.getText());
            ban.setSoLuongBan(Integer.parseInt(jTextFieldSoLuongBan.getText()));
            ban.setThoiGianBan(new TimePlay().TimeNow());
            ban.setGiaBan(Integer.parseInt(jTextFieldGiaBan.getText()));
            ban.setGiamGia(0);
            ban.setTheKhachHang(jComboBoxTheKhachHang.getItemAt(jComboBoxTheKhachHang.getSelectedIndex()));
            
            try{
                if( new ConnectionMySQL_SanPhamDaBan().addQuanLi(ban)){
                    JOptionPane.showMessageDialog(new GiaoDienChinh(), "Đã thêm sản phẩm vào giỏ hàng");        
                }else{
                    JOptionPane.showMessageDialog(new GiaoDienChinh(), "Lỗi!!!Không thể bán sản phẩm");  }
                 
                jTextFieldLoaiHang.setText("");
                jTextFieldMaMatHang.setText("");
                jTextFieldGioiTinh.setText("");
                jTextFieldSize.setText("");
                jTextFieldMau.setText("");
                jTextFieldNoiSanXuat.setText("");
                jTextFieldSoLuongCon.setText("");
                jTextFieldSoLuongBan.setText("");
                jTextFieldGiaBan.setText("");
                jComboBoxTheKhachHang.setEnabled(false);
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(new GiaoDienChinh(), "Lỗi!!!Không thể bán sản phẩm");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonBanHangActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTruActionPerformed
        if(jTextFieldSoLuongBan.getText().equals("")){
            jTextFieldSoLuongBan.setText("0");
        }
        if(!KiemTraSo0(jTextFieldSoLuongBan.getText())){
            JOptionPane.showMessageDialog(this, "Số lượng bán là chữ số !!");
        }
        else if(Integer.parseInt(jTextFieldSoLuongBan.getText()) == 0){}
        else{
            int k = Integer.parseInt(jTextFieldSoLuongBan.getText()) - 1 ;
            jTextFieldSoLuongBan.setText(k+"");
        }
    }//GEN-LAST:event_jButtonTruActionPerformed

    private void jButtonTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTatCaActionPerformed
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        AllTable();   
    }//GEN-LAST:event_jButtonTatCaActionPerformed
    
    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        int k = 0 ;
        if(jTextFieldTimKiem.getText().equals("")){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui lòng nhập dữ liệu cần tìm kiếm !!");
            k = 1 ;
        }
        if(jComboBoxLoaiHang.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui lòng chọn loại dử liệu cần tìm kiếm !!");
            k = 1 ;
        }
        if(k==0){
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
            }
            LocTable();
        } 
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jComboBoxLoaiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLoaiHangActionPerformed
        if(jComboBoxLoaiHang.getSelectedIndex() == 6 || jComboBoxLoaiHang.getSelectedIndex() == 7)
            JOptionPane.showMessageDialog(new GiaoDienChinh(),"Tìm kiếm theo giá bán và số lượng còn\nĐịnh dạng \">=500\" hay \"<100\"");
    }//GEN-LAST:event_jComboBoxLoaiHangActionPerformed

    private void jTableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseDragged
        index = jTable.getSelectedRow() ;
        key = jTable.getSelectedRow() ;
        QuanLiDanhSoCode s = list.get(index);
        
        jTextFieldLoaiHang.setText(s.getLoaiHang());
        jTextFieldMaMatHang.setText(s.getMaMatHang());
        jTextFieldGioiTinh.setText(s.getGioiTinh());
        jTextFieldSize.setText(s.getSize());
        jTextFieldMau.setText(s.getMau());
        jTextFieldNoiSanXuat.setText(s.getNoiSanXuat());
        jTextFieldSoLuongCon.setText(""+s.getSoLuongCon());
        jTextFieldSoLuongBan.setText("0");
        jTextFieldGiaBan.setText("" +s.getGiaBan());
        KiemTraANHSP();
    }//GEN-LAST:event_jTableMouseDragged

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        index = jTable.getSelectedRow() ;
        key = jTable.getSelectedRow() ;
        QuanLiDanhSoCode s = list.get(index);
        
        jTextFieldLoaiHang.setText(s.getLoaiHang());
        jTextFieldMaMatHang.setText(s.getMaMatHang());
        jTextFieldGioiTinh.setText(s.getGioiTinh());
        jTextFieldSize.setText(s.getSize());
        jTextFieldMau.setText(s.getMau());
        jTextFieldNoiSanXuat.setText(s.getNoiSanXuat());
        jTextFieldSoLuongCon.setText(""+s.getSoLuongCon());
        jTextFieldSoLuongBan.setText("0");
        jTextFieldGiaBan.setText("" +s.getGiaBan());
        
        KiemTraANHSP();
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonXuatFilePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuatFilePDFActionPerformed
        MessageFormat header = new MessageFormat("Mua bán sản phẩm");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonXuatFilePDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBanHang;
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonTatCa;
    private javax.swing.JButton jButtonThongTinGiaoDienBanHang;
    private javax.swing.JButton jButtonThongTinSP;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonTongDonHang;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JButton jButtonXuatFilePDF;
    private javax.swing.JComboBox<String> jComboBoxLoaiHang;
    public static javax.swing.JComboBox<String> jComboBoxTheKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAnhSP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldGiaBan;
    private javax.swing.JTextField jTextFieldGioiTinh;
    private javax.swing.JTextField jTextFieldLoaiHang;
    private javax.swing.JTextField jTextFieldMaMatHang;
    private javax.swing.JTextField jTextFieldMau;
    private javax.swing.JTextField jTextFieldNoiSanXuat;
    private javax.swing.JTextField jTextFieldSize;
    private javax.swing.JTextField jTextFieldSoLuongBan;
    private javax.swing.JTextField jTextFieldSoLuongCon;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables
}
