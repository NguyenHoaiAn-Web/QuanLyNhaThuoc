package Models;

import java.time.LocalDateTime;

public class PhieuDat {

	private String maPhieuDatHang;
	private LocalDateTime thoiGian;
	private String maKhachHang;
	private Float tongTien;
	private String diaChi;
	private String phuongThucThanhToan;
	private String trangThai;
	public String getMaPhieuDatHang() {
		return maPhieuDatHang;
	}
	public void setMaPhieuDatHang(String maPhieuDatHang) {
		this.maPhieuDatHang = maPhieuDatHang;
	}
	public LocalDateTime getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(LocalDateTime thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public Float getTongTien() {
		return tongTien;
	}
	public void setTongTien(Float tongTien) {
		this.tongTien = tongTien;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public PhieuDat(String maPhieuDatHang, LocalDateTime thoiGian, String maKhachHang, Float tongTien, String diaChi,
			String phuongThucThanhToan, String trangThai) {
		super();
		this.maPhieuDatHang = maPhieuDatHang;
		this.thoiGian = thoiGian;
		this.maKhachHang = maKhachHang;
		this.tongTien = tongTien;
		this.diaChi = diaChi;
		this.phuongThucThanhToan = phuongThucThanhToan;
		this.trangThai = trangThai;
	}
	public PhieuDat(String maPhieuDatHang) {
		super();
		this.maPhieuDatHang=maPhieuDatHang;
		// TODO Auto-generated constructor stub
	}
	
}
