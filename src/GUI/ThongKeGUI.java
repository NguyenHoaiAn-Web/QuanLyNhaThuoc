/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author 44ong
 */
public class ThongKeGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public ThongKeGUI() {
    	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
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

        panel_header = new javax.swing.JPanel();
        icon_close_fullscreen = new javax.swing.JPanel();
        panel_fullscreen = new javax.swing.JPanel();
        label_fullscreen = new javax.swing.JLabel();
        panel_close = new javax.swing.JPanel();
        label_close = new javax.swing.JLabel();
        panel_main = new javax.swing.JPanel();
        panel_title = new javax.swing.JPanel();
        label_quanlyhoadon = new javax.swing.JLabel();
        panel_thongtin = new javax.swing.JPanel();
        panel_hoadon = new javax.swing.JPanel();
        panel_button_loaithongke = new javax.swing.JPanel();
        panel_contain_button = new javax.swing.JPanel();
        button_thongkedoanhthu = new javax.swing.JButton();
        button_thongkethuoc = new javax.swing.JButton();
        button_thoat = new javax.swing.JButton();
        panel_bieudo = new javax.swing.JPanel();
        panel_bieudo_top = new javax.swing.JPanel();
        panel_bieudo_botton = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_header.setBackground(new java.awt.Color(204, 204, 204));
        panel_header.setPreferredSize(new java.awt.Dimension(900, 30));
        panel_header.setLayout(new java.awt.BorderLayout());

        icon_close_fullscreen.setBackground(new java.awt.Color(204, 204, 204));
        icon_close_fullscreen.setPreferredSize(new java.awt.Dimension(60, 30));
        icon_close_fullscreen.setLayout(new javax.swing.BoxLayout(icon_close_fullscreen, javax.swing.BoxLayout.X_AXIS));

        panel_fullscreen.setBackground(new java.awt.Color(204, 204, 204));
        panel_fullscreen.setPreferredSize(new java.awt.Dimension(30, 30));

        label_fullscreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fullscreen-removebg-preview (1).png"))); // NOI18N
        label_fullscreen.setText("jLabel2");
        label_fullscreen.setPreferredSize(new java.awt.Dimension(30, 30));
        label_fullscreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fullscreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_fullscreenLayout = new javax.swing.GroupLayout(panel_fullscreen);
        panel_fullscreen.setLayout(panel_fullscreenLayout);
        panel_fullscreenLayout.setHorizontalGroup(
            panel_fullscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fullscreenLayout.createSequentialGroup()
                .addComponent(label_fullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fullscreenLayout.setVerticalGroup(
            panel_fullscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fullscreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_fullscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        icon_close_fullscreen.add(panel_fullscreen);

        panel_close.setBackground(new java.awt.Color(204, 204, 204));
        panel_close.setPreferredSize(new java.awt.Dimension(30, 30));

        label_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clsoe-removebg-preview (1).png"))); // NOI18N
        label_close.setText("jLabel1");
        label_close.setPreferredSize(new java.awt.Dimension(30, 30));
        label_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_closeLayout = new javax.swing.GroupLayout(panel_close);
        panel_close.setLayout(panel_closeLayout);
        panel_closeLayout.setHorizontalGroup(
            panel_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_closeLayout.setVerticalGroup(
            panel_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        icon_close_fullscreen.add(panel_close);

        panel_header.add(icon_close_fullscreen, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panel_header, java.awt.BorderLayout.PAGE_START);

        panel_main.setLayout(new java.awt.BorderLayout());

        panel_title.setBackground(new java.awt.Color(4, 71, 126));
        panel_title.setPreferredSize(new java.awt.Dimension(100, 100));
        panel_title.setLayout(new java.awt.BorderLayout());

        label_quanlyhoadon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_quanlyhoadon.setForeground(new java.awt.Color(255, 255, 255));
        label_quanlyhoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_quanlyhoadon.setText("Thống Kê");
        panel_title.add(label_quanlyhoadon, java.awt.BorderLayout.CENTER);

        panel_main.add(panel_title, java.awt.BorderLayout.PAGE_START);

        panel_thongtin.setLayout(new java.awt.BorderLayout());

        panel_hoadon.setLayout(new java.awt.BorderLayout());

        panel_button_loaithongke.setBackground(new java.awt.Color(255, 255, 255));
        panel_button_loaithongke.setPreferredSize(new java.awt.Dimension(900, 50));
        panel_button_loaithongke.setLayout(new java.awt.BorderLayout());

        panel_contain_button.setBackground(new java.awt.Color(255, 255, 255));
        panel_contain_button.setPreferredSize(new java.awt.Dimension(420, 50));
        panel_contain_button.setLayout(new java.awt.GridBagLayout());

        button_thongkedoanhthu.setText("Doanh Thu");
        button_thongkedoanhthu.setPreferredSize(new java.awt.Dimension(120, 26));
        button_thongkedoanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_thongkedoanhthuMouseClicked(evt);
            }
        });
        button_thongkedoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thongkedoanhthuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_thongkedoanhthu, gridBagConstraints);

        button_thongkethuoc.setText("Thuốc");
        button_thongkethuoc.setPreferredSize(new java.awt.Dimension(120, 26));
        button_thongkethuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_thongkethuocMouseClicked(evt);
            }
        });
        button_thongkethuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thongkethuocActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_thongkethuoc, gridBagConstraints);

        button_thoat.setText("Thoát");
        button_thoat.setPreferredSize(new java.awt.Dimension(120, 26));
        button_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_thoatMouseClicked(evt);
            }
        });
        button_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thoatActionPerformed(evt);
            }
        });
        panel_contain_button.add(button_thoat, new java.awt.GridBagConstraints());

        panel_button_loaithongke.add(panel_contain_button, java.awt.BorderLayout.LINE_END);

        panel_hoadon.add(panel_button_loaithongke, java.awt.BorderLayout.PAGE_START);

        panel_bieudo.setLayout(new java.awt.GridLayout(2, 1));

        javax.swing.GroupLayout panel_bieudo_topLayout = new javax.swing.GroupLayout(panel_bieudo_top);
        panel_bieudo_top.setLayout(panel_bieudo_topLayout);
        panel_bieudo_topLayout.setHorizontalGroup(
            panel_bieudo_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        panel_bieudo_topLayout.setVerticalGroup(
            panel_bieudo_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panel_bieudo.add(panel_bieudo_top);

        panel_bieudo_botton.setLayout(new java.awt.BorderLayout());
        panel_bieudo.add(panel_bieudo_botton);

        panel_hoadon.add(panel_bieudo, java.awt.BorderLayout.CENTER);

        panel_thongtin.add(panel_hoadon, java.awt.BorderLayout.CENTER);

        panel_main.add(panel_thongtin, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_main, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    // chinh sua nut close
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
        
    }
    private void label_closeMouseEntered(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        changecolor(panel_close, new Color(245, 66, 105));
    }                                        

    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void label_closeMouseExited(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        changecolor(panel_close, new Color(204,204,204));
    }                                       
    // ket thuc chinh sua nut close
    
    private void label_fullscreenMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        if(this.getExtendedState()!=ThongKeGUI.MAXIMIZED_BOTH){
            this.setExtendedState(ThongKeGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(ThongKeGUI.NORMAL);
        }  
    }                                             

    private void button_thongkedoanhthuActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void button_thongkedoanhthuMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        // TODO add your handling code here:
    	this.setVisible(false);
    	ThongKeDoanhThuGUI thongkedoanhthugui = new ThongKeDoanhThuGUI();
    	thongkedoanhthugui.setVisible(true);
    }                                                   

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void button_thoatMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    	this.setVisible(false);
    	TongQuanGUI tongquangui = new TongQuanGUI();
    	tongquangui.setVisible(true);
    	}                                         

    private void button_thongkethuocActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    	this.setVisible(false);
    	ThongKeThuocGUI thonhkethuochuocgui = new ThongKeThuocGUI();
    	thonhkethuochuocgui.setVisible(true);
    }                                                   

    private void button_thongkethuocMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                
    
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
            java.util.logging.Logger.getLogger(ThongKeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ThongKeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton button_thoat;
    private javax.swing.JButton button_thongkedoanhthu;
    private javax.swing.JButton button_thongkethuoc;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_fullscreen;
    private javax.swing.JLabel label_quanlyhoadon;
    private javax.swing.JPanel panel_bieudo;
    private javax.swing.JPanel panel_bieudo_botton;
    private javax.swing.JPanel panel_bieudo_top;
    private javax.swing.JPanel panel_button_loaithongke;
    private javax.swing.JPanel panel_close;
    private javax.swing.JPanel panel_contain_button;
    private javax.swing.JPanel panel_fullscreen;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_hoadon;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_thongtin;
    private javax.swing.JPanel panel_title;
    // End of variables declaration                   
}
