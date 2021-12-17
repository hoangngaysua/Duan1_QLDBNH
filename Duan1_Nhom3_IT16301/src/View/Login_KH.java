/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.KhachHangDAO;
import DAO.TaiKhoanKHDAO;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Helper.utilityHelper;
import Model.KhachHang;
import Model.TaiKhoanKH;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class Login_KH extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_KH() {
        initComponents();
        txt_Password.setEchoChar((char) 0);
        txt_Username.setForeground(Color.GRAY);
        txt_Password.setForeground(Color.GRAY);
        ImageIcon logo = new ImageIcon("src/Logo/LogoNH.png");
        lb_Logo.setIcon(logo);
        setLocationRelativeTo(null);
    }
    TaiKhoanKHDAO tkkh = new TaiKhoanKHDAO();
    KhachHangDAO daoKH = new KhachHangDAO();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void Login() {
        String us = txt_Username.getText();
        String ps = new String(txt_Password.getPassword());
        try {
            TaiKhoanKH tk = tkkh.findById(us);
            KhachHang khachHang = daoKH.findByUser(us); 
            
            if (tk != null) {
                String ps1 = tk.getPass();
                if (ps.equals(ps1)) {
                    ShareHelper.USERkh = khachHang;
                    DialogHelper.alert(this, "Đăng nhập thành công !");
                    new TrangChu().setVisible(true);
                    this.dispose();
                } else {
                    DialogHelper.alert(this, "Mật khẩu không chính xác!");
                }
            } else {
                DialogHelper.alert(this, "Không tồn tại tài khoản này!\nVui lòng đăng ký tài khoản.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        cbx_Hienthi = new javax.swing.JCheckBox();
        btn_Dangnhap = new javax.swing.JButton();
        txt_Quenmk = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_DangKi = new javax.swing.JLabel();
        lb_Logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Username.setText("Tài Khoản");
        txt_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_UsernameFocusGained(evt);
            }
        });

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Password.setText("Mật Khẩu");
        txt_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PasswordFocusGained(evt);
            }
        });

        cbx_Hienthi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbx_Hienthi.setText("Hiện mật khẩu");
        cbx_Hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_HienthiActionPerformed(evt);
            }
        });

        btn_Dangnhap.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Dangnhap.setText("Đăng nhập");
        btn_Dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangnhapActionPerformed(evt);
            }
        });

        txt_Quenmk.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt_Quenmk.setText("Quên mật khẩu?");
        txt_Quenmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_QuenmkMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("hoặc");

        txt_DangKi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt_DangKi.setText("Đăng Kí");
        txt_DangKi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DangKiMouseClicked(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        lblTitle.setText("Đăng nhập");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbx_Hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_DangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Quenmk, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_Username)
                            .addComponent(txt_Password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblTitle)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_Hienthi)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Quenmk, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_DangKi)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UsernameFocusGained
        txt_Username.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt_Username.getText().equals("Tài Khoản")) {
                    txt_Username.setText("");
                    txt_Username.setForeground(Color.BLACK);
                } else {
                    txt_Username.selectAll();
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txt_Username.getText().equals("")) {
                    txt_Username.setText("Tài Khoản");
                    txt_Username.setForeground(Color.GRAY);
                }
            }
        })
        ;

    }//GEN-LAST:event_txt_UsernameFocusGained

    private void txt_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PasswordFocusGained
        txt_Password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt_Password.getText().equals("Mật Khẩu")) {
                    txt_Password.setEchoChar('*');
                    txt_Password.setText("");
                    txt_Password.setForeground(Color.BLACK);   
                } else{
                    txt_Password.selectAll();
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txt_Password.getText().equals("")) {
                    txt_Password.setText("Mật Khẩu");
                    txt_Password.setEchoChar((char) 0);
                    txt_Password.setForeground(Color.GRAY);
                }
            }
        });

    }//GEN-LAST:event_txt_PasswordFocusGained

    private void cbx_HienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_HienthiActionPerformed
        if (cbx_Hienthi.isSelected()) {
            txt_Password.setEchoChar((char) 0);
        } else {
            txt_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_cbx_HienthiActionPerformed

    private void btn_DangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangnhapActionPerformed
        if (utilityHelper.checkNullTextDN(txt_Username) && 
                utilityHelper.checkNullTextDN(txt_Password)) {
            Login();
        }
    }//GEN-LAST:event_btn_DangnhapActionPerformed

    private void txt_QuenmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_QuenmkMouseClicked
        new QuenMatKhau().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt_QuenmkMouseClicked

    private void txt_DangKiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DangKiMouseClicked
        new DangKy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt_DangKiMouseClicked

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
            java.util.logging.Logger.getLogger(Login_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_KH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dangnhap;
    private javax.swing.JCheckBox cbx_Hienthi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel txt_DangKi;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JLabel txt_Quenmk;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
