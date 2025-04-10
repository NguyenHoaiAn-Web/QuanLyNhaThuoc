package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuForm_2 extends JPanel {
    public interface MenuListener {
        /*void onDrugImportSelected();
        void onDrugUpdateSelected();
        void onDrugListSelected();
        void onInvoiceCreateSelected();
        void onInvoiceListSelected();
        void onRevenueStatsSelected();
        void onDrugStatsSelected();
        void onStaffListSelected();
        void onAddStaffSelected();
        void onCustomerListSelected();
        void onAddCustomerSelected();
        void onSupplierListSelected();
        void onAddSupplierSelected();*/
    	
    	
    	
        void openFormNhapThuoc();
        void openFormCapNhatThuoc();
        void openFormDanhSachThuoc();
        void openFormTaoHoaDon();
        void openFormDanhSachHoaDon();
        void openFormThongKeDoanhThu();
        void openFormThongKeThuoc();
        void openFormDanhSachNhanVien();
        void openFormThemNhanVien();
        void openFormDanhSachKhachHang();
        void openFormThemKhachHang();
        void openFormNhaCungCap();
        void openFormThemNhaCungCap();
    }

    private final MenuListener listener;

    public MenuForm_2(MenuListener listener) {
        this.listener = listener;
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(250, 700));
        setBackground(new Color(50, 120, 200));

        // Logo
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(new Color(40, 110, 190));
        logoPanel.setPreferredSize(new Dimension(250, 80));
        JLabel logo = new JLabel("NHÀ THUỐC", SwingConstants.CENTER);
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial", Font.BOLD, 18));
        logoPanel.add(logo);
        add(logoPanel);

        // Các menu chính
        addMenuSection("Quản lý thuốc", new String[]{"Nhập Thuốc", "Cập Nhật", "Danh sách thuốc"});
        addMenuSection("Quản lý hóa đơn", new String[]{"Tạo Hóa đơn", "Danh sách hóa đơn"});
        addMenuSection("Thống kê", new String[]{"Thống kê Doanh Thu", "Thống kê Thuốc"});
        addMenuSection("Quản lý nhân viên", new String[]{"Danh sách nhân viên", "Thêm nhân viên mới"});
        addMenuSection("Khách hàng", new String[]{"Danh sách khách hàng", "Thêm khách hàng mới"});
        addMenuSection("Nhà cung cấp", new String[]{"Danh sách nhà cung cấp", "Thêm nhà cung cấp"});
    }

    private void addMenuSection(String title, String[] items) {
        JButton mainButton = createMenuButton(title);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.setBackground(new Color(40, 110, 190));
        subPanel.setVisible(false);

        for (String item : items) {
            JButton subButton = createSubMenuButton(item);
            subButton.addActionListener(createActionListener(item));
            subPanel.add(subButton);
        }

        mainButton.addActionListener(e -> {
            subPanel.setVisible(!subPanel.isVisible());
            revalidate();
        });

        add(mainButton);
        add(subPanel);
    }

    private ActionListener createActionListener(String menuItem) {
        return e -> {
            switch (menuItem) {
                case "Nhập Thuốc" -> listener.openFormNhapThuoc();
                case "Cập Nhật" -> listener.openFormCapNhatThuoc();
                case "Danh sách thuốc" -> listener.openFormDanhSachThuoc();
                case "Tạo Hóa đơn" -> listener.openFormTaoHoaDon();
                case "Danh sách hóa đơn" -> listener.openFormDanhSachHoaDon();
                case "Thống kê Doanh Thu" -> listener.openFormThongKeDoanhThu();
                case "Thống kê Thuốc" -> listener.openFormThongKeThuoc();
                case "Danh sách nhân viên" -> listener.openFormDanhSachNhanVien();
                case "Thêm nhân viên mới" -> listener.openFormThemNhanVien();
                case "Danh sách khách hàng" -> listener.openFormDanhSachKhachHang();
                case "Thêm khách hàng mới" -> listener.openFormThemKhachHang();
                case "Danh sách nhà cung cấp" -> listener.openFormNhaCungCap();
                case "Thêm nhà cung cấp" -> listener.openFormThemNhaCungCap();
            }
        };
    }

    private JButton createMenuButton(String text) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(4, 71, 126));
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        btn.setMaximumSize(new Dimension(250, 50));
        btn.setFocusPainted(false);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        return btn;
    }

    private JButton createSubMenuButton(String text) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(60, 130, 210));
        btn.setFont(new Font("Arial", Font.PLAIN, 13));
        btn.setBorder(BorderFactory.createEmptyBorder(8, 40, 8, 10));
        btn.setMaximumSize(new Dimension(250, 40));
        btn.setFocusPainted(false);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        return btn;
    }
}