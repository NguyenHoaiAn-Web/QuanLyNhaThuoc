package Controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Models.Thuoc;
import Service.QuanLyThuocService;

public class QuanLyThuocController {
	private QuanLyThuocService quanLyThuocService;
	private DefaultTableModel tableModel;
	
	
	public void load_data_to_table(DefaultTableModel tableModel) {
		tableModel.setRowCount(0); // clear table
		quanLyThuocService = new QuanLyThuocService();
		List<Thuoc> dsThuoc = quanLyThuocService.getDanhSachThuoc();
		
		for (Thuoc thuoc : dsThuoc) {
			
            Object[] rowData = {
            		thuoc.getMaThuoc(),
            		thuoc.getTenThuoc(),
            		thuoc.getHinhAnh(),
            		thuoc.getNgayNhap(),
            		thuoc.getNgayHetHan(),
            		thuoc.getSoLuong(),
            		thuoc.getDonViTinh(),
            		thuoc.getdonGia(),
            		thuoc.getPhanLoai(),
            		thuoc.getHamLuong()
            		
            		
          
                };
            tableModel.addRow(rowData);
			
		}
	}
}
