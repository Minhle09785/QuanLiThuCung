/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_QLPKThuCung;

import TienIch.ImageHelper;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public final class ChaoJdialog extends javax.swing.JDialog {

    /**
     * Creates new form ChaoJdialog
     * @param parent
     * @param modal
     */
    public ChaoJdialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("CHÀO KHÁCH HÀNG");
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbln = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        lbltext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kính chào quý khách !");
        setUndecorated(true);

        lbln.setBackground(new java.awt.Color(255, 255, 255));
        lbln.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        lbllogo.setBackground(new java.awt.Color(255, 255, 255));
        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anh/Chao.png"))); // NOI18N
        lbllogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbllogo.setAutoscrolls(true);
        lbllogo.setDoubleBuffered(true);
        lbllogo.setFocusCycleRoot(true);
        lbllogo.setFocusable(false);
        lbllogo.setMaximumSize(new java.awt.Dimension(620, 230));
        lbllogo.setMinimumSize(new java.awt.Dimension(620, 230));
        lbllogo.setNextFocusableComponent(lbllogo);
        lbllogo.setOpaque(true);

        progressBar.setStringPainted(true);

        javax.swing.GroupLayout lblnLayout = new javax.swing.GroupLayout(lbln);
        lbln.setLayout(lblnLayout);
        lblnLayout.setHorizontalGroup(
            lblnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lblnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltext, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblnLayout.setVerticalGroup(
            lblnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblnLayout.createSequentialGroup()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChaoJdialog dialog = new ChaoJdialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel lbln;
    private javax.swing.JLabel lbltext;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

  public void init(){
       this.setLocationRelativeTo(null);
//        this.setIconImage(XImage.getAppIcon());
 
      new Timer(20, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           int value = progressBar.getValue();
              if (value< progressBar.getMaximum()){
                 progressBar.setValue(value + 1);
                 lbltext.setForeground(Color.black);
               if(value<30){
                        lbltext.setText("Hệ thống đang khởi động..!");
                    }else{
                 
                        lbltext.setText("Hệ thống đang khởi động....!");
                        lbltext.setText("Hệ thống đang khởi động......!");
                    }if(value>70){
                        lbltext.setText("Hệ thống đang khởi động..........!");
                    //    lbllogo.setIcon(new ImageIcon("src\\Image\\icon\\loadDing.gif"));
                     //   lbllogo.setIcon((Icon) ImageHelper.getAppIcon());
                      
                         //lbllogo.setToolTipText("src\\Image\\icon\\loadDing.gif");
                    }
                    if(value>90){
                      
                     //  lbltext.setFont(new Font("Sẵn sàng để bắt đầu! wellcom", Font.ITALIC, 12));
                        lbltext.setText("Sẵn sàng để bắt đầu! wellcom");
                     
                    }
               
              } 
              else{
                ChaoJdialog.this.dispose();
                }
        }
      }).start(); 
      
}
}