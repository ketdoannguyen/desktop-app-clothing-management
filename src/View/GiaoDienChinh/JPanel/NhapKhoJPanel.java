package View.GiaoDienChinh.JPanel;

import View.GiaoDienChinh.GiaoDienChinh;
import View.GiaoDienChinh.JDialog.ThongTinSanPhamNhapJDialog;
import Time.TimePlay;
import Controller.ConnectionMySQL_NhapKho;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.QuanLiDanhSoCode;
import java.text.MessageFormat;
import javax.swing.JTable;

public class NhapKhoJPanel extends javax.swing.JPanel {

    private int index ;
    private ArrayList<QuanLiDanhSoCode> list;
    DefaultTableModel model;
    public NhapKhoJPanel() {
        initComponents();
        list = new ConnectionMySQL_NhapKho().getListQuanLy();
        model = (DefaultTableModel) jTable.getModel();
        showTable();
    }

    int i=1;
    public void showTable() {
        for (QuanLiDanhSoCode s : list) {
            model.addRow(new Object[]{
                i++, s.getLoaiHang(),  s.getMaMatHang(), s.getGioiTinh(),s.getSize(), s.getMau(),s.getNoiSanXuat(), s.getSoLuongNhap(), s.getGiaNhap(),s.getGiaBan(),s.getThoiGian()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelAnhSP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxMau = new javax.swing.JComboBox<>();
        jComboBoxNoiSanXuat = new javax.swing.JComboBox<>();
        jComboBoxSize = new javax.swing.JComboBox<>();
        jComboBoxLoaiHang = new javax.swing.JComboBox<>();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jTextFieldMaMatHang = new javax.swing.JTextField();
        jTextFieldSoLuongNhap = new javax.swing.JTextField();
        jTextFieldGiaNhap = new javax.swing.JTextField();
        jTextFieldGiaBan = new javax.swing.JTextField();
        jButtonThongTinSP = new javax.swing.JButton();
        jButtonThemSP = new javax.swing.JButton();
        jButtonXoaSP = new javax.swing.JButton();
        jButtonChinhSuaSP = new javax.swing.JButton();
        jButtonTaiLai = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldThoiGian = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonXuatFilePDF = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nh???p kho s???n ph???m");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 510, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PanelTong/hoa2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/BongBong.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 130, 150));

        jSeparator1.setBackground(new java.awt.Color(0, 255, 0));
        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 580, 0));

        jTable.setBackground(new java.awt.Color(255, 255, 204));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Lo???i h??ng", "M?? SP", "Nam/N???", "Size", "M??u ", "N??i s???n xu???t", "S??? l?????ng", "Gi?? b??n", "Gi?? nh???p", "Th???i gian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setToolTipText("B???ng Table l??u tr??? th??ng tin s???n ph???m");
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
            jTable.getColumnModel().getColumn(1).setPreferredWidth(140);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(9).setResizable(false);
            jTable.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(10).setResizable(false);
            jTable.getColumnModel().getColumn(10).setPreferredWidth(120);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1200, 190));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("N??i s???n xu???t      : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Size SP            :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nam/N???           :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Lo???i h??ng         :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("S??? l?????ng nh???p   :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 160, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("M??u SP           :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Th???i gian nh???p  :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 160, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gi?? nh???p           :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("M?? m???t h??ng    :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 40));

        jLabelAnhSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/Khong.png"))); // NOI18N
        jLabelAnhSP.setToolTipText("???nh minh h???a s???n ph???m");
        add(jLabelAnhSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 160, 170));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Gi?? b??n             :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 160, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("???nh S???n Ph???m");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 160, 40));

        jComboBoxMau.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xanh l??", "Xanh da tr???i", "?????", "??en", "X??m", "H???ng", "V??ng", "Tr???ng", "Cam", "M??u kh??c" }));
        jComboBoxMau.setSelectedIndex(-1);
        jComboBoxMau.setToolTipText("M??u s???n ph???m");
        add(jComboBoxMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 180, 30));

        jComboBoxNoiSanXuat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxNoiSanXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vi???t Nam", "H??n Qu???c", "Nh???t B???n", "Trung Qu???c", "M???", "?????c", "Ph??p", "N?????c kh??c" }));
        jComboBoxNoiSanXuat.setSelectedIndex(-1);
        jComboBoxNoiSanXuat.setToolTipText("N??i s???n xu???t s???n ph???m");
        add(jComboBoxNoiSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 190, 30));

        jComboBoxSize.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL", "Size kh??c" }));
        jComboBoxSize.setSelectedIndex(-1);
        jComboBoxSize.setToolTipText("Size s???n ph???m");
        add(jComboBoxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, 30));

        jComboBoxLoaiHang.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qu???n Jean", "Qu???n Kaki", "Qu???n Jogger", "??o kho??t len", "??o kho??t d??", "??o kho??t kaki", "??o kho??t Jean", "V??y ng???n", "V??y d??i", "??o s?? mi", "??o Hoodie", "??o len", "??o thun", "??o d??i tay", "??o Croptop", "??o Vest", "T???t", "G??ng tay", "M??", "Kh??n qu??ng c???", "Lo???i kh??c" }));
        jComboBoxLoaiHang.setSelectedIndex(-1);
        jComboBoxLoaiHang.setToolTipText("Lo???i s???n ph???m");
        jComboBoxLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLoaiHangActionPerformed(evt);
            }
        });
        add(jComboBoxLoaiHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 132, 240, 30));

        buttonGroup1.add(jRadioButtonNu);
        jRadioButtonNu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButtonNu.setText("N???");
        jRadioButtonNu.setToolTipText("Ph??i N???");
        add(jRadioButtonNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 40));

        buttonGroup1.add(jRadioButtonNam);
        jRadioButtonNam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButtonNam.setText("Nam");
        jRadioButtonNam.setToolTipText("Gi???i t??nh nam");
        jRadioButtonNam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jRadioButtonNam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(jRadioButtonNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 40));

        jTextFieldMaMatHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldMaMatHang.setToolTipText("M?? s???n ph???m");
        jTextFieldMaMatHang.setEnabled(false);
        add(jTextFieldMaMatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 240, 40));

        jTextFieldSoLuongNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldSoLuongNhap.setToolTipText("S??? l?????ng nh???p s???n ph???m");
        add(jTextFieldSoLuongNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 190, 40));

        jTextFieldGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGiaNhap.setToolTipText("G??a nh???p s???n ph???m");
        add(jTextFieldGiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 190, 40));

        jTextFieldGiaBan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldGiaBan.setToolTipText("G??a b??n s???n ph???m");
        add(jTextFieldGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 190, 40));

        jButtonThongTinSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/information.png"))); // NOI18N
        jButtonThongTinSP.setToolTipText("Th??ng tin s???n ph???m ");
        jButtonThongTinSP.setContentAreaFilled(false);
        jButtonThongTinSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongTinSPActionPerformed(evt);
            }
        });
        add(jButtonThongTinSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 80, -1));

        jButtonThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/add.png"))); // NOI18N
        jButtonThemSP.setToolTipText("Nh???p kho s???n ph???m");
        jButtonThemSP.setContentAreaFilled(false);
        jButtonThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemSPActionPerformed(evt);
            }
        });
        add(jButtonThemSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 80, -1));

        jButtonXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/delete.png"))); // NOI18N
        jButtonXoaSP.setToolTipText("X??a s???n ph???m kh???i kho");
        jButtonXoaSP.setContentAreaFilled(false);
        jButtonXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaSPActionPerformed(evt);
            }
        });
        add(jButtonXoaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 80, -1));

        jButtonChinhSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/edit.png"))); // NOI18N
        jButtonChinhSuaSP.setToolTipText("Ch???nh s???a s???n ph???m trong kho");
        jButtonChinhSuaSP.setContentAreaFilled(false);
        jButtonChinhSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChinhSuaSPActionPerformed(evt);
            }
        });
        add(jButtonChinhSuaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 80, -1));

        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/refresh.png"))); // NOI18N
        jButtonTaiLai.setToolTipText("L??m m???i giao di???n");
        jButtonTaiLai.setContentAreaFilled(false);
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 80, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("C??i");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 40, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("VN??");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 40, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("VN??");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 40, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 590, -1));

        jTextFieldThoiGian.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldThoiGian.setToolTipText("Th???i gian nh???p s???n ph???m");
        jTextFieldThoiGian.setEnabled(false);
        add(jTextFieldThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 230, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOpaque(true);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 666, 810, 0));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setOpaque(true);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1200, 10));

        jButtonXuatFilePDF.setIcon(new javax.swing.ImageIcon("D:\\HocKi1-2020-2021\\NetBeans\\NetBeansJava\\DoAnJava\\src\\Image\\NhapKho\\xuatpdf.png")); // NOI18N
        jButtonXuatFilePDF.setToolTipText("Th??ng tin s???n ph???m ");
        jButtonXuatFilePDF.setContentAreaFilled(false);
        jButtonXuatFilePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuatFilePDFActionPerformed(evt);
            }
        });
        add(jButtonXuatFilePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 80, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NhapKho/nenNhapKho.jpg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 720));

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents
    private void MaMatHang(int l,String s,String k){
        if (jComboBoxLoaiHang.getSelectedIndex() == l ) {
            jLabelAnhSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MinhHoaSanPham/"+k+".png")));
            int t=1; 
            String str;
            for(int i=0;i<list.size();i++){
                str = s+""+t ;
                QuanLiDanhSoCode v = list.get(i);
                if(v.getMaMatHang().equals(str))
                    t++;
            }
            str = s+""+t ;
            jTextFieldMaMatHang.setText(str);
        }
    }
    private void jComboBoxLoaiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLoaiHangActionPerformed
        jRadioButtonNam.setEnabled(true);
        jRadioButtonNu.setEnabled(true);
        MaMatHang(-1,"","Khong");
        MaMatHang(0,"QJE","QuanJean");
        MaMatHang(1,"QK","QuanKaki");
        MaMatHang(2,"QJO","QuanJogger");
        MaMatHang(3,"AKL","AoKhoatLen");
        MaMatHang(4,"AKD","AoKhoatDu");
        MaMatHang(5,"AKK","AoKhoatKaki");
        MaMatHang(6,"AKJ","AoKhoatJean");
        if (jComboBoxLoaiHang.getSelectedIndex() == 7 || jComboBoxLoaiHang.getSelectedIndex() == 8 || jComboBoxLoaiHang.getSelectedIndex() == 14){
            jRadioButtonNu.setSelected(true);
            jRadioButtonNam.setEnabled(false);
            jRadioButtonNu.setEnabled(false);
        }
        MaMatHang(7,"VN","VayNgan");
        MaMatHang(8,"VD","VayDai");
        MaMatHang(9,"ASM","AoSoMi");
        MaMatHang(10,"AH","AoHoodie");
        MaMatHang(11,"AL","AoLen");
        MaMatHang(12,"AT","AoThun");
        MaMatHang(13,"ADT","AoDaiTay");
        MaMatHang(14,"AC","AoCroptop");
        MaMatHang(15,"AV","AoVest");
        MaMatHang(16,"T","Tat");
        MaMatHang(17,"GT","GangTay");
        MaMatHang(18,"M","Mu");
        MaMatHang(19,"KQC","KhanQuanCo");
        MaMatHang(20,"K","Khong");  
    }//GEN-LAST:event_jComboBoxLoaiHangActionPerformed
    public boolean KiemTra(){
        if((!jRadioButtonNam.isSelected()) && (!jRadioButtonNu.isSelected()))
            return false;
        if(jTextFieldMaMatHang.getText().equals(""))
            return false;
        if(jComboBoxLoaiHang.getSelectedIndex()==-1)
            return false;
        if(jComboBoxSize.getSelectedIndex()==-1)
            return false;
        if(jComboBoxMau.getSelectedIndex()==-1)
            return false;
        if(jComboBoxNoiSanXuat.getSelectedIndex()==-1)
            return false;
        
        return true;
    }
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
    private boolean KiemTraSauTable(String s){
        for(int i=0;i<list.size();i++){
                QuanLiDanhSoCode v = list.get(i);
                if(v.getMaMatHang().equals(s))
                    return false ;
        }
        return true;
    }
    private void TaiLaiTrang(){
        jComboBoxLoaiHang.setSelectedIndex(-1);
            jTextFieldMaMatHang.setText("");
            buttonGroup1.clearSelection();
            jComboBoxSize.setSelectedIndex(-1);
            jComboBoxMau.setSelectedIndex(-1);
            jComboBoxNoiSanXuat.setSelectedIndex(-1);
            jTextFieldSoLuongNhap.setText("");
            jTextFieldGiaBan.setText("");
            jTextFieldGiaNhap.setText("");
            jTextFieldThoiGian.setText("");
            jTable.clearSelection();
    }
    private void jButtonThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemSPActionPerformed
        if(!KiemTra()){
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ?????y ????? th??ng tin!!!");
        }
        else if(!KiemTraSo(jTextFieldGiaBan.getText()) || !KiemTraSo(jTextFieldSoLuongNhap.getText()) || !KiemTraSo(jTextFieldGiaNhap.getText())){
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ch??nh x??c th??ng tin!!!");
        }
        else if(Integer.parseInt(jTextFieldGiaBan.getText())<Integer.parseInt(jTextFieldGiaNhap.getText())){
            JOptionPane.showMessageDialog(this, "Gi?? nh???p > Gi?? b??n !! ");
        }
        else if(!KiemTraSauTable(jTextFieldMaMatHang.getText())){
            JOptionPane.showMessageDialog(this, "M?? s???n ph???m ???? t???n t???i!!!");
        }
        else{
            QuanLiDanhSoCode s = new QuanLiDanhSoCode();
            s.setLoaiHang(jComboBoxLoaiHang.getItemAt(jComboBoxLoaiHang.getSelectedIndex()));
            s.setMaMatHang(jTextFieldMaMatHang.getText());
            if(jRadioButtonNam.isSelected())
                s.setGioiTinh("Nam");
            else
                s.setGioiTinh("N???");
            s.setSize(jComboBoxSize.getItemAt(jComboBoxSize.getSelectedIndex()));
            s.setMau(jComboBoxMau.getItemAt(jComboBoxMau.getSelectedIndex()));
            s.setNoiSanXuat(jComboBoxNoiSanXuat.getItemAt(jComboBoxNoiSanXuat.getSelectedIndex()));
            s.setSoLuongNhap(Integer.parseInt(jTextFieldSoLuongNhap.getText()));
            s.setGiaNhap(Integer.parseInt(jTextFieldGiaNhap.getText()));
            s.setGiaBan(Integer.parseInt(jTextFieldGiaBan.getText()));
            s.setThoiGian(""+(new TimePlay().TimeNow()));
            
            try {
                if(new ConnectionMySQL_NhapKho().addQuanLi(s)){
                    JOptionPane.showMessageDialog(this, "Th??m s???n ph???m th??nh c??ng !!");
                    list.add(s); 
                    showResult();
                } 
                else{
                    JOptionPane.showMessageDialog(this, "L???i !!");
                }   
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "L???i !!");
            }
            TaiLaiTrang();
        }
    }//GEN-LAST:event_jButtonThemSPActionPerformed

    private void jButtonXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaSPActionPerformed
        index = jTable.getSelectedRow() ;
        if(list.size() == 0){
            JOptionPane.showMessageDialog(this, "H??y nh???p kho s???n ph???m!!!");
        }
        else if(index == -1){
            JOptionPane.showMessageDialog(this, "H??y ch???n s???n ph???m mu???n x??a!!!");
        }
        else{
            QuanLiDanhSoCode s = list.get(index);
            try {
                if(new ConnectionMySQL_NhapKho().DeleteQuanLi(s)){
                    JOptionPane.showMessageDialog(this, "X??a s???n ph???m th??nh c??ng!!!!");
                    list.remove(s);
                    model.removeRow(index);
                    model.fireTableDataChanged();
                } 
                else{
                    JOptionPane.showMessageDialog(this, "L???i !!! Kh??ng th??? x??a s???n ph???m");
                }   
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "L???i !!! Kh??ng th??? x??a s???n ph???m");
            }
            TaiLaiTrang();
        }
    }//GEN-LAST:event_jButtonXoaSPActionPerformed

    private void jButtonChinhSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChinhSuaSPActionPerformed
        index = jTable.getSelectedRow() ;
        QuanLiDanhSoCode c = null ;
        if(index == -1){
            JOptionPane.showMessageDialog(this, "H??y ch???n s???n ph???m mu???n ch???nh s???a!!!");
        }
        else{
            c = list.get(index);
        }
        
        if(!KiemTra()){
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ?????y ????? th??ng tin!!!");
        }
        else if(Integer.parseInt(jTextFieldGiaBan.getText())<Integer.parseInt(jTextFieldGiaNhap.getText())){
            JOptionPane.showMessageDialog(this, "Gi?? nh???p > Gi?? b??n !! ");
        }
        else if(!KiemTraSo(jTextFieldGiaBan.getText()) || !KiemTraSo(jTextFieldSoLuongNhap.getText()) || !KiemTraSo(jTextFieldGiaNhap.getText())){
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ch??nh x??c th??ng tin!!!");
        }
        else if(list.size() == 0){
            JOptionPane.showMessageDialog(this, "H??y nh???p kho s???n ph???m!!!");
        }
        else if(!c.getLoaiHang().equals(jComboBoxLoaiHang.getItemAt(jComboBoxLoaiHang.getSelectedIndex()))){
            JOptionPane.showMessageDialog(this, "Kh??ng th??? ch???nh s???a 'Lo???i h??ng' !!");
        }
        else{
            QuanLiDanhSoCode s = new QuanLiDanhSoCode();
            s.setLoaiHang(jComboBoxLoaiHang.getItemAt(jComboBoxLoaiHang.getSelectedIndex()));
            s.setMaMatHang(jTextFieldMaMatHang.getText());
            if(jRadioButtonNam.isSelected())
                s.setGioiTinh("Nam");
            else
                s.setGioiTinh("N???");
            s.setSize(jComboBoxSize.getItemAt(jComboBoxSize.getSelectedIndex()));
            s.setMau(jComboBoxMau.getItemAt(jComboBoxMau.getSelectedIndex()));
            s.setNoiSanXuat(jComboBoxNoiSanXuat.getItemAt(jComboBoxNoiSanXuat.getSelectedIndex()));
            s.setSoLuongNhap(Integer.parseInt(jTextFieldSoLuongNhap.getText()));
            s.setGiaNhap(Integer.parseInt(jTextFieldGiaNhap.getText()));
            s.setGiaBan(Integer.parseInt(jTextFieldGiaBan.getText()));
            s.setThoiGian(jTextFieldThoiGian.getText());
            
            try {
                if(new ConnectionMySQL_NhapKho().EditQuanLi(s)){
                    JOptionPane.showMessageDialog(this, "S???a s???n ph???m th??nh c??ng!!!!");
                    String s1 ;
                    if(jRadioButtonNam.isSelected())
                        s1 = "Nam" ;
                    else
                        s1 = "N???" ;
                    list.remove(index);
                    list.add(index,s); 
                    model.removeRow(index);
                    model.insertRow(index,new Object[]{
                         index+1,jComboBoxLoaiHang.getItemAt(jComboBoxLoaiHang.getSelectedIndex()),
                        jTextFieldMaMatHang.getText(),s1,
                       jComboBoxSize.getItemAt(jComboBoxSize.getSelectedIndex()),
                       jComboBoxMau.getItemAt(jComboBoxMau.getSelectedIndex()),
                       jComboBoxNoiSanXuat.getItemAt(jComboBoxNoiSanXuat.getSelectedIndex()),
                       jTextFieldSoLuongNhap.getText(),jTextFieldGiaNhap.getText(),jTextFieldGiaBan.getText(),
                            jTextFieldThoiGian.getText()
                    });
                    model.fireTableDataChanged();
                    
                } 
                else{
                    JOptionPane.showMessageDialog(this, "L???i!!!Kh??ng th??? s???a s???n ph???m"
                            + "");
                }   
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "L???i!!!Kh??ng th??? s???a s???n ph???m");
            }
            TaiLaiTrang();
        }
    }//GEN-LAST:event_jButtonChinhSuaSPActionPerformed
    
    private int TimViTriComboLoaiHang(String s){
        if(s.contains("QJE")) return 0;
        if(s.contains("QK"))  return 1;
        if(s.contains("QJO")) return 2;
        if(s.contains("AKL")) return 3;
        if(s.contains("AKD")) return 4;
        if(s.contains("AKK")) return 5;
        if(s.contains("AKJ")) return 6;
        if(s.contains("VN"))  return 7;
        if(s.contains("VD"))  return 8;
        if(s.contains("ASM")) return 9;
        if(s.contains("AH"))  return 10;
        if(s.contains("AL"))  return 11;
        if(s.contains("AT"))  return 12;
        if(s.contains("ADT")) return 13;
        if(s.contains("AC"))  return 14;
        if(s.contains("AV"))  return 15;
        if(s.contains("GT"))  return 17;
        if(s.contains("KQC")) return 19;
        if(s.contains("T"))   return 16;
        if(s.contains("M"))  return 18;
        if(s.contains("K"))   return 20;
        return -1 ;
    }
    private int TimViTriComboSize(String s){
        if(s.equals("XS"))    return 0;
        if(s.equals("S"))     return 1;
        if(s.equals("M"))     return 2;
        if(s.equals("L"))     return 3;
        if(s.equals("XL"))    return 4;
        if(s.equals("XXL"))   return 5;
        if(s.equals("Size kh??c"))return 6;
        return -1 ;
    }
    private int TimViTriComboMau(String s){
        if(s.equals("Xanh l??"))     return 0;
        if(s.equals("Xanh da tr???i"))return 1;
        if(s.equals("?????"))       return 2;
        if(s.equals("??en"))       return 3;
        if(s.equals("X??m"))       return 4;
        if(s.equals("H???ng"))      return 5;
        if(s.equals("V??ng"))       return 6;
        if(s.equals("Tr???ng"))     return 7;
        if(s.equals("Cam"))       return 8;
        if(s.equals("M??u kh??c"))   return 9;
        return -1 ;
    }
    private int TimViTriComboNoiSanXuat(String s){
        if(s.equals("Vi???t Nam"))   return 0;
        if(s.contains("H??n"))   return 1;
        if(s.equals("Nh???t B???n"))  return 2;
        if(s.equals("Trung Qu???c")) return 3;
        if(s.equals("M???"))        return 4;
        if(s.equals("?????c"))       return 5;
        if(s.equals("Ph??p"))       return 6;
        if(s.equals("N?????c kh??c"))  return 7;
        
        return -1 ;
    }
    
    
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        index = jTable.getSelectedRow() ;
        QuanLiDanhSoCode s = list.get(index);
        int loaiHang = TimViTriComboLoaiHang(s.getMaMatHang());
        int size = TimViTriComboSize(s.getSize());
        int mau = TimViTriComboMau(s.getMau());
        int noisanxuat = TimViTriComboNoiSanXuat(s.getNoiSanXuat());
        jComboBoxLoaiHang.setSelectedIndex(loaiHang);
        jTextFieldMaMatHang.setText(s.getMaMatHang());
        if(s.getGioiTinh().equals("Nam"))
            jRadioButtonNam.setSelected(true);
        else
            jRadioButtonNu.setSelected(true);
        jComboBoxSize.setSelectedIndex(size);
        jComboBoxMau.setSelectedIndex(mau);
        jComboBoxNoiSanXuat.setSelectedIndex(noisanxuat);
        jTextFieldSoLuongNhap.setText(""+s.getSoLuongNhap());
        jTextFieldGiaBan.setText(""+s.getGiaBan());
        jTextFieldGiaNhap.setText(""+s.getGiaNhap());
        jTextFieldThoiGian.setText(""+s.getThoiGian());
        
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
            TaiLaiTrang();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed
    public static int key  ;
    private void jButtonThongTinSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongTinSPActionPerformed
        index = jTable.getSelectedRow() ;
        key = jTable.getSelectedRow() ;
        
        if(index == -1){
            JOptionPane.showMessageDialog(this, "H??y ch???n s???n ph???m xem th??ng tin !!");
        }
        else{
            ThongTinSanPhamNhapJDialog x = new ThongTinSanPhamNhapJDialog(new GiaoDienChinh(),true);
            x.setVisible(true);
        } 
    }//GEN-LAST:event_jButtonThongTinSPActionPerformed

    private void jTableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseDragged
        index = jTable.getSelectedRow() ;
        QuanLiDanhSoCode s = list.get(index);
        int loaiHang = TimViTriComboLoaiHang(s.getMaMatHang());
        int size = TimViTriComboSize(s.getSize());
        int mau = TimViTriComboMau(s.getMau());
        int noisanxuat = TimViTriComboNoiSanXuat(s.getNoiSanXuat());
        jComboBoxLoaiHang.setSelectedIndex(loaiHang);
        jTextFieldMaMatHang.setText(s.getMaMatHang());
        if(s.getGioiTinh().equals("Nam"))
            jRadioButtonNam.setSelected(true);
        else
            jRadioButtonNu.setSelected(true);
        jComboBoxSize.setSelectedIndex(size);
        jComboBoxMau.setSelectedIndex(mau);
        jComboBoxNoiSanXuat.setSelectedIndex(noisanxuat);
        jTextFieldSoLuongNhap.setText(""+s.getSoLuongNhap());
        jTextFieldGiaBan.setText(""+s.getGiaBan());
        jTextFieldGiaNhap.setText(""+s.getGiaNhap());
        jTextFieldThoiGian.setText(""+s.getThoiGian());
    }//GEN-LAST:event_jTableMouseDragged

    private void jButtonXuatFilePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuatFilePDFActionPerformed
        MessageFormat header = new MessageFormat("Nh???p kho s???n ph???m");
        MessageFormat footer = new MessageFormat("");
        try {
            this.jTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to print");
        }
    }//GEN-LAST:event_jButtonXuatFilePDFActionPerformed
    public void showResult() {
        QuanLiDanhSoCode s = list.get(list.size() - 1);
        model.addRow(new Object[]{
            i++, s.getLoaiHang(),  s.getMaMatHang(), s.getGioiTinh(),s.getSize(), s.getMau(),s.getNoiSanXuat(), s.getSoLuongNhap(), s.getGiaNhap(),s.getGiaBan(),s.getThoiGian()
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonChinhSuaSP;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThemSP;
    private javax.swing.JButton jButtonThongTinSP;
    private javax.swing.JButton jButtonXoaSP;
    private javax.swing.JButton jButtonXuatFilePDF;
    private javax.swing.JComboBox<String> jComboBoxLoaiHang;
    private javax.swing.JComboBox<String> jComboBoxMau;
    private javax.swing.JComboBox<String> jComboBoxNoiSanXuat;
    private javax.swing.JComboBox<String> jComboBoxSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAnhSP;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldGiaBan;
    private javax.swing.JTextField jTextFieldGiaNhap;
    private javax.swing.JTextField jTextFieldMaMatHang;
    private javax.swing.JTextField jTextFieldSoLuongNhap;
    private javax.swing.JTextField jTextFieldThoiGian;
    // End of variables declaration//GEN-END:variables


}
