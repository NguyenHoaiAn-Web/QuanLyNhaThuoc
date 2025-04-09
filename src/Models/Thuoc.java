package Models;

import java.util.Date;

public class Thuoc {
	private String maThuoc;
	private String tenThuoc;
	private String donViTinh;
	private String phanLoai;
	private String hinhAnh;
	private Date ngayNhap;
	private Date ngayHetHan;
	private double donGia;
	private int soLuong;
	private float hamLuong;
	
	public Thuoc(String maThuoc) {
		super();
		this.maThuoc=maThuoc;
	}
	public Thuoc(String maThuoc, String tenThuoc, String donViTinh, String phanLoai, String hinhAnh, Date ngayNhap,
			Date ngayHetHan, double donGia, int soLuong, float hamLuong) {
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
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
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
	public float getHamLuong() {
		return hamLuong;
	}
	public void setHamLuong(float hamLuong) {
		this.hamLuong = hamLuong;
	}
	
}
