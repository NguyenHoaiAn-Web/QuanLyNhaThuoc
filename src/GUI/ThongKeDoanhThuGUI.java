/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

import PanelDashboard.BarChartThongKe;
import PanelDashboard.LineChartThongKe;
import PanelDashboard.PieChartThongKe;


/**
 *
 * @author 44ong
 */
public class ThongKeDoanhThuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public ThongKeDoanhThuGUI() {
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

        jButton1 = new javax.swing.JButton();
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
        panel_thongkechinh = new javax.swing.JPanel();
        panel_button_loaithongke = new javax.swing.JPanel();
        panel_contain_button = new javax.swing.JPanel();
        cb_tuan = new javax.swing.JComboBox<>();
        cb_thang = new javax.swing.JComboBox<>();
        cb_nam = new javax.swing.JComboBox<>();
        button_hienthi = new javax.swing.JButton();
        button_homnay = new javax.swing.JButton();
        button_thoat = new javax.swing.JButton();
        panel_thongkekhac = new javax.swing.JPanel();
        buton_thongkethuoc = new javax.swing.JButton();
        panel_bieudo = new javax.swing.JPanel();
        panel_bieudo_top = new javax.swing.JPanel();
        panel_bieudo_botton = new javax.swing.JPanel();

        jButton1.setText("jButton1");

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
        label_quanlyhoadon.setText("Thống Kê Doanh Thu");
        panel_title.add(label_quanlyhoadon, java.awt.BorderLayout.CENTER);

        panel_main.add(panel_title, java.awt.BorderLayout.PAGE_START);

        panel_thongtin.setLayout(new java.awt.BorderLayout());

        panel_thongkechinh.setLayout(new java.awt.BorderLayout());

        panel_button_loaithongke.setBackground(new java.awt.Color(255, 255, 255));
        panel_button_loaithongke.setPreferredSize(new java.awt.Dimension(900, 50));
        panel_button_loaithongke.setLayout(new java.awt.BorderLayout());

        panel_contain_button.setBackground(new java.awt.Color(255, 255, 255));
        panel_contain_button.setPreferredSize(new java.awt.Dimension(700, 50));
        panel_contain_button.setLayout(new java.awt.GridBagLayout());

        cb_tuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuần 1", "Tuần 2", "Tuần 3", "Tuần 4" }));
        cb_tuan.setPreferredSize(new java.awt.Dimension(90, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_tuan, gridBagConstraints);

        cb_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7" }));
        cb_thang.setPreferredSize(new java.awt.Dimension(90, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_thang, gridBagConstraints);

        cb_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", " " }));
        cb_nam.setPreferredSize(new java.awt.Dimension(90, 30));
        cb_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_namActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(cb_nam, gridBagConstraints);

        button_hienthi.setText("Hiển Thị");
        button_hienthi.setPreferredSize(new java.awt.Dimension(90, 30));
        button_hienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_hienthiMouseClicked(evt);
            }
        });
        button_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hienthiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_hienthi, gridBagConstraints);

        button_homnay.setText("Hôm Nay");
        button_homnay.setPreferredSize(new java.awt.Dimension(90, 30));
        button_homnay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_homnayMouseClicked(evt);
            }
        });
        button_homnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_homnayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_homnay, gridBagConstraints);

        button_thoat.setText("Thoát");
        button_thoat.setPreferredSize(new java.awt.Dimension(90, 30));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel_contain_button.add(button_thoat, gridBagConstraints);

        panel_button_loaithongke.add(panel_contain_button, java.awt.BorderLayout.LINE_END);

        panel_thongkekhac.setBackground(new java.awt.Color(255, 255, 255));
        panel_thongkekhac.setPreferredSize(new java.awt.Dimension(200, 50));
        panel_thongkekhac.setLayout(new java.awt.GridBagLayout());

        buton_thongkethuoc.setText("Thống Kê Thuốc");
        buton_thongkethuoc.setPreferredSize(new java.awt.Dimension(150, 30));
        buton_thongkethuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_thongkethuocMouseClicked(evt);
            }
        });
        buton_thongkethuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_thongkethuocActionPerformed(evt);
            }
        });
        panel_thongkekhac.add(buton_thongkethuoc, new java.awt.GridBagConstraints());

        panel_button_loaithongke.add(panel_thongkekhac, java.awt.BorderLayout.LINE_START);

        panel_thongkechinh.add(panel_button_loaithongke, java.awt.BorderLayout.PAGE_START);

        panel_bieudo.setLayout(new java.awt.GridLayout(2, 1));

        panel_bieudo_top.setLayout(new java.awt.GridLayout(1, 2));
        
        
        ChartPanel linechart = LineChartThongKe.createSampleChartPanel();
        panel_bieudo_top.add(linechart);
        
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        // Thêm dữ liệu (ví dụ)
        dataset.setValue("Quý 1", 25);
        dataset.setValue("Quý 2", 35);
        dataset.setValue("Quý 3", 20);
        dataset.setValue("Quý 4", 40);
        
        PieChartThongKe piechart = new PieChartThongKe(dataset, "Phần Trăm Doanh Thu Theo Nhân Viên");
        
        ChartPanel piechart_phantram = piechart.createChartPanel();

        
        //ChartPanel piechart = PieChartThongKe.createSampleChartPanel();
        
        
        
        panel_bieudo_top.add(piechart_phantram);
        
        
        
        
        
        panel_bieudo.add(panel_bieudo_top);

        panel_bieudo_botton.setLayout(new java.awt.BorderLayout());
        
        Map<String, Integer> salesData = new HashMap<>();
        salesData.put("Tháng 1", 150);
        salesData.put("Tháng 2", 200);
        salesData.put("Tháng 3", 180);
        salesData.put("Tháng 4", 300);
        salesData.put("Tháng 5", 250);

        // Tạo frame chính
        JFrame frame = new JFrame("Biểu Đồ Cột - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Tạo và thêm ChartPanel vào frame
        BarChartThongKe barchart_thongke = new BarChartThongKe(salesData, "Doanh Số Bán Hàng Theo Tháng", new Color(75, 192, 192));
        
        panel_bieudo_botton.add(barchart_thongke);
        
        panel_bieudo.add(panel_bieudo_botton);

        panel_thongkechinh.add(panel_bieudo, java.awt.BorderLayout.CENTER);

        panel_thongtin.add(panel_thongkechinh, java.awt.BorderLayout.CENTER);

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
        if(this.getExtendedState()!=ThongKeDoanhThuGUI.MAXIMIZED_BOTH){
            this.setExtendedState(ThongKeDoanhThuGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(ThongKeDoanhThuGUI.NORMAL);
        }  
    }                                             

    private void button_hienthiActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void button_hienthiMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void button_homnayActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void button_homnayMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
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

    private void cb_namActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void buton_thongkethuocActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void buton_thongkethuocMouseClicked(java.awt.event.MouseEvent evt) {                                                
        // TODO add your handling code here:
    	this.setVisible(false);
    	ThongKeThuocGUI thongkethuocgui = new ThongKeThuocGUI();
    	thongkethuocgui.setVisible(true);
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
            java.util.logging.Logger.getLogger(ThongKeDoanhThuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeDoanhThuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buton_thongkethuoc;
    private javax.swing.JButton button_hienthi;
    private javax.swing.JButton button_homnay;
    private javax.swing.JButton button_thoat;
    private javax.swing.JComboBox<String> cb_nam;
    private javax.swing.JComboBox<String> cb_thang;
    private javax.swing.JComboBox<String> cb_tuan;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_thongkechinh;
    private javax.swing.JPanel panel_thongkekhac;
    private javax.swing.JPanel panel_thongtin;
    private javax.swing.JPanel panel_title;
    // End of variables declaration                   
}
