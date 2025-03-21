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
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author 44ong
 */
public class NhapThuocGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public NhapThuocGUI() {
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
        panel_right_top = new javax.swing.JPanel();
        label_mathuoc = new javax.swing.JLabel();
        field_mathuoc = new javax.swing.JTextField();
        label_tenthuoc = new javax.swing.JLabel();
        field_tenthuoc = new javax.swing.JTextField();
        label_ngaynhap = new javax.swing.JLabel();
        field_ngaynhap = new javax.swing.JTextField();
        label_ngayhethan = new javax.swing.JLabel();
        field_ngayhethan = new javax.swing.JTextField();
        label_gia = new javax.swing.JLabel();
        field_gia = new javax.swing.JTextField();
        label_soluong = new javax.swing.JLabel();
        field_soluong = new javax.swing.JTextField();
        label_phanloai = new javax.swing.JLabel();
        field_phanloai = new javax.swing.JTextField();
        label_hinhanh = new javax.swing.JLabel();
        field_donvitinh = new javax.swing.JTextField();
        label_hamluong = new javax.swing.JLabel();
        field_hamluong = new javax.swing.JTextField();
        label_donvitinh = new javax.swing.JLabel();
        button_hinhanh = new javax.swing.JButton();
        button_them = new javax.swing.JButton();
        button_hoantac = new javax.swing.JButton();
        button_xoa = new javax.swing.JButton();
        panel_right_bot = new javax.swing.JPanel();
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

        panel_hoadon.setBackground(new java.awt.Color(4, 71, 126));
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

        panel_nhapthuoc.setBackground(new java.awt.Color(32, 86, 161));
        panel_nhapthuoc.setLayout(new java.awt.BorderLayout());

        label_nhapthuoc.setBackground(new java.awt.Color(32, 86, 161));
        label_nhapthuoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_nhapthuoc.setForeground(new java.awt.Color(255, 255, 255));
        label_nhapthuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nhapthuoc.setText("Nhập Thuốc");
        panel_nhapthuoc.add(label_nhapthuoc, java.awt.BorderLayout.CENTER);

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
        panel_right.setLayout(new java.awt.GridLayout(2, 1));

        panel_right_top.setLayout(new java.awt.GridBagLayout());

        label_mathuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_mathuoc.setText("Mã Thuốc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_mathuoc, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_mathuoc, gridBagConstraints);

        label_tenthuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_tenthuoc.setText("Tên Thuốc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_tenthuoc, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_tenthuoc, gridBagConstraints);

        label_ngaynhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_ngaynhap.setText("Ngày Nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_ngaynhap, gridBagConstraints);

        field_ngaynhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ngaynhapActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_ngaynhap, gridBagConstraints);

        label_ngayhethan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_ngayhethan.setText("Ngày Hết Hạn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_ngayhethan, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_ngayhethan, gridBagConstraints);

        label_gia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_gia.setText("Giá");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_gia, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_gia, gridBagConstraints);

        label_soluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_soluong.setText("Số Lượng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_soluong, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_soluong, gridBagConstraints);

        label_phanloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_phanloai.setText("Phân Loại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_phanloai, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_phanloai, gridBagConstraints);

        label_hinhanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_hinhanh.setText("Hình Ảnh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_hinhanh, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_donvitinh, gridBagConstraints);

        label_hamluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_hamluong.setText("Hàm Lượng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_hamluong, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(field_hamluong, gridBagConstraints);

        label_donvitinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_donvitinh.setText("Đơn Vị Tính");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(label_donvitinh, gridBagConstraints);

        button_hinhanh.setText("Upload");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(button_hinhanh, gridBagConstraints);

        button_them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_them.setText("Thêm");
        button_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_themMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(button_them, gridBagConstraints);

        button_hoantac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_hoantac.setText("Hoàn Tác");
        button_hoantac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_hoantacMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(button_hoantac, gridBagConstraints);

        button_xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_xoa.setText("Xóa");
        button_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_xoaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel_right_top.add(button_xoa, gridBagConstraints);

        panel_right.add(panel_right_top);

        panel_right_bot.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Thuốc", "Tên Thuốc", "Ngày Nhập", "Ngày Hết Hạn", "Giá", "Số Lương", "Phân Loại", "Đơn Vị Tính", "Hàm Lượng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel_right_bot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panel_right.add(panel_right_bot);

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
        if(this.getExtendedState()!=NhapThuocGUI.MAXIMIZED_BOTH){
            this.setExtendedState(NhapThuocGUI.MAXIMIZED_BOTH);
        }else{
           this.setExtendedState(NhapThuocGUI.NORMAL);
        }  
    }                                             

    private void field_ngaynhapActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void button_themMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void button_hoantacMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void button_xoaMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
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
    }                                            

    private void label_doanhthuMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void label_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        this.setVisible(false);
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
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
            java.util.logging.Logger.getLogger(NhapThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapThuocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapThuocGUI().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton button_hinhanh;
    private javax.swing.JButton button_hoantac;
    private javax.swing.JButton button_them;
    private javax.swing.JButton button_xoa;
    private javax.swing.JTextField field_donvitinh;
    private javax.swing.JTextField field_gia;
    private javax.swing.JTextField field_hamluong;
    private javax.swing.JTextField field_mathuoc;
    private javax.swing.JTextField field_ngayhethan;
    private javax.swing.JTextField field_ngaynhap;
    private javax.swing.JTextField field_phanloai;
    private javax.swing.JTextField field_soluong;
    private javax.swing.JTextField field_tenthuoc;
    private javax.swing.JPanel icon_close_fullscreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_capnhat;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_dangxuat;
    private javax.swing.JLabel label_doanhthu;
    private javax.swing.JLabel label_donvitinh;
    private javax.swing.JLabel label_fullscreen;
    private javax.swing.JLabel label_gia;
    private javax.swing.JLabel label_hamluong;
    private javax.swing.JLabel label_hinhanh;
    private javax.swing.JLabel label_hoadon;
    private javax.swing.JLabel label_laphoadon;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_mathuoc;
    private javax.swing.JLabel label_ngayhethan;
    private javax.swing.JLabel label_ngaynhap;
    private javax.swing.JLabel label_nhapthuoc;
    private javax.swing.JLabel label_phanloai;
    private javax.swing.JLabel label_soluong;
    private javax.swing.JLabel label_tenthuoc;
    private javax.swing.JLabel label_tongquan;
    private javax.swing.JPanel panel_capnhat;
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
    private javax.swing.JPanel panel_right_bot;
    private javax.swing.JPanel panel_right_top;
    private javax.swing.JPanel panel_tongquan;
    // End of variables declaration                   
}
