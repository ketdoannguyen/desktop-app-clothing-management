
package View.GiaoDienChinh;

import View.GiaoDienChinh.JPanel.QuanLiJPanel;
import View.GiaoDienChinh.JPanel.StartJPanel;
import View.GiaoDienChinh.JPanel.BanHangJPanel;
import View.GiaoDienChinh.JPanel.ThongKeJPanel;
import View.GiaoDienChinh.JPanel.NhapKhoJPanel;
import View.DangNhapDangKi.GiaoDienDangNhap;
import View.GiaoDienChinh.JDialog.ThongTinUngDungJDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class GiaoDienChinh extends javax.swing.JFrame {

    private NhapKhoJPanel nhapkho;
    int t = 0;
    public GiaoDienChinh() {
        initComponents();
        Start();
        showtime();
    }
    void showtime() {
        new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
                jLabelThoiGian.setText(s.format(d) +" "+ D.format(d));
            }
        }).start();
    }
    
    void Start() {
        StartJPanel x = new StartJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelChucNang = new javax.swing.JPanel();
        jButtonNhapKho = new javax.swing.JButton();
        jButtonBanHang = new javax.swing.JButton();
        jButtonQuanLi = new javax.swing.JButton();
        jButtonDangXuat = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jButtonThongKe = new javax.swing.JButton();
        jButtonThongTin = new javax.swing.JButton();
        jButtonTaiLai = new javax.swing.JButton();
        jLabelThoiGian = new javax.swing.JLabel();
        jPanelTong = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNhapSanPham = new javax.swing.JMenuItem();
        jMenuItemBanSanPham = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemQuanLi = new javax.swing.JMenuItem();
        jMenuItemThongKe = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemDangXuat = new javax.swing.JMenuItem();
        jMenuItemThoat = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemThongTin = new javax.swing.JMenuItem();
        jMenuItemTaiLai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao diện quản lí cửa hàng bán quần áo");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelChucNang.setBackground(new java.awt.Color(255, 255, 204));
        jPanelChucNang.setPreferredSize(new java.awt.Dimension(1200, 90));
        jPanelChucNang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonNhapKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/them1.png"))); // NOI18N
        jButtonNhapKho.setToolTipText("Nhập kho sản phẩm");
        jButtonNhapKho.setContentAreaFilled(false);
        jButtonNhapKho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonNhapKho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNhapKho.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonNhapKho.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonNhapKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhapKhoActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonNhapKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jButtonBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/ban.png"))); // NOI18N
        jButtonBanHang.setToolTipText("Bán sản phẩm");
        jButtonBanHang.setContentAreaFilled(false);
        jButtonBanHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBanHang.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonBanHang.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBanHangActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 80));

        jButtonQuanLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/quanli1.png"))); // NOI18N
        jButtonQuanLi.setToolTipText("Quản lí kho hàng");
        jButtonQuanLi.setContentAreaFilled(false);
        jButtonQuanLi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonQuanLi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonQuanLi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonQuanLi.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonQuanLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuanLiActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonQuanLi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 80));

        jButtonDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/logout.png"))); // NOI18N
        jButtonDangXuat.setToolTipText("Đăng xuất");
        jButtonDangXuat.setContentAreaFilled(false);
        jButtonDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDangXuat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangXuatActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 80));

        jButtonThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/thoat.png"))); // NOI18N
        jButtonThoat.setToolTipText("Thoát");
        jButtonThoat.setContentAreaFilled(false);
        jButtonThoat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThoat.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonThoat.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 80));

        jButtonThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/thongke.png"))); // NOI18N
        jButtonThongKe.setToolTipText("Thống kê kho hàng");
        jButtonThongKe.setContentAreaFilled(false);
        jButtonThongKe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThongKe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonThongKe.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKeActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 80));

        jButtonThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/information.png"))); // NOI18N
        jButtonThongTin.setToolTipText("Thông tin ứng dụng");
        jButtonThongTin.setContentAreaFilled(false);
        jButtonThongTin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThongTin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonThongTin.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongTinActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 80));

        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/reload.png"))); // NOI18N
        jButtonTaiLai.setToolTipText("Tải lại trang");
        jButtonTaiLai.setContentAreaFilled(false);
        jButtonTaiLai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonTaiLai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTaiLai.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonTaiLai.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });
        jPanelChucNang.add(jButtonTaiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 80));

        jLabelThoiGian.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelThoiGian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/clock.png"))); // NOI18N
        jLabelThoiGian.setText("11:14:56 20/05/2020");
        jPanelChucNang.add(jLabelThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, 300, 80));

        getContentPane().add(jPanelChucNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 85));

        jPanelTong.setAutoscrolls(true);
        jPanelTong.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelTong.setPreferredSize(new java.awt.Dimension(1220, 500));

        javax.swing.GroupLayout jPanelTongLayout = new javax.swing.GroupLayout(jPanelTong);
        jPanelTong.setLayout(jPanelTongLayout);
        jPanelTongLayout.setHorizontalGroup(
            jPanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTongLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(1011, 1011, 1011)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanelTongLayout.setVerticalGroup(
            jPanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelTongLayout.createSequentialGroup()
                .addGap(639, 639, 639)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 1200, 670));
        jPanelTong.getAccessibleContext().setAccessibleName("");
        jPanelTong.getAccessibleContext().setAccessibleDescription("");
        jPanelTong.getAccessibleContext().setAccessibleParent(jPanelTong);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setToolTipText("Menu phân loại quản lí bán hàng");
        jMenuBar1.setOpaque(false);

        jMenu1.setBackground(new java.awt.Color(153, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Nhập/Bán  ");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItemNhapSanPham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemNhapSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/importmenu.png"))); // NOI18N
        jMenuItemNhapSanPham.setText("Nhập sản phẩm");
        jMenuItemNhapSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemNhapSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNhapSanPhamActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNhapSanPham);

        jMenuItemBanSanPham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemBanSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/banmenu.png"))); // NOI18N
        jMenuItemBanSanPham.setText("Bán sản phẩm ");
        jMenuItemBanSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItemBanSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemBanSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBanSanPhamActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemBanSanPham);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Quản lí   ");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItemQuanLi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemQuanLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/quanlimenu.png"))); // NOI18N
        jMenuItemQuanLi.setText("Quản lí kho sản phẩm   ");
        jMenuItemQuanLi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemQuanLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuanLiActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemQuanLi);

        jMenuItemThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/thongkemenu.png"))); // NOI18N
        jMenuItemThongKe.setText("Thống kê kho sản phẩm");
        jMenuItemThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThongKeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemThongKe);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Thoát   ");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItemDangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/logoutmenu.png"))); // NOI18N
        jMenuItemDangXuat.setText("Đăng xuất");
        jMenuItemDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDangXuatActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemDangXuat);

        jMenuItemThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/exitmenu.png"))); // NOI18N
        jMenuItemThoat.setText("Thoát      ");
        jMenuItemThoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThoatActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemThoat);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Trợ giúp");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItemThongTin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/infomenu.png"))); // NOI18N
        jMenuItemThongTin.setText("Thông tin");
        jMenuItemThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThongTinActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemThongTin);

        jMenuItemTaiLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItemTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GiaoDienChinh/reloadmenu.png"))); // NOI18N
        jMenuItemTaiLai.setText("Tải lại     ");
        jMenuItemTaiLai.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItemTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTaiLaiActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemTaiLai);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1214, 819));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemQuanLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuanLiActionPerformed
        QuanLiJPanel x = new QuanLiJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jMenuItemQuanLiActionPerformed

    private void jMenuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDangXuatActionPerformed
         int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thoát giao diện chính",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (output == JOptionPane.YES_OPTION) {
           setVisible(false);
            new GiaoDienDangNhap().setVisible(true);
        } 
    }//GEN-LAST:event_jMenuItemDangXuatActionPerformed

    private void jMenuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThoatActionPerformed
        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát phần mềm",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (output == JOptionPane.YES_OPTION) {

            try {
                Thread.sleep(50);
                System.exit(0);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jMenuItemThoatActionPerformed

    private void jMenuItemThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThongTinActionPerformed
        ThongTinUngDungJDialog x = new ThongTinUngDungJDialog(this, true);
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItemThongTinActionPerformed

    private void jMenuItemTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTaiLaiActionPerformed
        try {
            setVisible(false);
            Thread.sleep(200);
            new GiaoDienChinh().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemTaiLaiActionPerformed

    private void jButtonNhapKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhapKhoActionPerformed
        nhapkho = new NhapKhoJPanel();
        nhapkho.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(nhapkho);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jButtonNhapKhoActionPerformed

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        try {
            setVisible(false);
            Thread.sleep(200);
            new GiaoDienChinh().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed

    private void jButtonDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangXuatActionPerformed
         int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thoát giao diện chính",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (output == JOptionPane.YES_OPTION) {
           setVisible(false);
            new GiaoDienDangNhap().setVisible(true);
        } 

    }//GEN-LAST:event_jButtonDangXuatActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát phần mềm",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (output == JOptionPane.YES_OPTION) {

            try {
                Thread.sleep(50);
                System.exit(0);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBanHangActionPerformed
        BanHangJPanel x = new BanHangJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jButtonBanHangActionPerformed

    private void jButtonThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongTinActionPerformed
        ThongTinUngDungJDialog x = new ThongTinUngDungJDialog(this, true);
        x.setVisible(true);
    }//GEN-LAST:event_jButtonThongTinActionPerformed

    private void jMenuItemNhapSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNhapSanPhamActionPerformed
        nhapkho = new NhapKhoJPanel();
        nhapkho.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(nhapkho);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jMenuItemNhapSanPhamActionPerformed

    private void jMenuItemBanSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBanSanPhamActionPerformed
        BanHangJPanel x = new BanHangJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jMenuItemBanSanPhamActionPerformed

    private void jButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKeActionPerformed
        ThongKeJPanel x = new ThongKeJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jButtonThongKeActionPerformed

    private void jMenuItemThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThongKeActionPerformed
        ThongKeJPanel x = new ThongKeJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jMenuItemThongKeActionPerformed

    private void jButtonQuanLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuanLiActionPerformed
        QuanLiJPanel x = new QuanLiJPanel();
        x.setBounds(0, 0, 1200, 670);
        jPanelTong.removeAll();
        jPanelTong.add(x);
        jPanelTong.validate();
        jPanelTong.repaint();
    }//GEN-LAST:event_jButtonQuanLiActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBanHang;
    private javax.swing.JButton jButtonDangXuat;
    private javax.swing.JButton jButtonNhapKho;
    private javax.swing.JButton jButtonQuanLi;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonThongKe;
    private javax.swing.JButton jButtonThongTin;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelThoiGian;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBanSanPham;
    private javax.swing.JMenuItem jMenuItemDangXuat;
    private javax.swing.JMenuItem jMenuItemNhapSanPham;
    private javax.swing.JMenuItem jMenuItemQuanLi;
    private javax.swing.JMenuItem jMenuItemTaiLai;
    private javax.swing.JMenuItem jMenuItemThoat;
    private javax.swing.JMenuItem jMenuItemThongKe;
    private javax.swing.JMenuItem jMenuItemThongTin;
    private javax.swing.JPanel jPanelChucNang;
    private javax.swing.JPanel jPanelTong;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
