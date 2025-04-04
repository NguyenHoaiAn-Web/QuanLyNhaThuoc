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
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author 44ong
 */
public class HoaDonGUI extends javax.swing.JFrame {

    private JTable table_chitiethoadon;
	/**
     * Creates new form MainForm
     */
    public HoaDonGUI() {
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

        panel_left = new javax.swing.JPanel();
        panel_logo = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        panel_tongquan = new javax.swing.JPanel();
        label_tongquan = new javax.swing.JLabel();
        panel_capnhat = new javax.swing.JPanel();
        label_capnhat = new javax.swing.JLabel();
        panel_hoadon = new javax.swing.JPanel();
        label_hoadon = new javax.swing.JLabel();
        panel_laphoadon = new javax.swing.JPanel();
        label_laphoadon = new javax.swing.JLabel();
        panel_doanhthu = new javax.swing.JPanel();
        label_doanhthu = new javax.swing.JLabel();
        panel_nhapthuoc = new javax.swing.JPanel();
        label_nhapthuoc = new javax.swing.JLabel();
        panel_dangxuat = new javax.swing.JPanel();
        label_dangxuat = new javax.swing.JLabel();
        panel_header = new javax.swing.JPanel();
        icon_close_fullscreen = new javax.swing.JPanel();
        panel_fullscreen = new javax.swing.JPanel();
        label_fullscreen = new javax.swing.JLabel();
        panel_close = new javax.swing.JPanel();
        label_close = new javax.swing.JLabel();
        panel_right = new javax.swing.JPanel();
        panel_chitiethoadon = new javax.swing.JPanel();
        panel_title_chitiethoadon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_thongtin_chitiethoadon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panel_tonghoadon = new javax.swing.JPanel();
        label_thue = new javax.swing.JLabel();
        giatrithue = new javax.swing.JLabel();
        label_tongtienhoadon = new javax.swing.JLabel();
        tongtien = new javax.swing.JLabel();
        panel_thanhsearch_table = new javax.swing.JPanel();
        panel_thanhsearch_button_filter = new javax.swing.JPanel();
        panel_button_filter = new javax.swing.JPanel();
        button_timkiem = new javax.swing.JButton();
        cmbobox_filter = new javax.swing.JComboBox<>();
        panel_thanhsearch = new javax.swing.JPanel();
        field_search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        panel_tongquan.setBackground(new java.awt.Color(4, 71, 126));
        panel_tongquan.setLayout(new java.awt.BorderLayout());

        label_tongquan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tongquan.setForeground(new java.awt.Color(255, 255, 255));
        label_tongquan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tongquan.setText("Tổng Quan");
        label_tongquan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_tongquanMouseClicked(evt);
            }
        });
        panel_tongquan.add(label_tongquan, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_tongquan);

        panel_capnhat.setBackground(new java.awt.Color(4, 71, 126));
        panel_capnhat.setLayout(new java.awt.BorderLayout());

        label_capnhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_capnhat.setForeground(new java.awt.Color(255, 255, 255));
        label_capnhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_capnhat.setText("Cập Nhật");
        label_capnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_capnhatMouseClicked(evt);
            }
        });
        panel_capnhat.add(label_capnhat, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_capnhat);

        panel_hoadon.setBackground(new java.awt.Color(32, 86, 161));
        panel_hoadon.setLayout(new java.awt.BorderLayout());

        label_hoadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        label_hoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hoadon.setText("Hóa Đơn");
        label_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_hoadonMouseClicked(evt);
            }
        });
        panel_hoadon.add(label_hoadon, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_hoadon);

        panel_laphoadon.setBackground(new java.awt.Color(4, 71, 126));
        panel_laphoadon.setLayout(new java.awt.BorderLayout());

        label_laphoadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_laphoadon.setForeground(new java.awt.Color(255, 255, 255));
        label_laphoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_laphoadon.setText("Lập Hóa Đơn");
        label_laphoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_laphoadonMouseClicked(evt);
            }
        });
        panel_laphoadon.add(label_laphoadon, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_laphoadon);

        panel_doanhthu.setBackground(new java.awt.Color(4, 71, 126));
        panel_doanhthu.setLayout(new java.awt.BorderLayout());

        label_doanhthu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_doanhthu.setForeground(new java.awt.Color(255, 255, 255));
        label_doanhthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_doanhthu.setText("Doanh Thu");
        label_doanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_doanhthuMouseClicked(evt);
            }
        });
        panel_doanhthu.add(label_doanhthu, java.awt.BorderLayout.CENTER);

        panel_left.add(panel_doanhthu);

        panel_nhapthuoc.setBackground(new java.awt.Color(4, 71, 126));
        panel_nhapthuoc.setLayout(new java.awt.BorderLayout());

        label_nhapthuoc.setBackground(new java.awt.Color(32, 86, 161));
        label_nhapthuoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_nhapthuoc.setForeground(new java.awt.Color(255, 255, 255));
        label_nhapthuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nhapthuoc.setText("Nhập Thuốc");
        panel_nhapthuoc.add(label_nhapthuoc, java.awt.BorderLayout.CENTER);
        panel_nhapthuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_nhapthuocMouseClicked(evt);
            }
        });

        panel_left.add(panel_nhapthuoc);

        panel_dangxuat.setBackground(new java.awt.Color(4, 71, 126));
        panel_dangxuat.setLayout(new java.awt.BorderLayout());

        label_dangxuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_dangxuat.setForeground(new java.awt.Color(255, 255, 255));
        label_dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_dangxuat.setText("Đăng Xuất");
        label_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_dangxuatMouseClicked(evt);
            }
        });
        panel_dangxuat.add(label_dangxuat, java.awt.BorderLayout.CENTER);

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
        panel_right.setLayout(new java.awt.BorderLayout());

        panel_chitiethoadon.setPreferredSize(new java.awt.Dimension(350, 470));
        panel_chitiethoadon.setLayout(new java.awt.BorderLayout());

        panel_title_chitiethoadon.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi Tiết Hóa Đơn");
        jLabel1.setPreferredSize(new java.awt.Dimension(280, 100));
        panel_title_chitiethoadon.add(jLabel1, java.awt.BorderLayout.CENTER);

        panel_chitiethoadon.add(panel_title_chitiethoadon, java.awt.BorderLayout.PAGE_START);

        panel_thongtin_chitiethoadon.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Thuốc", "Số Lượng", "Đơn Vị", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        panel_thongtin_chitiethoadon.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panel_tonghoadon.setPreferredSize(new java.awt.Dimension(280, 200));
        panel_tonghoadon.setLayout(new java.awt.GridBagLayout());

        label_thue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_thue.setText("Thuế: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        panel_tonghoadon.add(label_thue, gridBagConstraints);

        giatrithue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giatrithue.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panel_tonghoadon.add(giatrithue, gridBagConstraints);

        label_tongtienhoadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tongtienhoadon.setText("Tổng Tiền Hóa Đơn: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        panel_tonghoadon.add(label_tongtienhoadon, gridBagConstraints);

        tongtien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tongtien.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panel_tonghoadon.add(tongtien, gridBagConstraints);

        panel_thongtin_chitiethoadon.add(panel_tonghoadon, java.awt.BorderLayout.PAGE_END);

        panel_chitiethoadon.add(panel_thongtin_chitiethoadon, java.awt.BorderLayout.CENTER);

        panel_right.add(panel_chitiethoadon, java.awt.BorderLayout.LINE_END);

        panel_thanhsearch_table.setLayout(new java.awt.BorderLayout());

        panel_thanhsearch_button_filter.setPreferredSize(new java.awt.Dimension(400, 40));
        panel_thanhsearch_button_filter.setLayout(new java.awt.BorderLayout());

        panel_button_filter.setPreferredSize(new java.awt.Dimension(150, 40));
        panel_button_filter.setLayout(new java.awt.GridLayout(1, 2));

        button_timkiem.setBackground(new java.awt.Color(4, 71, 126));
        button_timkiem.setForeground(new java.awt.Color(255, 255, 255));
        button_timkiem.setText("Tìm Kiếm");
        panel_button_filter.add(button_timkiem);

        cmbobox_filter.setBackground(new java.awt.Color(4, 71, 126));
        cmbobox_filter.setForeground(new java.awt.Color(255, 255, 255));
        cmbobox_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên Khách Hàng", "Ngày Lập", "Số Điện Thoại", " " }));
        panel_button_filter.add(cmbobox_filter);

        panel_thanhsearch_button_filter.add(panel_button_filter, java.awt.BorderLayout.LINE_END);

        panel_thanhsearch.setLayout(new java.awt.BorderLayout());
        panel_thanhsearch.add(field_search, java.awt.BorderLayout.CENTER);

        panel_thanhsearch_button_filter.add(panel_thanhsearch, java.awt.BorderLayout.CENTER);

        panel_thanhsearch_table.add(panel_thanhsearch_button_filter, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Tên Nhân Viên", "Tên Khách Hàng", "Số Điện Thoại", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        panel_thanhsearch_table.add(jPanel2, java.awt.BorderLayout.CENTER);

        panel_right.add(panel_thanhsearch_table, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_right, java.awt.BorderLayout.CENTER);

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
        if(this.getExtendedState()!=HoaDonGUI.MAXIMIZED_BOTH){
            this.setExtendedState(HoaDonGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(HoaDonGUI.NORMAL);
        }  
    }                                             

    private void label_tongquanMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    	this.setVisible(false);
    	TongQuanGUI tongquangui = new TongQuanGUI();
    	tongquangui.setVisible(true);
    }                                           

    private void label_capnhatMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void label_hoadonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void label_laphoadonMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
    	this.setVisible(false);
    	LapHoaDonGUI laphoadongui = new LapHoaDonGUI();
    	laphoadongui.setVisible(true);
    }                                            

    private void label_doanhthuMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                      
    
    private void label_nhapthuocMouseClicked(java.awt.event.MouseEvent evt) {
    	this.setVisible(false);
    	NhapThuocGUI nhapthuocgui = new NhapThuocGUI();
    	nhapthuocgui.setVisible(true);
    	
    }

    private void label_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    	this.setVisible(false);
    	DangNhapForm danhnhapform = new DangNhapForm();
    	danhnhapform.setVisible(true);
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
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new HoaDonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton button_timkiem;
    private javax.swing.JComboBox<String> cmbobox_filter;
    private javax.swing.JTextField field_search;
    private javax.swing.JLabel giatrithue;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label_capnhat;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_dangxuat;
    private javax.swing.JLabel label_doanhthu;
    private javax.swing.JLabel label_fullscreen;
    private javax.swing.JLabel label_hoadon;
    private javax.swing.JLabel label_laphoadon;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_nhapthuoc;
    private javax.swing.JLabel label_thue;
    private javax.swing.JLabel label_tongquan;
    private javax.swing.JLabel label_tongtienhoadon;
    private javax.swing.JPanel panel_button_filter;
    private javax.swing.JPanel panel_capnhat;
    private javax.swing.JPanel panel_chitiethoadon;
    private javax.swing.JPanel panel_close;
    private javax.swing.JPanel panel_dangxuat;
    private javax.swing.JPanel panel_doanhthu;
    private javax.swing.JPanel panel_fullscreen;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_hoadon;
    private javax.swing.JPanel panel_laphoadon;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPanel panel_nhapthuoc;
    private javax.swing.JPanel panel_right;
    private javax.swing.JPanel panel_thanhsearch;
    private javax.swing.JPanel panel_thanhsearch_button_filter;
    private javax.swing.JPanel panel_thanhsearch_table;
    private javax.swing.JPanel panel_thongtin_chitiethoadon;
    private javax.swing.JPanel panel_title_chitiethoadon;
    private javax.swing.JPanel panel_tonghoadon;
    private javax.swing.JPanel panel_tongquan;
    private javax.swing.JLabel tongtien;
    // End of variables declaration                   
}
