package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicineForm extends JFrame {
    private JTextField txtMaThuoc, txtTenThuoc, txtNgayNhap, txtNgayHetHan, txtGia, txtSoLuong, txtPhanLoai, txtDonViTinh, txtHamLuong;
    private JButton btnSave, btnUpdate, btnDelete, btnClear, btnLoadImage;
    private JTable table;
    private JLabel lblImage;
    
    public MedicineForm() {
        setTitle("Quản lý Nhập Thuốc");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        // Sidebar menu
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(9, 1, 5, 5));
        sidePanel.setBackground(new Color(30, 60, 120));
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));
        
        JLabel lblLogo = new JLabel(new ImageIcon("logo.png"));
        sidePanel.add(lblLogo);
        
        String[] menuItems = {"Tổng Quan", "Cập Nhật", "Hóa Đơn", "Lập Hóa Đơn", "Doanh Thu", "Nhập Thuốc", "Đăng Xuất"};
        for (String item : menuItems) {
            JButton button = new JButton(item);
            button.setForeground(Color.WHITE);
            button.setBackground(new Color(30, 60, 120));
            button.setFocusPainted(false);
            button.setBorderPainted(false);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            sidePanel.add(button);
        }
        
        // Input Form Panel with Two Columns
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Nhập thông tin thuốc"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        
        JLabel lblMaThuoc = new JLabel("Mã Thuốc:");
        JLabel lblTenThuoc = new JLabel("Tên Thuốc:");
        JLabel lblNgayNhap = new JLabel("Ngày Nhập:");
        JLabel lblNgayHetHan = new JLabel("Ngày Hết Hạn:");
        JLabel lblGia = new JLabel("Giá:");
        JLabel lblSoLuong = new JLabel("Số Lượng:");
        JLabel lblPhanLoai = new JLabel("Phân Loại:");
        JLabel lblDonViTinh = new JLabel("Đơn Vị Tính:");
        JLabel lblHamLuong = new JLabel("Hàm Lượng:");
        JLabel lblHinhAnh = new JLabel("Hình Ảnh:");
        
        txtMaThuoc = new JTextField(15);
        txtTenThuoc = new JTextField(15);
        txtNgayNhap = new JTextField(15);
        txtNgayHetHan = new JTextField(15);
        txtGia = new JTextField(15);
        txtSoLuong = new JTextField(15);
        txtPhanLoai = new JTextField(15);
        txtDonViTinh = new JTextField(15);
        txtHamLuong = new JTextField(15);
        btnLoadImage = new JButton("Chọn Hình Ảnh");
        lblImage = new JLabel();
        lblImage.setPreferredSize(new Dimension(100, 100));
        
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(lblMaThuoc, gbc);
        gbc.gridx = 1;
        formPanel.add(txtMaThuoc, gbc);
        gbc.gridx = 2;
        formPanel.add(lblTenThuoc, gbc);
        gbc.gridx = 3;
        formPanel.add(txtTenThuoc, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(lblNgayNhap, gbc);
        gbc.gridx = 1;
        formPanel.add(txtNgayNhap, gbc);
        gbc.gridx = 2;
        formPanel.add(lblNgayHetHan, gbc);
        gbc.gridx = 3;
        formPanel.add(txtNgayHetHan, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(lblGia, gbc);
        gbc.gridx = 1;
        formPanel.add(txtGia, gbc);
        gbc.gridx = 2;
        formPanel.add(lblSoLuong, gbc);
        gbc.gridx = 3;
        formPanel.add(txtSoLuong, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(lblPhanLoai, gbc);
        gbc.gridx = 1;
        formPanel.add(txtPhanLoai, gbc);
        gbc.gridx = 2;
        formPanel.add(lblDonViTinh, gbc);
        gbc.gridx = 3;
        formPanel.add(txtDonViTinh, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4;
        formPanel.add(lblHamLuong, gbc);
        gbc.gridx = 1;
        formPanel.add(txtHamLuong, gbc);
        gbc.gridx = 2;
        formPanel.add(lblHinhAnh, gbc);
        gbc.gridx = 3;
        formPanel.add(btnLoadImage, gbc);
        
        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnSave = new JButton("Thêm");
        btnUpdate = new JButton("Cập Nhật");
        btnDelete = new JButton("Xóa");
        btnClear = new JButton("Xóa Trắng");
        
        buttonPanel.add(btnSave);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnClear);
        
        // Table Panel
        String[] columnNames = {"Mã Thuốc", "Tên Thuốc", "Ngày Nhập", "Ngày Hết Hạn", "Giá", "Số Lượng", "Phân Loại", "Đơn Vị Tính", "Hàm Lượng"};
        table = new JTable(new Object[10][9], columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(800, 300));
        
        // Main Content Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(formPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(tableScrollPane);
        
        // Add panels to main frame
        add(sidePanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MedicineForm().setVisible(true));
    }
}
