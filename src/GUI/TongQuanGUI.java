/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import GUI.TestChart;
/**
 *
 * @author 44ong
 */
public class TongQuanGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public TongQuanGUI() {
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

        panel_left = new javax.swing.JPanel();
        panel_logo = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        panel_nhapthuoc = new javax.swing.JPanel();
        label_nhapthuoc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_capnhat = new javax.swing.JPanel();
        label_capnhat = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panel_hoadon = new javax.swing.JPanel();
        label_hoadon = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        panel_lendonthuoc = new javax.swing.JPanel();
        label_lendonthuoc = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        panel_doanhthu = new javax.swing.JPanel();
        label_doanhthu = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panel_tongquan = new javax.swing.JPanel();
        label_tongquan = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panel_dangxuat = new javax.swing.JPanel();
        label_dangxuat = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panel_header = new javax.swing.JPanel();
        icon_close_fullscreen = new javax.swing.JPanel();
        panel_fullscreen = new javax.swing.JPanel();
        label_fullscreen = new javax.swing.JLabel();
        panel_close = new javax.swing.JPanel();
        label_close = new javax.swing.JLabel();
        panel_right = new javax.swing.JPanel();
        panel_thongso = new javax.swing.JPanel();
        panel_tongsanpham = new javax.swing.JPanel();
        tongsanpham = new javax.swing.JLabel();
        label_tongsanpham = new javax.swing.JLabel();
        panel_sanpham_sap_hethan = new javax.swing.JPanel();
        sanpham_saphethan = new javax.swing.JLabel();
        label_saphethan = new javax.swing.JLabel();
        panel_doanhthu_homnay = new javax.swing.JPanel();
        doanhthu_homnay = new javax.swing.JLabel();
        label_doanhthu_homnay = new javax.swing.JLabel();
        panel_chart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_left.setBackground(new java.awt.Color(4, 71, 126));
        panel_left.setPreferredSize(new java.awt.Dimension(200, 470));
        panel_left.setLayout(new java.awt.GridLayout(8, 1));

        panel_logo.setBackground(new java.awt.Color(4, 71, 126));
        panel_logo.setLayout(new java.awt.BorderLayout());

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logobenvien_resize.png"))); // NOI18N
        label_logo.setText("jLabel1");
        label_logo.setPreferredSize(new java.awt.Dimension(70, 62));
        panel_logo.add(label_logo, java.awt.BorderLayout.LINE_START);

        panel_left.add(panel_logo);

        panel_nhapthuoc.setBackground(new java.awt.Color(4, 71, 126));
        panel_nhapthuoc.setLayout(new java.awt.GridLayout(2, 1));

        label_nhapthuoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_nhapthuoc.setForeground(new java.awt.Color(255, 255, 255));
        label_nhapthuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nhapthuoc.setText("Nhập Thuốc");
        label_nhapthuoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        label_nhapthuoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        label_nhapthuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_nhapthuocMouseClicked(evt);
            }
        });
        panel_nhapthuoc.add(label_nhapthuoc);

        jSeparator1.setPreferredSize(new java.awt.Dimension(40, 10));
        panel_nhapthuoc.add(jSeparator1);

        panel_left.add(panel_nhapthuoc);

        panel_capnhat.setBackground(new java.awt.Color(4, 71, 126));
        panel_capnhat.setLayout(new java.awt.GridLayout(2, 1));

        label_capnhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_capnhat.setForeground(new java.awt.Color(255, 255, 255));
        label_capnhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_capnhat.setText("Cập Nhật");
        label_capnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_capnhatMouseClicked(evt);
            }
        });
        panel_capnhat.add(label_capnhat);
        panel_capnhat.add(jSeparator2);

        panel_left.add(panel_capnhat);

        panel_hoadon.setBackground(new java.awt.Color(4, 71, 126));
        panel_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        panel_hoadon.setLayout(new java.awt.GridLayout(2, 1));

        label_hoadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        label_hoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hoadon.setText("Hóa Đơn");
        label_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_hoadonMouseClicked(evt);
            }
        });
        panel_hoadon.add(label_hoadon);
        panel_hoadon.add(jSeparator4);

        panel_left.add(panel_hoadon);

        panel_lendonthuoc.setBackground(new java.awt.Color(4, 71, 126));
        panel_lendonthuoc.setLayout(new java.awt.GridLayout(2, 1));

        label_lendonthuoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_lendonthuoc.setForeground(new java.awt.Color(255, 255, 255));
        label_lendonthuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_lendonthuoc.setText("Lên Đơn Thuốc");
        label_lendonthuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_lendonthuocMouseClicked(evt);
            }
        });
        panel_lendonthuoc.add(label_lendonthuoc);
        panel_lendonthuoc.add(jSeparator5);

        panel_left.add(panel_lendonthuoc);

        panel_doanhthu.setBackground(new java.awt.Color(4, 71, 126));
        panel_doanhthu.setLayout(new java.awt.GridLayout(2, 1));

        label_doanhthu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_doanhthu.setForeground(new java.awt.Color(255, 255, 255));
        label_doanhthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_doanhthu.setText("Doanh Thu");
        label_doanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_doanhthuMouseClicked(evt);
            }
        });
        panel_doanhthu.add(label_doanhthu);
        panel_doanhthu.add(jSeparator6);

        panel_left.add(panel_doanhthu);

        panel_tongquan.setBackground(new java.awt.Color(4, 71, 126));
        panel_tongquan.setLayout(new java.awt.GridLayout(2, 1));

        label_tongquan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tongquan.setForeground(new java.awt.Color(255, 255, 255));
        label_tongquan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tongquan.setText("Tổng Quan");
        label_tongquan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_tongquanMouseClicked(evt);
            }
        });
        panel_tongquan.add(label_tongquan);
        panel_tongquan.add(jSeparator7);

        panel_left.add(panel_tongquan);

        panel_dangxuat.setBackground(new java.awt.Color(4, 71, 126));
        panel_dangxuat.setLayout(new java.awt.GridLayout(2, 1));

        label_dangxuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_dangxuat.setForeground(new java.awt.Color(255, 255, 255));
        label_dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_dangxuat.setText("Đăng Xuất");
        label_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_dangxuatMouseClicked(evt);
            }
        });
        panel_dangxuat.add(label_dangxuat);
        panel_dangxuat.add(jSeparator3);

        panel_left.add(panel_dangxuat);

        getContentPane().add(panel_left, java.awt.BorderLayout.LINE_START);

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

        panel_right.setForeground(new java.awt.Color(255, 255, 255));
        panel_right.setPreferredSize(new java.awt.Dimension(700, 470));
        panel_right.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        panel_thongso.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 60);
        flowLayout1.setAlignOnBaseline(true);
        panel_thongso.setLayout(flowLayout1);

        panel_tongsanpham.setBackground(new java.awt.Color(0, 204, 102));
        panel_tongsanpham.setPreferredSize(new java.awt.Dimension(150, 100));
        panel_tongsanpham.setLayout(new java.awt.GridLayout(2, 1));

        tongsanpham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tongsanpham.setForeground(new java.awt.Color(255, 255, 255));
        tongsanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongsanpham.setText("0");
        panel_tongsanpham.add(tongsanpham);

        label_tongsanpham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_tongsanpham.setForeground(new java.awt.Color(255, 255, 255));
        label_tongsanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tongsanpham.setText("Tổng Sản Phẩm");
        panel_tongsanpham.add(label_tongsanpham);

        panel_thongso.add(panel_tongsanpham);

        panel_sanpham_sap_hethan.setBackground(new java.awt.Color(0, 204, 204));
        panel_sanpham_sap_hethan.setPreferredSize(new java.awt.Dimension(150, 100));
        panel_sanpham_sap_hethan.setLayout(new java.awt.GridLayout(2, 1));

        sanpham_saphethan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sanpham_saphethan.setForeground(new java.awt.Color(255, 255, 255));
        sanpham_saphethan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sanpham_saphethan.setText("0");
        panel_sanpham_sap_hethan.add(sanpham_saphethan);

        label_saphethan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_saphethan.setForeground(new java.awt.Color(255, 255, 255));
        label_saphethan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_saphethan.setText("Sản Phẩm Sắp Hết Hạn");
        panel_sanpham_sap_hethan.add(label_saphethan);

        panel_thongso.add(panel_sanpham_sap_hethan);

        panel_doanhthu_homnay.setBackground(new java.awt.Color(255, 0, 0));
        panel_doanhthu_homnay.setPreferredSize(new java.awt.Dimension(150, 100));
        panel_doanhthu_homnay.setLayout(new java.awt.GridLayout(2, 1));

        doanhthu_homnay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doanhthu_homnay.setForeground(new java.awt.Color(255, 255, 255));
        doanhthu_homnay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doanhthu_homnay.setText("0");
        panel_doanhthu_homnay.add(doanhthu_homnay);

        label_doanhthu_homnay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_doanhthu_homnay.setForeground(new java.awt.Color(255, 255, 255));
        label_doanhthu_homnay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_doanhthu_homnay.setText("Doanh Thu Hôm Nay");
        panel_doanhthu_homnay.add(label_doanhthu_homnay);

        panel_thongso.add(panel_doanhthu_homnay);

        panel_right.add(panel_thongso);

        panel_chart.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_chartLayout = new javax.swing.GroupLayout(panel_chart);
        panel_chart.setLayout(panel_chartLayout);
        panel_chartLayout.setHorizontalGroup(
            panel_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panel_chartLayout.setVerticalGroup(
            panel_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

     // ve bieu do
        ChartPanel chartPanel = TestChart.createSampleChartPanel();
         
         panel_right.add(chartPanel);

         getContentPane().add(panel_right, java.awt.BorderLayout.LINE_END);
        
  
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
        if(this.getExtendedState()!=TongQuanGUI.MAXIMIZED_BOTH){
            this.setExtendedState(TongQuanGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(TongQuanGUI.NORMAL);
        }  
    }                                             

    private void label_nhapthuocMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.label_nhapthuocMouseClicked()");
    }                                            

    private void label_capnhatMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.capnhatMouseClicked()");
    }                                          

    private void label_hoadonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.hoadonMouseClicked()");
    }                                         

    private void label_lendonthuocMouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.lendonthuocMouseClicked()");
    }                                              

    private void label_doanhthuMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.doanhthuMouseClicked()");
    }                                           

    private void label_tongquanMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.label_tongquanMouseClicked()");
    } 
    
    private void label_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        System.out.println("GUI.MainForm_NhanVIen.label_dangxuatMouseClicked()");
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
            java.util.logging.Logger.getLogger(TongQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TongQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TongQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TongQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TongQuanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel doanhthu_homnay;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel label_capnhat;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_dangxuat;
    private javax.swing.JLabel label_doanhthu;
    private javax.swing.JLabel label_doanhthu_homnay;
    private javax.swing.JLabel label_fullscreen;
    private javax.swing.JLabel label_hoadon;
    private javax.swing.JLabel label_lendonthuoc;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_nhapthuoc;
    private javax.swing.JLabel label_saphethan;
    private javax.swing.JLabel label_tongquan;
    private javax.swing.JLabel label_tongsanpham;
    private javax.swing.JPanel panel_capnhat;
    private javax.swing.JPanel panel_chart;
    private javax.swing.JPanel panel_close;
    private javax.swing.JPanel panel_dangxuat;
    private javax.swing.JPanel panel_doanhthu;
    private javax.swing.JPanel panel_doanhthu_homnay;
    private javax.swing.JPanel panel_fullscreen;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_hoadon;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_lendonthuoc;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPanel panel_nhapthuoc;
    private javax.swing.JPanel panel_right;
    private javax.swing.JPanel panel_sanpham_sap_hethan;
    private javax.swing.JPanel panel_thongso;
    private javax.swing.JPanel panel_tongquan;
    private javax.swing.JPanel panel_tongsanpham;
    private javax.swing.JLabel sanpham_saphethan;
    private javax.swing.JLabel tongsanpham;
    // End of variables declaration                   
}
