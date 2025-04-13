package Controller;

import java.sql.Date;
import java.time.LocalDate;
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
	
	
	public boolean themThuoc(String maThuoc, String tenThuoc, String hinhAnh, LocalDate ngayNhap_date, LocalDate ngayHetHan_date, int soLuong,
								String donViTinh, double donGia, String phanLoai, double hamLuong, DefaultTableModel tableModel
			) {
	
		quanLyThuocService = new QuanLyThuocService();
		Thuoc thuoc = new Thuoc(maThuoc, tenThuoc, donViTinh,phanLoai,hinhAnh, ngayNhap_date, ngayHetHan_date, donGia, soLuong,hamLuong);
		
		boolean success = quanLyThuocService.themThuocService(thuoc);
		
		Object[] rowData = {
				maThuoc,
				tenThuoc,
				hinhAnh,
				ngayNhap_date,
				ngayHetHan_date,
				donGia,
				soLuong,
				phanLoai,
				donViTinh,
				hamLuong
        		
            };
		
		tableModel.addRow(rowData);
		
		return success;
		
	}



}
