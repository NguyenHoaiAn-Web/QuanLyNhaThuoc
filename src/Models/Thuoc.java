package Models;

import java.time.LocalDate;
import java.util.Date;

public class Thuoc {
	private String maThuoc;
	private String tenThuoc;
	private String donViTinh;
	private String phanLoai;
	private String hinhAnh;
	private LocalDate ngayNhap;
	private LocalDate ngayHetHan;
	private double donGia;
	private int soLuong;
	private double hamLuong;
	
	public Thuoc(String maThuoc) {
		super();
		this.maThuoc=maThuoc;
	}
	public Thuoc(String maThuoc, String tenThuoc, String donViTinh, String phanLoai, String hinhAnh, LocalDate ngayNhap,
			LocalDate ngayHetHan, double donGia, int soLuong, double hamLuong) {
		super();
		this.maThuoc = maThuoc;
		this.tenThuoc = tenThuoc;
		this.donViTinh = donViTinh;
		this.phanLoai = phanLoai;
		this.hinhAnh = hinhAnh;
		this.ngayNhap = ngayNhap;
		this.ngayHetHan = ngayHetHan;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.hamLuong = hamLuong;
	}
	
	public Thuoc() {
		
	}
	public String getMaThuoc() {
		return maThuoc;
	}
	public void setMaThuoc(String maThuoc) {
		this.maThuoc = maThuoc;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public String getPhanLoai() {
		return phanLoai;
	}
	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public double getdonGia() {
		return donGia;
	}
	public void setdonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getHamLuong() {
		return hamLuong;
	}
	public void setHamLuong(float hamLuong) {
		this.hamLuong = hamLuong;
	}
	
}
