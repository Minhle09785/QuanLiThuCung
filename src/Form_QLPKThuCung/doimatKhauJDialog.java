/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_QLPKThuCung;

import Dao.NhanVienDao;
import TienIch.Auth;
import TienIch.MsgBox;
import TienIch.ImageHelper;
import java.awt.Color;


public class doimatKhauJDialog extends javax.swing.JDialog {

    /**
     * Creates new form doimatKhauJDialog
     * @param parent
     * @param modal
     */
    public doimatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
    }
public void init(){
    
      this.setIconImage(ImageHelper.getAppIcon());
      this.setLocationRelativeTo(null);
      txtUser.setText(Auth.user.getMaNV());
      txtUser.setEditable(false);
      txtUser.setBackground(new java.awt.Color(218, 237, 234));
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        llblOldPass = new javax.swing.JLabel();
        lblNewPass = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JPasswordField();
        txtNewpass = new javax.swing.JPasswordField();
        txtConfirmpass = new javax.swing.JPasswordField();
        btnchange = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        cboShowpas = new javax.swing.JCheckBox();

        jLabel5.setText("Xác nhận mật khẩu mới:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Đổi mật khẩu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đổi mật khẩu ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\Office-Customer-Male-Light-icon.png")); // NOI18N
        lblUser.setText("ID :");

        txtUser.setPreferredSize(new java.awt.Dimension(7, 25));

        llblOldPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        llblOldPass.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\Security-Password-2-icon.png")); // NOI18N
        llblOldPass.setText("Mật Khẩu cũ :");

        lblNewPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewPass.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\Security-Password-1-icon.png")); // NOI18N
        lblNewPass.setText("Mật khẩu mới");

        lblConfirmPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConfirmPass.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\Password-Field-icon.png")); // NOI18N
        lblConfirmPass.setText("Nhập lại mật khẩu");

        txtOldPass.setPreferredSize(new java.awt.Dimension(7, 25));

        txtNewpass.setPreferredSize(new java.awt.Dimension(7, 25));

        txtConfirmpass.setPreferredSize(new java.awt.Dimension(7, 25));

        btnchange.setBackground(new java.awt.Color(255, 204, 102));
        btnchange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnchange.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\add-icon.png")); // NOI18N
        btnchange.setText("Chọn");
        btnchange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangeActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 204, 102));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(51, 51, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon("D:\\HK4\\DUAM(DA1)\\PS16989_TruongThanhThang_DuAnMau\\ThanhThang_Ps16989\\src\\Image_icon\\Actions-process-stop-icon (1).png")); // NOI18N
        btnThoat.setText("Hủy");
        btnThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        cboShowpas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cboShowpas.setForeground(new java.awt.Color(0, 153, 102));
        cboShowpas.setText("Show Password");
        cboShowpas.setOpaque(false);
        cboShowpas.setRequestFocusEnabled(false);
        cboShowpas.setRolloverEnabled(false);
        cboShowpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboShowpasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnchange, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(llblOldPass)
                            .addComponent(lblNewPass)
                            .addComponent(lblConfirmPass))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOldPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNewpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConfirmpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(cboShowpas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llblOldPass))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewPass))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboShowpas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangeActionPerformed
      if(check()){
              this.doiMatKhau();
      }
    }//GEN-LAST:event_btnchangeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.thoat();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cboShowpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboShowpasActionPerformed
      if (cboShowpas.isSelected()) {
          txtOldPass.setEchoChar((char) 0);
            txtNewpass.setEchoChar((char) 0);
            txtConfirmpass.setEchoChar((char) 0);
        } else {
            txtOldPass.setEchoChar('*');
            txtNewpass.setEchoChar('*');
            txtConfirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_cboShowpasActionPerformed

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
            java.util.logging.Logger.getLogger(doimatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doimatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doimatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doimatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                doimatKhauJDialog dialog = new doimatKhauJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnchange;
    private javax.swing.JCheckBox cboShowpas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel llblOldPass;
    private javax.swing.JPasswordField txtConfirmpass;
    private javax.swing.JPasswordField txtNewpass;
    private javax.swing.JPasswordField txtOldPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables



    NhanVienDao dao = new NhanVienDao();
    
    private void doiMatKhau(){
        String manv= txtUser.getText();
        String matKhau = new String(txtOldPass.getPassword());
        String matKhauMoi = new String(txtNewpass.getPassword());
        String matKhauMoi2 = new String(txtConfirmpass.getPassword());
        
        if(!manv.equals(Auth.user.getMaNV())){
          
            MsgBox.alert(this, "Sai ID đăng nhập!");
        }
        else if(!matKhau.equals(Auth.user.getMatKhau())){
            MsgBox.alert(this, "Sai mật khẩu!");
        }
        else if(!matKhauMoi.equals(matKhauMoi2)){
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        }
        else{
            Auth.user.setMatKhau(matKhauMoi);
            dao.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
        }
    }

    private void thoat() {
        this.dispose();
    }
   private boolean check(){
        if (txtUser.getText().equals("")) {
            txtUser.setBackground(Color.YELLOW);
            txtUser.requestFocus();
            MsgBox.alert(this, "Vui lòng nhập Tên đăng nhâp !");
            return false;
        }
       if (txtOldPass.getText().equals("")) {
            txtOldPass.setBackground(Color.YELLOW);
            txtOldPass.requestFocus();
            MsgBox.alert(this, "Vui lòng nhập mật khẩu cũ của bạn !");
            return false;
        }
         if (txtNewpass.getText().equals("")) {
            txtNewpass.setBackground(Color.YELLOW);
            txtNewpass.requestFocus();
            MsgBox.alert(this, "Vui lòng nhập mật khẩu mớicủa bạn !");
            return false;
        }
         
         if(txtConfirmpass.getText().equals("")){
           MsgBox.alert(this, "Vui lòng nhập lại confirmpass của bạn !");
             txtConfirmpass.requestFocus();
            txtConfirmpass.setBackground(Color.YELLOW);
            return false;
         }

        return true;
        
    }

}
