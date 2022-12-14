/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_QLPKThuCung;

import TienIch.MsgBox;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Dao.NhanVienDao;
import TienIch.ImageHelper;
import static TienIch.ValidateHelper.Black;
import static TienIch.ValidateHelper.Color;
import static TienIch.ValidateHelper.Gray;
import static TienIch.ValidateHelper.Italic;
import static TienIch.ValidateHelper.Plain;
import java.awt.HeadlessException;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public final class DangKyJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangKỵdialog
     *
     * @param parent
     * @param modal
     */
    public DangKyJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("ĐĂNG KÍ");
        this.init();

    }
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;database=QLPKTC_Nhom06";
    private static String username1 = "sa";
    private static String password = "songlong";

    Connection con1 = null;
    ResultSet rs1 = null;
    PreparedStatement pst = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttendn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdoDongY = new javax.swing.JRadioButton();
        btnDangKy = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        cboshowpass = new javax.swing.JCheckBox();
        rdoBacSi = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtSDT = new javax.swing.JTextField();
        lblQuayLai = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Mã Nhân Viên :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Mật khẩu :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Tên đăng nhập :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Số điện thoại :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Vai trò :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Đăng ký thông tin");

        rdoDongY.setText("Bạn có đồng ý với điều khoản ");
        rdoDongY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoDongYMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdoDongYMouseReleased(evt);
            }
        });
        rdoDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDongYActionPerformed(evt);
            }
        });
        rdoDongY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdoDongYKeyReleased(evt);
            }
        });

        btnDangKy.setBackground(new java.awt.Color(0, 102, 51));
        btnDangKy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(0, 102, 51));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        cboshowpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/Eye-2-icon.png"))); // NOI18N
        cboshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboshowpassActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoBacSi);
        rdoBacSi.setForeground(new java.awt.Color(0, 0, 204));
        rdoBacSi.setSelected(true);
        rdoBacSi.setText("Bác sĩ");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setForeground(new java.awt.Color(0, 204, 204));
        rdoNhanVien.setText("Nhân Viên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setText("Giới tính :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("Ngày sinh :");

        txtNgaySinh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNgaySinhFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNgaySinhFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("Địa chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        buttonGroup2.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        rdoNam.setForeground(new java.awt.Color(51, 51, 255));
        rdoNam.setText("Nam");

        buttonGroup2.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        rdoNu.setForeground(new java.awt.Color(255, 102, 102));
        rdoNu.setSelected(true);
        rdoNu.setText("Nữ");

        lblQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/quaylai.png"))); // NOI18N
        lblQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuayLaiMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("04/25/1999,(dd/MM/yyyy)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txttendn, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboshowpass))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdoDongY)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoBacSi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(rdoNhanVien))))
                    .addComponent(lblQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblQuayLai)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttendn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboshowpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoBacSi)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addComponent(rdoDongY)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(btnHuy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoDongYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDongYMouseClicked
        if (rdoDongY.isSelected()) {
            btnDangKy.setEnabled(true);
        } else {
            btnDangKy.setEnabled(false);
        }
    }//GEN-LAST:event_rdoDongYMouseClicked

    private void rdoDongYMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDongYMouseReleased

    }//GEN-LAST:event_rdoDongYMouseReleased

    private void rdoDongYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdoDongYKeyReleased

    }//GEN-LAST:event_rdoDongYKeyReleased

    private void cboshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboshowpassActionPerformed
        if (cboshowpass.isSelected()) {
            txtMatKhau.setEchoChar((char) 0);

        } else {
            txtMatKhau.setEchoChar('*');

        }
    }//GEN-LAST:event_cboshowpassActionPerformed
    NhanVienDao dao = new NhanVienDao();
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
if(check_Form()){
        this.DK();

    }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        if (MsgBox.confirm(this, "Bạn có muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    private void rdoDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDongYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoDongYActionPerformed

    private void lblQuayLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayLaiMouseClicked
        DangNhapJdialog DN = new DangNhapJdialog(null, rootPaneCheckingEnabled);
        this.setVisible(false);
        DN.setVisible(true);
    }//GEN-LAST:event_lblQuayLaiMouseClicked

    private void txtNgaySinhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgaySinhFocusGained
if (txtNgaySinh.getForeground().equals(Gray)) {
            Color(txtNgaySinh, "", Plain, Black);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhFocusGained

    private void txtNgaySinhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgaySinhFocusLost
        if (txtNgaySinh.getText().trim().isEmpty()) {
            Color(txtNgaySinh, "VD: 04/16/2000 ", Italic, Gray);
        }
    }//GEN-LAST:event_txtNgaySinhFocusLost

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
            java.util.logging.Logger.getLogger(DangKyJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DangKyJDialog dialog = new DangKyJDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnHuy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cboshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuayLai;
    private javax.swing.JRadioButton rdoBacSi;
    private javax.swing.JRadioButton rdoDongY;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txttendn;
    // End of variables declaration//GEN-END:variables

    void init() {

        this.setLocationRelativeTo(null);
        this.setIconImage(ImageHelper.getAppIcon());
        this.setTitle("ĐĂNG Ký");
        btnDangKy.setEnabled(false);

    }

    public boolean DK() {
        //Khai bao bien int
        int DK = JOptionPane.showConfirmDialog(this, "Bạn Muốn đăng ký tài khoản", "Confirm", JOptionPane.YES_NO_OPTION);
        if (DK != JOptionPane.YES_OPTION) {
            return false;
        }

        try {

            Class.forName(driver);
            Connection con = DriverManager.getConnection(dburl, username1, password);
            String sql = "insert into NhanVien (MaNV,TenNV,Dienthoai,Diachi,Email,Gioitinh,Ngaysinh,Matkhau,Vaitro) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtMaNV.getText());
            ps.setString(2, txttendn.getText());
            ps.setString(3, txtSDT.getText());
            ps.setString(4, txtDiaChi.getText());
            ps.setString(5, txtEmail.getText());
            boolean GioiTinh;
            if (rdoNam.isSelected()) {
                GioiTinh = true;
            } else {
                GioiTinh = false;
            }
            ps.setBoolean(6, GioiTinh);
         
            ps.setString(7, txtNgaySinh.getText());
            ps.setString(8, txtMatKhau.getText());
            boolean VaiTro;
            if (rdoBacSi.isSelected()) {
                VaiTro = true;
            } else {
                VaiTro = false;
            }
            ps.setBoolean(9, VaiTro);
            int U = ps.executeUpdate();//Update du lieu len

            if (txtMaNV.getText().equals("") | txttendn.getText().equals("")
                    | txtMatKhau.getText().equals("") | txtSDT.getText().equals("") | txtNgaySinh.getText().equals("") | txtEmail.getText().equals("") | txtDiaChi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng đièn đày đủ thông tin");
            } else if (U != 0) {
                txtMaNV.setBackground(Color.green);
                txttendn.setBackground(Color.green);
                txtMatKhau.setBackground(Color.green);
                txtSDT.setBackground(Color.green);
                txtNgaySinh.setBackground(Color.green);
                txtEmail.setBackground(Color.green);
                txtDiaChi.setBackground(Color.green);

                JOptionPane.showMessageDialog(this, "Dang Ky Thanh Cong !");
                //  this.dispose();// tắt form

            } else {
                JOptionPane.showMessageDialog(this, "Dang Ky That BAi !");
            }
            con.close();
            ps.close();

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, " xin mời bạn nhập lại", "ERRO !", JOptionPane.ERROR_MESSAGE);
        }

        return true;
    }

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean verifyEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_PATTERN);
    }
    boolean flag = false;
    String err = "";

    boolean check_Form() {
        if (txtMaNV.getText().equals("")) {
            txtMaNV.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập mã nhân viên !");
            txtMaNV.requestFocus();
            return false;
        } else {
            txtMaNV.setBackground(Color.WHITE);
        }
        if (txtMaNV.getText().length() > 0 && txtMaNV.getText().length() < 5) {
            MsgBox.alert(this, "Mã Nhân viên phải nhập ít nhất 5 ký tự");
            txtMaNV.setBackground(Color.yellow);
            txtMaNV.setForeground(Color.BLUE);
            return false;
        } else {
            txtMaNV.setBackground(Color.white);
        }
        if (txttendn.getText().equals("")) {
            txttendn.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Tên nhân viên !");
            txttendn.requestFocus();
            return false;
        } else {
            txttendn.setBackground(Color.WHITE);
        }
        if (txtEmail.getText().equals("")) {
            txtEmail.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Email!");
            txtEmail.requestFocus();
            return false;
        } else {
            txtEmail.setBackground(Color.WHITE);
        }
        if (verifyEmail(txtEmail.getText()) == false) {
            MsgBox.alert(this, "Định dạng email bạn nhập không chính xác");
            txtEmail.setForeground(Color.BLUE);
            txtEmail.setBackground(Color.yellow);
            return false;
        } else {
            txtEmail.setBackground(Color.white);
        }
        if (txtDiaChi.getText().equals("")) {
            txtDiaChi.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Địa chỉ!");
            txtDiaChi.requestFocus();
            return false;
        } else {
            txtDiaChi.setBackground(Color.WHITE);
        }
        if (txtSDT.getText().equals("")) {
            txtSDT.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Số điện thoại!");
            txtSDT.requestFocus();
            return false;
        } else {
            txtSDT.setBackground(Color.WHITE);
        }
        if (!txtSDT.getText().matches("[0-9]+")) {
            MsgBox.alert(this, "Số điện thoại chỉ nhập số");
            return false;
        }
        if (txtSDT.getText().length() < 10 || txtSDT.getText().length() > 12) {
            MsgBox.alert(this, "Số điện thoại phải nhập đủ 10 hoặc 11 số !");
            txtSDT.setBackground(Color.YELLOW);
            txtSDT.setForeground(Color.BLUE);
            return false;
        } else {
            txtSDT.setBackground(Color.white);
        }

        if (txtNgaySinh.getText().equals("")) {
            txtNgaySinh.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Ngày sinh!");
            txtNgaySinh.requestFocus();
            return false;
        } else {
            txtNgaySinh.setBackground(Color.WHITE);
        }
        if ((txtNgaySinh.getText().length() != 10)) {
            txtNgaySinh.requestFocus();
            txtNgaySinh.setBackground(Color.yellow);
            txtNgaySinh.setForeground(Color.BLUE);
            MsgBox.alert(this, "Định dạng ngày nhập vào chưa chính xác!");
            return false;
        } else {
            txtNgaySinh.setBackground(Color.white);
        }
        if (txtMatKhau.getText().equals("")) {
            txtMatKhau.setBackground(Color.YELLOW);
            MsgBox.alert(this, "Bạn vui lòng nhập Mạt khẩu!");
            txtMatKhau.requestFocus();
            return false;
        } else {
            txtMatKhau.setBackground(Color.WHITE);
        }

        return true;
    }
}
