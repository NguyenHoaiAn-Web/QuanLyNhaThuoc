/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author 44ong
 */
public class DangNhapForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public DangNhapForm() {
    	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    class JPanelGradient extends JPanel{
        

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator2 = new javax.swing.JSeparator();
        container_panel = new javax.swing.JPanel();
        panel_left = new javax.swing.JPanel();
        panel_logo = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        panel_slogan = new javax.swing.JPanel();
        label_slogan = new javax.swing.JLabel();
        panel_right = new javax.swing.JPanel();
        panel_logo_bacsi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_form_dangnhap = new javax.swing.JPanel();
        field_username = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        button_dangnhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container_panel.setLayout(new java.awt.GridLayout(1, 2));

        panel_left.setBackground(new java.awt.Color(4, 71, 126));
        panel_left.setLayout(new java.awt.GridLayout(2, 1));

        panel_logo.setBackground(new java.awt.Color(4, 71, 126));
        panel_logo.setLayout(new java.awt.BorderLayout());

        label_logo.setBackground(new java.awt.Color(4, 71, 126));
        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_pharmacy-removebg-preview.png"))); // NOI18N
        panel_logo.add(label_logo, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_logo);

        panel_slogan.setBackground(new java.awt.Color(4, 71, 126));
        panel_slogan.setLayout(new java.awt.BorderLayout());

        label_slogan.setBackground(new java.awt.Color(4, 71, 126));
        label_slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_slogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mangsuckhoetoichoban1_new.png"))); // NOI18N
        panel_slogan.add(label_slogan, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_slogan);

        container_panel.add(panel_left);

        panel_right.setLayout(new java.awt.GridLayout(2, 1));

        panel_logo_bacsi.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/removed-background (1) (1).png"))); // NOI18N
        panel_logo_bacsi.add(jLabel1, java.awt.BorderLayout.CENTER);

        panel_right.add(panel_logo_bacsi);

        panel_form_dangnhap.setLayout(new java.awt.GridBagLayout());

        field_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        field_username.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Đăng Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        field_username.setPreferredSize(new java.awt.Dimension(300, 50));
        field_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_usernameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel_form_dangnhap.add(field_username, gridBagConstraints);

        field_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        field_password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mật Khẩu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        field_password.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel_form_dangnhap.add(field_password, gridBagConstraints);

        button_dangnhap.setBackground(new java.awt.Color(4, 71, 126));
        button_dangnhap.setForeground(new java.awt.Color(255, 255, 255));
        button_dangnhap.setText("Đăng Nhập");
        button_dangnhap.setPreferredSize(new java.awt.Dimension(150, 50));
        button_dangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_dangnhapMouseClicked(evt);
            }
        });
        button_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dangnhapActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel_form_dangnhap.add(button_dangnhap, gridBagConstraints);

        panel_right.add(panel_form_dangnhap);

        container_panel.add(panel_right);

        getContentPane().add(container_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void field_usernameActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void button_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void button_dangnhapMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
    	if("admin".equals(field_username.getText()) && "1234".equals(new String(field_password.getPassword()))) {
    		this.setVisible(false);

    		TongQuanGUI tongquangui = new TongQuanGUI();
    		tongquangui.setVisible(true);
    	}
    }                                            

    
        
    
    /**
     * @param args the command line arguments
     */
    
    
     
   /* public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhapForm().setVisible(true);
            }
        });
   
}*/

    // Variables declaration - do not modify                     
    private javax.swing.JButton button_dangnhap;
    private javax.swing.JPanel container_panel;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_slogan;
    private javax.swing.JPanel panel_form_dangnhap;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPanel panel_logo_bacsi;
    private javax.swing.JPanel panel_right;
    private javax.swing.JPanel panel_slogan;
    // End of variables declaration                   
}

