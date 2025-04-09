package Models;

import java.time.LocalDateTime;

public class ChiTietPhieuNhap {
	private PhieuNhap phieuNhap;
	private Thuoc thuoc;
	private LocalDateTime ngayNhap;
	private NhaCungCap nhaCungCap;
	private NhanVien nhanVien;
	private int soLuong;
	private double donGiaNhap;
	private double thanhTien;
	
	public PhieuNhap getPhieuNhap() {
		return phieuNhap;
	}
	public void setPhieuNhap(PhieuNhap phieuNhap) {
		this.phieuNhap = phieuNhap;
	}
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public LocalDateTime getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDateTime ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGiaNhap() {
		return donGiaNhap;
	}
	public void setDonGiaNhap(double donGiaNhap) {
		this.donGiaNhap = donGiaNhap;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public ChiTietPhieuNhap(PhieuNhap phieuNhap, Thuoc thuoc, int soLuong, double donGiaNhap, double thanhTien) {
		super();
		this.phieuNhap = phieuNhap;
		this.thuoc = thuoc;
		this.soLuong = soLuong;
		this.donGiaNhap = donGiaNhap;
		this.thanhTien = thanhTien;
	}
	public ChiTietPhieuNhap() {
		super();
	}
	
}
