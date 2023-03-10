/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GiaoDienChinh.JPanel;

import View.GiaoDienChinh.GiaoDienChinh;
import View.GiaoDienChinh.JDialog.ThoiGianBanJDialog;
import static View.GiaoDienChinh.JPanel.NhapKhoJPanel.key;
import Controller.ConnectionMySQL_QuanLiBanHang;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.QuanLiDanhSoCode;
import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author Admin
 */
public class QuanLiJPanel extends javax.swing.JPanel {

    private int index ;
    ArrayList<QuanLiDanhSoCode> list;
    DefaultTableModel model;
    public static int soLanBann ;
    public QuanLiJPanel() {
        initComponents();
        list = new ConnectionMySQL_QuanLiBanHang().getListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }

    public void showTable() {
        int i=1;
        for (QuanLiDanhSoCode s : list) {
            model.addRow(new Object[]{
                i++, s.getLoaiHang(), s.getMaMatHang(), s.getGioiTinh() ,s.getSize(), s.getMau(),s.getNoiSanXuat(),
                s.getThoiGian(),s.getGiaNhap(),s.getGiaBan(),s.getSoLuongNhap(),s.getSoLuongBan(),s.getSoLuongCon(),
                s.getTienVon(),s.getTienBan()
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
        jTextFieldGioiTinh = new javax.swing.JTextField();
        jTextFieldThoiGianNhap = new javax.swing.JTextField();
        jTextFieldGiaNhap = new javax.swing.JTextField();
        jComboBoxLoaiHang = new javax.swing.JComboBox<>();
        jButtonThoiGian = new javax.swing.JButton();
        jTextFieldTienBan = new javax.swing.JTextField();
        jButtonTatCa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonTaiLai = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jTextFieldSize = new javax.swing.JTextField();
        jTextFieldMau = new javax.swing.JTextField();
        jTextFieldSoLuongNhap = new javax.swing.JTextField();
        jTextFieldSoLuongBan = new javax.swing.JTextField();
        jTextFieldGiaBan = new javax.swing.JTextField();
        jTextFieldTienVon = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonChuaBan = new javax.swing.JButton();
        jButtonDaBan = new javax.swing.JButton();
        jButtonBanHet = new javax.swing.JButton();
        jButtonXuatFilePDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Qu???n l?? kho h??ng");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 510, 80));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 590, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/iconQuanLi1.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, -10, 160, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/iconQuanLi.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 140));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Lo???i h??ng      :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("M?? m???t h??ng    :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gi???i t??nh       :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Size SP         :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("M??u SP         :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("N??i s???n xu???t  : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Ti???n B??n    :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 110, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("???nh S???n Ph???m");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 160, 40));

        jLabelAnhSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/Khong.png"))); // NOI18N
        jLabelAnhSP.setToolTipText("???nh minh h???a s???n ph???m");
        add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 130, 130));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Th???i gian nh???p :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 140, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("S??? l?????ng b??n   :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 140, 40));

        jTextFieldTimKiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldTimKiem.setToolTipText("Nh???p th??ng tin c???n t??m ki???m");
        add(jTextFieldTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 270, 40));

        jTextFieldLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldLoaiHang.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldLoaiHang.setToolTipText("M?? s???n ph???m");
        jTextFieldLoaiHang.setEnabled(false);
        add(jTextFieldLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 240, 40));

        jTextFieldNoiSanXuat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldNoiSanXuat.setToolTipText("M?? s???n ph???m");
        jTextFieldNoiSanXuat.setEnabled(false);
        add(jTextFieldNoiSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 40));

        jTextFieldSoLuongCon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongCon.setToolTipText("M?? s???n ph???m");
        jTextFieldSoLuongCon.setEnabled(false);
        add(jTextFieldSoLuongCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 180, 40));

        jTextFieldMaMatHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldMaMatHang.setToolTipText("M?? s???n ph???m");
        jTextFieldMaMatHang.setEnabled(false);
        add(jTextFieldMaMatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 240, 40));

        jTextFieldGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGioiTinh.setToolTipText("M?? s???n ph???m");
        jTextFieldGioiTinh.setEnabled(false);
        add(jTextFieldGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 40));

        jTextFieldThoiGianNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldThoiGianNhap.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldThoiGianNhap.setToolTipText("M?? s???n ph???m");
        jTextFieldThoiGianNhap.setEnabled(false);
        add(jTextFieldThoiGianNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 180, 40));

        jTextFieldGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGiaNhap.setToolTipText("M?? s???n ph???m");
        jTextFieldGiaNhap.setEnabled(false);
        add(jTextFieldGiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 170, 40));

        jComboBoxLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lo???i h??ng", "M?? S???n Ph???m", "Gi???i t??nh", "Size", "M??u", "N??i s???n xu???t", "Gi?? b??n", "S??? l?????ng c??n" }));
        jComboBoxLoaiHang.setToolTipText("Ph??n lo???i th??ng tin c???n t??m ki???m");
        jComboBoxLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLoaiHangActionPerformed(evt);
            }
        });
        add(jComboBoxLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 160, 40));

        jButtonThoiGian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/thoigianBan.png"))); // NOI18N
        jButtonThoiGian.setToolTipText("Qu???n l?? b??n s???n ph???m");
        jButtonThoiGian.setContentAreaFilled(false);
        jButtonThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoiGianActionPerformed(evt);
            }
        });
        add(jButtonThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 80, 80));

        jTextFieldTienBan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldTienBan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTienBan.setToolTipText("M?? s???n ph???m");
        jTextFieldTienBan.setEnabled(false);
        add(jTextFieldTienBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 170, 40));

        jButtonTatCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/reply.png"))); // NOI18N
        jButtonTatCa.setToolTipText("T???t c??? c??c s???n ph???m trong kho h??ng");
        jButtonTatCa.setContentAreaFilled(false);
        jButtonTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTatCaActionPerformed(evt);
            }
        });
        add(jButtonTatCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, 50));

        jTable.setBackground(new java.awt.Color(255, 255, 204));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Lo???i h??ng", "M?? SP", "Gi???i t??nh", "Size", "M??u ", "N??i s???n xu???t", "Th???i gian nh???p", "Gi?? nh???p", "Gi?? b??n", "SL nh???p", "SL b??n", "SLc??n", "Ti???n V???n", "Ti???n ???? b??n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(9).setResizable(false);
            jTable.getColumnModel().getColumn(9).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(10).setResizable(false);
            jTable.getColumnModel().getColumn(10).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(11).setResizable(false);
            jTable.getColumnModel().getColumn(11).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(12).setResizable(false);
            jTable.getColumnModel().getColumn(12).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(13).setResizable(false);
            jTable.getColumnModel().getColumn(13).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(14).setResizable(false);
            jTable.getColumnModel().getColumn(14).setPreferredWidth(90);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1200, 220));

        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/refresh.png"))); // NOI18N
        jButtonTaiLai.setToolTipText("L??m m???i giao di???n");
        jButtonTaiLai.setContentAreaFilled(false);
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 80, -1));

        jButtonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BanHang/search1.png"))); // NOI18N
        jButtonTimKiem.setToolTipText("T??m ki???m th??ng tin");
        jButtonTimKiem.setContentAreaFilled(false);
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });
        add(jButtonTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, 50));

        jTextFieldSize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSize.setToolTipText("M?? s???n ph???m");
        jTextFieldSize.setEnabled(false);
        add(jTextFieldSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, 40));

        jTextFieldMau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldMau.setToolTipText("M?? s???n ph???m");
        jTextFieldMau.setEnabled(false);
        add(jTextFieldMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, 40));

        jTextFieldSoLuongNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongNhap.setToolTipText("M?? s???n ph???m");
        jTextFieldSoLuongNhap.setEnabled(false);
        add(jTextFieldSoLuongNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 180, 40));

        jTextFieldSoLuongBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongBan.setToolTipText("M?? s???n ph???m");
        jTextFieldSoLuongBan.setEnabled(false);
        add(jTextFieldSoLuongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 180, 40));

        jTextFieldGiaBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGiaBan.setToolTipText("M?? s???n ph???m");
        jTextFieldGiaBan.setEnabled(false);
        add(jTextFieldGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 170, 40));

        jTextFieldTienVon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldTienVon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTienVon.setToolTipText("M?? s???n ph???m");
        jTextFieldTienVon.setEnabled(false);
        add(jTextFieldTienVon, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 170, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("S??? l?????ng nh???p :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 130, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("S??? l?????ng c??n   :");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 140, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Gi?? nh???p    :");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 110, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Gi?? b??n      :");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 110, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Ti???n V???n    :");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 110, 40));

        jButtonChuaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/chuaban.png"))); // NOI18N
        jButtonChuaBan.setText("S???n ph???m ch??a ???????c b??n");
        jButtonChuaBan.setToolTipText("Th??ng tin s???n ph???m ");
        jButtonChuaBan.setContentAreaFilled(false);
        jButtonChuaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuaBanActionPerformed(evt);
            }
        });
        add(jButtonChuaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 80, 80));

        jButtonDaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/daban.png"))); // NOI18N
        jButtonDaBan.setToolTipText("S???n ph???m ???? b??n");
        jButtonDaBan.setContentAreaFilled(false);
        jButtonDaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaBanActionPerformed(evt);
            }
        });
        add(jButtonDaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 80, 80));

        jButtonBanHet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/QuanLi/banhet.png"))); // NOI18N
        jButtonBanHet.setToolTipText("S???n ph???m ???? b??n h???t");
        jButtonBanHet.setContentAreaFilled(false);
        jButtonBanHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBanHetActionPerformed(evt);
            }
        });
        add(jButtonBanHet, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 80, 80));

        jButtonXuatFilePDF.setIcon(new javax.swing.ImageIcon("D:\\HocKi1-2020-2021\\NetBeans\\NetBeansJava\\DoAnJava\\src\\Image\\NhapKho\\xuatpdf.png")); // NOI18N
        jButtonXuatFilePDF.setToolTipText("Th??ng tin s???n ph???m ");
        jButtonXuatFilePDF.setContentAreaFilled(false);
        jButtonXuatFilePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuatFilePDFActionPerformed(evt);
            }
        });
        add(jButtonXuatFilePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, 670));
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
    private void jButtonThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoiGianActionPerformed
        ThoiGianBanJDialog x = new ThoiGianBanJDialog(new GiaoDienChinh(),true);
        x.setVisible(true);
    }//GEN-LAST:event_jButtonThoiGianActionPerformed
        
    void KiemTraANHSP(){
        AnhSP("","Khong");
        AnhSP("Qu???n Jean","QuanJean");
        AnhSP("Qu???n Kaki","QuanKaki");
        AnhSP("Qu???n Jogger","QuanJogger");
        AnhSP("??o kho??t len","AoKhoatLen");
        AnhSP("??o kho??t d??","AoKhoatDu");
        AnhSP("??o kho??t kaki","AoKhoatKaki");
        AnhSP("??o kho??t Jean","AoKhoatJean");
        AnhSP("V??y ng???n","VayNgan");
        AnhSP("V??y d??i","VayDai");
        AnhSP("??o s?? mi","AoSoMi");
        AnhSP("??o Hoodie","AoHoodie");
        AnhSP("??o len","AoLen");
        AnhSP("??o thun","AoThun");
        AnhSP("??o d??i tay","AoDaiTay");
        AnhSP("??o Croptop","AoCroptop");
        AnhSP("??o Vest","AoVest");
        AnhSP("G??ng tay","GangTay");
        AnhSP("Kh??n qu??ng c???","KhanQuanCo");
        AnhSP("T???t","Tat");
        AnhSP("M??","Mu");
        AnhSP("Lo???i kh??c","Khong"); 
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
        jTextFieldThoiGianNhap.setText("");
        jTextFieldSoLuongNhap.setText("");
        jTextFieldSoLuongBan.setText("");
        jTextFieldSoLuongCon.setText("");
        jTextFieldGiaNhap.setText("");
        jTextFieldGiaBan.setText("");
        jTextFieldTienVon.setText("");
        jTextFieldTienBan.setText("");
        
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        AllTable();
        jTextFieldTimKiem.setText("");
        jComboBoxLoaiHang.setSelectedIndex(-1);
        jTable.clearSelection();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed
    
    private void jButtonTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTatCaActionPerformed
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        AllTable();   
    }//GEN-LAST:event_jButtonTatCaActionPerformed
    
    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        int k = 0 ;
        if(jTextFieldTimKiem.getText().equals("")){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui l??ng nh???p d??? li???u c???n t??m ki???m !!");
            k = 1 ;
        }
        if(jComboBoxLoaiHang.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(new GiaoDienChinh(), "Vui l??ng ch???n lo???i d??? li???u c???n t??m ki???m !!");
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
            JOptionPane.showMessageDialog(new GiaoDienChinh(),"T??m ki???m theo gi?? b??n v?? s??? l?????ng c??n\n?????nh d???ng \">=500\" hay \"<100\"");
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
        jTextFieldThoiGianNhap.setText(s.getThoiGian());
        jTextFieldSoLuongNhap.setText(XuLiSo(s.getSoLuongNhap())+" C??i");
        jTextFieldSoLuongBan.setText(XuLiSo(s.getSoLuongBan())+" C??i");
        jTextFieldSoLuongCon.setText(XuLiSo(s.getSoLuongCon())+" C??i");
        jTextFieldGiaNhap.setText(XuLiSo(s.getGiaNhap())+" VN??");
        jTextFieldGiaBan.setText(XuLiSo(s.getGiaBan())+" VN??");
        jTextFieldTienVon.setText(XuLiSo(s.getTienVon())+" VN??");
        jTextFieldTienVon.setText(XuLiSo(s.getTienBan())+" VN??");
        
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
        jTextFieldThoiGianNhap.setText(s.getThoiGian());
        jTextFieldSoLuongNhap.setText(XuLiSo(s.getSoLuongNhap())+" C??i");
        jTextFieldSoLuongBan.setText(XuLiSo(s.getSoLuongBan())+" C??i");
        jTextFieldSoLuongCon.setText(XuLiSo(s.getSoLuongCon())+" C??i");
        jTextFieldGiaNhap.setText(XuLiSo(s.getGiaNhap())+" VN??");
        jTextFieldGiaBan.setText(XuLiSo(s.getGiaBan())+" VN??");
        jTextFieldTienVon.setText(XuLiSo(s.getTienVon())+" VN??");
        jTextFieldTienBan.setText(XuLiSo(s.getTienBan())+" VN??");
        
        KiemTraANHSP();
    }//GEN-LAST:event_jTableMouseClicked
    
    private void jButtonChuaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuaBanActionPerformed
        pdf = 3 ;
        JOptionPane.showMessageDialog(new GiaoDienChinh(),"Danh S??ch t???t c??? s???n ph???m ch??a b??n");
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        list.clear();
        list = new ConnectionMySQL_QuanLiBanHang().ChuaBanListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }//GEN-LAST:event_jButtonChuaBanActionPerformed
    int pdf = 0 ;
    private void jButtonDaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaBanActionPerformed
        pdf = 1 ;
        JOptionPane.showMessageDialog(new GiaoDienChinh(),"Danh S??ch t???t c??? s???n ph???m ???? b??n");
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        list.clear();
        list = new ConnectionMySQL_QuanLiBanHang().DaBanListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }//GEN-LAST:event_jButtonDaBanActionPerformed

    private void jButtonBanHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBanHetActionPerformed
        pdf = 2 ;
        JOptionPane.showMessageDialog(new GiaoDienChinh(),"Danh S??ch t???t c??? s???n ph???m ???? b??n h???t");
        for (int i = model.getRowCount() - 1; i > -1; i--) {
                        model.removeRow(i);
        }
        list.clear();
        list = new ConnectionMySQL_QuanLiBanHang().DaHetListBanHang();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }//GEN-LAST:event_jButtonBanHetActionPerformed

    private void jButtonXuatFilePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuatFilePDFActionPerformed
        MessageFormat header = null ;
        if(pdf==0){
            header = new MessageFormat("Danh s??ch s???n ph???m");
        }
        if(pdf==1){
            header = new MessageFormat("Danh s??ch s???n ph???m ???? b??n");
        }
        if(pdf==2){
            header = new MessageFormat("Danh s??ch s???n ph???m ???? b??n h???t");
        }
        if(pdf==3){
            header = new MessageFormat("Danh s??ch s???n ph???m ch??a b??n");
        }
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonXuatFilePDFActionPerformed

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBanHet;
    private javax.swing.JButton jButtonChuaBan;
    private javax.swing.JButton jButtonDaBan;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonTatCa;
    private javax.swing.JButton jButtonThoiGian;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonXuatFilePDF;
    private javax.swing.JComboBox<String> jComboBoxLoaiHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextFieldGiaNhap;
    private javax.swing.JTextField jTextFieldGioiTinh;
    private javax.swing.JTextField jTextFieldLoaiHang;
    private javax.swing.JTextField jTextFieldMaMatHang;
    private javax.swing.JTextField jTextFieldMau;
    private javax.swing.JTextField jTextFieldNoiSanXuat;
    private javax.swing.JTextField jTextFieldSize;
    private javax.swing.JTextField jTextFieldSoLuongBan;
    private javax.swing.JTextField jTextFieldSoLuongCon;
    private javax.swing.JTextField jTextFieldSoLuongNhap;
    private javax.swing.JTextField jTextFieldThoiGianNhap;
    private javax.swing.JTextField jTextFieldTienBan;
    private javax.swing.JTextField jTextFieldTienVon;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables
}
