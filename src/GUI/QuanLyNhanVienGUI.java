package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.DateFormatter;

import Models.NhanVien;
import dao.NhanVien_Dao;



public class QuanLyNhanVienGUI extends JFrame implements ActionListener, MouseListener, Serializable {
    private static final long serialVersionUID = 1L;
    private JLabel lbMa, lbTen, lbSDT;
    private JTextField txtMa, txtTen, txtSDT;
    private JButton btnThem, btnXoa, btnXoaTrang, btnSua;
    private JPanel pnSouth;
    private JTable table;
    private DefaultTableModel model;
    private JLabel lbGioiTinh;
    private JLabel lbNamSinh;
    private ButtonGroup groudradio;
    private JRadioButton raNu;
    private JRadioButton raNam;
    private JButton btnTim;
    private JTextField txtNamSinh;
    private JButton btnLoadData;
    private JLabel lbVaiTro;
    private JLabel lbTrinhDo;
    private JLabel lbTitle;

    public QuanLyNhanVienGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    public void initComponents() {
        this.setLayout(new BorderLayout());

        // Panel chứa tiêu đề
        JPanel pnTitle = new JPanel(new BorderLayout());
        lbTitle = new JLabel("QUẢN LÝ NHÂN VIÊN", JLabel.CENTER);
        lbTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lbTitle.setOpaque(true);
        lbTitle.setBackground(new Color(4, 71, 126));
        lbTitle.setForeground(Color.WHITE);
        lbTitle.setPreferredSize(new Dimension(0, 100));
        pnTitle.add(lbTitle, BorderLayout.CENTER);

        // Thêm panel tiêu đề vào pnNorth
        JPanel pnNorth = new JPanel(new BorderLayout());
        pnNorth.add(pnTitle, BorderLayout.NORTH);
        this.add(pnNorth, BorderLayout.NORTH);

        // Panel chứa các form và bảng
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BorderLayout());

        // Tạo form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0, 2, 10, 10)); // 2 cột
        createForm(formPanel);

        // Panel chứa các nút
        JPanel pnButtons = new JPanel();
        createButtons(pnButtons);

        // Tạo bảng
        pnSouth = new JPanel();
        createTable();

        // Thêm form và bảng vào pnCenter
        pnCenter.add(formPanel, BorderLayout.NORTH);
        pnCenter.add(pnButtons, BorderLayout.CENTER);
        pnCenter.add(pnSouth, BorderLayout.SOUTH);

        this.add(pnCenter, BorderLayout.CENTER);
        this.setVisible(true);
    }

    private void createForm(JPanel formPanel) {
        lbMa = new JLabel("Mã nhân viên:");
        lbTen = new JLabel("Tên nhân viên:");
        lbGioiTinh = new JLabel("Giới tính:");
        lbSDT = new JLabel("Số điện thoại:");
        lbVaiTro = new JLabel("Vai trò:");
        lbNamSinh = new JLabel("Năm sinh:");

        txtMa = new JTextField(10);
        txtMa.setEditable(false);
        txtTen = new JTextField();
        txtSDT = new JTextField();
        txtNamSinh = new JTextField();

        raNam = new JRadioButton("Nam");
        raNu = new JRadioButton("Nữ");
        groudradio = new ButtonGroup();
        groudradio.add(raNam);
        groudradio.add(raNu);

        JComboBox<String> comboBoxVaiTro = new JComboBox<>();
        comboBoxVaiTro.addItem("Quản lý");
        comboBoxVaiTro.addItem("Nhân Viên");

        formPanel.add(lbMa);
        formPanel.add(txtMa);
        formPanel.add(lbVaiTro);
        formPanel.add(comboBoxVaiTro);
        formPanel.add(lbNamSinh);
        formPanel.add(txtNamSinh);
        formPanel.add(lbTen);
        formPanel.add(txtTen);
        formPanel.add(lbSDT);
        formPanel.add(txtSDT);
        formPanel.add(lbGioiTinh);
        
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        genderPanel.add(raNam);
        genderPanel.add(raNu);
        formPanel.add(genderPanel);
    }

    private void createButtons(JPanel pnButtons) {
        btnThem = new JButton("Thêm");
        btnSua = new JButton("Sửa");
        btnXoa = new JButton("Xóa");
        btnXoaTrang = new JButton("Xóa trắng");
        btnTim = new JButton("Tìm kiếm");
        btnLoadData = new JButton("Load dữ liệu");

        pnButtons.add(btnThem);
        pnButtons.add(btnXoa);
        pnButtons.add(btnSua);
        pnButtons.add(btnXoaTrang);
        pnButtons.add(btnTim);
        pnButtons.add(btnLoadData);

        btnThem.addActionListener(this);
        btnSua.addActionListener(this);
        btnXoa.addActionListener(this);
        btnXoaTrang.addActionListener(this);
        btnTim.addActionListener(this);
        btnLoadData.addActionListener(this);
    }

    private void createTable() {
        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới tính");
        model.addColumn("Số Điện Thoại");
        model.addColumn("Vai Trò");
        model.addColumn("Năm sinh");
        model.addColumn("Trình độ");

        JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnSouth.setLayout(new BorderLayout());
        pnSouth.add(sp, BorderLayout.CENTER);
        table.addMouseListener(this);
    }



//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == btnThem) {
//			themNhanVien();
//		} else if (e.getSource() == btnSua) {
//			suaNhanVien();
//		} else if (e.getSource() == btnXoa) {
//			xoaNhanVien();
//		} else if (e.getSource() == btnXoaTrang) {
//			xoaTrang();
//		} else if (e.getSource() == btnLoadData) {
//			loadDataToTable();
//		} else if (e.getSource() == btnTim) {
//			timKiemNhanVien();
//		}
//
//	}

//	private void themNhanVien() {
//		// Lấy dữ liệu từ các trường nhập liệu
//		String ma = txtMa.getText().trim();
//		String ten = txtTen.getText().trim();
//		String sdt = txtSDT.getText().trim();
//		if (!sdt.matches("^0\\d{9}$")) {
//			JOptionPane.showMessageDialog(this,
//					"Số điện thoại không hợp lệ. Vui lòng nhập số điện thoại bắt đầu 0 và có 10 số bao gồm cả số 0).");
//			return;
//		}
//		// Kiểm tra và lấy giá trị từ trường "Ca trực"
//		int caTruc;
//		try {
//			caTruc = Integer.parseInt(txtCaTruc.getText().trim());
//		} catch (NumberFormatException ex) {
//			JOptionPane.showMessageDialog(this, "Ca trực phải là số nguyên.");
//			return;
//		}
//
//		// Kiểm tra và lấy giá trị từ trường "Năm sinh"
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate namSinh;
//		try {
//			namSinh = LocalDate.parse(txtNamSinh.getText().trim(), formatter);
//			int tuoi = LocalDate.now().getYear() - namSinh.getYear();
//			if (tuoi < 18 || tuoi > 64) {
//				JOptionPane.showMessageDialog(this, "Tuổi của nhân viên phải từ 18 đến 64.");
//				return;
//			}
//		} catch (DateTimeParseException ex) {
//			JOptionPane.showMessageDialog(this, "Vui lòng nhập năm sinh hợp lệ (định dạng: dd-MM-yyyy).");
//			return;
//		}
//
//		// Lấy giới tính
//		boolean gioiTinh = raNam.isSelected();
//
//		// Tạo đối tượng nhân viên mới
//		NhanVien nv = new NhanVien(ma, ten, gioiTinh, sdt, caTruc, namSinh);
//
//		// Thêm nhân viên vào cơ sở dữ liệu
//		if (NhanVien_dao.create(nv)) {
//			JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công.");
//			xoaTrang();
//		} else {
//			JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại. Vui lòng thử lại.");
//		}
//	}

//	private void xoaNhanVien() {
//		int row = table.getSelectedRow();
//		if (row != -1) {
//			String IDNV = (String) table.getValueAt(row, 0);
//
//			int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nhân viên này?", "Xác nhận",
//					JOptionPane.YES_NO_OPTION);
//			if (confirm == JOptionPane.YES_OPTION) {
//				if (NhanVien_dao.delete(IDNV)) {
//					model.removeRow(row);
//					JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
//					xoaTrang();
//				} else {
//					
//				}
//			}
//		} else {
//			JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xóa.");
//		}
//	}
//	private void xoaNhanVien() {
//	    int row = table.getSelectedRow();
//	    if (row != -1) {
//	        String IDNV = (String) table.getValueAt(row, 0);
//
//	        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nhân viên này?", "Xác nhận",
//	                JOptionPane.YES_NO_OPTION);
//	        if (confirm == JOptionPane.YES_OPTION) {
//	            if (NhanVien_dao.delete(IDNV)) {
//	                // Nếu xóa thành công, cập nhật lại dữ liệu từ cơ sở dữ liệu và làm mới JTable
//	                model.removeRow(row);
//	                JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
//	                xoaTrang(); // Giả sử xoaTrang() làm sạch các trường nhập liệu
//
//	                
//	            } else {
//	                JOptionPane.showMessageDialog(this, "Xóa nhân viên thất bại.");
//	            }
//	        }
//	    } else {
//	        JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xóa.");
//	    }
//	}
//
//
//	private void suaNhanVien() {
//		int row = table.getSelectedRow();
//		if (row != -1) {
//			// Lấy dữ liệu đã chỉnh sửa từ các trường nhập liệu
//			String ma = txtMa.getText().trim();
//			String ten = txtTen.getText().trim();
//			String sdt = txtSDT.getText().trim();
//
//			int caTruc;
//			try {
//				caTruc = Integer.parseInt(txtCaTruc.getText().trim());
//			} catch (NumberFormatException ex) {
//				JOptionPane.showMessageDialog(this, "Ca trực phải là số nguyên.");
//				return;
//			}
//
//			// Định dạng lại năm sinh theo định dạng dd-MM-yyyy
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//			LocalDate namSinh;
//			try {
//				namSinh = LocalDate.parse(txtNamSinh.getText().trim(), formatter);
//			} catch (DateTimeParseException ex) {
//				JOptionPane.showMessageDialog(this, "Vui lòng nhập năm sinh hợp lệ (định dạng: dd-MM-yyyy).");
//				return;
//			}
//
//			boolean gioiTinh = raNam.isSelected();
//
//			// Tạo đối tượng nhân viên mới với thông tin đã sửa
//			NhanVien nv = new NhanVien(ma, ten, gioiTinh, sdt, caTruc, namSinh);
//
//			// Cập nhật thông tin nhân viên trong cơ sở dữ liệu
//			if (NhanVien_dao.update(nv)) {
//				// Định dạng lại ngày sinh trước khi cập nhật bảng
//				String formattedBirthDate = namSinh.format(formatter);
//
//				// Cập nhật bảng
//				model.setValueAt(ma, row, 0);
//				model.setValueAt(ten, row, 1);
//				model.setValueAt(gioiTinh ? "Nam" : "Nữ", row, 2);
//				model.setValueAt(sdt, row, 3);
//				model.setValueAt(caTruc, row, 4);
//				model.setValueAt(formattedBirthDate, row, 5); // Định dạng ngày sinh ở đây
//
//				JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công.");
//				xoaTrang();
//			} else {
//				JOptionPane.showMessageDialog(this, "Sửa nhân viên thất bại. Vui lòng thử lại.");
//			}
//		} else {
//			JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần sửa.");
//		}
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		txtMa.setText(model.getValueAt(row, 0).toString());
		txtTen.setText(model.getValueAt(row, 1).toString());
		String GioiTinh = model.getValueAt(row, 2).toString();
		if (GioiTinh.equals("Nam")) {
			raNam.setSelected(true);
			raNu.setSelected(false);
		} else if (GioiTinh.equals("Nữ")) {
			raNu.setSelected(true);
			raNam.setSelected(false);
		}
		txtSDT.setText(model.getValueAt(row, 3).toString());
//		txtCaTruc.setText(model.getValueAt(row, 4).toString());
		txtNamSinh.setText(model.getValueAt(row, 5).toString());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	private void xoaTrang() {
		// TODO Auto-generated method stub
		txtMa.setText("");
		txtTen.setText("");
//		txtCaTruc.setText("");
		txtSDT.setText("");
		groudradio.clearSelection();
		txtNamSinh.setText("");
		txtMa.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

//	private void loadDataToTable() {
//		model.setRowCount(0);
//
//		// Lấy danh sách nhân viên từ cơ sở dữ liệu
//		ArrayList<NhanVien> ds = new ArrayList<>();
//		try {
//			ds = NhanVien_Dao.getAllNhanVien();
//		} catch (Exception e) {
//			e.printStackTrace();
//			JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu từ cơ sở dữ liệu.");
//			return;
//		}
//		// Format ngày sinh theo định dạng dd-MM-yyyy
//		java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		// Thêm dữ liệu của từng nhân viên vào bảng
//		for (NhanVien nhanVien : ds) {
//			String formattedBirthDate = nhanVien.getNamSinh().format(formatter);
//			model.addRow(new Object[] { nhanVien.getIDNV(), nhanVien.getTenNV(), nhanVien.getGioiTinh() ? "Nam" : "Nữ",
//					nhanVien.getSdt(), nhanVien.getCaTruc(), formattedBirthDate });
//		}
//	}

//	private void timKiemNhanVien() {
//		// Xóa hết các dòng trong bảng trước khi bắt đầu tìm kiếm
//		model.setRowCount(0);
//
//		// Lấy giá trị nhập vào từ các trường
//		String ten = txtTen.getText().trim();
//		String sdt = txtSDT.getText().trim();
//		String caTrucStr = txtCaTruc.getText().trim();
//		String namSinhStr = txtNamSinh.getText().trim();
//
//		boolean gioiTinhNam = raNam.isSelected(); // Giới tính Nam được chọn hay không
//
//		// Kiểm tra xem người dùng có nhập thông tin tìm kiếm không
//		if (ten.isEmpty() && sdt.isEmpty() && caTrucStr.isEmpty() && namSinhStr.isEmpty() && !gioiTinhNam) {
//			JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm.");
//			return;
//		}
//
//		// Lọc danh sách nhân viên theo các tiêu chí
//		ArrayList<NhanVien> ds = new ArrayList<>();
//		try {
//			// Lấy tất cả nhân viên từ cơ sở dữ liệu
//			ds = NhanVien_dao.getAllNhanVien();
//		} catch (Exception e) {
//			e.printStackTrace();
//			JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu.");
//			return;
//		}
//
//		// Format năm sinh nếu có nhập
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate namSinh = null;
//		if (!namSinhStr.isEmpty()) {
//			try {
//				namSinh = LocalDate.parse(namSinhStr, formatter);
//			} catch (DateTimeParseException ex) {
//				JOptionPane.showMessageDialog(this, "Vui lòng nhập năm sinh hợp lệ.");
//				return;
//			}
//		}
//
//		// Lọc các nhân viên theo các điều kiện tìm kiếm
//		ArrayList<NhanVien> ketQuaTimKiem = new ArrayList<>();
//		for (NhanVien nv : ds) {
//			boolean matches = true;
//
//			// Kiểm tra các trường nhập liệu
//			if (!ten.isEmpty() && !nv.getTenNV().toLowerCase().contains(ten.toLowerCase())) {
//				matches = false;
//			}
//			if (!sdt.isEmpty() && !nv.getSdt().contains(sdt)) {
//				matches = false;
//			}
//			if (!caTrucStr.isEmpty()) {
//				try {
//					int caTruc = Integer.parseInt(caTrucStr);
//					if (nv.getCaTruc() != caTruc) {
//						matches = false;
//					}
//				} catch (NumberFormatException ex) {
//					JOptionPane.showMessageDialog(this, "Ca trực phải là số.");
//					return;
//				}
//			}
//			if (namSinh != null && !nv.getNamSinh().equals(namSinh)) {
//				matches = false;
//			}
//
//			// Kiểm tra giới tính (nếu raNam được chọn thì tìm nhân viên nam, ngược lại tìm
//			// nữ)
//			if (gioiTinhNam && !nv.getGioiTinh()) {
//				matches = false;
//			}
//			if (!gioiTinhNam && nv.getGioiTinh()) {
//				matches = false;
//			}
//
//			// Nếu nhân viên thỏa mãn tất cả các điều kiện tìm kiếm
//			if (matches) {
//				ketQuaTimKiem.add(nv);
//			}
//		}
//
//		// Cập nhật lại bảng với kết quả tìm kiếm
//		for (NhanVien nv : ketQuaTimKiem) {
//			String formattedBirthDate = nv.getNamSinh().format(formatter);
//			model.addRow(new Object[] { nv.getIDNV(), nv.getTenNV(), nv.getGioiTinh() ? "Nam" : "Nữ", nv.getSdt(),
//					nv.getCaTruc(), formattedBirthDate, });
//		}
//	}
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
            java.util.logging.Logger.getLogger(QuanLyNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVienGUI().setVisible(true);
            }
        });
    }
//
}
