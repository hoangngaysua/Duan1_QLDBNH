/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Helper.DateHelper;
import Helper.DialogHelper;
import Helper.ShareHelper;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Dieu Le
 */
public class HomeNhaHang extends javax.swing.JFrame {

    /**
     * Creates new form HomeNhaHang
     */
    public HomeNhaHang() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        init();
        ImageIcon banner = new ImageIcon("src/Logo/banner.jpg");
        Image im = banner.getImage();
        ImageIcon icon = new ImageIcon(im.getScaledInstance(lblbanner.getWidth(), lblbanner.getHeight(), im.SCALE_SMOOTH));
        lblbanner.setIcon(icon);
        
        
        ImageIcon dondat1 = new ImageIcon("src/Logo/phieudat1.png");
        btnPhieuDat.setIcon(dondat1);
        ImageIcon ttb1 = new ImageIcon("src/Logo/datban1.png");
        btnTTB.setIcon(ttb1);
        ImageIcon hoadon1 = new ImageIcon("src/Logo/bill.png");
        btnHoaDon.setIcon(hoadon1);
        ImageIcon taikhoan1 = new ImageIcon("src/Logo/lock.png");
        btnTaiKhoan.setIcon(taikhoan1);
        ImageIcon nhanvien1 = new ImageIcon("src/Logo/add-user.png");
        btnNhanVien.setIcon(nhanvien1);
    }
    
    void init(){
        Date date = DateHelper.now();
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date time = new Date();
                SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss a");
                String text = fm.format(time);
                lblDongHo.setText(text);
            }
        }).start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDXuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnPhieuDat = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnTTB = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHoaDon = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnTaiKhoan = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnNhanVien = new javax.swing.JButton();
        lblbanner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mniDangxuat = new javax.swing.JCheckBoxMenuItem();
        mniDoiMK = new javax.swing.JCheckBoxMenuItem();
        mniThoat = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniPhieuDat = new javax.swing.JCheckBoxMenuItem();
        mniTrangThaiBan = new javax.swing.JCheckBoxMenuItem();
        mniHoaDon = new javax.swing.JCheckBoxMenuItem();
        mniTaikhoan = new javax.swing.JCheckBoxMenuItem();
        mniNhanVien = new javax.swing.JCheckBoxMenuItem();
        mniThucDon = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnDXuat.setBackground(new java.awt.Color(255, 255, 255));
        btnDXuat.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnDXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/dangxuat1.png"))); // NOI18N
        btnDXuat.setText("   Thoát   ");
        btnDXuat.setFocusable(false);
        btnDXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDXuat);
        jToolBar1.add(jSeparator1);

        btnPhieuDat.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnPhieuDat.setText("  Đơn đặt  ");
        btnPhieuDat.setFocusable(false);
        btnPhieuDat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhieuDat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPhieuDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuDatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPhieuDat);

        jSeparator3.setForeground(new java.awt.Color(204, 153, 255));
        jToolBar1.add(jSeparator3);

        btnTTB.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnTTB.setText("  Món ăn   ");
        btnTTB.setFocusable(false);
        btnTTB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTTB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTBActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTTB);
        jToolBar1.add(jSeparator5);

        btnHoaDon.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnHoaDon.setText("  Hóa đơn  ");
        btnHoaDon.setFocusable(false);
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHoaDon);
        jToolBar1.add(jSeparator6);

        btnTaiKhoan.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnTaiKhoan.setText(" Tài khoản ");
        btnTaiKhoan.setFocusable(false);
        btnTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTaiKhoan);
        jToolBar1.add(jSeparator8);

        btnNhanVien.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNhanVien.setText(" Nhân viên ");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jLabel2.setText("Quản lý đặt bàn nhà hàng");

        lblDongHo.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N
        lblDongHo.setText("hh:mm:aa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblDongHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Hệ thống");

        jMenuItem1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Accept.png"))); // NOI18N
        jMenuItem1.setText("Đăng nhập");
        jMenu1.add(jMenuItem1);

        mniDangxuat.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniDangxuat.setText("Đăng xuất");
        mniDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        mniDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangxuat);

        mniDoiMK.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        jMenu1.add(mniDoiMK);

        mniThoat.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniThoat.setText("Thoát");
        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        jMenu1.add(mniThoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mniPhieuDat.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniPhieuDat.setText("Đơn đặt");
        mniPhieuDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        mniPhieuDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPhieuDatActionPerformed(evt);
            }
        });
        jMenu2.add(mniPhieuDat);

        mniTrangThaiBan.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniTrangThaiBan.setText("Trạng thái bàn ");
        mniTrangThaiBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        mniTrangThaiBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrangThaiBanActionPerformed(evt);
            }
        });
        jMenu2.add(mniTrangThaiBan);

        mniHoaDon.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniHoaDon.setText("Hóa đơn ");
        mniHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Text.png"))); // NOI18N
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        jMenu2.add(mniHoaDon);

        mniTaikhoan.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniTaikhoan.setText("Tài khoản ");
        mniTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unknown person.png"))); // NOI18N
        mniTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTaikhoanActionPerformed(evt);
            }
        });
        jMenu2.add(mniTaikhoan);

        mniNhanVien.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mniNhanVien);

        mniThucDon.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        mniThucDon.setText("Thực đơn");
        mniThucDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Price list.png"))); // NOI18N
        mniThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThucDonActionPerformed(evt);
            }
        });
        jMenu2.add(mniThucDon);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
            .addComponent(lblbanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblbanner, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        new QuanLiNhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        new HoaDonKH().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        new Accout().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        new QuanLiNhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void mniTrangThaiBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrangThaiBanActionPerformed
        
    }//GEN-LAST:event_mniTrangThaiBanActionPerformed

    private void mniTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTaikhoanActionPerformed
        new Accout().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniTaikhoanActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        new HoaDonKH().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void btnTTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTBActionPerformed
        new QLMonAn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTTBActionPerformed

    private void btnPhieuDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuDatActionPerformed
        new PhieuDat_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPhieuDatActionPerformed

    private void mniDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangxuatActionPerformed
        ShareHelper.logoff();
        new Login_NV().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniDangxuatActionPerformed

    private void btnDXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDXuatActionPerformed
        ShareHelper.logoff();
        new Login_NV().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDXuatActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        if (DialogHelper.confirm(this, "Bạn có muốn thoát chương trình không?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniPhieuDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPhieuDatActionPerformed
        new PhieuDat_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniPhieuDatActionPerformed

    private void mniThucDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThucDonActionPerformed
        new QLLoaiMon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniThucDonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeNhaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeNhaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeNhaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeNhaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeNhaHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhieuDat;
    private javax.swing.JButton btnTTB;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblbanner;
    private javax.swing.JCheckBoxMenuItem mniDangxuat;
    private javax.swing.JCheckBoxMenuItem mniDoiMK;
    private javax.swing.JCheckBoxMenuItem mniHoaDon;
    private javax.swing.JCheckBoxMenuItem mniNhanVien;
    private javax.swing.JCheckBoxMenuItem mniPhieuDat;
    private javax.swing.JCheckBoxMenuItem mniTaikhoan;
    private javax.swing.JCheckBoxMenuItem mniThoat;
    private javax.swing.JCheckBoxMenuItem mniThucDon;
    private javax.swing.JCheckBoxMenuItem mniTrangThaiBan;
    // End of variables declaration//GEN-END:variables
}
